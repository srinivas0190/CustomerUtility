package com.customerservice.webservice.registration;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-08-17T04:37:42.737-05:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://webservice.customerdetails.customerservice.com/", name = "ServicePlanWS")
@XmlSeeAlso({ObjectFactory.class})
public interface ServicePlanWS {

    @WebMethod
    @RequestWrapper(localName = "getServicePlan", targetNamespace = "http://webservice.customerdetails.customerservice.com/", className = "com.customerservice.webservice.registration.GetServicePlan")
    @ResponseWrapper(localName = "getServicePlanResponse", targetNamespace = "http://webservice.customerdetails.customerservice.com/", className = "com.customerservice.webservice.registration.GetServicePlanResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.customerservice.webservice.registration.ServicePlan> getServicePlan();
}
