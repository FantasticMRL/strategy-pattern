package com.mrl;

public class DeptAccept extends MoneyAccount
{

    private double dept;
    
    
    public DeptAccept(double dept) {
        super();
        this.dept = dept;
    }


    @Override
    public double getTotalMoney(double orgin) {
        return orgin*dept;
    }

}
