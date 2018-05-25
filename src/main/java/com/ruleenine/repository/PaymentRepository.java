package com.ruleenine.repository;

import com.ruleenine.bean.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, String> {
}
