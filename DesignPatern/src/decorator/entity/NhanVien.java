package decorator.entity;

public abstract class NhanVien implements INhanVien {
    private INhanVien nhanVien;

    public NhanVien(INhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    @Override
    public String method() {
        return nhanVien.method();
    }

}
