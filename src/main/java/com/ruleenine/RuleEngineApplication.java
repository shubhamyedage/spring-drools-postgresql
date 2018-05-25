package com.ruleenine;

import com.ruleenine.bean.Inovoice;
import com.ruleenine.bean.Payment;
import com.ruleenine.repository.InovoiceRepository;
import com.ruleenine.utils.CustomRuleBase;
import org.drools.compiler.compiler.DroolsParserException;
import org.drools.core.WorkingMemory;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.Date;

public class RuleEngineApplication {
    @Bean
    public KieContainer kieContainer() {
        return KieServices.Factory.get().getKieClasspathContainer();
    }

    @Autowired
    static InovoiceRepository inovoiceRepository;
    static CustomRuleBase ruleBase = new CustomRuleBase();
    static KieContainer kieContainer;

    public static void main(String[] Args) {
        WorkingMemory session = null;
        try {
            session = ruleBase.executeDrools();
        } catch (DroolsParserException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ioex) {
            System.out.println(ioex.getMessage());
        }

        Inovoice inovoice = new Inovoice();
        inovoice.setInvoice_document_no("INDOC00001");
        inovoice.setVendor_account_no("VAC0000123");
        inovoice.setInvoice_date(new Date());
        inovoice.setPosting_date(new Date());
        inovoice.setCurrency_code("SGD");
        inovoice.setTotal_amount(1000.0);
        inovoice.setPurchasing_document_no("PDN00001");
        inovoice.setCreated_by("VENDOR000001");

        Payment payment = new Payment();
        payment.setClearing_document_no("CLDOC00001");
        payment.setInvoice_document_no("INDOC00001");
        payment.setVendor_account_no("VAC0000123");
        payment.setInvoice_date(new Date());
        payment.setPosting_date(new Date());
        payment.setClearing_date(new Date());
        payment.setCurrency_code("SGD");
        payment.setTotal_amount(1000.);
        payment.setPayment_method("3");
        payment.setCreated_by("VENDOR000001");

        if (session != null) {
            KieSession kieSession = kieContainer.newKieSession("ruleSession");
            kieSession.insert(inovoice);
            kieSession.insert(payment);
            kieSession.fireAllRules();
            kieSession.dispose();
        }

    }
}
