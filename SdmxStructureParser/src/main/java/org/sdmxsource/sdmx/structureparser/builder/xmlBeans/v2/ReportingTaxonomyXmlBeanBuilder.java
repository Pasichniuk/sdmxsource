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
package org.sdmxsource.sdmx.structureparser.builder.xmlBeans.v2;

import org.sdmx.resources.sdmxml.schemas.v20.structure.ReportingTaxonomyType;
import org.sdmxsource.sdmx.api.exception.SdmxException;
import org.sdmxsource.sdmx.api.model.beans.categoryscheme.ReportingCategoryBean;
import org.sdmxsource.sdmx.api.model.beans.categoryscheme.ReportingTaxonomyBean;


/**
 * The type Reporting taxonomy xml bean builder.
 */
public class ReportingTaxonomyXmlBeanBuilder extends AbstractBuilder {

    private final CategoryXmlBeanBuilder categoryXmlBeanBuilder = new CategoryXmlBeanBuilder();

    /**
     * Build reporting taxonomy type.
     *
     * @param buildFrom the build from
     * @return the reporting taxonomy type
     * @throws SdmxException the sdmx exception
     */
    public ReportingTaxonomyType build(ReportingTaxonomyBean buildFrom) throws SdmxException {
        ReportingTaxonomyType builtObj = ReportingTaxonomyType.Factory.newInstance();

        //MAINTAINABLE ATTRIBUTES
        if (validString(buildFrom.getAgencyId())) {
            builtObj.setAgencyID(buildFrom.getAgencyId());
        }
        if (validString(buildFrom.getId())) {
            builtObj.setId(buildFrom.getId());
        }
        if (buildFrom.getUri() != null) {
            builtObj.setUri(buildFrom.getUri().toString());
        }
        if (validString(buildFrom.getUrn())) {
            builtObj.setUrn(buildFrom.getUrn());
        }
        if (validString(buildFrom.getVersion())) {
            builtObj.setVersion(buildFrom.getVersion());
        }
        if (buildFrom.getStartDate() != null) {
            builtObj.setValidFrom(buildFrom.getStartDate().getDate());
        }
        if (buildFrom.getEndDate() != null) {
            builtObj.setValidTo(buildFrom.getEndDate().getDate());
        }
        if (validCollection(buildFrom.getNames())) {
            builtObj.setNameArray(getTextType(buildFrom.getNames()));
        }
        if (validCollection(buildFrom.getDescriptions())) {
            builtObj.setDescriptionArray(getTextType(buildFrom.getDescriptions()));
        }
        if (hasAnnotations(buildFrom)) {
            builtObj.setAnnotations(getAnnotationsType(buildFrom));
        }
        if (buildFrom.isExternalReference().isSet()) {
            builtObj.setIsExternalReference(buildFrom.isExternalReference().isTrue());
        }
        if (buildFrom.isFinal().isSet()) {
            builtObj.setIsFinal(buildFrom.isFinal().isTrue());
        }

        //CATEGORIES
        for (ReportingCategoryBean categoryBean : buildFrom.getItems()) {
            builtObj.getCategoryList().add(categoryXmlBeanBuilder.build(categoryBean));
        }

        return builtObj;
    }
}
