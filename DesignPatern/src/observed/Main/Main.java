package observed.Main;

import observed.entity.LopHoc;
import observed.entity.SinhVien;

public class Main {
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc("Toán");

        SinhVien sinhVien1 = new SinhVien("Nguyễn Văn A");
        SinhVien sinhVien2 = new SinhVien("Trần Thị B");

        lopHoc.attach(sinhVien1);
        lopHoc.attach(sinhVien2);

        lopHoc.thongBao("Ngày mai có bài kiểm tra!");
    }
}