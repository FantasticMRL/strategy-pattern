package com.mrl;

public class ReturnAccept extends MoneyAccount
{
    
    private double contion;
    private double monreturn;

    
    public ReturnAccept(double contion, double monreturn) {
        super();
        this.contion = contion;
        this.monreturn = monreturn;
    }


    @Override
    public double getTotalMoney(double orgin) {
        if(orgin >= contion){
            return orgin-monreturn;
        }
        return orgin;
    }

}
