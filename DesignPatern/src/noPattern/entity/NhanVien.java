package noPattern.entity;

public class NhanVien {
    private String name;
    private EChucVu chucVu;

    public NhanVien(String name, EChucVu chucVu) {
        this.name = name;
        this.chucVu = chucVu;
    }

    public String method() {
        if (chucVu == EChucVu.NHAN_VIEN_XUONG) {
            return "Nhan vien xuong";
        } else if (chucVu == EChucVu.NHAN_VIEN_VP) {
            return "Nhan vien vp";
        } else if (chucVu == EChucVu.DOI_TRUONG) {
            return "Doi truong";
        } else if (chucVu == EChucVu.GIAM_DOC) {
            return "Giam doc";
        } else if (chucVu == EChucVu.KE_TOAN_TRUONG) {
            return "Ke toan truong";
        } else {
            return "Chuc vu khong hop le";
        }
    }
}
