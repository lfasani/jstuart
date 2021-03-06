
package fr.obeo.tools.stuart.pmi;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Noncode {

    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("format")
    @Expose
    private String format;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Noncode() {
    }

    /**
     * 
     * @param value
     * @param format
     */
    public Noncode(String value, String format) {
        this.value = value;
        this.format = format;
    }

    /**
     * 
     * @return
     *     The value
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(String value) {
        this.value = value;
    }

    public Noncode withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 
     * @return
     *     The format
     */
    public String getFormat() {
        return format;
    }

    /**
     * 
     * @param format
     *     The format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    public Noncode withFormat(String format) {
        this.format = format;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
