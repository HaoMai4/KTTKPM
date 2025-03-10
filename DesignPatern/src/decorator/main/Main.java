package decorator.main;

import decorator.entity.*;

public class Main {
    public static void main(String[] args) {
        INhanVien nhanVien = new DefaultNhanVien();
        System.out.println(nhanVien.method());

        INhanVien nhanVienVP = new NhanVienVP(nhanVien);
        System.out.println(nhanVienVP.method());

        INhanVien doiTruong = new DoiTruong(nhanVienVP);
        System.out.println(doiTruong.method());

        INhanVien giamDoc = new GiamDoc(doiTruong);
        System.out.println(giamDoc.method());
    }
}
