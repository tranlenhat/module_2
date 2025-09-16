package bai_lam_then_mvc.service;

import bai_lam_then_mvc.entity.SavingsAccount;

import java.util.List;

public interface ISavingsAccountService {
    List<SavingsAccount> getAll();
    boolean add(SavingsAccount savingsAccount);
}
