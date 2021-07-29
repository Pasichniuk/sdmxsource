/*******************************************************************************
 * Copyright (c) 2013 Metadata Technology Ltd.
 *
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the GNU Lesser General Public License v 3.0 
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This file is part of the SDMX Component Library.
 *
 * The SDMX Component Library is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * The SDMX Component Library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser 
 * General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License 
 * along with The SDMX Component Library If not, see 
 * http://www.gnu.org/licenses/lgpl.
 *
 * Contributors:
 * Metadata Technology - initial API and implementation
 ******************************************************************************/
package org.sdmxsource.sdmx.api.model.superbeans.metadata;

import org.sdmxsource.sdmx.api.model.metadata.TargetBean;
import org.sdmxsource.sdmx.api.model.superbeans.base.SuperBean;

import java.util.List;


/**
 * Target contains a set of target reference values which when taken together,
 * identify the object or objects to which the reported metadata apply.
 *
 * @author Matt Nelson
 */
public interface TargetSuperBean extends SuperBean {

    String getId();

    List<ReferenceValueSuperBean> getReferenceValues();

    /**
     * Override from parent - returns the ReferenceValueBean that was used to build this SuperBean
     */
    @Override
    TargetBean getBuiltFrom();
}
