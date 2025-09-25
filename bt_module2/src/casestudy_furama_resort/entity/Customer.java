package casestudy_furama_resort.entity;

public class Customer extends Person{
    private String maKh;
    private String loaiKhach;
    private String diaChi;

    public Customer(String hoTen, String ngaySinh, String gioiTinh, String soCmnd, String soDt, String email, String maKh, String loaiKhach, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, soCmnd, soDt, email);
        this.maKh = maKh;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }
    @Override
    public String getInFoToCSV() {
        return getHoTen() + "," +
                getNgaySinh() + "," +
                getGioiTinh() + "," +
                getSoCmnd() + "," +
                getSoDt() + "," +
                getEmail() + "," +
                maKh + "," +
                loaiKhach + "," +
                diaChi;
    }


    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }



    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "maKh=" + maKh +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
