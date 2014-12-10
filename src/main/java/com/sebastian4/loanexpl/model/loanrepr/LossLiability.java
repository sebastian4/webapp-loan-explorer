
package com.sebastian4.loanexpl.model.loanrepr;

import java.util.HashMap;
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
    "nonpayment",
    "currency_exchange",
    "currency_exchange_coverage_rate"
})
public class LossLiability {

    @JsonProperty("nonpayment")
    private String nonpayment;
    @JsonProperty("currency_exchange")
    private String currencyExchange;
    @JsonProperty("currency_exchange_coverage_rate")
    private Double currencyExchangeCoverageRate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The nonpayment
     */
    @JsonProperty("nonpayment")
    public String getNonpayment() {
        return nonpayment;
    }

    /**
     * 
     * @param nonpayment
     *     The nonpayment
     */
    @JsonProperty("nonpayment")
    public void setNonpayment(String nonpayment) {
        this.nonpayment = nonpayment;
    }

    /**
     * 
     * @return
     *     The currencyExchange
     */
    @JsonProperty("currency_exchange")
    public String getCurrencyExchange() {
        return currencyExchange;
    }

    /**
     * 
     * @param currencyExchange
     *     The currency_exchange
     */
    @JsonProperty("currency_exchange")
    public void setCurrencyExchange(String currencyExchange) {
        this.currencyExchange = currencyExchange;
    }

    /**
     * 
     * @return
     *     The currencyExchangeCoverageRate
     */
    @JsonProperty("currency_exchange_coverage_rate")
    public Double getCurrencyExchangeCoverageRate() {
        return currencyExchangeCoverageRate;
    }

    /**
     * 
     * @param currencyExchangeCoverageRate
     *     The currency_exchange_coverage_rate
     */
    @JsonProperty("currency_exchange_coverage_rate")
    public void setCurrencyExchangeCoverageRate(Double currencyExchangeCoverageRate) {
        this.currencyExchangeCoverageRate = currencyExchangeCoverageRate;
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
