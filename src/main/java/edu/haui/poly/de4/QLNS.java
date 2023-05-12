/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.de4;
import java.util.Scanner;
import java.util.ArrayList;
 import java.util.Collections;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class QLNS {
    private ArrayList<NHANSU> list=new ArrayList<>();
    Scanner s=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap n :");
        int n=s.nextInt();
        s.hasNextLine();
        for(int i=0;i<n;i++){
           
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            s.nextLine();
            System.out.print("Ho ten: ");
            String hoTen = s.nextLine(); 
        System.out.println("Nhap ngay sinh :");
        String ngaySinh=s.nextLine();
        System.out.println("Nhap gioi tinh :");
        String gioiTinh=s.nextLine();
        System.out.println("Nhap cccd :");
        String cccd=s.nextLine();
        System.out.println("Nhap manv :");
        String manv=s.nextLine();
        System.out.println("Nhap nganh nghe :");
        String nganhNghe=s.nextLine();
        System.out.println("Nhap he So:");
        double heSo=s.nextDouble();
        System.out.println("Nhap luong co ban :");
        double luongCoBan=s.nextDouble();
       
        LUONG luong=new LUONG(luongCoBan, heSo);
        NHANSU ns=new NHANSU(hoTen,ngaySinh,gioiTinh,cccd,manv,nganhNghe,luong);
        list.add(ns);
        }
    }
    public void xuat(){
         if (list.isEmpty()) {
            System.out.println("Danh sach nhan su rong");
        } else {
            System.out.println("Danh sach nhan su:");
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "Ho Ten", "Ngay Sinh", "Gioi Tinh", "CCCD", "Ma Sinh Vien", "Nganh Nghe", "He So","Luong Co Ban","Luong");
            for (NHANSU sv : list) {
               System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20.2f%-20.2f%-20.2f%n",
                        sv.getHoTen(), sv.getNgaySinh(), sv.getGioiTinh(), sv.getCccd(),
                        sv.getManv(), sv.getNganhNghe(),sv.getLuong().getHeSo(),
                        sv.getLuong().getLuongCoBan(),sv.getLuong().getLuong());

            }
        }
    }
    public void sapXep(){
        Collections.sort(list,((a, b) -> (int)(a.getLuong().getLuong()-b.getLuong().getLuong())));
        xuat();
    }
    public void menu(){
        while(true){
            System.out.println("CHUONG TRINH QUAN LY NHAN SU");
            System.out.println("----------------------------");
            System.out.println("1.Nhap");
            System.out.println("2.Hien thi");
            System.out.println("3.Sap xep");
            System.out.println("4.Thoat");
            System.out.println("Moi ban nhap lua chon :");
            int luachon=s.nextInt();
            s.nextLine();
            switch(luachon) {
                case 1:
                    nhap();
                    
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    sapXep();
                    break;
                case 4:
                    System.exit(0);
                default:
                    throw new AssertionError();
            }
        }
    }
}
