//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.10.27 at 01:27:01 PM CEST
//
package org.modelio.module.javadesigner.xmlreverse.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * &lt;choice maxOccurs="unbounded" minOccurs="0">
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}base-type"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}class-type"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}note"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}stereotype"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}tagged-value"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}constraint"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}value"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}attribute"/>
 * &lt;/choice>
 * &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="multiplicity-min" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="multiplicity-max" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="aggregation">
 * &lt;simpleType>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 * &lt;enumeration value="KindIsAssociation"/>
 * &lt;enumeration value="KindIsAggregation"/>
 * &lt;enumeration value="KindIsComposition"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * &lt;/attribute>
 * &lt;attribute name="is-ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 * &lt;attribute name="is-navigable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 * &lt;attribute name="is-changeable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 * &lt;attribute name="changeable">
 * &lt;simpleType>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 * &lt;enumeration value="Read"/>
 * &lt;enumeration value="Write"/>
 * &lt;enumeration value="ReadWrite"/>
 * &lt;enumeration value="AccessNone"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * &lt;/attribute>
 * &lt;attribute name="is-abstract" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 * &lt;attribute name="is-class" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 * &lt;attribute name="visibility">
 * &lt;simpleType>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 * &lt;enumeration value="Public"/>
 * &lt;enumeration value="Protected"/>
 * &lt;enumeration value="Private"/>
 * &lt;enumeration value="Visibility_Undefined"/>
 * &lt;enumeration value="Package_Visibility"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * &lt;/attribute>
 * &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="refid" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="objid" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "baseTypeOrClassTypeOrNote"
})
@XmlRootElement(name = "association-end")
public class JaxbAssociationEnd implements IVisitorElement {
    
    @XmlAttribute(required = true)
    protected String name;

    
    @XmlAttribute(name = "multiplicity-min")
    protected String multiplicityMin;

    
    @XmlAttribute(name = "multiplicity-max")
    protected String multiplicityMax;

    
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String aggregation;

    
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String changeable;

    
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visibility;

    
    @XmlAttribute
    protected String id;

    
    @XmlAttribute
    protected String objid;

    
    @XmlAttribute(name = "is-ordered")
    protected Boolean isOrdered;

    
    @XmlAttribute(name = "is-navigable")
    protected Boolean isNavigable;

    
    @XmlAttribute(name = "is-changeable")
    protected Boolean isChangeable;

    
    @XmlAttribute(name = "is-abstract")
    protected Boolean isAbstract;

    
    @XmlAttribute(name = "is-class")
    protected Boolean isClass;

    
    @XmlAttribute
    protected String refid;

    
    @XmlElementRefs({
        @XmlElementRef(name = "base-type", namespace = "http://www.modeliosoft.com/rev-modele.xsd", type = JAXBElement.class),
        @XmlElementRef(name = "stereotype", namespace = "http://www.modeliosoft.com/rev-modele.xsd", type = JaxbStereotype.class),
        @XmlElementRef(name = "constraint", namespace = "http://www.modeliosoft.com/rev-modele.xsd", type = JaxbConstraint.class),
        @XmlElementRef(name = "attribute", namespace = "http://www.modeliosoft.com/rev-modele.xsd", type = JaxbAttribute.class),
        @XmlElementRef(name = "value", namespace = "http://www.modeliosoft.com/rev-modele.xsd", type = JAXBElement.class),
        @XmlElementRef(name = "class-type", namespace = "http://www.modeliosoft.com/rev-modele.xsd", type = JaxbClassType.class),
        @XmlElementRef(name = "tagged-value", namespace = "http://www.modeliosoft.com/rev-modele.xsd", type = JaxbTaggedValue.class),
        @XmlElementRef(name = "note", namespace = "http://www.modeliosoft.com/rev-modele.xsd", type = JaxbNote.class)

})
    protected List<Object> baseTypeOrClassTypeOrNote;

    /**
     * Gets the value of the baseTypeOrClassTypeOrNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseTypeOrClassTypeOrNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getBaseTypeOrClassTypeOrNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JaxbStereotype }
     * {@link JaxbConstraint }
     * {@link JaxbAttribute }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JaxbClassType }
     * {@link JaxbTaggedValue }
     * {@link JaxbNote }
     */
    
    public List<Object> getBaseTypeOrClassTypeOrNote() {
        if (this.baseTypeOrClassTypeOrNote == null) {
            this.baseTypeOrClassTypeOrNote = new ArrayList<>();
        }
        return this.baseTypeOrClassTypeOrNote;
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
     * Gets the value of the multiplicityMin property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getMultiplicityMin() {
        return this.multiplicityMin;
    }

    /**
     * Sets the value of the multiplicityMin property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setMultiplicityMin(final String value) {
        this.multiplicityMin = value;
    }

    /**
     * Gets the value of the multiplicityMax property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getMultiplicityMax() {
        return this.multiplicityMax;
    }

    /**
     * Sets the value of the multiplicityMax property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setMultiplicityMax(final String value) {
        this.multiplicityMax = value;
    }

    /**
     * Gets the value of the aggregation property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getAggregation() {
        return this.aggregation;
    }

    /**
     * Sets the value of the aggregation property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setAggregation(final String value) {
        this.aggregation = value;
    }

    /**
     * Gets the value of the isOrdered property.
     * @return
     * possible object is
     * {@link Boolean }
     */
    
    public Boolean isIsOrdered() {
        return this.isOrdered;
    }

    /**
     * Sets the value of the isOrdered property.
     * @param value allowed object is
     * {@link Boolean }
     */
    
    public void setIsOrdered(final Boolean value) {
        this.isOrdered = value;
    }

    /**
     * Gets the value of the isNavigable property.
     * @return
     * possible object is
     * {@link Boolean }
     */
    
    public Boolean isIsNavigable() {
        return this.isNavigable;
    }

    /**
     * Sets the value of the isNavigable property.
     * @param value allowed object is
     * {@link Boolean }
     */
    
    public void setIsNavigable(final Boolean value) {
        this.isNavigable = value;
    }

    /**
     * Gets the value of the isChangeable property.
     * @return
     * possible object is
     * {@link Boolean }
     */
    
    public Boolean isIsChangeable() {
        return this.isChangeable;
    }

    /**
     * Sets the value of the isChangeable property.
     * @param value allowed object is
     * {@link Boolean }
     */
    
    public void setIsChangeable(final Boolean value) {
        this.isChangeable = value;
    }

    /**
     * Gets the value of the changeable property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getChangeable() {
        return this.changeable;
    }

    /**
     * Sets the value of the changeable property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setChangeable(final String value) {
        this.changeable = value;
    }

    /**
     * Gets the value of the isAbstract property.
     * @return
     * possible object is
     * {@link Boolean }
     */
    
    public Boolean isIsAbstract() {
        return this.isAbstract;
    }

    /**
     * Sets the value of the isAbstract property.
     * @param value allowed object is
     * {@link Boolean }
     */
    
    public void setIsAbstract(final Boolean value) {
        this.isAbstract = value;
    }

    /**
     * Gets the value of the isClass property.
     * @return
     * possible object is
     * {@link Boolean }
     */
    
    public Boolean isIsClass() {
        return this.isClass;
    }

    /**
     * Sets the value of the isClass property.
     * @param value allowed object is
     * {@link Boolean }
     */
    
    public void setIsClass(final Boolean value) {
        this.isClass = value;
    }

    /**
     * Gets the value of the visibility property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getVisibility() {
        return this.visibility;
    }

    /**
     * Sets the value of the visibility property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setVisibility(final String value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the id property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getId() {
        return this.id;
    }

    /**
     * Sets the value of the id property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setId(final String value) {
        this.id = value;
    }

    /**
     * Gets the value of the objid property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getObjid() {
        return this.objid;
    }

    /**
     * Sets the value of the objid property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setObjid(final String value) {
        this.objid = value;
    }

    
    @Override
    public Object accept(final IReverseModelVisitor visitor) {
        return visitor.visitAssociationEnd(this);
    }

    /**
     * Gets the value of the refid property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getRefid() {
        return this.refid;
    }

    /**
     * Sets the value of the refid property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setRefid(final String value) {
        this.refid = value;
    }

}
