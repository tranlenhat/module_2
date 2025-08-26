package ss_9_quan_ly_xe.entity;

public class XeMay extends PhuongTien{
    private int congSuat;

    public XeMay() {
    }
    public XeMay(int id, String bienKiemSoat, String tenHangSX, int namSX, String chuSoHuu, int congSuat) {
        super(id, bienKiemSoat, tenHangSX, namSX, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "id=" + getId() +
                ", bienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", tenHangSX='" + getTenHangSX() + '\'' +
                ", namSX=" + getNamSX() +
                ", chuSoHuu='" + getChuSoHuu() + '\'' +
                ", congSuat=" + congSuat +
                '}';
    }
}
