package strategy.main;

import strategy.entity.DoiTruong;
import strategy.entity.NhanVien;
import strategy.entity.NhanVienVP;

public class Main {
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien("Nguyen Van A", new DoiTruong());
        System.out.println(nhanVien.getChucVu().method());

        nhanVien.setChucVu(new NhanVienVP());
        System.out.println(nhanVien.getChucVu().method());

        nhanVien.setChucVu(new DoiTruong());
        System.out.println(nhanVien.getChucVu().method());


    }
}
