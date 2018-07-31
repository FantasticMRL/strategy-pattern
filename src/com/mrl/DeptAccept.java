package com.mrl;

/**
 *  打折策略
 *  [功能详细描述]
 * @作者 lwqMR
 * @version [版本号, 2018年7月31日]
 * @see [相关类/方法]
 * @since [产品/模块版本] 
 */
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
