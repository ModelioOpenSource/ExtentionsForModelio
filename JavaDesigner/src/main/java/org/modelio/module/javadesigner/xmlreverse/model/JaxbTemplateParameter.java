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
import jakarta.xml.bind.annotation.XmlElements;
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
 * &lt;choice maxOccurs="unbounded" minOccurs="0">
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}package"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}class"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}operation"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}attribute"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}association-end"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}default-value"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}type"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}default-type"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}tagged-value"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}stereotype"/>
 * &lt;/choice>
 * &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="refid" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "packageOrClazzOrOperation"
})
@XmlRootElement(name = "template-parameter")
public class JaxbTemplateParameter implements IVisitorElement {
    
    @XmlAttribute
    protected String id;

    
    @XmlAttribute(required = true)
    protected String name;

    
    @XmlAttribute
    protected String refid;

    
    @XmlElements({
    @XmlElement(name = "default-type", type = JaxbDefaultType.class),
    @XmlElement(name = "attribute", type = JaxbAttribute.class),
    @XmlElement(name = "class", type = JaxbClass.class),
    @XmlElement(name = "stereotype", type = JaxbStereotype.class),
    @XmlElement(name = "default-value", type = String.class),
    @XmlElement(name = "operation", type = JaxbOperation.class),
    @XmlElement(name = "package", type = JaxbPackage.class),
    @XmlElement(name = "type", type = JaxbType.class),
    @XmlElement(name = "tagged-value", type = JaxbTaggedValue.class),
    @XmlElement(name = "association-end", type = JaxbAssociationEnd.class)
})
    protected List<Object> packageOrClazzOrOperation;

    /**
     * Gets the value of the packageOrClazzOrOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageOrClazzOrOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getPackageOrClazzOrOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbDefaultType }
     * {@link JaxbAttribute }
     * {@link JaxbClass }
     * {@link JaxbStereotype }
     * {@link String }
     * {@link JaxbOperation }
     * {@link JaxbPackage }
     * {@link JaxbType }
     * {@link JaxbTaggedValue }
     * {@link JaxbAssociationEnd }
     */
    
    public List<Object> getPackageOrClazzOrOperation() {
        if (this.packageOrClazzOrOperation == null) {
            this.packageOrClazzOrOperation = new ArrayList<>();
        }
        return this.packageOrClazzOrOperation;
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

    
    @Override
    public Object accept(final IReverseModelVisitor visitor) {
        return visitor.visitTemplateParameter(this);
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
