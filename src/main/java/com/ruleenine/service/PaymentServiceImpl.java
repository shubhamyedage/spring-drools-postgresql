package com.ruleenine.service;

import com.ruleenine.bean.Invoice;
import com.ruleenine.bean.Payment;
import com.ruleenine.repository.InvoiceRepository;
import com.ruleenine.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class PaymentServiceImpl implements PaymentService{
    private PaymentRepository paymentRepository;

    @Autowired
    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public List<Payment> listAll() {
        List<Payment> products = new ArrayList<>();
        paymentRepository.findAll().forEach(products::add);
        return products;
    }
}
