package bai_lam_then_mvc.service;

import bai_lam_then_mvc.entity.SavingsAccount;
import bai_lam_then_mvc.repository.ISavingsAccountRepository;
import bai_lam_then_mvc.repository.SavingsAccountRepository;

import java.util.List;

public class SavingsAccountService implements ISavingsAccountService {
    private ISavingsAccountRepository savingsAccountRepository = new SavingsAccountRepository();
    @Override
    public List<SavingsAccount> getAll() {
        return savingsAccountRepository.getAll();
    }

    @Override
    public boolean add(SavingsAccount savingsAccount) {
        List<SavingsAccount> savingsAccountList = savingsAccountRepository.getAll();
        for (int i = 0; i < savingsAccountList.size(); i++) {
            if(savingsAccountList.get(i) != null){
                if(savingsAccountList.get(i).getId() == savingsAccount.getId()){
                    System.out.println("ID đã tồn tại");
                    return false;
                }
            }else {
                break;
            }
        }
        return savingsAccountRepository.add(savingsAccount);
    }
}
