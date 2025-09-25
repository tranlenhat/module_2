package casestudy_furama_resort.entity;

public abstract class Person {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String soCmnd;
    private String soDt;
    private String email;

    public Person(String hoTen, String ngaySinh, String gioiTinh, String soCmnd, String soDt, String email) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCmnd = soCmnd;
        this.soDt = soDt;
        this.email = email;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoCmnd() {
        return soCmnd;
    }

    public void setSoCmnd(String soCmnd) {
        this.soCmnd = soCmnd;
    }

    public String getSoDt() {
        return soDt;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public abstract String getInFoToCSV();
    @Override
    public String toString() {
        return "Person{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soCmnd=" + soCmnd +
                ", soDt=" + soDt +
                ", email='" + email + '\'' +
                '}';
    }
}
