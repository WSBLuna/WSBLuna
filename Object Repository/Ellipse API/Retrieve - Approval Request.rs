<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>Retrieve - Approval Request</description>
   <name>Retrieve - Approval Request</name>
   <tag></tag>
   <elementGuidId>e01d827e-6dcb-4d89-b72e-403dfbb5f7aa</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1bmlxdWVfbmFtZSI6ImFkbWluIiwicm9sZSI6IkFkbWluaXN0YXJ0b3IiLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoie1widXNlcl9uYW1lXCI6XCJhZG1pblwiLFwicGFzc3dvcmRcIjpcIlwiLFwicG9zaXRpb25JZFwiOlwiU1lTQURcIixcImVsbGlwc2VVcmxcIjpcImh0dHA6Ly9lbGxpcHNlLWRlbW8uZW1zLWVsbHRzdC5lbXMuY28uaWQvXCIsXCJkaXN0cmljdENvZGVcIjpcIlNFUlZcIn0iLCJuYmYiOjE2ODIwNDQ4NTUsImV4cCI6MTY4MjA1NTY1NSwiaWF0IjoxNjgyMDQ0ODU1fQ.NLVWBPE0YpT8Lao3mdRTEvw5DqH1LD3wuEbnBIplVmg</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1bmlxdWVfbmFtZSI6ImFkbWluIiwicm9sZSI6IkFkbWluaXN0YXJ0b3IiLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoie1widXNlcl9uYW1lXCI6XCJhZG1pblwiLFwicGFzc3dvcmRcIjpcIlwiLFwicG9zaXRpb25JZFwiOlwiU1lTQURcIixcImVsbGlwc2VVcmxcIjpcImh0dHA6Ly9lbGxpcHNlLWRlbW8uZW1zLWVsbHRzdC5lbXMuY28uaWQvXCIsXCJkaXN0cmljdENvZGVcIjpcIlNFUlZcIn0iLCJuYmYiOjE2ODIwNDQ4NTUsImV4cCI6MTY4MjA1NTY1NSwiaWF0IjoxNjgyMDQ0ODU1fQ.NLVWBPE0YpT8Lao3mdRTEvw5DqH1LD3wuEbnBIplVmg</value>
      <webElementGuid>70144875-7ef2-4ced-bee7-376afd323ba0</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://ellipseinterface.ems.co.id/api/ApprovalsManager/RetrieveApprovals</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
