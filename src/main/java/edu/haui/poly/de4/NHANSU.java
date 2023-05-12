/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.de4;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class NHANSU extends NGUOI{
    private String manv;
    private String nganhNghe;
    private LUONG luong;
    public NHANSU(String hoTen, String ngaySinh, String gioiTinh, String cccd,String manv,String nganhNghe,LUONG luong) {
        super(hoTen, ngaySinh, gioiTinh, cccd);
        this.manv=manv;
        this.nganhNghe=nganhNghe;
        this.luong=luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getNganhNghe() {
        return nganhNghe;
    }

    public void setNganhNghe(String nganhNghe) {
        this.nganhNghe = nganhNghe;
    }

    public LUONG getLuong() {
        return luong;
    }

    public void setLuong(LUONG luong) {
        this.luong = luong;
    }
    
}
