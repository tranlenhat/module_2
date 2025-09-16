package bai_lam_then_mvc.entity;

public abstract class BankAccount {
    private int id;
    private int maTk;
    private String tenChuTk;
    private String ngayTaoTk;

    public BankAccount() {
    }

    public BankAccount(int id, int maTk, String tenChuTk, String ngayTaoTk) {
        this.id = id;
        this.maTk = maTk;
        this.tenChuTk = tenChuTk;
        this.ngayTaoTk = ngayTaoTk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaTk() {
        return maTk;
    }

    public void setMaTk(int maTk) {
        this.maTk = maTk;
    }

    public String getTenChuTk() {
        return tenChuTk;
    }

    public void setTenChuTk(String tenChuTk) {
        this.tenChuTk = tenChuTk;
    }

    public String getNgayTaoTk() {
        return ngayTaoTk;
    }

    public void setNgayTaoTk(String ngayTaoTk) {
        this.ngayTaoTk = ngayTaoTk;
    }
    public abstract String getInfoToCSV();

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", maTk=" + maTk +
                ", tenChuTk='" + tenChuTk + '\'' +
                ", ngayTaoTk='" + ngayTaoTk + '\'' +
                '}';
    }
}
