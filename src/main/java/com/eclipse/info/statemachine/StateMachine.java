package com.eclipse.info.statemachine;

import com.eclipse.info.common.Deal;
import com.eclipse.info.common.Event;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName StateMachine
 * Description 状态机
 * @Author kidd
 * @Date 2020/5/2 3:47 PM
 * Version 0.1
 **/
public class StateMachine {

    //状态机持有所有状态的聚合
    private MachineState init = new InitMachineState();
    private MachineState draft = new DraftMachineState();
    private MachineState pendingApproval = new PendingApprovalMachineState();
    private MachineState complete = new CompleteMachineState();
    private MachineState cancel = new CancelMachineState();

    //状态机的当前状态
    private MachineState currentState = null;

    // 状态机的状态变化映射
    // key - 当前状态和事件 value - 下一状态
    public Map<String, MachineState> STATE_EVENT_MAP = new HashMap<>(5);
    public StateMachine(){

        this.currentState = init;

        STATE_EVENT_MAP.put(init + Event.INPUT.getText(), draft);
        STATE_EVENT_MAP.put(draft + Event.SUBMIT.getText(), pendingApproval);
        STATE_EVENT_MAP.put(pendingApproval + Event.REJECT.getText(), draft);
        STATE_EVENT_MAP.put(complete + Event.REMOVE.getText(), cancel);
        STATE_EVENT_MAP.put(pendingApproval + Event.APPROVE.getText(), complete);

    }

    public void manage(Deal deal, Event event){

        // 执行当前状态的业务逻辑
        this.currentState.processBusinessLogic();

        // 在map中查找下一个状态
        MachineState nextState = STATE_EVENT_MAP.get(this.currentState + event.getText());
        if ( null == nextState ){
            System.out.println("State setup invalidate, please check!");
            return;
        }

        // 修改deal的状态
        deal.setState(nextState.getDealState());
        System.out.println("After event:" + event.getText() + " Deal info:" + deal);
        // 改变状态机的状态
        this.currentState = nextState;
    }

    /**
     * 测试状态机
     * @param args
     */
    public static void main(String[] args) {

        StateMachine machine = new StateMachine();
        Deal deal = new Deal();
        deal.setNumber("1");

        System.out.println("Before machine running:" + deal);
        machine.manage(deal, Event.INPUT);
        machine.manage(deal, Event.SUBMIT);
        machine.manage(deal, Event.REJECT);
        machine.manage(deal, Event.SUBMIT);
        machine.manage(deal, Event.APPROVE);


    }
}
