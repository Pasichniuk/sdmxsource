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
package org.sdmxsource.sdmx.api.model.beans.categoryscheme;

import org.sdmxsource.sdmx.api.model.beans.base.MaintainableBean;
import org.sdmxsource.sdmx.api.model.beans.reference.CrossReferenceBean;
import org.sdmxsource.sdmx.api.model.mutable.categoryscheme.CategorisationMutableBean;

import java.net.URL;


/**
 * Represents an SDMX Categorisation
 *
 * @author Matt Nelson
 */
public interface CategorisationBean extends MaintainableBean {

    /**
     * Returns a reference to the structure that this is categorising - this can not be null
     *
     * @return structure reference
     */
    CrossReferenceBean getStructureReference();

    /**
     * Returns a reference to the category that is categorising the structure - this can not be null
     *
     * @return category reference
     */
    CrossReferenceBean getCategoryReference();

    /**
     * Returns a stub reference of itself.
     * <p>
     * A stub bean only contains Maintainable and Identifiable Attributes, not the composite Objects that are
     * contained within the Maintainable
     *
     * @param actualLocation the URL indicating where the full structure can be returned from
     * @param isServiceUrl   if true this URL will be present on the serviceURL attribute, otherwise it will be treated as a structureURL attribute
     * @return the stub
     */
    @Override
    CategorisationBean getStub(URL actualLocation, boolean isServiceUrl);

    /**
     * Returns a representation of itself in a bean which can be modified, modifications to the mutable bean
     * are not reflected in the instance of the MaintainableBean.
     *
     * @return the mutable instance
     */
    @Override
    CategorisationMutableBean getMutableInstance();
}
