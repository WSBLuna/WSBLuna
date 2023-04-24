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
            <value>eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1bmlxdWVfbmFtZSI6ImFkbWluIiwicm9sZSI6IkFkbWluaXN0YXJ0b3IiLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoie1widXNlcl9uYW1lXCI6XCJhZG1pblwiLFwicGFzc3dvcmRcIjpcIlwiLFwicG9zaXRpb25JZFwiOlwiU1lTQURcIixcImVsbGlwc2VVcmxcIjpcImh0dHA6Ly9lbGxpcHNlLWRlbW8uZW1zLWVsbHRzdC5lbXMuY28uaWQvXCIsXCJkaXN0cmljdENvZGVcIjpcIlNFUlZcIn0iLCJuYmYiOjE2ODIzMTg2NTYsImV4cCI6MTY4MjMyOTQ1NiwiaWF0IjoxNjgyMzE4NjU2fQ.uVJtMF0Vw2e17WejHasH4marMHZula8UG-gqdkcbgcU</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1bmlxdWVfbmFtZSI6ImFkbWluIiwicm9sZSI6IkFkbWluaXN0YXJ0b3IiLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoie1widXNlcl9uYW1lXCI6XCJhZG1pblwiLFwicGFzc3dvcmRcIjpcIlwiLFwicG9zaXRpb25JZFwiOlwiU1lTQURcIixcImVsbGlwc2VVcmxcIjpcImh0dHA6Ly9lbGxpcHNlLWRlbW8uZW1zLWVsbHRzdC5lbXMuY28uaWQvXCIsXCJkaXN0cmljdENvZGVcIjpcIlNFUlZcIn0iLCJuYmYiOjE2ODIzMTg2NTYsImV4cCI6MTY4MjMyOTQ1NiwiaWF0IjoxNjgyMzE4NjU2fQ.uVJtMF0Vw2e17WejHasH4marMHZula8UG-gqdkcbgcU</value>
      <webElementGuid>7a38d9f2-cf64-4d6b-9928-923b00cb407e</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://ellipseinterface.ems.co.id/api/ApprovalsManager/RetrieveApprovals</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
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
