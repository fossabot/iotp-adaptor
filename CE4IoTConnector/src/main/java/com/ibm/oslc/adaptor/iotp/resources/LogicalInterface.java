// Start of user code Copyright
/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *       Sam Padgett          - initial API and implementation
 *     Michael Fiedler      - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (422448)
 *     Matthieu Helleboid   - Support for multiple Service Providers.
 *     Anass Radouani       - Support for multiple Service Providers.
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
// End of user code

package com.ibm.oslc.adaptor.iotp.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcMemberProperty;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;

import com.ibm.oslc.adaptor.iotp.resources.Oslc_iotDomainConstants;
import com.ibm.oslc.adaptor.iotp.resources.Oslc_iotDomainConstants;
import com.ibm.oslc.adaptor.iotp.resources.Person;
import com.ibm.oslc.adaptor.iotp.resources.Person;
import com.ibm.oslc.adaptor.iotp.resources.Discussion;
import com.ibm.oslc.adaptor.iotp.resources.Schema;

// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(Oslc_iotDomainConstants.IOT_PLATFORM_NAMSPACE)
@OslcName(Oslc_iotDomainConstants.LOGICALINTERFACE)
@OslcResourceShape(title = "LogicalInterface Resource Shape", describes = Oslc_iotDomainConstants.TYPE_LOGICALINTERFACE)
public class LogicalInterface
    extends Resource
    implements ILogicalInterface
{
    // Start of user code attributeAnnotation:schema
    // End of user code
    private Link schema = new Link();
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public LogicalInterface()
           throws URISyntaxException
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public LogicalInterface(final URI about)
           throws URISyntaxException
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    /**
    * @deprecated Use the methods in class {@link com.ibm.oslc.adaptor.iotp.CE4IoTConnectorResourcesFactory} instead.
    */
    @Deprecated
    public LogicalInterface(final String iotId, final String logicalInterfaceId)
           throws URISyntaxException
    {
        this (constructURI(iotId, logicalInterfaceId));
        // Start of user code constructor3
        // End of user code
    }
    
    /**
    * @deprecated Use the methods in class {@link com.ibm.oslc.adaptor.iotp.CE4IoTConnectorResourcesFactory} instead.
    */
    @Deprecated
    public static URI constructURI(final String iotId, final String logicalInterfaceId)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("iotId", iotId);
        pathParameters.put("logicalInterfaceId", logicalInterfaceId);
        String instanceURI = "iotp/{iotId}/resources/logicalInterfaces/{logicalInterfaceId}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    /**
    * @deprecated Use the methods in class {@link com.ibm.oslc.adaptor.iotp.CE4IoTConnectorResourcesFactory} instead.
    */
    @Deprecated
    public static Link constructLink(final String iotId, final String logicalInterfaceId , final String label)
    {
        return new Link(constructURI(iotId, logicalInterfaceId), label);
    }
    
    /**
    * @deprecated Use the methods in class {@link com.ibm.oslc.adaptor.iotp.CE4IoTConnectorResourcesFactory} instead.
    */
    @Deprecated
    public static Link constructLink(final String iotId, final String logicalInterfaceId)
    {
        return new Link(constructURI(iotId, logicalInterfaceId));
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        Oslc_iotDomainConstants.PATH_LOGICALINTERFACE,
        LogicalInterface.class);
    }
    
    
    public String toString()
    {
        return toString(false);
    }
    
    public String toString(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toString_init
        // End of user code
    
        if (asLocalResource) {
            result = result + "{a Local LogicalInterface Resource} - update LogicalInterface.toString() to present resource as desired.";
            // Start of user code toString_bodyForLocalResource
            // End of user code
        }
        else {
            result = getAbout().toString();
        }
    
        // Start of user code toString_finalize
        // End of user code
    
        return result;
    }
    
    public String toHtml()
    {
        return toHtml(false);
    }
    
    public String toHtml(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toHtml_init
        // End of user code
    
        if (asLocalResource) {
            result = toString(true);
            // Start of user code toHtml_bodyForLocalResource
            // End of user code
        }
        else {
            result = "<a href=\"" + getAbout() + "\" class=\"oslc-resource-link\">" + toString() + "</a>";
        }
    
        // Start of user code toHtml_finalize
        // End of user code
    
        return result;
    }
    
    
    // Start of user code getterAnnotation:schema
    // End of user code
    @OslcName("schema")
    @OslcPropertyDefinition(Oslc_iotDomainConstants.IOT_PLATFORM_NAMSPACE + "schema")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_iotDomainConstants.TYPE_SCHEMA})
    @OslcReadOnly(false)
    @OslcTitle("schema")
    public Link getSchema()
    {
        // Start of user code getterInit:schema
        // End of user code
        return schema;
    }
    
    
    // Start of user code setterAnnotation:schema
    // End of user code
    public void setSchema(final Link schema )
    {
        // Start of user code setterInit:schema
        // End of user code
        this.schema = schema;
    
        // Start of user code setterFinalize:schema
        // End of user code
    }
    
    
    static public String schemaToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:schemaToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"schema\">schema: </LABEL>";
    
        // Start of user code "Mid:schemaToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:schemaToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String schemaToHtmlForCreation1 (final HttpServletRequest httpServletRequest, final String iotId)
    {
        String s = "";
    
        // Start of user code "Init:schemaToHtmlForCreation1(...final String iotId)"
        // End of user code
    
        s = s + "<label for=\"schema\">schema: </LABEL>";
    
        // Start of user code "Mid:schemaToHtmlForCreation1(...final String iotId)"
        // End of user code
    
        // Start of user code "Finalize:schemaToHtmlForCreation1(...final String iotId)"
        // End of user code
    
        return s;
    }
    
    public String schemaToHtml()
    {
        String s = "";
    
        // Start of user code schematoHtml_mid
        // End of user code
    
        try {
            if ((schema == null) || (schema.getValue() == null)) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + (new Schema (schema.getValue())).toHtml(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code schematoHtml_finalize
        // End of user code
    
        return s;
    }
    
    
}
