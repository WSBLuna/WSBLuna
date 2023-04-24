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
            <value>eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1bmlxdWVfbmFtZSI6IjAwMDAwMDAxNzEiLCJyb2xlIjoiQWRtaW5pc3RhcnRvciIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvdXNlcmRhdGEiOiJ7XCJ1c2VyX25hbWVcIjpcIjAwMDAwMDAxNzFcIixcInBhc3N3b3JkXCI6XCJcIixcInBvc2l0aW9uSWRcIjpcIlwiLFwiZWxsaXBzZVVybFwiOlwiaHR0cDovL2VsbGlwc2UtZGVtby5lbXMtZWxsdHN0LmVtcy5jby5pZC9cIixcImRpc3RyaWN0Q29kZVwiOlwiXCJ9IiwibmJmIjoxNjgyMzIwMzY4LCJleHAiOjE2ODIzMzExNjgsImlhdCI6MTY4MjMyMDM2OH0.A-dwRzfN-6mvl1UhdFLnA6j-fZ7pdtG_Cx2SDWlKRX4</value>
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
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1bmlxdWVfbmFtZSI6IjAwMDAwMDAxNzEiLCJyb2xlIjoiQWRtaW5pc3RhcnRvciIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvdXNlcmRhdGEiOiJ7XCJ1c2VyX25hbWVcIjpcIjAwMDAwMDAxNzFcIixcInBhc3N3b3JkXCI6XCJcIixcInBvc2l0aW9uSWRcIjpcIlwiLFwiZWxsaXBzZVVybFwiOlwiaHR0cDovL2VsbGlwc2UtZGVtby5lbXMtZWxsdHN0LmVtcy5jby5pZC9cIixcImRpc3RyaWN0Q29kZVwiOlwiXCJ9IiwibmJmIjoxNjgyMzIwMzY4LCJleHAiOjE2ODIzMzExNjgsImlhdCI6MTY4MjMyMDM2OH0.A-dwRzfN-6mvl1UhdFLnA6j-fZ7pdtG_Cx2SDWlKRX4</value>
      <webElementGuid>c1819819-75eb-47b7-843f-d54d516f903f</webElementGuid>
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
