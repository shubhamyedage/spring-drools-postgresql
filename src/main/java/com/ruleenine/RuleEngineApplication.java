package com.ruleenine;

import com.ruleenine.bean.Invoice;
import com.ruleenine.bean.Payment;
import com.ruleenine.repository.InvoiceRepository;
import com.ruleenine.service.InvoiceService;
import com.ruleenine.service.RuleBaseConfiguration;
import com.ruleenine.service.RuleBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

public class RuleEngineApplication {
    static InvoiceService invoiceService;

    public static void main(String[] Args) {
        List<Invoice> in = invoiceService.listAll();
        System.out.println(in);
//        Invoice invoice = new Invoice();
//        invoice.setInvoice_document_no("INDOC00001");
//        invoice.setVendor_account_no("VAC0000123");
//        invoice.setInvoice_date(new Date());
//        invoice.setPosting_date(new Date());
//        invoice.setCurrency_code("SGD");
//        invoice.setTotal_amount(1000.0);
//        invoice.setPurchasing_document_no("PDN00001");
//        invoice.setCreated_by("VENDOR000001");
//
//        Payment payment = new Payment();
//        payment.setClearing_document_no("CLDOC00001");
//        payment.setInvoice_document_no("INDOC00001");
//        payment.setVendor_account_no("VAC0000123");
//        payment.setInvoice_date(new Date());
//        payment.setPosting_date(new Date());
//        payment.setClearing_date(new Date());
//        payment.setCurrency_code("SGD");
//        payment.setTotal_amount(10000.);
//        payment.setPayment_method("3");
//        payment.setCreated_by("VENDOR000001");
//
//        ApplicationContext context = new AnnotationConfigApplicationContext(RuleBaseConfiguration.class);
//        RuleBaseService ruleBaseService = (RuleBaseService) context.getBean(RuleBaseService.class);
//        ruleBaseService.checkOverpayment(invoice, payment);
    }
}
