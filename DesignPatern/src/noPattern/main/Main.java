package noPattern.main;

import noPattern.entity.EChucVu;
import noPattern.entity.NhanVien;

public class Main {
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien("Nguyen Van A", EChucVu.NHAN_VIEN_VP);
        System.out.println(nhanVien.method());
    }
}
