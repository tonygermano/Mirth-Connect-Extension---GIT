/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * 
 * http://www.mirthcorp.com
 * 
 * The software in this package is published under the terms of the MPL license a copy of which has
 * been included with this distribution in the LICENSE.txt file.
 */

package com.mirth.connect.model;

public interface Exportable {
    public static final String DATE_TIME_FORMAT = "dd-MM-yy HH-mm-ss.SS";
    
    public String toExportString();
}
