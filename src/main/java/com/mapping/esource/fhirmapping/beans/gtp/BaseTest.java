//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.15 at 01:50:20 PM EDT 
//


package com.mapping.esource.fhirmapping.beans.gtp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.mapping.esource.fhirmapping.util.DateTimeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}PerformingLab"/>
 *         &lt;element ref="{}LabTest"/>
 *         &lt;element ref="{}ReceiverTest" minOccurs="0"/>
 *         &lt;element ref="{}LOINCTestCode" minOccurs="0"/>
 *         &lt;element ref="{}TestLevelComment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}BaseResult" minOccurs="0"/>
 *         &lt;element ref="{}TransactionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Status" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="D"/>
 *             &lt;enumeration value="N"/>
 *             &lt;enumeration value="X"/>
 *             &lt;maxLength value="13"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TestingDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="TestType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="S"/>
 *             &lt;enumeration value="N"/>
 *             &lt;enumeration value="U"/>
 *             &lt;maxLength value="22"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "performingLab",
    "labTest",
    "receiverTest",
    "loincTestCode",
    "testLevelComment",
    "baseResult",
    "transactionType"
})
@XmlRootElement(name = "BaseTest")
public class BaseTest
    implements Serializable
{

    private final static long serialVersionUID = 5190875983846359311L;
    @XmlElement(name = "PerformingLab", required = true)
    protected PerformingLab performingLab;
    @XmlElement(name = "LabTest", required = true)
    protected LabTest labTest;
    @XmlElement(name = "ReceiverTest")
    protected ReceiverTest receiverTest;
    @XmlElement(name = "LOINCTestCode")
    protected LOINCTestCode loincTestCode;
    @XmlElement(name = "TestLevelComment")
    protected List<String> testLevelComment;
    @XmlElement(name = "BaseResult")
    protected BaseResult baseResult;
    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlAttribute(name = "Status", required = true)
    protected String status;
    @XmlAttribute(name = "TestingDateTime")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date testingDateTime;
    @XmlAttribute(name = "TestType")
    protected String testType;

    /**
     * Gets the value of the performingLab property.
     * 
     * @return
     *     possible object is
     *     {@link PerformingLab }
     *     
     */
    public PerformingLab getPerformingLab() {
        return performingLab;
    }

    /**
     * Sets the value of the performingLab property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformingLab }
     *     
     */
    public void setPerformingLab(PerformingLab value) {
        this.performingLab = value;
    }

    /**
     * Gets the value of the labTest property.
     * 
     * @return
     *     possible object is
     *     {@link LabTest }
     *     
     */
    public LabTest getLabTest() {
        return labTest;
    }

    /**
     * Sets the value of the labTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabTest }
     *     
     */
    public void setLabTest(LabTest value) {
        this.labTest = value;
    }

    /**
     * Gets the value of the receiverTest property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverTest }
     *     
     */
    public ReceiverTest getReceiverTest() {
        return receiverTest;
    }

    /**
     * Sets the value of the receiverTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverTest }
     *     
     */
    public void setReceiverTest(ReceiverTest value) {
        this.receiverTest = value;
    }

    /**
     * Gets the value of the loincTestCode property.
     * 
     * @return
     *     possible object is
     *     {@link LOINCTestCode }
     *     
     */
    public LOINCTestCode getLOINCTestCode() {
        return loincTestCode;
    }

    /**
     * Sets the value of the loincTestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOINCTestCode }
     *     
     */
    public void setLOINCTestCode(LOINCTestCode value) {
        this.loincTestCode = value;
    }

    /**
     * Gets the value of the testLevelComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testLevelComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestLevelComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTestLevelComment() {
        if (testLevelComment == null) {
            testLevelComment = new ArrayList<String>();
        }
        return this.testLevelComment;
    }

    /**
     * Gets the value of the baseResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getBaseResult() {
        return baseResult;
    }

    /**
     * Sets the value of the baseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setBaseResult(BaseResult value) {
        this.baseResult = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the testingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTestingDateTime() {
        return testingDateTime;
    }

    /**
     * Sets the value of the testingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestingDateTime(Date value) {
        this.testingDateTime = value;
    }

    /**
     * Gets the value of the testType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestType() {
        return testType;
    }

    /**
     * Sets the value of the testType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestType(String value) {
        this.testType = value;
    }

}
