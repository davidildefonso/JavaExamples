package com.exercises.package2;

import com.exercises.package1.ClassA;


public class ClassC extends ClassA {
    public static void main(String[] args) {
        ClassE e = new ClassE();
        System.out.println(e.protectedMsg);
    }
}
