package com.codegym;

public class HocSinh {
    String lop;
    String khoaHoc;
    String kyHoc;
    String name;
    String namSinh;
    String queQuan;

    public HocSinh() {
    }

    public HocSinh(String lop, String khoaHoc, String kyHoc, String name, String namSinh, String queQuan) {
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
        this.name = name;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(String kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "lop='" + lop + '\'' +
                ", khoaHoc='" + khoaHoc + '\'' +
                ", kyHoc='" + kyHoc + '\'' +
                ", name='" + name + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }
}
