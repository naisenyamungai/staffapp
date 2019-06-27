package com.staff.staffapp.model;

public class LeaveDays {
    int id;
    String type;
    String staff;
    int entitled;
    int carryover;
    int taken;
    int balance;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getStaff() {
        return staff;
    }

    public int getEntitled() {
        return entitled;
    }

    public int getCarryover() {
        return carryover;
    }

    public int getTaken() {
        return taken;
    }

    public int getBalance() {
        return balance;
    }
}
