package casestudy_furama_resort.entity;

public class Customer extends Person{
    private int maKh;
    private String loaiKhach;
    private String diaChi;

    public Customer(String hoTen, int ngaySinh, String gioiTinh, int soCmnd, int soDt, String email, int maKh, String loaiKhach, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, soCmnd, soDt, email);
        this.maKh = maKh;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }
    @Override
    public String getInFoToCSV() {
        return this.getHoTen()+","+ this.getNgaySinh()+","+this.getGioiTinh()+","+this.getSoCmnd()+","+this.getSoDt()+","+this.getEmail()+","+this.maKh+","+this.loaiKhach+","+this.diaChi+",";
    }


    public int getMaKh() {
        return maKh;
    }

    public void setMaKh(int maKh) {
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
                toString() +
                "maKh=" + maKh +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
