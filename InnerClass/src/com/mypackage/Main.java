package com.mypackage;

public class Main {

    public static void main(String[] args) {
	OuterClass myOuter = new OuterClass();
	OuterClass.Innerclass myInner = myOuter.new Innerclass();//instansera i en Klass
	System.out.println();
    }
}
