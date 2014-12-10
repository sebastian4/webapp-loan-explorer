
package com.sebastian4.loanexpl.model.loanrepr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "disbursal_date",
    "disbursal_currency",
    "disbursal_amount",
    "repayment_interval",
    "repayment_term",
    "loan_amount",
    "local_payments",
    "scheduled_payments",
    "loss_liability"
})
public class Terms {

    @JsonProperty("disbursal_date")
    private String disbursalDate;
    @JsonProperty("disbursal_currency")
    private String disbursalCurrency;
    @JsonProperty("disbursal_amount")
    private Integer disbursalAmount;
    @JsonProperty("repayment_interval")
    private String repaymentInterval;
    @JsonProperty("repayment_term")
    private Integer repaymentTerm;
    @JsonProperty("loan_amount")
    private Integer loanAmount;
    @JsonProperty("local_payments")
    private List<LocalPayment> localPayments = new ArrayList<LocalPayment>();
    @JsonProperty("scheduled_payments")
    private List<ScheduledPayment> scheduledPayments = new ArrayList<ScheduledPayment>();
    @JsonProperty("loss_liability")
    private LossLiability lossLiability;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The disbursalDate
     */
    @JsonProperty("disbursal_date")
    public String getDisbursalDate() {
        return disbursalDate;
    }

    /**
     * 
     * @param disbursalDate
     *     The disbursal_date
     */
    @JsonProperty("disbursal_date")
    public void setDisbursalDate(String disbursalDate) {
        this.disbursalDate = disbursalDate;
    }

    /**
     * 
     * @return
     *     The disbursalCurrency
     */
    @JsonProperty("disbursal_currency")
    public String getDisbursalCurrency() {
        return disbursalCurrency;
    }

    /**
     * 
     * @param disbursalCurrency
     *     The disbursal_currency
     */
    @JsonProperty("disbursal_currency")
    public void setDisbursalCurrency(String disbursalCurrency) {
        this.disbursalCurrency = disbursalCurrency;
    }

    /**
     * 
     * @return
     *     The disbursalAmount
     */
    @JsonProperty("disbursal_amount")
    public Integer getDisbursalAmount() {
        return disbursalAmount;
    }

    /**
     * 
     * @param disbursalAmount
     *     The disbursal_amount
     */
    @JsonProperty("disbursal_amount")
    public void setDisbursalAmount(Integer disbursalAmount) {
        this.disbursalAmount = disbursalAmount;
    }

    /**
     * 
     * @return
     *     The repaymentInterval
     */
    @JsonProperty("repayment_interval")
    public String getRepaymentInterval() {
        return repaymentInterval;
    }

    /**
     * 
     * @param repaymentInterval
     *     The repayment_interval
     */
    @JsonProperty("repayment_interval")
    public void setRepaymentInterval(String repaymentInterval) {
        this.repaymentInterval = repaymentInterval;
    }

    /**
     * 
     * @return
     *     The repaymentTerm
     */
    @JsonProperty("repayment_term")
    public Integer getRepaymentTerm() {
        return repaymentTerm;
    }

    /**
     * 
     * @param repaymentTerm
     *     The repayment_term
     */
    @JsonProperty("repayment_term")
    public void setRepaymentTerm(Integer repaymentTerm) {
        this.repaymentTerm = repaymentTerm;
    }

    /**
     * 
     * @return
     *     The loanAmount
     */
    @JsonProperty("loan_amount")
    public Integer getLoanAmount() {
        return loanAmount;
    }

    /**
     * 
     * @param loanAmount
     *     The loan_amount
     */
    @JsonProperty("loan_amount")
    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * 
     * @return
     *     The localPayments
     */
    @JsonProperty("local_payments")
    public List<LocalPayment> getLocalPayments() {
        return localPayments;
    }

    /**
     * 
     * @param localPayments
     *     The local_payments
     */
    @JsonProperty("local_payments")
    public void setLocalPayments(List<LocalPayment> localPayments) {
        this.localPayments = localPayments;
    }

    /**
     * 
     * @return
     *     The scheduledPayments
     */
    @JsonProperty("scheduled_payments")
    public List<ScheduledPayment> getScheduledPayments() {
        return scheduledPayments;
    }

    /**
     * 
     * @param scheduledPayments
     *     The scheduled_payments
     */
    @JsonProperty("scheduled_payments")
    public void setScheduledPayments(List<ScheduledPayment> scheduledPayments) {
        this.scheduledPayments = scheduledPayments;
    }

    /**
     * 
     * @return
     *     The lossLiability
     */
    @JsonProperty("loss_liability")
    public LossLiability getLossLiability() {
        return lossLiability;
    }

    /**
     * 
     * @param lossLiability
     *     The loss_liability
     */
    @JsonProperty("loss_liability")
    public void setLossLiability(LossLiability lossLiability) {
        this.lossLiability = lossLiability;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
