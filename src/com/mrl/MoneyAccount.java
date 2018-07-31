package com.mrl;

/**
 *  抽象类，抽取获取收费的总数的基类
 *  [功能详细描述]
 * @作者 lwqMR
 * @version [版本号, 2018年7月31日]
 * @see [相关类/方法]
 * @since [产品/模块版本] 
 */
public abstract class MoneyAccount
{
    public abstract double getTotalMoney(double orgin);
}
