package com.eclipse.info.statemachine;

import com.eclipse.info.common.State;

/**
 * @ClassName CancelMachineState
 * Description TODO
 * @Author kidd
 * @Date 2020/5/2 3:41 PM
 * Version 0.1
 **/
public class CancelMachineState implements MachineState {

    @Override
    public void processBusinessLogic() {
        System.out.println("Process cancel business logic...");
    }

    @Override
    public State getDealState() {
        return State.CANCEL;
    }
}
