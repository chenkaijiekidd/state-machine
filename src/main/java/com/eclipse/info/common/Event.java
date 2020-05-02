package com.eclipse.info.common;/**
 * Created by kidd on 2020/5/1.
 */

/**
 * @Enum Event
 * Description TODO
 * @Author kidd
 * @Date 2020/5/1 9:15 PM
 * Version 0.1
 **/
public enum Event {

    INPUT("input"),
    SUBMIT("submit"),
    REJECT("reject"),
    APPROVE("approve"),
    REMOVE("remove");

    private String text;

    Event(String text) {
        this.text = text;
    }

    public String getText(){return text;}
}
