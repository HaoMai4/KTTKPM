package state.main;

import state.entity.DoiTruong;
import state.entity.NhanVien;
import state.entity.NhanVienVP;

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
