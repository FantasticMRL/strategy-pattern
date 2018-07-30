package com.mrl;

public class Context
{
    private MoneyAccount moneyAccount = null;

    public Context(String type) {
        switch (type) {
            case "正常收费":
                moneyAccount = new OrignAccept();
                break;
            case "满300减100":
                moneyAccount = new ReturnAccept(300, 100);
                break;
            case "打8折":
                moneyAccount = new DeptAccept(0.8);
                break;
            default:
                moneyAccount = new OrignAccept();
                break;
        }
    }
    
    public double contextInterface(double orgin){
        return moneyAccount.getTotalMoney(orgin);
    }
}
