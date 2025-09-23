package casestudy_furama_resort.entity;

public class Employee extends Person {


    private int maNv;
    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee(String hoTen, int ngaySinh, String gioiTinh, int soCmnd, int soDt, String email, int maNv, String trinhDo, String viTri, double luong) {
        super(hoTen, ngaySinh, gioiTinh, soCmnd, soDt, email);
        this.maNv = maNv;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }
    @Override
    public String getInFoToCSV() {
        return this.getHoTen()+","+ this.getNgaySinh()+","+this.getGioiTinh()+","+this.getSoCmnd()+","+this.getSoDt()+","+this.getEmail()+","+this.maNv+","+this.trinhDo+","+this.viTri+","+this.luong;
    }

    public int getMaNv() {
        return maNv;
    }

    public void setMaNv(int maNv) {
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
                toString() +
                "maNv=" + maNv +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }
}
