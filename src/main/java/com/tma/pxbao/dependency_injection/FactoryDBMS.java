package com.tma.pxbao.dependency_injection;


public class FactoryDBMS {
    public static DBMS getDBMS(int type) {
        if (type == 1) {
            return new MySQL();
        }
        if (type == 2) {
            return new Postgre();
        }
        if (type == 3) {
            return new MSSQL();
        }
        return null;
    }
}
