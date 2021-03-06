/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:06:10 PM CDT 
//

package com.dell.isg.smi.commons.model.storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class StorageAlert.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "createTime", "objectName", "message", "type", "alertStatus", "acknowledged", "alertDefinition", "category" })
@XmlRootElement(name = "StorageAlert")
public class StorageAlert {

    @XmlElement(required = true)
    protected String createTime;
    @XmlElement(required = true)
    protected String objectName;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    protected StorageAlertType type;
    @XmlElement(required = true)
    protected StorageAlertStatus alertStatus;
    protected boolean acknowledged;
    @XmlElement(required = true)
    protected String alertDefinition;
    @XmlElement(required = true)
    protected StorageAlertCategory category;


    /**
     * Gets the value of the createTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCreateTime() {
        return createTime;
    }


    /**
     * Sets the value of the createTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }


    /**
     * Gets the value of the objectName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getObjectName() {
        return objectName;
    }


    /**
     * Sets the value of the objectName property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }


    /**
     * Gets the value of the message property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMessage() {
        return message;
    }


    /**
     * Sets the value of the message property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setMessage(String value) {
        this.message = value;
    }


    /**
     * Gets the value of the type property.
     * 
     * @return possible object is {@link StorageAlertType }
     * 
     */
    public StorageAlertType getType() {
        return type;
    }


    /**
     * Sets the value of the type property.
     * 
     * @param value allowed object is {@link StorageAlertType }
     * 
     */
    public void setType(StorageAlertType value) {
        this.type = value;
    }


    /**
     * Gets the value of the alertStatus property.
     * 
     * @return possible object is {@link StorageAlertStatus }
     * 
     */
    public StorageAlertStatus getAlertStatus() {
        return alertStatus;
    }


    /**
     * Sets the value of the alertStatus property.
     * 
     * @param value allowed object is {@link StorageAlertStatus }
     * 
     */
    public void setAlertStatus(StorageAlertStatus value) {
        this.alertStatus = value;
    }


    /**
     * Gets the value of the acknowledged property.
     *
     * @return true, if is acknowledged
     */
    public boolean isAcknowledged() {
        return acknowledged;
    }


    /**
     * Sets the value of the acknowledged property.
     *
     * @param value the new acknowledged
     */
    public void setAcknowledged(boolean value) {
        this.acknowledged = value;
    }


    /**
     * Gets the value of the alertDefinition property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAlertDefinition() {
        return alertDefinition;
    }


    /**
     * Sets the value of the alertDefinition property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setAlertDefinition(String value) {
        this.alertDefinition = value;
    }


    /**
     * Gets the value of the category property.
     * 
     * @return possible object is {@link StorageAlertCategory }
     * 
     */
    public StorageAlertCategory getCategory() {
        return category;
    }


    /**
     * Sets the value of the category property.
     * 
     * @param value allowed object is {@link StorageAlertCategory }
     * 
     */
    public void setCategory(StorageAlertCategory value) {
        this.category = value;
    }

}
