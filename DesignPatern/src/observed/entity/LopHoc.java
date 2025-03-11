package observed.entity;

import java.util.ArrayList;
import java.util.List;

public class LopHoc implements Subject {
    private String tenLop;
    private List<Observer> sinhViens = new ArrayList<>();

    public LopHoc(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public void attach(Observer observer) {
        sinhViens.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        sinhViens.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer sinhVien : sinhViens) {
            sinhVien.update(message);
        }
    }

    public void thongBao(String message) {
        System.out.println("Lớp " + tenLop + " thông báo: " + message);
        notifyObservers(message);
    }
}