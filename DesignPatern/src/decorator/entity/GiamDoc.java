package decorator.entity;

public class GiamDoc extends NhanVien{

    public GiamDoc(INhanVien nhanVien) {
        super(nhanVien);
    }

    @Override
    public String method() {
        return super.method() + " Giam doc";
    }
}
