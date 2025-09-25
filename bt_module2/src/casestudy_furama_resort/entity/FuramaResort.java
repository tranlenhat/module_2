package casestudy_furama_resort.entity;

public class FuramaResort {
    private int maDv ;
    private String tenDv;
    private int dienTich;
    private int chiPhiThue;
    private int soLuongNguoi;
    private String kieuThue;

    public FuramaResort() {
    }

    public FuramaResort(int maDv, String tenDv, int dienTich, int chiPhiThue, int soLuongNguoi, String kieuThue) {
        this.maDv = maDv;
        this.tenDv = tenDv;
        this.dienTich = dienTich;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoi = soLuongNguoi;
        this.kieuThue = kieuThue;
    }

    public int getMaDv() {
        return maDv;
    }

    public void setMaDv(int maDv) {
        this.maDv = maDv;
    }

    public String getTenDv() {
        return tenDv;
    }

    public void setTenDv(String tenDv) {
        this.tenDv = tenDv;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(int chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(int soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "FuramaResort{" +
                "maDv=" + maDv +
                ", tenDv='" + tenDv + '\'' +
                ", dienTich=" + dienTich +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoi=" + soLuongNguoi +
                ", kieuThue=" + kieuThue +
                '}';
    }
}
