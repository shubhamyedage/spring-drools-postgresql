package com.ruleenine.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Payment")
public class Payment {
    @Id
    @Column(name = "ClearingDocumentNo")
    private String clearing_document_no;

    @Column(name = "InvoiceDocumentNo")
    private String invoice_document_no;

    @Column(name = "VendorAccountNo")
    private String vendor_account_no;

    @Column(name = "InvoiceDate")
    private Date invoice_date;

    @Column(name = "PostingDate")
    private Date posting_date;

    @Column(name = "ClearingDate")
    private Date clearing_date;

    @Column(name = "CurrencyCode")
    private String currency_code;

    @Column(name = "TotalAmount")
    private Double total_amount;

    @Column(name = "PaymentMethod")
    private String payment_method;

    @Column(name = "CreatedBy")
    private String created_by;

    public String getClearing_document_no() {
        return clearing_document_no;
    }

    public void setClearing_document_no(String clearing_document_no) {
        this.clearing_document_no = clearing_document_no;
    }

    public String getInvoice_document_no() {
        return invoice_document_no;
    }

    public void setInvoice_document_no(String invoice_document_no) {
        this.invoice_document_no = invoice_document_no;
    }

    public String getVendor_account_no() {
        return vendor_account_no;
    }

    public void setVendor_account_no(String vendor_account_no) {
        this.vendor_account_no = vendor_account_no;
    }

    public Date getInvoice_date() {
        return invoice_date;
    }

    public void setInvoice_date(Date invoice_date) {
        this.invoice_date = invoice_date;
    }

    public Date getPosting_date() {
        return posting_date;
    }

    public void setPosting_date(Date posting_date) {
        this.posting_date = posting_date;
    }

    public Date getClearing_date() {
        return clearing_date;
    }

    public void setClearing_date(Date clearing_date) {
        this.clearing_date = clearing_date;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public Double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Double total_amount) {
        this.total_amount = total_amount;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }
}
