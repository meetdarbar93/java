/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.Math;

/**
 *
 * @author LENOVO
 */
public class practical3 {

    public static void main(String[] args) {
        int a = 123;
        int b = -123;
        System.out.println("Absolute value of " + a + " is " + Math.abs(a));
        System.out.println("Absolute value of " + b + " is " + Math.abs(b));
        double c = 16;
        System.out.println("Square root of " + c + " is " + Math.sqrt(c));
        double d = 123.45;
        System.out.println("Floor value of " + d + " is " + Math.floor(d));
        int e = 3, f = 5;
        System.out.println(e + " power of " + f + " is " + Math.pow(e, f));
    }
}
