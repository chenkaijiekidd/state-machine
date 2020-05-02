package com.eclipse.info.nonstatemachine;

import com.eclipse.info.common.Deal;
import com.eclipse.info.common.Event;
import com.eclipse.info.common.State;

/**
 * @ClassName NonStateMachine
 * Description TODO
 * @Author kidd
 * @Date 2020/5/1 9:17 PM
 * Version 0.1
 **/
public class NonStateMachine {

    private static Deal deal = null;

    public static void main(String[] args) {

        deal = new Deal();
        deal.setNumber("1");

        NonStateMachine nonStateMachine = new NonStateMachine();

        nonStateMachine.process(Event.INPUT);
        nonStateMachine.process(Event.SUBMIT);
        nonStateMachine.process(Event.APPROVE);
        nonStateMachine.process(Event.REJECT);
        nonStateMachine.process(Event.REMOVE);

        nonStateMachine.doInput();
        nonStateMachine.doSubmit();
        nonStateMachine.doApprove();
        nonStateMachine.doReject();
        nonStateMachine.doRemove();

    }

    /**
     * 根据输入事件判断需要处理的业务逻辑
     * @param nowEvent
     */
    private void process(Event nowEvent){

        switch (nowEvent){

            case INPUT:
                if ( null != deal.getState() ){
                    System.out.println("deal status is not null, please check!");
                } else {
                    //修改deal的状态，以及打印信息
                    deal.setState(State.DRAFT);
                    System.out.println("deal state changed to draft.");
                }
                break;

            case SUBMIT:
                if ( State.DRAFT != deal.getState() ){
                    System.out.println("deal status is invalidate, please check!");
                } else {
                    deal.setState(State.PENDING_APPROVAL);
                    System.out.println("deal state changed to pending approval.");
                }
                break;

            case APPROVE:
                //...
                break;

            case REJECT:
                //...
                break;

            case REMOVE:
                //...
                break;

            default:
                System.out.println("Input event invalidate, please check!");
                break;

        }

    }

    /**
     * 处理输入事件，更改deal的状态
     */
    private void doInput() {

        //判断deal的当前状态是否为null，不为null则返回错误信息
        if ( null != deal.getState() ){
            System.out.println("deal status is not null, please check!");
            return;
        }

        //修改deal的状态，以及打印信息
        deal.setState(State.DRAFT);
        System.out.println("deal state changed to draft.");

    }

    private void doSubmit() {

        //判断deal的当前状态是否为草稿，不为草稿则返回错误信息
        if ( State.DRAFT != deal.getState() ){
            System.out.println("deal status is invalidate, please check!");
            return;
        }


        deal.setState(State.PENDING_APPROVAL);
        System.out.println("deal state changed to pending approval.");

    }

    private void doApprove() {
        //...}
    }

    private void doReject() {
        //...
    }

    private void doRemove() {
        //...
    }


}
