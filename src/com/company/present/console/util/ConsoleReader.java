package com.company.present.console.util;

import java.util.Scanner;

public class ConsoleReader {

    public double readNumber(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public String readString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public int readInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
