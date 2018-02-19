//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.12 at 12:57:34 PM SAST
//


package com.iqa.generated.qualifications;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="skill" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="areOfSpecialization" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="proficiency" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = {
    "skill"
})
@XmlRootElement(name = "Skills")
public class Skills {

    protected List<Skill> skill;

    /**
     * Gets the value of the skill property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skill property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkill().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Skill }
     *
     *
     */
    public List<Skill> getSkill() {
        if (skill == null) {
            skill = new ArrayList<Skill>();
        }
        return this.skill;
    }


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
     *         &lt;element name="areOfSpecialization" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="proficiency" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "areOfSpecialization",
        "proficiency"
    })
    public static class Skill {

        @XmlElement(required = true)
        protected String areOfSpecialization;
        @XmlElement(required = true)
        protected String proficiency;

        /**
         * Gets the value of the areOfSpecialization property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreOfSpecialization() {
            return areOfSpecialization;
        }

        /**
         * Sets the value of the areOfSpecialization property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreOfSpecialization(String value) {
            this.areOfSpecialization = value;
        }

        /**
         * Gets the value of the proficiency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProficiency() {
            return proficiency;
        }

        /**
         * Sets the value of the proficiency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProficiency(String value) {
            this.proficiency = value;
        }

    }

}