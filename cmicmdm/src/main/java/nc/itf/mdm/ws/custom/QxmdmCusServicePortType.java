package nc.itf.mdm.ws.custom;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.lang.*;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-10-17T10:44:09.945+08:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService", name = "QxmdmCusServicePortType")
@XmlSeeAlso({ObjectFactory.class, nc.uap.ws.lang.ObjectFactory.class})
public interface QxmdmCusServicePortType {

    @WebMethod(action = "urn:getNewCusByTypeSrv")
    @Action(input = "urn:getNewCusByTypeSrv", output = "urn:getNewCusByTypeSrvResponse", fault = {})
    @RequestWrapper(localName = "getNewCusByTypeSrv", targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService", className = "nc.itf.mdm.ws.GetNewCusByTypeSrv")
    @ResponseWrapper(localName = "getNewCusByTypeSrvResponse", targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService", className = "nc.itf.mdm.ws.GetNewCusByTypeSrvResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String getNewCusByTypeSrv(
            @WebParam(name = "string", targetNamespace = "")
                    String string,
            @WebParam(name = "int", targetNamespace = "")
                    Integer _int,
            @WebParam(name = "int1", targetNamespace = "")
                    Integer int1,
            @WebParam(name = "string1", targetNamespace = "")
                    String string1,
            @WebParam(name = "string2", targetNamespace = "")
                    String string2
    ) throws java.lang.Exception;

    @WebMethod(action = "urn:getCusCountByTypeSrv")
    @Action(input = "urn:getCusCountByTypeSrv", output = "urn:getCusCountByTypeSrvResponse", fault = {})
    @RequestWrapper(localName = "getCusCountByTypeSrv", targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService", className = "nc.itf.mdm.ws.GetCusCountByTypeSrv")
    @ResponseWrapper(localName = "getCusCountByTypeSrvResponse", targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService", className = "nc.itf.mdm.ws.GetCusCountByTypeSrvResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String getCusCountByTypeSrv(
            @WebParam(name = "string", targetNamespace = "")
                    String string,
            @WebParam(name = "string1", targetNamespace = "")
                    String string1
    ) throws java.lang.Exception;

    @WebMethod(action = "urn:getCusByUniSrv")
    @Action(input = "urn:getCusByUniSrv", output = "urn:getCusByUniSrvResponse", fault = {})
    @RequestWrapper(localName = "getCusByUniSrv", targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService", className = "nc.itf.mdm.ws.GetCusByUniSrv")
    @ResponseWrapper(localName = "getCusByUniSrvResponse", targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService", className = "nc.itf.mdm.ws.GetCusByUniSrvResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String getCusByUniSrv(
            @WebParam(name = "string", targetNamespace = "")
                    String string,
            @WebParam(name = "string1", targetNamespace = "")
                    String string1,
            @WebParam(name = "string2", targetNamespace = "")
                    String string2
    ) throws java.lang.Exception;

    @WebMethod(action = "urn:reqModCusSrv")
    @Action(input = "urn:reqModCusSrv", output = "urn:reqModCusSrvResponse", fault = {})
    @RequestWrapper(localName = "reqModCusSrv", targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService", className = "nc.itf.mdm.ws.ReqModCusSrv")
    @ResponseWrapper(localName = "reqModCusSrvResponse", targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService", className = "nc.itf.mdm.ws.ReqModCusSrvResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String reqModCusSrv(
            @WebParam(name = "string", targetNamespace = "")
                    String string,
            @WebParam(name = "string1", targetNamespace = "")
                    String string1,
            @WebParam(name = "string2", targetNamespace = "")
                    String string2
    ) throws java.lang.Exception;

    @WebMethod(action = "urn:getCusByCodeSrv")
    @Action(input = "urn:getCusByCodeSrv", output = "urn:getCusByCodeSrvResponse", fault = {})
    @RequestWrapper(localName = "getCusByCodeSrv", targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService", className = "nc.itf.mdm.ws.GetCusByCodeSrv")
    @ResponseWrapper(localName = "getCusByCodeSrvResponse", targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService", className = "nc.itf.mdm.ws.GetCusByCodeSrvResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String getCusByCodeSrv(
            @WebParam(name = "string", targetNamespace = "")
                    String string,
            @WebParam(name = "string1", targetNamespace = "")
                    String string1,
            @WebParam(name = "string2", targetNamespace = "")
                    String string2
    ) throws java.lang.Exception;

    @WebMethod(action = "urn:reqCusSrv")
    @Action(input = "urn:reqCusSrv", output = "urn:reqCusSrvResponse", fault = {})
    @RequestWrapper(localName = "reqCusSrv", targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService", className = "nc.itf.mdm.ws.ReqCusSrv")
    @ResponseWrapper(localName = "reqCusSrvResponse", targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService", className = "nc.itf.mdm.ws.ReqCusSrvResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String reqCusSrv(
            @WebParam(name = "string", targetNamespace = "")
                    String string,
            @WebParam(name = "string1", targetNamespace = "")
                    String string1,
            @WebParam(name = "string2", targetNamespace = "")
                    String string2
    ) throws java.lang.Exception;

    @WebMethod(action = "urn:getCusByTypeSrv")
    @Action(input = "urn:getCusByTypeSrv", output = "urn:getCusByTypeSrvResponse", fault = {})
    @RequestWrapper(localName = "getCusByTypeSrv", targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService", className = "nc.itf.mdm.ws.GetCusByTypeSrv")
    @ResponseWrapper(localName = "getCusByTypeSrvResponse", targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService", className = "nc.itf.mdm.ws.GetCusByTypeSrvResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String getCusByTypeSrv(
            @WebParam(name = "int", targetNamespace = "")
                    Integer _int,
            @WebParam(name = "int1", targetNamespace = "")
                    Integer int1,
            @WebParam(name = "string", targetNamespace = "")
                    String string,
            @WebParam(name = "string1", targetNamespace = "")
                    String string1
    ) throws java.lang.Exception;
}