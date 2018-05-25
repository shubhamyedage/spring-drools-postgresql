package com.ruleenine.service;

import com.ruleenine.bean.Invoice;
import com.ruleenine.bean.Payment;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuleBaseService {
    @Autowired
    private KieContainer kContainer;

    public String checkOverpayment(Invoice invoice, Payment payment) {
        KieSession kieSession = kContainer.newKieSession();
        kieSession.insert(invoice);
        kieSession.insert(payment);
        kieSession.fireAllRules();
        kieSession.dispose();
        return invoice.getInvoice_document_no();
    }
}
