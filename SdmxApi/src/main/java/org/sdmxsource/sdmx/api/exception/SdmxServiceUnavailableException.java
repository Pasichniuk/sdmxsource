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
package org.sdmxsource.sdmx.api.exception;

import org.sdmxsource.sdmx.api.constants.ExceptionCode;
import org.sdmxsource.sdmx.api.constants.SDMX_ERROR_CODE;

public class SdmxServiceUnavailableException extends SdmxException {
    private static final long serialVersionUID = 7924014513423640091L;

    public SdmxServiceUnavailableException(String str) {
        super(str, SDMX_ERROR_CODE.SERVICE_UNAVAILABLE);
    }

    public SdmxServiceUnavailableException(ExceptionCode code, Object... args) {
        super(SDMX_ERROR_CODE.SERVICE_UNAVAILABLE, code, args);
    }

    public SdmxServiceUnavailableException(Throwable th, ExceptionCode code, Object... args) {
        super(th, SDMX_ERROR_CODE.SERVICE_UNAVAILABLE, code, args);
    }

}
