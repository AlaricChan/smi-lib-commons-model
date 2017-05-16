/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.17 at 12:15:24 AM CDT 
//

package com.dell.isg.smi.commons.model.commons.chassis.inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ChassisIomModel.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChassisIomModel", propOrder = { "id", "name", "number", "fabric", "serviceTag", "firmwareVersion", "hardwareVersion", "gateway", "ipAddress", "macAddress", "subnetMask", "role", "slot", "present", "dhcpEnabled", "powerStatus" })
public class ChassisIomModel {

    /**
     * Instantiates a new chassis iom model.
     */
    public ChassisIomModel() {
        super();
    }

    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String number;
    @XmlElement(required = true)
    protected String fabric;
    @XmlElement(required = true)
    protected String serviceTag;
    @XmlElement(required = true)
    protected String firmwareVersion;
    @XmlElement(required = true)
    protected String hardwareVersion;
    @XmlElement(required = true)
    protected String gateway;
    @XmlElement(required = true)
    protected String ipAddress;
    @XmlElement(required = true)
    protected String macAddress;
    @XmlElement(required = true)
    protected String subnetMask;
    @XmlElement(required = true)
    protected String role;
    @XmlElement(required = true)
    protected String slot;
    protected boolean present;
    protected boolean dhcpEnabled;
    @XmlElement(required = true)
    protected PowerStatus powerStatus;


    /**
     * Gets the value of the id property.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the value of the id property.
     *
     * @param value the new id
     */
    public void setId(long value) {
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
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * Gets the value of the number property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNumber() {
        return number;
    }


    /**
     * Sets the value of the number property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNumber(String value) {
        this.number = value;
    }


    /**
     * Gets the value of the fabric property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFabric() {
        return fabric;
    }


    /**
     * Sets the value of the fabric property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFabric(String value) {
        this.fabric = value;
    }


    /**
     * Gets the value of the serviceTag property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getServiceTag() {
        return serviceTag;
    }


    /**
     * Sets the value of the serviceTag property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setServiceTag(String value) {
        this.serviceTag = value;
    }


    /**
     * Gets the value of the firmwareVersion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }


    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }


    /**
     * Gets the value of the hardwareVersion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHardwareVersion() {
        return hardwareVersion;
    }


    /**
     * Sets the value of the hardwareVersion property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setHardwareVersion(String value) {
        this.hardwareVersion = value;
    }


    /**
     * Gets the value of the gateway property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getGateway() {
        return gateway;
    }


    /**
     * Sets the value of the gateway property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setGateway(String value) {
        this.gateway = value;
    }


    /**
     * Gets the value of the ipAddress property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }


    /**
     * Gets the value of the macAddress property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the value of the macAddress property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }


    /**
     * Gets the value of the subnetMask property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSubnetMask() {
        return subnetMask;
    }


    /**
     * Sets the value of the subnetMask property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSubnetMask(String value) {
        this.subnetMask = value;
    }


    /**
     * Gets the value of the role property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRole() {
        return role;
    }


    /**
     * Sets the value of the role property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setRole(String value) {
        this.role = value;
    }


    /**
     * Gets the value of the slot property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSlot() {
        return slot;
    }


    /**
     * Sets the value of the slot property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSlot(String value) {
        this.slot = value;
    }


    /**
     * Gets the value of the present property.
     *
     * @return true, if is present
     */
    public boolean isPresent() {
        return present;
    }


    /**
     * Sets the value of the present property.
     *
     * @param value the new present
     */
    public void setPresent(boolean value) {
        this.present = value;
    }


    /**
     * Gets the value of the dhcpEnabled property.
     *
     * @return true, if is dhcp enabled
     */
    public boolean isDhcpEnabled() {
        return dhcpEnabled;
    }


    /**
     * Sets the value of the dhcpEnabled property.
     *
     * @param value the new dhcp enabled
     */
    public void setDhcpEnabled(boolean value) {
        this.dhcpEnabled = value;
    }


    /**
     * Gets the value of the powerStatus property.
     * 
     * @return possible object is {@link PowerStatus }
     * 
     */
    public PowerStatus getPowerStatus() {
        return powerStatus;
    }


    /**
     * Sets the value of the powerStatus property.
     * 
     * @param value allowed object is {@link PowerStatus }
     * 
     */
    public void setPowerStatus(PowerStatus value) {
        this.powerStatus = value;
    }

}