
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
    "entries",
    "bulkEntries"
})
public class JournalTotals {

    @JsonProperty("entries")
    private Integer entries;
    @JsonProperty("bulkEntries")
    private Integer bulkEntries;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The entries
     */
    @JsonProperty("entries")
    public Integer getEntries() {
        return entries;
    }

    /**
     * 
     * @param entries
     *     The entries
     */
    @JsonProperty("entries")
    public void setEntries(Integer entries) {
        this.entries = entries;
    }

    /**
     * 
     * @return
     *     The bulkEntries
     */
    @JsonProperty("bulkEntries")
    public Integer getBulkEntries() {
        return bulkEntries;
    }

    /**
     * 
     * @param bulkEntries
     *     The bulkEntries
     */
    @JsonProperty("bulkEntries")
    public void setBulkEntries(Integer bulkEntries) {
        this.bulkEntries = bulkEntries;
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
