package com.delloite;

class BC {
    public void Print() {
        System.out.println("Base");
    }         
}

class DC extends BC {    
    public void Print() {
        System.out.println("Derived");
    }
}

public class Main{
    public static void DoPrint( BC o ) {
        o.Print();   
    }
    public static void main(String[] args) {
        BC a = new BC();
        BC b = new DC();
        DC c = new DC();
        DoPrint(a);
        DoPrint(b);
        DoPrint(c);
    }
}