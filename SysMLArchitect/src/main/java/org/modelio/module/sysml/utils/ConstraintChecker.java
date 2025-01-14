/**
 * Java Class : ConstraintChecker.java
 *
 * Description :
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing,
 *    software distributed under the License is distributed on an
 *    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *    KIND, either express or implied.  See the License for the
 *    specific language governing permissions and limitations
 *    under the License.
 *
 * @category   Util
 * @package    com.modeliosoft.modelio.sysml.utils
 * @author     Modelio
 * @license    http://www.apache.org/licenses/LICENSE-2.0
 * @version    2.0.08
 **/
package org.modelio.module.sysml.utils;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.module.sysml.api.ISysMLPeerModule;
import org.modelio.module.sysml.api.SysMLStereotypes;
import org.modelio.module.sysml.i18n.I18nMessageService;
import org.modelio.module.sysml.impl.SysMLModule;

/**
 * This class provides services for checking SysML profile constraintes
 * @author ebrosse
 */

public class ConstraintChecker {
    /**
     * Method CheckUpdatedElement
     * @author ebrosse
     * 
     * @param toCheck : the checked element
     */
    
    public static void CheckUpdatedElement(Element toCheck) {
        IModelingSession session = SysMLModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction (I18nMessageService.getString ("Info.Session.Create", "Check Update"))){
        
            if (toCheck instanceof Classifier){
                CheckUpdatedClassifier((Classifier) toCheck);
            }
        
            if (toCheck instanceof Port){
                CheckUpdatedPort((Port) toCheck);
            }
        
            if (toCheck instanceof Attribute){
                CheckUpdatedAttribute((Attribute) toCheck);
            }
        
            if (toCheck instanceof BindableInstance){
                CheckUpdatedBindableInstance((BindableInstance) toCheck);
            }
        
            if (toCheck instanceof Interface){
                CheckUpdatedInterface((Interface) toCheck);
            }
        
            transaction.commit();
        }
    }

    /**
     * Method CheckUpdatedInterface
     * @author ebrosse
     */
    
    private static void CheckUpdatedInterface(Interface toCheck) {
        /**Flow specifications cannot own operations or receptions (they can only own FlowProperties).**/
        /**Every ?ownedAttribute? of a FlowSpecification must be a FlowProperty**/
        if (toCheck.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.FLOWSPECIFICATION)){
            boolean ownedOperation = toCheck.getOwnedOperation().size() > 0;
            boolean ownedSimpleAttribute = false;
        
            for(Attribute current :toCheck.getOwnedAttribute() ){
                if ( !(current.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.FLOWPROPERTY)))
                    ownedSimpleAttribute = true;
            }
        
            if (ownedOperation)
                MessageDialog.openInformation(Display.getDefault().getActiveShell()
                        ,"SysML"
                        ,I18nMessageService.getString("Ui.I18nMessageService.FlowSpecificationCannotOwnOperations"));
        
        
            if (ownedSimpleAttribute)
                MessageDialog.openInformation(Display.getDefault().getActiveShell()
                        ,"SysML"
                        ,I18nMessageService.getString("Ui.I18nMessageService.FlowSpecificationCannotOwnSimpleAttribute"));
        
        }
    }

    /**
     * Method CheckCreatedElement
     * @author ebrosse
     * 
     * @param toCheck : the MObject to check
     */
    
    public static void CheckCreatedElement(Element toCheck) {
        IModelingSession session = SysMLModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction (I18nMessageService.getString ("Info.Session.Create", "Activity"))){
        
            if (toCheck instanceof Operation){
                CheckCreatedOperation((Operation) toCheck);
            }
        
            if (toCheck instanceof Attribute){
                CheckCreatedAttribute((Attribute) toCheck);
            }
        
            transaction.commit();
        }
    }

    /**
     * Method CheckCreatedOperation
     * @author ebrosse
     */
    
    private static void CheckCreatedOperation(Operation toCheck) {
        /**Flow specifications cannot own operations or receptions (they can only own FlowProperties).**/
        Classifier owner = toCheck.getOwner();
        if (owner.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.FLOWSPECIFICATION)){
            MessageDialog.openInformation(Display.getDefault().getActiveShell()
                    ,"SysML"
                    ,I18nMessageService.getString("Ui.I18nMessageService.FlowSpecificationCannotOwnOperations"));
        
        }
    }

    /**
     * Method CheckCreatedAttribute
     * @author ebrosse
     */
    
    private static void CheckCreatedAttribute(Attribute toCheck) {
        /**Flow specifications cannot own operations or receptions (they can only own FlowProperties).**/
        Classifier owner = toCheck.getOwner();
        if (owner.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.FLOWSPECIFICATION)){
            MessageDialog.openInformation(Display.getDefault().getActiveShell()
                    ,"SysML"
                    ,I18nMessageService.getString("Ui.I18nMessageService.FlowSpecificationCannotOwnSimpleAttribute"));
        
        }
    }

    /**
     * Method CheckUpdatedClassifier
     * @author ebrosse
     */
    
    private static void CheckUpdatedClassifier(Classifier toCheck) {
        /**The name of a classifier to which a PropertySpecificType is applied must be missing. (The ?name? attribute of the NamedElement metaclass must be empty.)**/
        if  (toCheck.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.PROPERTYSPECIFICTYPE)){
            toCheck.setName("");
            MessageDialog.openInformation(Display.getDefault().getActiveShell()
                    ,"SysML"
                    ,I18nMessageService.getString("Ui.I18nMessageService.NameOfPropertySpecificTypeMustBeMissing"));
        
        }
    }

    /**
     * Method CheckUpdatedAttribute
     * @author ebrosse
     */
    
    private static void CheckUpdatedAttribute(Attribute toCheck) {
        /**If a property owned by a SysML Block or SysML ValueType is typed by a SysML ValueType,
        then the aggregation attribute of the property must be ?composite.?**/
        Classifier owner = toCheck.getOwner();
        GeneralClass type = toCheck.getType();
        if ((owner.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.BLOCK) || owner.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.VALUETYPE))
                && ((type != null) && (type.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.VALUETYPE)))){
            MessageDialog.openInformation(Display.getDefault().getActiveShell()
                    ,"SysML"
                    ,I18nMessageService.getString("Ui.I18nMessageService.ValueTypePropertyMustBeComposite"));
        
        }
        
        /**The DistributedProperty stereotype may be applied only to properties of classifiers stereotyped by Block or ValueType**/
        if ( (toCheck.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.DISTRIBUTEDPROPERTY)) && 
                ( !    (owner.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.BLOCK) || owner.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.VALUETYPE))))
            MessageDialog.openInformation(Display.getDefault().getActiveShell()
                    ,"SysML"
                    ,I18nMessageService.getString("Ui.I18nMessageService.DistributedPropertyOwnerMustBeBlockOrValueType"));
        
        
        /**A FlowProperty is typed by a ValueType, Block, or Signal.**/
        if ((type != null) && (toCheck.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.FLOWPROPERTY)) && 
                ( !    (type.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.BLOCK) || type.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.VALUETYPE) 
                        || (type instanceof Signal))))
            MessageDialog.openInformation(Display.getDefault().getActiveShell()
                    ,"SysML"
                    ,I18nMessageService.getString("Ui.I18nMessageService.FlowPropertyTypeControl"));
    }

    /**
     * Method CheckUpdatedPort
     * @author ebrosse
     */
    
    private static void CheckUpdatedPort(Port toCheck) {
        /**A FlowPort must be typed by a FlowSpecification, Block, Signal, or ValueType.**/
        NameSpace type = toCheck.getBase();
        if (toCheck.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.FLOWPORT) && (type != null) 
                && (!(type.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.FLOWSPECIFICATION) 
                        || type.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.BLOCK)
                        || type.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.VALUETYPE)
                        || (type instanceof Signal)))){
            MessageDialog.openInformation(Display.getDefault().getActiveShell(),
                    "SysML",
                    I18nMessageService.getString("Ui.I18nMessageService.FlowPropertyTypeControl"));
        
        }
    }

    /**
     * Method CheckUpdatedBindableInstance
     * @author ebrosse
     */
    
    private static void CheckUpdatedBindableInstance(BindableInstance toCheck) {
        /**ConnectorProperty may only be applied to properties of classes stereotyped by Block.**/
        Classifier owner = toCheck.getInternalOwner();
        if ((owner != null) && (toCheck.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.CONNECTORPROPERTY)) && ( !owner.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.BLOCK)))
            MessageDialog.openInformation(Display.getDefault().getActiveShell(),
                    "SysML",
                    I18nMessageService.getString("Ui.I18nMessageService.ConnectorPropertyOwnerMustBeBlock"));
        
        /**The DistributedProperty stereotype may be applied only to properties of classifiers stereotyped by Block or ValueType**/
        if ((owner != null) && (toCheck.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.DISTRIBUTEDPROPERTY)) && 
                ( !    (owner.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.BLOCK) || owner.isStereotyped(ISysMLPeerModule.MODULE_NAME,SysMLStereotypes.VALUETYPE))))
            MessageDialog.openInformation(Display.getDefault().getActiveShell(),
                    "SysML",
                    I18nMessageService.getString("Ui.I18nMessageService.DistributedPropertyOwnerMustBeBlockOrValueType"));
    }

}
