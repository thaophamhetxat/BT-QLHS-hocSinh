package com.codegym;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageHocSinh {
    static ArrayList<String> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void create(ArrayList<HocSinh> list) {

        System.out.println("Lop: ");
        String lop = scanner.nextLine();
        System.out.println("Khoa Hoc: ");
        String khoaHoc = scanner.nextLine();
        System.out.println("Ky Hoc: ");
        String kyHoc = scanner.nextLine();
        System.out.println("Ten: ");
        String name = scanner.nextLine();
        System.out.println("Nam Sinh: ");
        String namSinh = scanner.nextLine();
        System.out.println("Que quan: ");
        String queQuan = scanner.nextLine();

        HocSinh hocSinh = new HocSinh(lop,khoaHoc,kyHoc,name,namSinh,queQuan);
        ArrayList<HocSinh> list1=new ArrayList<>();
        list1.add(hocSinh);
        System.out.println(list1);


    }
    }

