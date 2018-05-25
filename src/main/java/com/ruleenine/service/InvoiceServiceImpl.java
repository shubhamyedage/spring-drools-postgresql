package com.ruleenine.service;

import com.ruleenine.bean.Invoice;
import com.ruleenine.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class InvoiceServiceImpl implements InvoiceService {

    private InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceServiceImpl(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public List<Invoice> listAll() {
        List<Invoice> products = new ArrayList<>();
        invoiceRepository.findAll().forEach(products::add);
        return products;
    }
}
