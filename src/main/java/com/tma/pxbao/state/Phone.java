package com.tma.pxbao.state;

public class Phone {
    public State state;

    // Initial state is Off state for phone
    public Phone() {
        state = new Off(this);
    }

    // Set state for phone after actions change state
    public void setState(State state) {
        this.state = state;
    }

    // phone is changed state from unlock to locked and turn of by pushing power button
    public String lock() {
        return "Locking screen and turning of the screen";
    }

    // phone is changed state from turn of to home
    public String home() {
        return "Going to home screen";
    }

    // phone is changed state from lock to unlock screen by push home button
    public String unlock() {
        return "Unlocking the phone to home";
    }

    // phone is changed state from off to on
    public String turnOn() {
        return "Turning screen on, device still locked";
    }
}
