package com.eclipse.info.statemachine;

import com.eclipse.info.common.State;

/**
 * @ClassName CompleteMachineState
 * Description TODO
 * @Author kidd
 * @Date 2020/5/2 3:43 PM
 * Version 0.1
 **/
public class CompleteMachineState implements MachineState {
    @Override
    public void processBusinessLogic() {
        System.out.println("Processing complete business logic...");
    }

    @Override
    public State getDealState() {
        return State.COMPLETED;
    }
}
