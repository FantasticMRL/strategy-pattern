package com.mrl;

/**
 *  策略类,定义了抽象的基类，根据type获取相关的实现类，并且提供一个调用的方法，直接调用抽象类的方法，返回值，这样
 *  客户端就需要认识这个策略类就行了，而不需要认识抽象类和工厂类，可以实现解耦和简化客户端。
 *  [功能详细描述]
 * @作者 lwqMR
 * @version [版本号, 2018年7月31日]
 * @see [相关类/方法]
 * @since [产品/模块版本] 
 */
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
