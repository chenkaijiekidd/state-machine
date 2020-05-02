package com.eclipse.info.statemachine;

import com.eclipse.info.common.State;

/**
 * @ClassName InitMachineState
 * Description TODO
 * @Author kidd
 * @Date 2020/5/2 3:45 PM
 * Version 0.1
 **/
public class InitMachineState implements MachineState {
    @Override
    public void processBusinessLogic() {
        System.out.println("Processing init business logic...");
    }

    @Override
    public State getDealState() {
        return State.INIT;
    }
}
