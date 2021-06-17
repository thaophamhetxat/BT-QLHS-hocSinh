package com.codegym;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Object HocSinh;

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("1.add");
            System.out.println("2.show");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    ManageHocSinh.create((ArrayList<com.codegym.HocSinh>) HocSinh);
                    break;
                case 2: {
                    for (String s : list1) {
                        System.out.println(s);
                    }
                    break;
                }

            }
        }
    }
}
