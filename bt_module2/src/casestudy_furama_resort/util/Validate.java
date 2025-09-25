package casestudy_furama_resort.util;

import java.net.DatagramPacket;

public class Validate {
    public static boolean checkMaNv(String maNv) {
        String regexMaNv = "^NV-\\d{4}$";
        return maNv.matches(regexMaNv);
    }
    public static boolean checkMaKh(String maKh) {
        String regexMaKH = "^KH-\\d{4}$";
        return maKh.matches(regexMaKH);
    }

    public static boolean checkName(String name) {
        String regexName ="^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";
        return name.matches(regexName);
    }
    public static boolean checkCmnd(String cmnd) {
        String regex = "^(\\d{9}|\\d{12})$";
        return cmnd.matches(regex);
    }

    public static boolean checkSoDienThoai(String sdt) {
        String regex = "^0\\d{9}$";
        return sdt.matches(regex);
    }
}