package com.eclipse.info.statemachine;

import com.eclipse.info.common.State;

/**
 * @ClassName PendingApprovalMachineState
 * Description TODO
 * @Author kidd
 * @Date 2020/5/2 3:46 PM
 * Version 0.1
 **/
public class PendingApprovalMachineState implements MachineState {
    @Override
    public void processBusinessLogic() {
        System.out.println("Processing pending approval business logic...");
    }

    @Override
    public State getDealState() {
        return State.PENDING_APPROVAL;
    }
}
