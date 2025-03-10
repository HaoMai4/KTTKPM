package decorator.entity;

public class DoiTruong extends NhanVien{

    public DoiTruong(INhanVien nhanVien) {
        super(nhanVien);
    }

    @Override
    public String method() {
        return super.method() + " Doi truong";
    }
}
