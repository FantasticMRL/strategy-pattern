package com.mrl;

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
