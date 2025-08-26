package ss_9_quan_ly_xe.entity;

public class Oto extends PhuongTien{
    private int soChoNgoi;
    private String kieuXe;

    public Oto(){

    }
    public Oto(int id, String bienKiemSoat, String tenHangSX, int namSX, String chuSoHuu,int soChoNgoi, String kieuXe) {
        super(id, bienKiemSoat, tenHangSX, namSX, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }
    @Override
    public String toString() {
        return "Oto{" +
                "id=" + getId() +
                ", bienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", tenHangSX='" + getTenHangSX() + '\'' +
                ", namSX=" + getNamSX() +
                ", chuSoHuu='" + getChuSoHuu() + '\'' +
                ", soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
