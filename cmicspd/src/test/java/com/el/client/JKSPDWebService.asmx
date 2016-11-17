<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://localhost/JKSPDWebService/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://localhost/JKSPDWebService/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SPD接口服务</wsdl:documentation>
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://localhost/JKSPDWebService/">
      <s:element name="UpLoadData">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="appkey" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="timestamp" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="data" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sign" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ver" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpLoadDataResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UpLoadDataResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="查询报表">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="data" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="url" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="appPassWord" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="appKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="查询报表Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="查询报表Result">
              <s:complexType>
                <s:sequence>
                  <s:any minOccurs="0" maxOccurs="unbounded" namespace="http://www.w3.org/2001/XMLSchema" processContents="lax" />
                  <s:any minOccurs="1" namespace="urn:schemas-microsoft-com:xml-diffgram-v1" processContents="lax" />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="string" nillable="true" type="s:string" />
      <s:element name="DataTable" nillable="true">
        <s:complexType>
          <s:sequence>
            <s:any minOccurs="0" maxOccurs="unbounded" namespace="http://www.w3.org/2001/XMLSchema" processContents="lax" />
            <s:any minOccurs="1" namespace="urn:schemas-microsoft-com:xml-diffgram-v1" processContents="lax" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="UpLoadDataSoapIn">
    <wsdl:part name="parameters" element="tns:UpLoadData" />
  </wsdl:message>
  <wsdl:message name="UpLoadDataSoapOut">
    <wsdl:part name="parameters" element="tns:UpLoadDataResponse" />
  </wsdl:message>
  <wsdl:message name="查询报表SoapIn">
    <wsdl:part name="parameters" element="tns:查询报表" />
  </wsdl:message>
  <wsdl:message name="查询报表SoapOut">
    <wsdl:part name="parameters" element="tns:查询报表Response" />
  </wsdl:message>
  <wsdl:message name="UpLoadDataHttpGetIn">
    <wsdl:part name="appkey" type="s:string" />
    <wsdl:part name="timestamp" type="s:string" />
    <wsdl:part name="data" type="s:string" />
    <wsdl:part name="sign" type="s:string" />
    <wsdl:part name="ver" type="s:string" />
  </wsdl:message>
  <wsdl:message name="UpLoadDataHttpGetOut">
    <wsdl:part name="Body" element="tns:string" />
  </wsdl:message>
  <wsdl:message name="查询报表HttpGetIn">
    <wsdl:part name="data" type="s:string" />
    <wsdl:part name="url" type="s:string" />
    <wsdl:part name="appPassWord" type="s:string" />
    <wsdl:part name="appKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="查询报表HttpGetOut">
    <wsdl:part name="Body" element="tns:DataTable" />
  </wsdl:message>
  <wsdl:message name="UpLoadDataHttpPostIn">
    <wsdl:part name="appkey" type="s:string" />
    <wsdl:part name="timestamp" type="s:string" />
    <wsdl:part name="data" type="s:string" />
    <wsdl:part name="sign" type="s:string" />
    <wsdl:part name="ver" type="s:string" />
  </wsdl:message>
  <wsdl:message name="UpLoadDataHttpPostOut">
    <wsdl:part name="Body" element="tns:string" />
  </wsdl:message>
  <wsdl:message name="查询报表HttpPostIn">
    <wsdl:part name="data" type="s:string" />
    <wsdl:part name="url" type="s:string" />
    <wsdl:part name="appPassWord" type="s:string" />
    <wsdl:part name="appKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="查询报表HttpPostOut">
    <wsdl:part name="Body" element="tns:DataTable" />
  </wsdl:message>
  <wsdl:portType name="JKSPDWebServiceSoap">
    <wsdl:operation name="UpLoadData">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">UpLoadData</wsdl:documentation>
      <wsdl:input message="tns:UpLoadDataSoapIn" />
      <wsdl:output message="tns:UpLoadDataSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="查询报表">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询报表</wsdl:documentation>
      <wsdl:input message="tns:查询报表SoapIn" />
      <wsdl:output message="tns:查询报表SoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="JKSPDWebServiceHttpGet">
    <wsdl:operation name="UpLoadData">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">UpLoadData</wsdl:documentation>
      <wsdl:input message="tns:UpLoadDataHttpGetIn" />
      <wsdl:output message="tns:UpLoadDataHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="查询报表">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询报表</wsdl:documentation>
      <wsdl:input message="tns:查询报表HttpGetIn" />
      <wsdl:output message="tns:查询报表HttpGetOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="JKSPDWebServiceHttpPost">
    <wsdl:operation name="UpLoadData">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">UpLoadData</wsdl:documentation>
      <wsdl:input message="tns:UpLoadDataHttpPostIn" />
      <wsdl:output message="tns:UpLoadDataHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="查询报表">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询报表</wsdl:documentation>
      <wsdl:input message="tns:查询报表HttpPostIn" />
      <wsdl:output message="tns:查询报表HttpPostOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="JKSPDWebServiceSoap" type="tns:JKSPDWebServiceSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="UpLoadData">
      <soap:operation soapAction="http://localhost/JKSPDWebService/UpLoadData" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="查询报表">
      <soap:operation soapAction="http://localhost/JKSPDWebService/查询报表" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="JKSPDWebServiceSoap12" type="tns:JKSPDWebServiceSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="UpLoadData">
      <soap12:operation soapAction="http://localhost/JKSPDWebService/UpLoadData" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="查询报表">
      <soap12:operation soapAction="http://localhost/JKSPDWebService/查询报表" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="JKSPDWebServiceHttpGet" type="tns:JKSPDWebServiceHttpGet">
    <http:binding verb="GET" />
    <wsdl:operation name="UpLoadData">
      <http:operation location="/UpLoadData" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="查询报表">
      <http:operation location="/查询报表" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="JKSPDWebServiceHttpPost" type="tns:JKSPDWebServiceHttpPost">
    <http:binding verb="POST" />
    <wsdl:operation name="UpLoadData">
      <http:operation location="/UpLoadData" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="查询报表">
      <http:operation location="/查询报表" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="JKSPDWebService">
    <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SPD接口服务</wsdl:documentation>
    <wsdl:port name="JKSPDWebServiceSoap" binding="tns:JKSPDWebServiceSoap">
      <soap:address location="http://58.221.248.222/JKSPDWebService/JKSPDWebService.asmx" />
    </wsdl:port>
    <wsdl:port name="JKSPDWebServiceSoap12" binding="tns:JKSPDWebServiceSoap12">
      <soap12:address location="http://58.221.248.222/JKSPDWebService/JKSPDWebService.asmx" />
    </wsdl:port>
    <wsdl:port name="JKSPDWebServiceHttpGet" binding="tns:JKSPDWebServiceHttpGet">
      <http:address location="http://58.221.248.222/JKSPDWebService/JKSPDWebService.asmx" />
    </wsdl:port>
    <wsdl:port name="JKSPDWebServiceHttpPost" binding="tns:JKSPDWebServiceHttpPost">
      <http:address location="http://58.221.248.222/JKSPDWebService/JKSPDWebService.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>