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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * The Enum VolumeSnapshotProfile.
 */
@XmlType(name = "VolumeSnapshotProfile")
@XmlEnum
public enum VolumeSnapshotProfile {

    @XmlEnumValue("Daily")
    DAILY("Daily"), @XmlEnumValue("Weekly")
    WEEKLY("Weekly");
    private final String value;


    /**
     * Instantiates a new volume snapshot profile.
     *
     * @param v the v
     */
    VolumeSnapshotProfile(String v) {
        value = v;
    }


    /**
     * Value.
     *
     * @return the string
     */
    public String value() {
        return value;
    }


    /**
     * From value.
     *
     * @param v the v
     * @return the volume snapshot profile
     */
    public static VolumeSnapshotProfile fromValue(String v) {
        for (VolumeSnapshotProfile c : VolumeSnapshotProfile.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
