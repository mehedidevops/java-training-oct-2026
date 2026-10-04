package com.syntexpro.students.basic.variableInterference;

public class VariableInference {

    // var = local variable type inference. It lets Java figure out the variable’s type from the value you assign.

    int a = 20;

    public static void hello(int b) {
        var g = '*';
        var h = true;
        System.out.println("hello");
    }

    public static void main(String[] args) {

        String p = "                                  ami aj biryani khabo";
        //System.out.println(p);

        byte a = -127;
        short b = 127;
        var c = 1;
        var d = 10L;
        var e = 1.1234567890123456F;
        var f = 1.1234567890123456;
        var g = '*';
        var h = true;
        System.out.println("byte data = " + a);
        System.out.println("short data = " + b);
        System.out.println("int data = " + c);
        System.out.println("long data = " + d);
        System.out.println("float data = " + e);
        System.out.println("double data = " + f);
        System.out.println("char data = " + g);
        System.out.println("boolean data = " + h);
    }
}
