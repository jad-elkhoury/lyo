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

package org.eclipse.lyo.oslc.domains.qm;

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

import org.eclipse.lyo.oslc.domains.qm.Oslc_qmDomainConstants;


import org.eclipse.lyo.oslc.domains.cm.Oslc_cmDomainConstants;
import org.eclipse.lyo.oslc.domains.DctermsDomainConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcDomainConstants;
import org.eclipse.lyo.oslc.domains.qm.Oslc_qmDomainConstants;
import org.eclipse.lyo.oslc.domains.RdfDomainConstants;
import org.eclipse.lyo.oslc.domains.cm.ChangeRequest;
import org.eclipse.lyo.oslc.domains.qm.TestScript;
import org.eclipse.lyo.oslc.domains.qm.TestExecutionRecord;
import org.eclipse.lyo.oslc.domains.qm.TestCase;
import org.eclipse.lyo.oslc.domains.qm.TestPlan;

// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(Oslc_qmDomainConstants.TESTRESULT_NAMESPACE)
@OslcName(Oslc_qmDomainConstants.TESTRESULT_LOCALNAME)
@OslcResourceShape(title = "TestResult Resource Shape", describes = Oslc_qmDomainConstants.TESTRESULT_TYPE)
public class TestResult
    extends AbstractResource
    implements ITestResult
{
    // Start of user code attributeAnnotation:created
    // End of user code
    private Date created;
    // Start of user code attributeAnnotation:identifier
    // End of user code
    private String identifier;
    // Start of user code attributeAnnotation:modified
    // End of user code
    private Date modified;
    // Start of user code attributeAnnotation:instanceShape
    // End of user code
    private URI instanceShape;
    // Start of user code attributeAnnotation:title
    // End of user code
    private String title;
    // Start of user code attributeAnnotation:type
    // End of user code
    private Set<Link> type = new HashSet<Link>();
    // Start of user code attributeAnnotation:serviceProvider
    // End of user code
    private Set<URI> serviceProvider = new HashSet<URI>();
    // Start of user code attributeAnnotation:status
    // End of user code
    private String status;
    // Start of user code attributeAnnotation:affectedByChangeRequest
    // End of user code
    private Set<Link> affectedByChangeRequest = new HashSet<Link>();
    // Start of user code attributeAnnotation:executesTestScript
    // End of user code
    private Link executesTestScript;
    // Start of user code attributeAnnotation:producedByTestExecutionRecord
    // End of user code
    private Link producedByTestExecutionRecord;
    // Start of user code attributeAnnotation:reportsOnTestCase
    // End of user code
    private Link reportsOnTestCase;
    // Start of user code attributeAnnotation:reportsOnTestPlan
    // End of user code
    private Link reportsOnTestPlan;
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public TestResult()
           throws URISyntaxException
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public TestResult(final URI about)
           throws URISyntaxException
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        Oslc_qmDomainConstants.TESTRESULT_PATH,
        TestResult.class);
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
            result = result + "{a Local TestResult Resource} - update TestResult.toString() to present resource as desired.";
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
    
    @Deprecated
    public String toHtml()
    {
        return toHtml(false);
    }
    
    @Deprecated
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
    
    public void addType(final Link type)
    {
        this.type.add(type);
    }
    
    public void addServiceProvider(final URI serviceProvider)
    {
        this.serviceProvider.add(serviceProvider);
    }
    
    public void addAffectedByChangeRequest(final Link affectedByChangeRequest)
    {
        this.affectedByChangeRequest.add(affectedByChangeRequest);
    }
    
    
    // Start of user code getterAnnotation:created
    // End of user code
    @OslcName("created")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "created")
    @OslcDescription("Timestamp of resource creation")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.DateTime)
    @OslcReadOnly(false)
    public Date getCreated()
    {
        // Start of user code getterInit:created
        // End of user code
        return created;
    }
    
    // Start of user code getterAnnotation:identifier
    // End of user code
    @OslcName("identifier")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "identifier")
    @OslcDescription("A unique identifier for a resource. Typically read-only and assigned by the service provider when a resource is created. Not typically intended for end-user display.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getIdentifier()
    {
        // Start of user code getterInit:identifier
        // End of user code
        return identifier;
    }
    
    // Start of user code getterAnnotation:modified
    // End of user code
    @OslcName("modified")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "modified")
    @OslcDescription("Timestamp of latest resource modification")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.DateTime)
    @OslcReadOnly(false)
    public Date getModified()
    {
        // Start of user code getterInit:modified
        // End of user code
        return modified;
    }
    
    // Start of user code getterAnnotation:instanceShape
    // End of user code
    @OslcName("instanceShape")
    @OslcPropertyDefinition(OslcDomainConstants.OSLC_NAMSPACE + "instanceShape")
    @OslcDescription("The URI of a Resource Shape that describes the possible properties, occurrence, value types, allowed values and labels. This shape information is useful in displaying the subject resource as well as guiding clients in performing modifications. Instance shapes may be specific to the authenticated user associated with the request that retrieved the resource, the current state of the resource and other factors and thus should not be cached.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcReadOnly(false)
    public URI getInstanceShape()
    {
        // Start of user code getterInit:instanceShape
        // End of user code
        return instanceShape;
    }
    
    // Start of user code getterAnnotation:title
    // End of user code
    @OslcName("title")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "title")
    @OslcDescription("Title of the resource represented as rich text in XHTML content. SHOULD include only content that is valid inside an XHTML <span> element.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getTitle()
    {
        // Start of user code getterInit:title
        // End of user code
        return title;
    }
    
    // Start of user code getterAnnotation:type
    // End of user code
    @OslcName("type")
    @OslcPropertyDefinition(RdfDomainConstants.RDF_NAMSPACE + "type")
    @OslcDescription("The resource type URIs")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcReadOnly(false)
    public Set<Link> getType()
    {
        // Start of user code getterInit:type
        // End of user code
        return type;
    }
    
    // Start of user code getterAnnotation:serviceProvider
    // End of user code
    @OslcName("serviceProvider")
    @OslcPropertyDefinition(OslcDomainConstants.OSLC_NAMSPACE + "serviceProvider")
    @OslcDescription("A link to the resource's OSLC Service Provider. There may be cases when the subject resource is available from a service provider that implements multiple domain specifications, which could result in multiple values for this property.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcReadOnly(false)
    public Set<URI> getServiceProvider()
    {
        // Start of user code getterInit:serviceProvider
        // End of user code
        return serviceProvider;
    }
    
    // Start of user code getterAnnotation:status
    // End of user code
    @OslcName("status")
    @OslcPropertyDefinition(Oslc_qmDomainConstants.QUALITY_MANAGEMENT_NAMSPACE + "status")
    @OslcDescription("Used to indicate the state of the Test Result based on values defined by the service provider. Most often a read-only property.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getStatus()
    {
        // Start of user code getterInit:status
        // End of user code
        return status;
    }
    
    // Start of user code getterAnnotation:affectedByChangeRequest
    // End of user code
    @OslcName("affectedByChangeRequest")
    @OslcPropertyDefinition(Oslc_qmDomainConstants.QUALITY_MANAGEMENT_NAMSPACE + "affectedByChangeRequest")
    @OslcDescription("Change request that affects the Test Result. It is likely that the target resource will be an oslc_cm:ChangeRequest but that is not necessarily the case.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRepresentation(Representation.Reference)
    @OslcRange({Oslc_cmDomainConstants.CHANGEREQUEST_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getAffectedByChangeRequest()
    {
        // Start of user code getterInit:affectedByChangeRequest
        // End of user code
        return affectedByChangeRequest;
    }
    
    // Start of user code getterAnnotation:executesTestScript
    // End of user code
    @OslcName("executesTestScript")
    @OslcPropertyDefinition(Oslc_qmDomainConstants.QUALITY_MANAGEMENT_NAMSPACE + "executesTestScript")
    @OslcDescription("Test Script executed to produce the Test Result. It is likely that the target resource will be an oslc_qm:TestScript but that is not necessarily the case.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_qmDomainConstants.TESTSCRIPT_TYPE})
    @OslcReadOnly(false)
    @OslcTitle("")
    public Link getExecutesTestScript()
    {
        // Start of user code getterInit:executesTestScript
        // End of user code
        return executesTestScript;
    }
    
    // Start of user code getterAnnotation:producedByTestExecutionRecord
    // End of user code
    @OslcName("producedByTestExecutionRecord")
    @OslcPropertyDefinition(Oslc_qmDomainConstants.QUALITY_MANAGEMENT_NAMSPACE + "producedByTestExecutionRecord")
    @OslcDescription("Test Execution Record that the Test Result was produced by. It is likely that the target resource will be an oslc_qm:TestExecutionRecord but that is not necessarily the case.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_qmDomainConstants.TESTEXECUTIONRECORD_TYPE})
    @OslcReadOnly(false)
    @OslcTitle("")
    public Link getProducedByTestExecutionRecord()
    {
        // Start of user code getterInit:producedByTestExecutionRecord
        // End of user code
        return producedByTestExecutionRecord;
    }
    
    // Start of user code getterAnnotation:reportsOnTestCase
    // End of user code
    @OslcName("reportsOnTestCase")
    @OslcPropertyDefinition(Oslc_qmDomainConstants.QUALITY_MANAGEMENT_NAMSPACE + "reportsOnTestCase")
    @OslcDescription("Test Case that the Test Result reports on. It is likely that the target resource will be an oslc_qm:TestCase but that is not necessarily the case.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_qmDomainConstants.TESTCASE_TYPE})
    @OslcReadOnly(false)
    public Link getReportsOnTestCase()
    {
        // Start of user code getterInit:reportsOnTestCase
        // End of user code
        return reportsOnTestCase;
    }
    
    // Start of user code getterAnnotation:reportsOnTestPlan
    // End of user code
    @OslcName("reportsOnTestPlan")
    @OslcPropertyDefinition(Oslc_qmDomainConstants.QUALITY_MANAGEMENT_NAMSPACE + "reportsOnTestPlan")
    @OslcDescription("Test Plan that the Test Execution Record reports on. It is likely that the target resource will be an oslc_qm:TestPlan but that is not necessarily the case.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_qmDomainConstants.TESTPLAN_TYPE})
    @OslcReadOnly(false)
    public Link getReportsOnTestPlan()
    {
        // Start of user code getterInit:reportsOnTestPlan
        // End of user code
        return reportsOnTestPlan;
    }
    
    
    // Start of user code setterAnnotation:created
    // End of user code
    public void setCreated(final Date created )
    {
        // Start of user code setterInit:created
        // End of user code
        this.created = created;
    
        // Start of user code setterFinalize:created
        // End of user code
    }
    
    // Start of user code setterAnnotation:identifier
    // End of user code
    public void setIdentifier(final String identifier )
    {
        // Start of user code setterInit:identifier
        // End of user code
        this.identifier = identifier;
    
        // Start of user code setterFinalize:identifier
        // End of user code
    }
    
    // Start of user code setterAnnotation:modified
    // End of user code
    public void setModified(final Date modified )
    {
        // Start of user code setterInit:modified
        // End of user code
        this.modified = modified;
    
        // Start of user code setterFinalize:modified
        // End of user code
    }
    
    // Start of user code setterAnnotation:instanceShape
    // End of user code
    public void setInstanceShape(final URI instanceShape )
    {
        // Start of user code setterInit:instanceShape
        // End of user code
        this.instanceShape = instanceShape;
    
        // Start of user code setterFinalize:instanceShape
        // End of user code
    }
    
    // Start of user code setterAnnotation:title
    // End of user code
    public void setTitle(final String title )
    {
        // Start of user code setterInit:title
        // End of user code
        this.title = title;
    
        // Start of user code setterFinalize:title
        // End of user code
    }
    
    // Start of user code setterAnnotation:type
    // End of user code
    public void setType(final Set<Link> type )
    {
        // Start of user code setterInit:type
        // End of user code
        this.type.clear();
        if (type != null)
        {
            this.type.addAll(type);
        }
    
        // Start of user code setterFinalize:type
        // End of user code
    }
    
    // Start of user code setterAnnotation:serviceProvider
    // End of user code
    public void setServiceProvider(final Set<URI> serviceProvider )
    {
        // Start of user code setterInit:serviceProvider
        // End of user code
        this.serviceProvider.clear();
        if (serviceProvider != null)
        {
            this.serviceProvider.addAll(serviceProvider);
        }
    
        // Start of user code setterFinalize:serviceProvider
        // End of user code
    }
    
    // Start of user code setterAnnotation:status
    // End of user code
    public void setStatus(final String status )
    {
        // Start of user code setterInit:status
        // End of user code
        this.status = status;
    
        // Start of user code setterFinalize:status
        // End of user code
    }
    
    // Start of user code setterAnnotation:affectedByChangeRequest
    // End of user code
    public void setAffectedByChangeRequest(final Set<Link> affectedByChangeRequest )
    {
        // Start of user code setterInit:affectedByChangeRequest
        // End of user code
        this.affectedByChangeRequest.clear();
        if (affectedByChangeRequest != null)
        {
            this.affectedByChangeRequest.addAll(affectedByChangeRequest);
        }
    
        // Start of user code setterFinalize:affectedByChangeRequest
        // End of user code
    }
    
    // Start of user code setterAnnotation:executesTestScript
    // End of user code
    public void setExecutesTestScript(final Link executesTestScript )
    {
        // Start of user code setterInit:executesTestScript
        // End of user code
        this.executesTestScript = executesTestScript;
    
        // Start of user code setterFinalize:executesTestScript
        // End of user code
    }
    
    // Start of user code setterAnnotation:producedByTestExecutionRecord
    // End of user code
    public void setProducedByTestExecutionRecord(final Link producedByTestExecutionRecord )
    {
        // Start of user code setterInit:producedByTestExecutionRecord
        // End of user code
        this.producedByTestExecutionRecord = producedByTestExecutionRecord;
    
        // Start of user code setterFinalize:producedByTestExecutionRecord
        // End of user code
    }
    
    // Start of user code setterAnnotation:reportsOnTestCase
    // End of user code
    public void setReportsOnTestCase(final Link reportsOnTestCase )
    {
        // Start of user code setterInit:reportsOnTestCase
        // End of user code
        this.reportsOnTestCase = reportsOnTestCase;
    
        // Start of user code setterFinalize:reportsOnTestCase
        // End of user code
    }
    
    // Start of user code setterAnnotation:reportsOnTestPlan
    // End of user code
    public void setReportsOnTestPlan(final Link reportsOnTestPlan )
    {
        // Start of user code setterInit:reportsOnTestPlan
        // End of user code
        this.reportsOnTestPlan = reportsOnTestPlan;
    
        // Start of user code setterFinalize:reportsOnTestPlan
        // End of user code
    }
    
    
    @Deprecated
    static public String createdToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:createdToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"created\">created: </LABEL>";
    
        // Start of user code "Mid:createdToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"created\" type=\"text\" style=\"width: 400px\" id=\"created\" >";
        // Start of user code "Finalize:createdToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    @Deprecated
    static public String identifierToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:identifierToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"identifier\">identifier: </LABEL>";
    
        // Start of user code "Mid:identifierToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"identifier\" type=\"text\" style=\"width: 400px\" id=\"identifier\" >";
        // Start of user code "Finalize:identifierToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    @Deprecated
    static public String modifiedToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:modifiedToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"modified\">modified: </LABEL>";
    
        // Start of user code "Mid:modifiedToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"modified\" type=\"text\" style=\"width: 400px\" id=\"modified\" >";
        // Start of user code "Finalize:modifiedToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    @Deprecated
    static public String instanceShapeToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:instanceShapeToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"instanceShape\">instanceShape: </LABEL>";
    
        // Start of user code "Mid:instanceShapeToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"instanceShape\" type=\"text\" style=\"width: 400px\" id=\"instanceShape\" >";
        // Start of user code "Finalize:instanceShapeToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    @Deprecated
    static public String titleToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:titleToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"title\">title: </LABEL>";
    
        // Start of user code "Mid:titleToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"title\" type=\"text\" style=\"width: 400px\" id=\"title\" >";
        // Start of user code "Finalize:titleToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    @Deprecated
    static public String typeToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:typeToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"type\">type: </LABEL>";
    
        // Start of user code "Mid:typeToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:typeToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    @Deprecated
    static public String serviceProviderToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:serviceProviderToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"serviceProvider\">serviceProvider: </LABEL>";
    
        // Start of user code "Mid:serviceProviderToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"serviceProvider\" type=\"text\" style=\"width: 400px\" id=\"serviceProvider\" >";
        // Start of user code "Finalize:serviceProviderToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    @Deprecated
    static public String statusToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:statusToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"status\">status: </LABEL>";
    
        // Start of user code "Mid:statusToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"status\" type=\"text\" style=\"width: 400px\" id=\"status\" >";
        // Start of user code "Finalize:statusToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    @Deprecated
    static public String affectedByChangeRequestToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:affectedByChangeRequestToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"affectedByChangeRequest\">affectedByChangeRequest: </LABEL>";
    
        // Start of user code "Mid:affectedByChangeRequestToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:affectedByChangeRequestToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    @Deprecated
    static public String executesTestScriptToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:executesTestScriptToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"executesTestScript\">executesTestScript: </LABEL>";
    
        // Start of user code "Mid:executesTestScriptToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:executesTestScriptToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    @Deprecated
    static public String producedByTestExecutionRecordToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:producedByTestExecutionRecordToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"producedByTestExecutionRecord\">producedByTestExecutionRecord: </LABEL>";
    
        // Start of user code "Mid:producedByTestExecutionRecordToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:producedByTestExecutionRecordToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    @Deprecated
    static public String reportsOnTestCaseToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:reportsOnTestCaseToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"reportsOnTestCase\">reportsOnTestCase: </LABEL>";
    
        // Start of user code "Mid:reportsOnTestCaseToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:reportsOnTestCaseToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    @Deprecated
    static public String reportsOnTestPlanToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:reportsOnTestPlanToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"reportsOnTestPlan\">reportsOnTestPlan: </LABEL>";
    
        // Start of user code "Mid:reportsOnTestPlanToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:reportsOnTestPlanToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    
    @Deprecated
    public String createdToHtml()
    {
        String s = "";
    
        // Start of user code createdtoHtml_mid
        // End of user code
    
        try {
            if (created == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + created.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code createdtoHtml_finalize
        // End of user code
    
        return s;
    }
    
    @Deprecated
    public String identifierToHtml()
    {
        String s = "";
    
        // Start of user code identifiertoHtml_mid
        // End of user code
    
        try {
            if (identifier == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + identifier.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code identifiertoHtml_finalize
        // End of user code
    
        return s;
    }
    
    @Deprecated
    public String modifiedToHtml()
    {
        String s = "";
    
        // Start of user code modifiedtoHtml_mid
        // End of user code
    
        try {
            if (modified == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + modified.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code modifiedtoHtml_finalize
        // End of user code
    
        return s;
    }
    
    @Deprecated
    public String instanceShapeToHtml()
    {
        String s = "";
    
        // Start of user code instanceShapetoHtml_mid
        // End of user code
    
        try {
            if (instanceShape == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + instanceShape.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code instanceShapetoHtml_finalize
        // End of user code
    
        return s;
    }
    
    @Deprecated
    public String titleToHtml()
    {
        String s = "";
    
        // Start of user code titletoHtml_mid
        // End of user code
    
        try {
            if (title == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + title.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code titletoHtml_finalize
        // End of user code
    
        return s;
    }
    
    @Deprecated
    public String typeToHtml()
    {
        String s = "";
    
        // Start of user code typetoHtml_mid
        // End of user code
    
        try {
            s = s + "<ul>";
            for(Link next : type) {
                s = s + "<li>";
                if (next.getValue() == null) {
                    s= s + "<em>null</em>";
                }
                else {
                    s = s + "<a href=\"" + next.getValue().toString() + "\">" + next.getValue().toString() + "</a>";
                }
                s = s + "</li>";
            }
            s = s + "</ul>";
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code typetoHtml_finalize
        // End of user code
    
        return s;
    }
    
    @Deprecated
    public String serviceProviderToHtml()
    {
        String s = "";
    
        // Start of user code serviceProvidertoHtml_mid
        // End of user code
    
        try {
            s = s + "<ul>";
            Iterator<URI> itr = serviceProvider.iterator();
            while(itr.hasNext()) {
                s = s + "<li>";
                s= s + itr.next().toString();
                s = s + "</li>";
            }
            s = s + "</ul>";
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code serviceProvidertoHtml_finalize
        // End of user code
    
        return s;
    }
    
    @Deprecated
    public String statusToHtml()
    {
        String s = "";
    
        // Start of user code statustoHtml_mid
        // End of user code
    
        try {
            if (status == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + status.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code statustoHtml_finalize
        // End of user code
    
        return s;
    }
    
    @Deprecated
    public String affectedByChangeRequestToHtml()
    {
        String s = "";
    
        // Start of user code affectedByChangeRequesttoHtml_mid
        // End of user code
    
        try {
            s = s + "<ul>";
            for(Link next : affectedByChangeRequest) {
                s = s + "<li>";
                s = s + (new ChangeRequest (next.getValue())).toHtml(false);
                s = s + "</li>";
            }
            s = s + "</ul>";
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code affectedByChangeRequesttoHtml_finalize
        // End of user code
    
        return s;
    }
    
    @Deprecated
    public String executesTestScriptToHtml()
    {
        String s = "";
    
        // Start of user code executesTestScripttoHtml_mid
        // End of user code
    
        try {
            if ((executesTestScript == null) || (executesTestScript.getValue() == null)) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + (new TestScript (executesTestScript.getValue())).toHtml(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code executesTestScripttoHtml_finalize
        // End of user code
    
        return s;
    }
    
    @Deprecated
    public String producedByTestExecutionRecordToHtml()
    {
        String s = "";
    
        // Start of user code producedByTestExecutionRecordtoHtml_mid
        // End of user code
    
        try {
            if ((producedByTestExecutionRecord == null) || (producedByTestExecutionRecord.getValue() == null)) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + (new TestExecutionRecord (producedByTestExecutionRecord.getValue())).toHtml(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code producedByTestExecutionRecordtoHtml_finalize
        // End of user code
    
        return s;
    }
    
    @Deprecated
    public String reportsOnTestCaseToHtml()
    {
        String s = "";
    
        // Start of user code reportsOnTestCasetoHtml_mid
        // End of user code
    
        try {
            if ((reportsOnTestCase == null) || (reportsOnTestCase.getValue() == null)) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + (new TestCase (reportsOnTestCase.getValue())).toHtml(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code reportsOnTestCasetoHtml_finalize
        // End of user code
    
        return s;
    }
    
    @Deprecated
    public String reportsOnTestPlanToHtml()
    {
        String s = "";
    
        // Start of user code reportsOnTestPlantoHtml_mid
        // End of user code
    
        try {
            if ((reportsOnTestPlan == null) || (reportsOnTestPlan.getValue() == null)) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + (new TestPlan (reportsOnTestPlan.getValue())).toHtml(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code reportsOnTestPlantoHtml_finalize
        // End of user code
    
        return s;
    }
    
    
}
