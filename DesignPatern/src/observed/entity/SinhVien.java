package observed.entity;

public class SinhVien implements Observer {
    private String ten;

    public SinhVien(String ten) {
        this.ten = ten;
    }

    @Override
    public void update(String message) {
        System.out.println("Sinh viên " + ten + " nhận được thông báo: " + message);
    }
}
