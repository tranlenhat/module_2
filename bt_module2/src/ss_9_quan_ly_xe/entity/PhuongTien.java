package ss_9_quan_ly_xe.entity;

public abstract class PhuongTien {
    private int id;
    private String bienKiemSoat;
    private String tenHangSX;
    private int namSX;
    private String chuSoHuu;

    public PhuongTien() {
    }

    public PhuongTien(int id, String bienKiemSoat, String tenHangSX, int namSX, String chuSoHuu) {
        this.id = id;
        this.bienKiemSoat = bienKiemSoat;
        this.tenHangSX = tenHangSX;
        this.namSX = namSX;
        this.chuSoHuu = chuSoHuu;
    }

    public int getId() {
        return id;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "id=" + id +
                ", bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSX='" + tenHangSX + '\'' +
                ", namSX=" + namSX +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
