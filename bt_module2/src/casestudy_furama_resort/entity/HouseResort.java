package casestudy_furama_resort.entity;

public class HouseResort extends FuramaResort{
    private String tieuChuanPhong;
    private int soTang;

    public HouseResort() {
    }

    public HouseResort(int maDv, String tenDv, int dienTich, int chiPhiThue, int soLuongNguoi, int kieuThue, String tieuChuanPhong, int soTang) {
        super(maDv, tenDv, dienTich, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "HouseResort{" +
                super.toString()+
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                '}';
    }
}
