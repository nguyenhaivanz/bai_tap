package Bai_tap_VN;

import java.util.ArrayList;

public class SinhVien  {
    private String HoTen;
    private int MaSinhVien;
    private String NgaySinh;
    private String Lop;
    ArrayList<TheMuon> muons = new ArrayList<>();

    public SinhVien(String hoTen, int maSinhVien, String ngaySinh, String lop) {
    }

    public SinhVien(String hoTen, int maSinhVien, String ngaySinh, String lop, ArrayList<TheMuon> muons) {
        HoTen = hoTen;
        MaSinhVien = maSinhVien;
        NgaySinh = ngaySinh;
        Lop = lop;
        this.muons = muons;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        MaSinhVien = maSinhVien;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public ArrayList<TheMuon> getMuons() {
        return muons;
    }

    public void setMuons(ArrayList<TheMuon> muons) {
        this.muons = muons;
    }

    @Override
    public String toString() {
        return "HoTen='" + HoTen + '\'' +
                ", MaSinhVien=" + MaSinhVien +
                ", NgaySinh='" + NgaySinh + '\'' +
                ", Lop='" + Lop + '\'' +
                ", muons=" + muons;
    }
}
