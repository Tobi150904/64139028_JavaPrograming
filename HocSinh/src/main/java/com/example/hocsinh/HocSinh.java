package com.example.hocsinh;

public class HocSinh {
    private int mssv;
    private String ten;
    private String lop;

    public HocSinh(int mssv, String ten, String lop) {
        this.mssv = mssv;
        this.ten = ten;
        this.lop = lop;
    }

    public int getMssv() {
        return mssv;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }
}