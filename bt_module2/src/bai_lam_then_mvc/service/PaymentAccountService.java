package bai_lam_then_mvc.service;

import bai_lam_then_mvc.entity.PaymentAccount;
import bai_lam_then_mvc.repository.IPaymentAccountRepository;
import bai_lam_then_mvc.repository.PaymentAccountRepository;

import java.util.List;

public class PaymentAccountService implements IPaymentAccountService  {
    private IPaymentAccountRepository paymentAccountRepository = new PaymentAccountRepository();
    @Override
    public List<PaymentAccount> getAll() {
        return paymentAccountRepository.getAll();
    }

    @Override
    public boolean add(PaymentAccount paymentAccount) {
        List<PaymentAccount> paymentAccounts = paymentAccountRepository.getAll();
        for (int i = 0; i < paymentAccounts.size(); i++) {
            if(paymentAccounts.get(i) != null){
                if(paymentAccounts.get(i).getId() == paymentAccount.getId()){
                    System.out.println("ID đã tồn tại");
                    return false;
                }
            }else {
                break;
            }
            
        }
        return paymentAccountRepository.add(paymentAccount);
    }

    @Override
    public boolean delete(int id) {
        return paymentAccountRepository.delete(id);
    }
}
