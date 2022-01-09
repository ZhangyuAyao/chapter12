package com.hspedu.try_;

import java.util.Scanner;

public class TryCatchExercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.println("请输入一个整数：");
            String input = scanner.nextLine();
            try {
                num = Integer.parseInt(input);
                //1.input
                //2.检测不是整数则抛出异常
                break;
            } catch(Exception e) {
                System.out.println("not a num");
            }
        }

        System.out.println("你输入的值是：" + num);
    }
}
