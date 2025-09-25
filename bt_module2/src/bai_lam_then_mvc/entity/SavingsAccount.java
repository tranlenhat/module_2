package bai_lam_then_mvc.entity;

public class SavingsAccount extends BankAccount{
    private int soTienGuiTk;
    private int ngayGuiTk;
    private int laiSuat;
    private int kyHan;

    public SavingsAccount(int id, int maTk, String tenChuTk, String ngayTaoTk, int soTienGuiTk, int ngayGuiTk, int laiSuat, int kyHan) {
        super(id, maTk, tenChuTk, ngayTaoTk);
        this.soTienGuiTk = soTienGuiTk;
        this.ngayGuiTk = ngayGuiTk;
        this.laiSuat = laiSuat;
        this.kyHan = kyHan;
    }

    @Override
    public String getInfoToCSV() {
        return this.getId()+","+this.getMaTk()+","+this.getTenChuTk()+","+this.getNgayTaoTk()+","+this.soTienGuiTk+","+this.ngayGuiTk+","+this.laiSuat+","+this.kyHan;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "id=" + getId() +
                ", maTk=" + getMaTk() +
                ", tenChuTk='" + getTenChuTk() + '\'' +
                ", ngayTaoTk='" + getNgayTaoTk() + '\'' +
                ", soTienGuiTk=" + soTienGuiTk +
                ", ngayGuiTk='" + ngayGuiTk + '\'' +
                ", laiSuat=" + laiSuat +
                ", kyHan=" + kyHan +
                '}';
    }
}
