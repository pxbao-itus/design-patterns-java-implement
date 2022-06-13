package com.tma.pxbao.dependency_injection;

import javax.inject.Inject;

public class Client {
    @Inject
    private DBMS dbms;
    public Client(int type) {
        dbms = FactoryDBMS.getDBMS(type);
    }
    public DBMS getDBMS() {
        return dbms;
    }
    public void setDBMS(DBMS dbms) {
        this.dbms = dbms;
    }

    public void execute() {
        dbms.insert();
        dbms.update();
        dbms.delete();
    }
}