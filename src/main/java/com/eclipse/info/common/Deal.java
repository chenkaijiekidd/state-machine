package com.eclipse.info.common;

/**
 * @ClassName Deal
 * Description TODO
 * @Author kidd
 * @Date 2020/5/1 9:12 PM
 * Version 0.1
 **/
public class Deal {

    private String number;
    private State state;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "number='" + number + '\'' +
                ", state=" + state +
                '}';
    }
}
