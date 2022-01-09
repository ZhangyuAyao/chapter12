package com.hspedu.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
    public static void main(String[] args) {

    }

    public static void f2() {
        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
    }

    public static void f1() {
        //1. 因为f3会抛出一个编译异常
        //2. 这时就要求f1必须处理这个编译异常
        //3. 在f1中，要么try-catch-finally，要么继续throws
        try {
            f3();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void f3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }

    public static void f4() {
        //1. 在f4中调用f5是 ok的
        //2. 原因是f5是运行异常
        //3. 而jva中，并不要求程序员显示处理，因为有默认处理机制
        f5();
    }

    public static void f5() throws ArithmeticException {

    }
}

class Father {
    public void method() throws RuntimeException {

    }
}

class Son extends Father {
    @Override
    public void method() throws RuntimeException {

    }
}