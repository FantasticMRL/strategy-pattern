package com.mrl;

/**
 * MoneyAccount的实现类，计算金额的一种策略(满减策略
 *  [功能详细描述]
 * @作者 lwqMR
 * @version [版本号, 2018年7月31日]
 * @see [相关类/方法]
 * @since [产品/模块版本] 
 */
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
