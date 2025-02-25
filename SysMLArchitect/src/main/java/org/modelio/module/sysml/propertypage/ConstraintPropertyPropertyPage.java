/**
 * Java Class : ConstraintPropertyPropertyPage.java
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
 * @category   PropertyDefinition page
 * @package    org.modelio.module.sysml.gui.propertypage
 * @author     Modelio
 * @license    http://www.apache.org/licenses/LICENSE-2.0
 * @version    2.0.08
 **/
package org.modelio.module.sysml.propertypage;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.module.sysml.i18n.I18nMessageService;

/**
 * This class handles the properties associated to the constraint proper stereotype
 * @author ebrosse
 */

public class ConstraintPropertyPropertyPage implements IPropertyContent {
    /**
     * Constructor ConstraintPropertyPropertyPage
     * @author ebrosse
     */
    
    public ConstraintPropertyPropertyPage() {
    }

    
    @Override
    public void changeProperty(ModelElement element, int row, String value) {
    }

    
    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        /*
         * Display Constraint
         */
        String valuetab = "";
        NameSpace type = ((BindableInstance) element).getBase();
        if (type != null){
            List<Constraint> constraints = type.getConstraintDefinition();
            if ((constraints != null) && (constraints.size() >= 1)){
                valuetab = valuetab.concat(constraints.get(0).getBody());
            }
        }
               
        table.addConsultProperty(I18nMessageService.getString("Ui.Property.Equation.Name"), valuetab);
    }

}
