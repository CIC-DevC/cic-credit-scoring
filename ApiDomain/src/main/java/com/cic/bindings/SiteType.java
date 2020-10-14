//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.09.21 at 01:55:40 PM PDT
//

package com.cic.bindings;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for siteType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="siteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="numUsers" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="storage" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://tableau.com/api}resourceIdType" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contentUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="adminMode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ContentOnly"/>
 *             &lt;enumeration value="ContentAndUsers"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="userQuota" type="{http://tableau.com/api}siteQuotaType" />
 *       &lt;attribute name="storageQuota" type="{http://tableau.com/api}siteQuotaType" />
 *       &lt;attribute name="disableSubscriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="state">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Active"/>
 *             &lt;enumeration value="Suspended"/>
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
@XmlType(name = "siteType", propOrder = { "usage" })
public class SiteType {

    protected SiteType.Usage usage;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "contentUrl")
    protected String contentUrl;
    @XmlAttribute(name = "adminMode")
    protected String adminMode;
    @XmlAttribute(name = "userQuota")
    protected BigInteger userQuota;
    @XmlAttribute(name = "storageQuota")
    protected BigInteger storageQuota;
    @XmlAttribute(name = "disableSubscriptions")
    protected Boolean disableSubscriptions;
    @XmlAttribute(name = "state")
    protected String state;

    /**
     * Gets the value of the usage property.
     *
     * @return possible object is {@link SiteType.Usage }
     *
     */
    public SiteType.Usage getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     *
     * @param value
     *            allowed object is {@link SiteType.Usage }
     *
     */
    public void setUsage(SiteType.Usage value) {
        this.usage = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the contentUrl property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * Sets the value of the contentUrl property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setContentUrl(String value) {
        this.contentUrl = value;
    }

    /**
     * Gets the value of the adminMode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAdminMode() {
        return adminMode;
    }

    /**
     * Sets the value of the adminMode property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setAdminMode(String value) {
        this.adminMode = value;
    }

    /**
     * Gets the value of the userQuota property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getUserQuota() {
        return userQuota;
    }

    /**
     * Sets the value of the userQuota property.
     *
     * @param value
     *            allowed object is {@link BigInteger }
     *
     */
    public void setUserQuota(BigInteger value) {
        this.userQuota = value;
    }

    /**
     * Gets the value of the storageQuota property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getStorageQuota() {
        return storageQuota;
    }

    /**
     * Sets the value of the storageQuota property.
     *
     * @param value
     *            allowed object is {@link BigInteger }
     *
     */
    public void setStorageQuota(BigInteger value) {
        this.storageQuota = value;
    }

    /**
     * Gets the value of the disableSubscriptions property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isDisableSubscriptions() {
        return disableSubscriptions;
    }

    /**
     * Sets the value of the disableSubscriptions property.
     *
     * @param value
     *            allowed object is {@link Boolean }
     *
     */
    public void setDisableSubscriptions(Boolean value) {
        this.disableSubscriptions = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setState(String value) {
        this.state = value;
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
     *       &lt;attribute name="numUsers" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="storage" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Usage {

        @XmlAttribute(name = "numUsers", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger numUsers;
        @XmlAttribute(name = "storage", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger storage;

        /**
         * Gets the value of the numUsers property.
         *
         * @return possible object is {@link BigInteger }
         *
         */
        public BigInteger getNumUsers() {
            return numUsers;
        }

        /**
         * Sets the value of the numUsers property.
         *
         * @param value
         *            allowed object is {@link BigInteger }
         *
         */
        public void setNumUsers(BigInteger value) {
            this.numUsers = value;
        }

        /**
         * Gets the value of the storage property.
         *
         * @return possible object is {@link BigInteger }
         *
         */
        public BigInteger getStorage() {
            return storage;
        }

        /**
         * Sets the value of the storage property.
         *
         * @param value
         *            allowed object is {@link BigInteger }
         *
         */
        public void setStorage(BigInteger value) {
            this.storage = value;
        }

    }

}
