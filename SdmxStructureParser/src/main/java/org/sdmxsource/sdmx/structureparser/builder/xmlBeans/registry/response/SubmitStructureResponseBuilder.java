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
package org.sdmxsource.sdmx.structureparser.builder.xmlBeans.registry.response;

import org.apache.xmlbeans.XmlObject;
import org.sdmxsource.sdmx.api.constants.SDMX_SCHEMA;
import org.sdmxsource.sdmx.api.model.beans.SdmxBeans;
import org.sdmxsource.sdmx.api.model.beans.reference.StructureReferenceBean;


/**
 * A class supporting this interface can build error and success responses for submitting structures.
 */
public interface SubmitStructureResponseBuilder {

    /**
     * Returns an error response based on the submitted beans and exception
     *
     * @param th             - the error
     * @param errorReference the error reference
     * @param schemaVersion  - the version of the schema to output the response in
     * @return xml object
     */
    XmlObject buildErrorResponse(Throwable th, StructureReferenceBean errorReference, SDMX_SCHEMA schemaVersion);

    /**
     * Builds a success response based on the submitted beans
     *
     * @param beans         - the beans that were successfully submitted
     * @param schemaVersion - the version of the schema to output the response in
     * @return xml object
     */
    XmlObject buildSuccessResponse(SdmxBeans beans, SDMX_SCHEMA schemaVersion);
}
