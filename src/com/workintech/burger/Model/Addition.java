package com.workintech.burger.Model;

public class Addition {
    private String additionName;
    private double additionPrice;

    public Addition(String additionName, double additionPrice) {
        this.additionName = additionName;
        this.additionPrice = additionPrice;
    }

    public String getAdditionName() {
        return additionName;
    }

    public double getAdditionPrice() {
        return additionPrice;
    }

    public void setAdditionName(String additionName) {
        this.additionName = additionName;
    }

    public void setAdditionPrice(double additionPrice) {
        this.additionPrice = additionPrice;
    }
}
