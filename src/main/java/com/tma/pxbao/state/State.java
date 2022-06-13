package com.tma.pxbao.state;

public abstract class State {

    protected Phone phone;

    // initial state for phone
    public State(Phone phone) {
        this.phone = phone;
    }

    // visualization of pushing home button
    public abstract String onHome();

    // visualization of pushing power button
    public abstract String onPower();
}

class HomeReady extends State {

    public HomeReady(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        return phone.home();
    }

    @Override
    public String onPower() {
        phone.setState(new Off(phone));
        return phone.lock();
    }
}

class Locked extends State {

    public Locked(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new HomeReady(phone));
        return phone.unlock();
    }

    @Override
    public String onPower() {
        phone.setState(new Off(phone));
        return phone.lock();
    }
}

class Off extends State {

    public Off(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new Locked(phone));
        return phone.turnOn();
    }

    @Override
    public String onPower() {
        phone.setState(new Locked(phone));
        return phone.turnOn();
    }
}