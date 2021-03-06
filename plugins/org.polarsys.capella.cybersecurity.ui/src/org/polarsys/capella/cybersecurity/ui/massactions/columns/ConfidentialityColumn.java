/*******************************************************************************
 * Copyright (c) 2019, 2020 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.cybersecurity.ui.massactions.columns;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.data.convert.DefaultIntegerDisplayConverter;
import org.eclipse.nebula.widgets.nattable.data.convert.IDisplayConverter;
import org.polarsys.capella.cybersecurity.model.CybersecurityQueries;
import org.polarsys.capella.cybersecurity.model.SecurityNeeds;
import org.polarsys.capella.cybersecurity.ui.massactions.Messages;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

public class ConfidentialityColumn extends AbstractCybersecurityColumn {
  public ConfidentialityColumn() {
    id = getClass().getCanonicalName();
    label = Messages.PrimaryAssetColumns_Name_Confidentiality;
    name = Messages.PrimaryAssetColumns_Label_Confidentiality;
  }

  @Override
  public Object getDataValue(EObject rowObject) {
    SecurityNeeds sn = CybersecurityQueries.getSecurityNeeds((ExtensibleElement) rowObject);
    if (sn != null) {
      return sn.getConfidentiality();
    }
    
    // consistency with the property view
    return 0;
  }
  
  @Override
  public void setDataValue(EObject rowObject, Object newValue) {
    if (newValue instanceof Integer) {
      getCyberService().setConfidentiality((ExtensibleElement) rowObject, (Integer) newValue);
    }
  }
  
  @Override
  protected IDisplayConverter createDisplayConverter() {
    return new DefaultIntegerDisplayConverter();
  }
}