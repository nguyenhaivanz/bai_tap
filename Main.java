package Bai_tap_VN;

import java.util.Scanner;

public class Main {
    static Manage manage = new Manage();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1.xem danh sach: ");
            System.out.println("2.thêm học sinh: ");
            System.out.println("3.the muon: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    manage.show();
                    break;
                case 2:
                    manage.nhap();
                    break;
                case 3:
                    manage.TheMuon();
                    break;
            }
        }
    }
}
