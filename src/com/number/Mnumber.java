package com.number;

import java.util.Scanner;
        //use class compareoption
class GenericCompareOperation {
    //T extends comparable methode
    public static <T extends Comparable> T compareMax(T a,T b,T c){
        T mf;
        //using ternary operter we are comparing a and b
        mf = ( a.compareTo(b) == 1 ? a : b);

        T FMAX;
        //using ternary opertaer we are comparing mf and c
        FMAX = ( mf.compareTo(c) == 1 ? mf : c);
        return FMAX;
    }
}

public class Mnumber {
//main methode
    public static void main(String[] args) {
//for integer
        System.out.println("Enter 3 Integer numbers to compare");
        Scanner sc = new Scanner(System.in);
        Integer x= new Integer(sc.nextInt());
        Integer y= new Integer(sc.nextInt());
        Integer z= new Integer(sc.nextInt());
        Integer IMAX = GenericCompareOperation.compareMax(x,y,z);
        System.out.println(IMAX+ " is the Maximum Integer number");

//for passing the float value
        System.out.println("Enter 3 Float numbers to compare");
        Float a= new Float(sc.nextFloat());
        Float b= new Float(sc.nextFloat());
        Float c= new Float(sc.nextFloat());
        Float FMAX = GenericCompareOperation.compareMax(a,b,c);
        System.out.println(FMAX+ " is the Maximum Float number");

//for passing the string value which is given in question
        System.out.println("Checking MAX between Apple, Banana, Peach");
        String p = new String("Apple");
        String q = new String("Banana");
        String r = new String("Peach");
        String SMAX = GenericCompareOperation.compareMax(p,q,r);
        System.out.println(SMAX+ " is the Maximum String");


        }

    }

