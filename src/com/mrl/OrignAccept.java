package com.mrl;

/**
 *  MoneyAccount的实现类，计算金额的一种策略(没有促销的策略)
 *  [功能详细描述]
 * @作者 lwqMR
 * @version [版本号, 2018年7月31日]
 * @see [相关类/方法]
 * @since [产品/模块版本] 
 */
public class OrignAccept extends MoneyAccount
{

    @Override
    public double getTotalMoney(double orgin) {
        return orgin;
    }
}
