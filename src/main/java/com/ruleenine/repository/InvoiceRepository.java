package com.ruleenine.repository;

import com.ruleenine.bean.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, String> {
}
