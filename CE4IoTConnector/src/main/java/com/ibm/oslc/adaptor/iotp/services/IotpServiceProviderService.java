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
 *     Michael Fiedler      - implementation for Bugzilla adapter
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
// End of user code

package com.ibm.oslc.adaptor.iotp.services;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.eclipse.lyo.oslc4j.core.annotation.OslcDialog;
import org.eclipse.lyo.oslc4j.core.annotation.OslcQueryCapability;
import org.eclipse.lyo.oslc4j.core.annotation.OslcService;
import org.eclipse.lyo.oslc4j.core.model.Compact;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;
import org.eclipse.lyo.oslc4j.core.model.Service;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;

import com.ibm.oslc.adaptor.iotp.CE4IoTConnectorManager;
import com.ibm.oslc.adaptor.iotp.servlet.ServiceProviderCatalogSingleton;

// Start of user code imports
// End of user code

@OslcService(OslcConstants.OSLC_CORE_DOMAIN)
@Path("iotp")
public class IotpServiceProviderService
{
    @Context private HttpServletRequest httpServletRequest;
    @Context private HttpServletResponse httpServletResponse;

    /**
     * RDF/XML, XML and JSON representations of an OSLC Service Provider collection
     * @return
     */
    @OslcDialog
    (
         title = "Service Provider Selection Dialog",
         label = "Service Provider Selection Dialog",
         uri = "",
         hintWidth = "1000px",
         hintHeight = "600px",
         resourceTypes = {OslcConstants.TYPE_SERVICE_PROVIDER},
         usages = {OslcConstants.OSLC_USAGE_DEFAULT}
    )
    @OslcQueryCapability
    (
         title = "Service Provider Query Capability",
         label = "Service Provider Query",
         resourceShape = OslcConstants.PATH_RESOURCE_SHAPES + "/" + OslcConstants.PATH_SERVICE_PROVIDER,
         resourceTypes = {OslcConstants.TYPE_SERVICE_PROVIDER},
         usages = {OslcConstants.OSLC_USAGE_DEFAULT}
    )
    @GET
    
    @Produces({OslcMediaType.APPLICATION_RDF_XML, OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON, OslcMediaType.TEXT_TURTLE})
    public ServiceProvider[] getServiceProviders()
    {
        httpServletResponse.addHeader("Oslc-Core-Version","2.0");
        return ServiceProviderCatalogSingleton.getServiceProviders(httpServletRequest);
    }

    /**
     * RDF/XML, XML and JSON representations of a single OSLC Service Provider
     *
     * @param serviceProviderId
     * @return
     */
    @GET
    @Path("{iotId}")
    @Produces({OslcMediaType.APPLICATION_RDF_XML, OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON, OslcMediaType.TEXT_TURTLE})
    public ServiceProvider getServiceProvider(@PathParam("iotId") final String iotId)
    {
        httpServletResponse.addHeader("Oslc-Core-Version","2.0");
        return ServiceProviderCatalogSingleton.getIotpServiceProvider(httpServletRequest, iotId);
    }

    /**
     * HTML representation of a single OSLC Service Provider
     *
     * Forwards to serviceprovider_html.jsp to create the html document
     *
     * @param serviceProviderId
     */
    @GET
    @Path("{iotId}")
    @Produces(MediaType.TEXT_HTML)
    public void getHtmlServiceProvider(@PathParam("iotId") final String iotId)
    {
        ServiceProvider serviceProvider = ServiceProviderCatalogSingleton.getIotpServiceProvider(httpServletRequest, iotId);
        Service [] services = serviceProvider.getServices();

        httpServletRequest.setAttribute("serviceProvider", serviceProvider);
        httpServletRequest.setAttribute("services", services);
        // Start of user code getHtmlServiceProvider_setAttributes
        // End of user code

        RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/com/ibm/oslc/adaptor/iotp/iotpserviceprovider.jsp");
        try {
            rd.forward(httpServletRequest, httpServletResponse);
        } catch (Exception e) {
            e.printStackTrace();
            throw new WebApplicationException(e);
        }
    }
}

