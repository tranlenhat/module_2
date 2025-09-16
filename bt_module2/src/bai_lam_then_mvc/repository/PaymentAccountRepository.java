package bai_lam_then_mvc.repository;

import bai_lam_then_mvc.entity.PaymentAccount;
import bai_lam_then_mvc.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PaymentAccountRepository implements IPaymentAccountRepository{
    private final String PAYMENT_ACCOUNT_FILE = "src/bai_lam_then_mvc/data/pay.csv";
    @Override
    public List<PaymentAccount> getAll() {
        List<PaymentAccount> paymentAccountsList =new LinkedList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(PAYMENT_ACCOUNT_FILE);
            String[] array = null;
            for (int i = 0; i < stringList.size(); i++) {
                array = stringList.get(i).split(",");
                PaymentAccount paymentAccount = new PaymentAccount(Integer.parseInt(array[0]),Integer.parseInt(array[1]),array[2],array[3],Integer.parseInt(array[4]),Integer.parseInt(array[5]));
                paymentAccountsList.add(paymentAccount);
                
            }
        } catch (IOException e) {
            System.out.println("đọc bị lỗi");
        }
        return paymentAccountsList;
    }

    @Override
    public boolean add(PaymentAccount paymentAccount) {
        List<String> list = new ArrayList<>();
        list.add(paymentAccount.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(PAYMENT_ACCOUNT_FILE,list,true);
        } catch (IOException e) {
            System.out.println("loi ghi file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(int id) {
        boolean isSuccessDelete = false;
        List<PaymentAccount> paymentAccountsList = this.getAll();
        for (int i = 0; i < paymentAccountsList.size(); i++) {
            if(id == paymentAccountsList.get(i).getId()){
                paymentAccountsList.remove(i);
                isSuccessDelete = true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (PaymentAccount paymentAccount : paymentAccountsList){
            stringList.add(paymentAccount.getInfoToCSV());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(PAYMENT_ACCOUNT_FILE,stringList,false);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
        return isSuccessDelete;
    }
}
