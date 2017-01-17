
package by.nbrb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2001.xmlschema.Schema;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrenciesRefDailyResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.w3.org/2001/XMLSchema}schema"/>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "currenciesRefDailyResult" })
@XmlRootElement(name = "CurrenciesRefDailyResponse")
public class CurrenciesRefDailyResponse {

    @XmlElement(name = "CurrenciesRefDailyResult")
    protected CurrenciesRefDailyResponse.CurrenciesRefDailyResult currenciesRefDailyResult;

    /**
     * Gets the value of the currenciesRefDailyResult property.
     * 
     * @return possible object is
     *         {@link CurrenciesRefDailyResponse.CurrenciesRefDailyResult }
     * 
     */
    public CurrenciesRefDailyResponse.CurrenciesRefDailyResult getCurrenciesRefDailyResult() {
        return currenciesRefDailyResult;
    }

    /**
     * Sets the value of the currenciesRefDailyResult property.
     * 
     * @param value
     *            allowed object is
     *            {@link CurrenciesRefDailyResponse.CurrenciesRefDailyResult }
     * 
     */
    public void setCurrenciesRefDailyResult(CurrenciesRefDailyResponse.CurrenciesRefDailyResult value) {
        this.currenciesRefDailyResult = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.w3.org/2001/XMLSchema}schema"/>
     *         &lt;any/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "schema", "any" })
    public static class CurrenciesRefDailyResult {

        @XmlElement(namespace = "http://www.w3.org/2001/XMLSchema", required = true)
        protected Schema schema;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the schema property.
         * 
         * @return possible object is {@link Schema }
         * 
         */
        public Schema getSchema() {
            return schema;
        }

        /**
         * Sets the value of the schema property.
         * 
         * @param value
         *            allowed object is {@link Schema }
         * 
         */
        public void setSchema(Schema value) {
            this.schema = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * @return possible object is {@link Object }
         * 
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *            allowed object is {@link Object }
         * 
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
