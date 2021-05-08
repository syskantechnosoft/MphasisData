/**
 * EmployDaoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.java.mphasis.ws;

public class EmployDaoServiceLocator extends org.apache.axis.client.Service implements com.java.mphasis.ws.EmployDaoService {

    public EmployDaoServiceLocator() {
    }


    public EmployDaoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmployDaoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EmployDao
    private java.lang.String EmployDao_address = "http://localhost:8080/EmployService/services/EmployDao";

    public java.lang.String getEmployDaoAddress() {
        return EmployDao_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EmployDaoWSDDServiceName = "EmployDao";

    public java.lang.String getEmployDaoWSDDServiceName() {
        return EmployDaoWSDDServiceName;
    }

    public void setEmployDaoWSDDServiceName(java.lang.String name) {
        EmployDaoWSDDServiceName = name;
    }

    public com.java.mphasis.ws.EmployDao getEmployDao() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EmployDao_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmployDao(endpoint);
    }

    public com.java.mphasis.ws.EmployDao getEmployDao(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.java.mphasis.ws.EmployDaoSoapBindingStub _stub = new com.java.mphasis.ws.EmployDaoSoapBindingStub(portAddress, this);
            _stub.setPortName(getEmployDaoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmployDaoEndpointAddress(java.lang.String address) {
        EmployDao_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.java.mphasis.ws.EmployDao.class.isAssignableFrom(serviceEndpointInterface)) {
                com.java.mphasis.ws.EmployDaoSoapBindingStub _stub = new com.java.mphasis.ws.EmployDaoSoapBindingStub(new java.net.URL(EmployDao_address), this);
                _stub.setPortName(getEmployDaoWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EmployDao".equals(inputPortName)) {
            return getEmployDao();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.mphasis.java.com", "EmployDaoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.mphasis.java.com", "EmployDao"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EmployDao".equals(portName)) {
            setEmployDaoEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
