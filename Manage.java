package Bai_tap_VN;

import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
    ArrayList<TheMuon> themuons = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public SinhVien nhap(){
        System.out.println("nhập họ tên:");
        String HoTen = scanner.nextLine();
        System.out.println("nhập mã sinh viên: ");
        int MaSinhVien = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập ngày sinh: ");
        String NgaySinh = scanner.nextLine();
        System.out.println("nhập lớp: ");
        String Lop = scanner.nextLine();
        SinhVien HocSinh = new SinhVien(HoTen,MaSinhVien,NgaySinh,Lop);
        return HocSinh;
    }
   public TheMuon TheMuon(){
       System.out.println("số phiếu mượn: ");
       int SoPhieuMuon = Integer.parseInt(scanner.nextLine());
       System.out.println("Ma sinh vien: ");
       int MaSinhVienMuon = Integer.parseInt(scanner.nextLine());
       System.out.println("ngay muon: ");
       String NgayMuon = scanner.nextLine();
       System.out.println("han tra: ");
       String HanTra = scanner.nextLine();
       System.out.println("so hieu sach: ");
       int SoHieuSach = Integer.parseInt(scanner.nextLine());
       TheMuon theMuon = new TheMuon(SoPhieuMuon,MaSinhVienMuon,NgayMuon,HanTra,SoHieuSach);
       return theMuon;
   }
       public void show() {
           for (int i = 0; i < themuons.size(); i++) {
               System.out.println(themuons.size());
           }
       }
   }