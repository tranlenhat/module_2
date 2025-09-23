package casestudy_furama_resort.entity;

public class RoomResort extends FuramaResort{
    private String dichVuMienPhi;

    public RoomResort() {
    }

    public RoomResort(int maDv, String tenDv, int dienTich, int chiPhiThue, int soLuongNguoi, int kieuThue, String dichVuMienPhi) {
        super(maDv, tenDv, dienTich, chiPhiThue, soLuongNguoi, kieuThue);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return "RoomResort{" +
                super.toString()+
                "dichVuMienPhi='" + dichVuMienPhi + '\'' +
                '}';
    }
}
