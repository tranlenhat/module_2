package casestudy_furama_resort.entity;

public class VillaResort extends FuramaResort{
    private String tieuChuanPhong;
    private int dienTichHoBoi;
    private int soTang;

    public VillaResort() {
    }

    public VillaResort(int maDv, String tenDv, int dienTich, int chiPhiThue, int soLuongNguoi, String kieuThue, String tieuChuanPhong, int dienTichHoBoi, int soTang) {
        super(maDv, tenDv, dienTich, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(int dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "VillaResort{" +
                super.toString()+
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                '}';
    }
}
