package casestudy_furama_resort.entity;

public class Employee extends Person {

    private String maNv;
    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee(String hoTen, String ngaySinh, String gioiTinh, String soCmnd, String soDt, String email, String maNv, String trinhDo, String viTri, double luong) {
        super(hoTen, ngaySinh, gioiTinh, soCmnd, soDt, email);
        this.maNv = maNv;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }
    @Override
    public String getInFoToCSV() {
        return getHoTen() + "," + getNgaySinh() + "," + getGioiTinh() + "," + getSoCmnd() + "," + getSoDt() + "," +
                getEmail() + "," + maNv + "," + trinhDo + "," + viTri + "," + luong;
    }


    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }


    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "maNv=" + maNv +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }
}
