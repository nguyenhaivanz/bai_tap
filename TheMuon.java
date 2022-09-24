package Bai_tap_VN;
public class TheMuon {
    private int SoPhieuMuon;
    private int MaSinhVienMuon;
    private String NgayMuon;
    private String HanTra;
    public int SoHieuSach;

    public TheMuon(String hoTen, int maSinhVien, String ngaySinh, String lop) {
    }

    public TheMuon(int soPhieuMuon, int maSinhVienMuon, String ngayMuon, String hanTra, int soHieuSach) {
        SoPhieuMuon = soPhieuMuon;
        MaSinhVienMuon = maSinhVienMuon;
        NgayMuon = ngayMuon;
        HanTra = hanTra;
        SoHieuSach = soHieuSach;
    }

    public static void add(TheMuon hs) {
    }

    public int getSoPhieuMuon() {
        return SoPhieuMuon;
    }

    public void setSoPhieuMuon(int soPhieuMuon) {
        SoPhieuMuon = soPhieuMuon;
    }

    public int getMaSinhVienMuon() {
        return MaSinhVienMuon;
    }

    public void setMaSinhVienMuon(int maSinhVienMuon) {
        MaSinhVienMuon = maSinhVienMuon;
    }

    public String getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        NgayMuon = ngayMuon;
    }

    public String getHanTra() {
        return HanTra;
    }

    public void setHanTra(String hanTra) {
        HanTra = hanTra;
    }

    public int getSoHieuSach() {
        return SoHieuSach;
    }

    public void setSoHieuSach(int soHieuSach) {
        SoHieuSach = soHieuSach;
    }

    @Override
    public String toString() {
        return "SoPhieuMuon=" + SoPhieuMuon +
                ", MaSinhVienMuon=" + MaSinhVienMuon +
                ", NgayMuon='" + NgayMuon + '\'' +
                ", HanTra='" + HanTra + '\'' +
                ", SoHieuSach=" + SoHieuSach;
    }
}
