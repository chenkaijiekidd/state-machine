package com.eclipse.info.statemachine;

import com.eclipse.info.common.State;

/**
 * @InterfaceName MachineState
 * Description 状态机接口
 * @Author kidd
 * @Date 2020/5/2 3:40 PM
 * Version 0.1
 **/
public interface MachineState {

    void processBusinessLogic();
    State getDealState();
}
