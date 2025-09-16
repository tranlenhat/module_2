package bai_lam_then_mvc.service;

import bai_lam_then_mvc.entity.PaymentAccount;

import java.util.List;

public interface IPaymentAccountService {
    List<PaymentAccount> getAll();
    boolean add(PaymentAccount paymentAccount);
    boolean delete(int id);
}
