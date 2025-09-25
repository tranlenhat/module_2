package bai_lam_then_mvc.entity;

public class PaymentAccount extends BankAccount {
    private int soThe;
    private int soTienTrongThe;

    public PaymentAccount(){

    }

    @Override
    public String getInfoToCSV() {
        return this.getId()+","+this.getMaTk()+","+this.getTenChuTk()+","+this.getNgayTaoTk()+","+this.soThe+","+this.soTienTrongThe;
    }
    public PaymentAccount(int id, int maTk, String tenChuTk, String ngayTaoTk, int soThe, int soTienTrongThe) {
        super(id, maTk, tenChuTk, ngayTaoTk);
        this.soThe = soThe;
        this.soTienTrongThe = soTienTrongThe;
    }
    @Override
    public String toString() {
        return "PaymentAccount{" +
                "id=" + getId() +
                ", maTk=" + getMaTk() +
                ", tenChuTk='" + getTenChuTk() + '\'' +
                ", ngayTaoTk='" + getNgayTaoTk() + '\'' +
                ", soThe=" + soThe +
                ", soTienTrongThe=" + soTienTrongThe +
                '}';
    }

}
