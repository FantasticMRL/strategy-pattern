package com.mrl;

/**
 *  客户端
 *  [功能详细描述]
 * @作者 lwqMR
 * @version [版本号, 2018年7月31日]
 * @see [相关类/方法]
 * @since [产品/模块版本] 
 */
public class Demo
{
    public static void main(String[] args) {
        
        //策略类
        Context context = new Context("满300减100");
        //调用方法
        double res = context.contextInterface(300);
        System.out.println(res);
    }
}
