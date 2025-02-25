//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.10.27 at 01:27:01 PM CEST
//
package org.modelio.module.javadesigner.xmlreverse.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.modelio.module.javadesigner.xmlreverse.model.defaultvisitor.IReverseModelVisitor;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}tag-parameter" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="tag-type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tagParameter"
})
@XmlRootElement(name = "tagged-value")
public class JaxbTaggedValue implements IVisitorElement {
    
    @XmlAttribute
    protected String name;

    
    @XmlAttribute(name = "tag-type", required = true)
    protected String tagType;

    
    @XmlElement(name = "tag-parameter")
    protected List<String> tagParameter;

    /**
     * Gets the value of the tagParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tagParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getTagParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    
    public List<String> getTagParameter() {
        if (this.tagParameter == null) {
            this.tagParameter = new ArrayList<>();
        }
        return this.tagParameter;
    }

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setName(final String value) {
        this.name = value;
    }

    /**
     * Gets the value of the tagType property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getTagType() {
        return this.tagType;
    }

    /**
     * Sets the value of the tagType property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setTagType(final String value) {
        this.tagType = value;
    }

    
    @Override
    public Object accept(final IReverseModelVisitor visitor) {
        return visitor.visitTaggedValue(this);
    }

}
