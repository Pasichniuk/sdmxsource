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
package org.sdmxsource.sdmx.api.manager.retrieval.crossreference;

import org.sdmxsource.sdmx.api.constants.SDMX_STRUCTURE_TYPE;
import org.sdmxsource.sdmx.api.model.beans.base.IdentifiableBean;
import org.sdmxsource.sdmx.api.model.beans.base.MaintainableBean;
import org.sdmxsource.sdmx.api.model.beans.reference.StructureReferenceBean;

import java.util.Set;


/**
 * The CrossReferenceRetrievalManager is used to retrieve structures that cross reference or are cross referenced by the
 * given structures.
 */
public interface CrossReferencedRetrievalManager {

    /**
     * Returns a set of MaintainableBean  that are cross referenced by the structure(s) that match the reference parameter
     *
     * @param structureReference - What Do I Reference?
     * @param returnStub         if true, then will return the stubs that reference the structure
     * @param structures         an optional parameter to further filter the list by structure type
     * @return cross referenced structures
     */
    Set<MaintainableBean> getCrossReferencedStructures(StructureReferenceBean structureReference, boolean returnStub, SDMX_STRUCTURE_TYPE... structures);

    /**
     * Returns a set of MaintainableBean that are cross referenced by the given identifiable structure
     *
     * @param identifiable the identifiable bean to retrieve the references for - What Do I Reference?
     * @param returnStub   if true, then will return the stubs that reference the structure
     * @param structures   an optional parameter to further filter the list by structure type
     * @return cross referenced structures
     */
    Set<MaintainableBean> getCrossReferencedStructures(IdentifiableBean identifiable, boolean returnStub, SDMX_STRUCTURE_TYPE... structures);
}
