package com.eclipse.info.common;/**
 * Created by kidd on 2020/5/1.
 */

/**
 * @Enum State
 * Description TODO
 * @Author kidd
 * @Date 2020/5/1 9:12 PM
 * Version 0.1
 **/
public enum State {

    INIT("init"),
    DRAFT("draft"),
    PENDING_APPROVAL("pending approval"),
    CANCEL("cancel"),
    COMPLETED("completed");

    private String text;

    State(String text) {
        this.text = text;
    }

    public String getText(){return text;}
}
