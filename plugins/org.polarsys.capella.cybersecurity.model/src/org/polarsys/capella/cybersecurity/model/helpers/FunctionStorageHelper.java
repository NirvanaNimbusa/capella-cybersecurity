/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.cybersecurity.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.cybersecurity.model.FunctionStorage;

/**
 * @generated
 */
public class FunctionStorageHelper {

  private static final FunctionStorageHelper instance = new FunctionStorageHelper();

  /**
   * @generated
   */
  public static FunctionStorageHelper getInstance() {
    return instance;
  }

  /**
   * @generated
   */
  public Object doSwitch(FunctionStorage object, EStructuralFeature feature) {
    // handle derivated feature

    // delegate to parent helper
    return org.polarsys.capella.common.data.helpers.modellingcore.delegates.ModelElementHelper.getInstance()
        .doSwitch(object, feature);

  }

}