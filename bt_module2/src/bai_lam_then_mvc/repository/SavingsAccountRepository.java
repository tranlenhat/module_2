package bai_lam_then_mvc.repository;

import bai_lam_then_mvc.entity.SavingsAccount;
import bai_lam_then_mvc.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SavingsAccountRepository implements ISavingsAccountRepository {
    private final String SAVINGS_ACCOUNT_FILE = "src/bai_lam_then_mvc/data/savings.csv";
    @Override
    public List<SavingsAccount> getAll() {
        List<SavingsAccount > savingsAccountList = new LinkedList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(SAVINGS_ACCOUNT_FILE);
            String[] array = null;
            for (int i = 0; i < stringList.size(); i++) {
                array = stringList.get(i).split(",");
                SavingsAccount savingsAccount = new SavingsAccount(
                        Integer.parseInt(array[0]),
                        Integer.parseInt(array[1]),
                        array[2],
                        array[3],
                        Integer.parseInt(array[4]),
                        Integer.parseInt(array[5]),
                        Integer.parseInt(array[6]),
                        Integer.parseInt(array[7])
                );
                savingsAccountList.add(savingsAccount);
            }
        } catch (IOException e) {
            System.out.println("Đọc file bị lỗi");
        } catch (Exception e) {
            e.getStackTrace();
        }
        return savingsAccountList;
    }

    @Override
    public boolean add(SavingsAccount savingsAccount) {
        List<String> list = new ArrayList<>();
        list.add(savingsAccount.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(SAVINGS_ACCOUNT_FILE,list,true);
        } catch (IOException e) {
            System.out.println("loi ghi file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
