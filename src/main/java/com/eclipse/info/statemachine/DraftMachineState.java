package com.eclipse.info.statemachine;

import com.eclipse.info.common.State;

/**
 * @ClassName DraftMachineState
 * Description TODO
 * @Author kidd
 * @Date 2020/5/2 3:44 PM
 * Version 0.1
 **/
public class DraftMachineState implements MachineState {
    @Override
    public void processBusinessLogic() {
        System.out.println("Processing draft business logic...");
    }

    @Override
    public State getDealState() {
        return State.DRAFT;
    }
}
