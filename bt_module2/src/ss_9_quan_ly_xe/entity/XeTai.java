package ss_9_quan_ly_xe.entity;

public class XeTai extends PhuongTien {
    private int trongTai;

    public XeTai() {
    }

    public XeTai(int id, String bienKiemSoat, String tenHangSX, int namSX, String chuSoHuu, int trongTai) {
        super(id, bienKiemSoat, tenHangSX, namSX, chuSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "id=" + getId() +
                ", bienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", tenHangSX='" + getTenHangSX() + '\'' +
                ", namSX=" + getNamSX() +
                ", chuSoHuu='" + getChuSoHuu() + '\'' +
                ", trongTai=" + trongTai +
                '}';
    }

}
