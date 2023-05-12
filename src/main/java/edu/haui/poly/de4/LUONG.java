/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.de4;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class LUONG {
    private double luongCoBan;
    private double heSo;
    private double luong;

    public LUONG(double luongCoBan, double heSo) {
        this.luongCoBan = luongCoBan;
        this.heSo = heSo;
        this.luong=heSo*luongCoBan;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
}
