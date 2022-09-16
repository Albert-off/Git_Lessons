package com.company.lesson1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        Person Optimus = new Person();
        Optimus.height = 360;
        System.out.println(Optimus.height);

        Optimus.sayHello(name);
    }
}

