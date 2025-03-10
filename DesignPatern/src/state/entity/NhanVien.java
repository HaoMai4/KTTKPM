package state.entity;

public class NhanVien {
    private String name;
    private IChucVu chucVu;

    public NhanVien(String name, IChucVu chucVu) {
        this.name = name;
        this.chucVu = chucVu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(IChucVu chucVu) {
        this.chucVu = chucVu;
    }
}
