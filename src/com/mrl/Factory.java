package com.mrl;

/**
 *  简单工厂模式，根据类型返回对应的实现类
 *  [功能详细描述]
 * @作者 lwqMR
 * @version [版本号, 2018年7月31日]
 * @see [相关类/方法]
 * @since [产品/模块版本] 
 */
public class Factory
{
    
    public static MoneyAccount getIns(String type){
        MoneyAccount moneyAccount = null;
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
        
        return moneyAccount;
    } 
}
