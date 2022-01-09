package com.hspedu.try_;

public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String name = "123";
            int num = Integer.parseInt(name);
            System.out.println("num=" + num);
        } catch (Exception e) {
            System.out.println("异常信息=" + e.getMessage());
        } finally {
            System.out.println("finally代码块被执行...");
        }
    }
}
