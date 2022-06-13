package com.tma.pxbao.dependency_injection;

public interface DBMS {
    void insert();

    void delete();

    void update();
}

class MySQL implements DBMS {
    @Override
    public void insert() {
        System.out.println("MySQL insert");
    }
    @Override
    public void delete() {
        System.out.println("MySQL delete");
    }
    @Override
    public void update() {
        System.out.println("MySQL update");
    }
}

class Postgre implements DBMS {
    @Override
    public void insert() {
        System.out.println("Postgre insert");
    }
    @Override
    public void delete() {
        System.out.println("Postgre delete");
    }
    @Override
    public void update() {
        System.out.println("Postgre update");
    }
}
class MSSQL implements DBMS {
    @Override
    public void insert() {
        System.out.println("MSSQL insert");
    }
    @Override
    public void delete() {
        System.out.println("MSSQL delete");
    }
    @Override
    public void update() {
        System.out.println("MSSQL update");
    }
}