
package com.sebastian4.loanexpl.model.loansnew;

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
    "id",
    "name",
    "description",
    "status",
    "funded_amount",
    "basket_amount",
    "image",
    "activity",
    "sector",
    "use",
    "location",
    "partner_id",
    "posted_date",
    "planned_expiration_date",
    "loan_amount",
    "borrower_count",
    "lender_count",
    "bonus_credit_eligibility",
    "tags",
    "theme"
})
public class Loan {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private Description description;
    @JsonProperty("status")
    private String status;
    @JsonProperty("funded_amount")
    private Integer fundedAmount;
    @JsonProperty("basket_amount")
    private Integer basketAmount;
    @JsonProperty("image")
    private Image image;
    @JsonProperty("activity")
    private String activity;
    @JsonProperty("sector")
    private String sector;
    @JsonProperty("use")
    private String use;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("partner_id")
    private Integer partnerId;
    @JsonProperty("posted_date")
    private String postedDate;
    @JsonProperty("planned_expiration_date")
    private String plannedExpirationDate;
    @JsonProperty("loan_amount")
    private Integer loanAmount;
    @JsonProperty("borrower_count")
    private Integer borrowerCount;
    @JsonProperty("lender_count")
    private Integer lenderCount;
    @JsonProperty("bonus_credit_eligibility")
    private Boolean bonusCreditEligibility;
    @JsonProperty("tags")
    private List<Object> tags = new ArrayList<Object>();
    @JsonProperty("theme")
    private String theme;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public Description getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(Description description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The fundedAmount
     */
    @JsonProperty("funded_amount")
    public Integer getFundedAmount() {
        return fundedAmount;
    }

    /**
     * 
     * @param fundedAmount
     *     The funded_amount
     */
    @JsonProperty("funded_amount")
    public void setFundedAmount(Integer fundedAmount) {
        this.fundedAmount = fundedAmount;
    }

    /**
     * 
     * @return
     *     The basketAmount
     */
    @JsonProperty("basket_amount")
    public Integer getBasketAmount() {
        return basketAmount;
    }

    /**
     * 
     * @param basketAmount
     *     The basket_amount
     */
    @JsonProperty("basket_amount")
    public void setBasketAmount(Integer basketAmount) {
        this.basketAmount = basketAmount;
    }

    /**
     * 
     * @return
     *     The image
     */
    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The activity
     */
    @JsonProperty("activity")
    public String getActivity() {
        return activity;
    }

    /**
     * 
     * @param activity
     *     The activity
     */
    @JsonProperty("activity")
    public void setActivity(String activity) {
        this.activity = activity;
    }

    /**
     * 
     * @return
     *     The sector
     */
    @JsonProperty("sector")
    public String getSector() {
        return sector;
    }

    /**
     * 
     * @param sector
     *     The sector
     */
    @JsonProperty("sector")
    public void setSector(String sector) {
        this.sector = sector;
    }

    /**
     * 
     * @return
     *     The use
     */
    @JsonProperty("use")
    public String getUse() {
        return use;
    }

    /**
     * 
     * @param use
     *     The use
     */
    @JsonProperty("use")
    public void setUse(String use) {
        this.use = use;
    }

    /**
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The partnerId
     */
    @JsonProperty("partner_id")
    public Integer getPartnerId() {
        return partnerId;
    }

    /**
     * 
     * @param partnerId
     *     The partner_id
     */
    @JsonProperty("partner_id")
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * 
     * @return
     *     The postedDate
     */
    @JsonProperty("posted_date")
    public String getPostedDate() {
        return postedDate;
    }

    /**
     * 
     * @param postedDate
     *     The posted_date
     */
    @JsonProperty("posted_date")
    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    /**
     * 
     * @return
     *     The plannedExpirationDate
     */
    @JsonProperty("planned_expiration_date")
    public String getPlannedExpirationDate() {
        return plannedExpirationDate;
    }

    /**
     * 
     * @param plannedExpirationDate
     *     The planned_expiration_date
     */
    @JsonProperty("planned_expiration_date")
    public void setPlannedExpirationDate(String plannedExpirationDate) {
        this.plannedExpirationDate = plannedExpirationDate;
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
     *     The borrowerCount
     */
    @JsonProperty("borrower_count")
    public Integer getBorrowerCount() {
        return borrowerCount;
    }

    /**
     * 
     * @param borrowerCount
     *     The borrower_count
     */
    @JsonProperty("borrower_count")
    public void setBorrowerCount(Integer borrowerCount) {
        this.borrowerCount = borrowerCount;
    }

    /**
     * 
     * @return
     *     The lenderCount
     */
    @JsonProperty("lender_count")
    public Integer getLenderCount() {
        return lenderCount;
    }

    /**
     * 
     * @param lenderCount
     *     The lender_count
     */
    @JsonProperty("lender_count")
    public void setLenderCount(Integer lenderCount) {
        this.lenderCount = lenderCount;
    }

    /**
     * 
     * @return
     *     The bonusCreditEligibility
     */
    @JsonProperty("bonus_credit_eligibility")
    public Boolean getBonusCreditEligibility() {
        return bonusCreditEligibility;
    }

    /**
     * 
     * @param bonusCreditEligibility
     *     The bonus_credit_eligibility
     */
    @JsonProperty("bonus_credit_eligibility")
    public void setBonusCreditEligibility(Boolean bonusCreditEligibility) {
        this.bonusCreditEligibility = bonusCreditEligibility;
    }

    /**
     * 
     * @return
     *     The tags
     */
    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The theme
     */
    @JsonProperty("theme")
    public String getTheme() {
        return theme;
    }

    /**
     * 
     * @param theme
     *     The theme
     */
    @JsonProperty("theme")
    public void setTheme(String theme) {
        this.theme = theme;
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
