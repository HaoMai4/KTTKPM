package decorator.entity;

public class NhanVienVP extends NhanVien {

    public NhanVienVP(INhanVien nhanVien) {
        super(nhanVien);
    }

    @Override
    public String method() {
        return super.method() + " Nhan vien van phong";
    }
}
