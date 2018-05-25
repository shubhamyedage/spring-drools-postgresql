package com.ruleenine.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Invoice")
public class Invoice {

    @Id
    @Column(name = "InvoiceDocumentNo")
    private String invoice_document_no;

    @Column(name = "VendorAccountNo")
    private String vendor_account_no;

    @Column(name = "InvoiceDate")
    private Date invoice_date;

    @Column(name = "PostingDate")
    private Date posting_date;

    @Column(name = "CurrencyCode")
    private String currency_code;

    @Column(name = "TotalAmount")
    private Double total_amount;

    @Column(name = "InvoiceDueDate")
    private Date invoice_due_date;

    @Column(name = "PurchasingDocumentNo")
    private String purchasing_document_no;

    @Column(name = "CreatedBy")
    private String created_by;

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

    public Date getInvoice_due_date() {
        return invoice_due_date;
    }

    public void setInvoice_due_date(Date invoice_due_date) {
        this.invoice_due_date = invoice_due_date;
    }

    public String getPurchasing_document_no() {
        return purchasing_document_no;
    }

    public void setPurchasing_document_no(String purchasing_document_no) {
        this.purchasing_document_no = purchasing_document_no;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }
}
