package com.mrl.traver;

/**
 * 环境类(Context):用一个ConcreteStrategy对象来配置。维护一个对Strategy对象的引用。可定义一个接口来让Strategy访问它的数据。
 * 算法解决类，以提供客户选择使用何种解决方案：
 *  [功能详细描述]
 * @作者 lwqMR
 * @version [版本号, 2018年7月3日]
 * @see [相关类/方法]
 * @since [产品/模块版本] 
 */
public class PersonContext
{
   /* private TravelStartegy travelStartegy  = null;

    public PersonContext(TravelStartegy travelStartegy) {
        super();
        this.travelStartegy = travelStartegy;
    }
    
    public void travel(){
        this.travelStartegy.travel();
    }*/
    

    private TravelStartegy travelStartegy  = null;

    public PersonContext(String type) {
       switch (type) {
        case "air":
            travelStartegy = new TravelByAir();
            break;
        case "train":
            travelStartegy = new TravelByTrain();
            break;
        default:
            travelStartegy = new TravelByAir();
            break;
    }
    }
    
    public void travel(){
        this.travelStartegy.travel();
    }
    
}

