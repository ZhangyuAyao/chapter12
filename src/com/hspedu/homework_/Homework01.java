package com.hspedu.homework_;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        try {
            if(args.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }

            int d1 = Integer.parseInt(args[0]);
            int d2 = Integer.parseInt(args[1]);
            System.out.println("d1/d2=" + EcmDef.cal(d1,d2));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }


    }
}
