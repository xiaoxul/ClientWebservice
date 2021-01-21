package com.test.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class callReferCustomerRequest3 {
	public static void main(String[] args) throws Exception {
	URL url = new URL("http://localhost:9080/jp/sales/oio/oiobama/web/OIOServerService.wss");
	URLConnection conn = url.openConnection();
	HttpURLConnection httpConn = (HttpURLConnection) conn;
	System.out.println("20200301 httpConn== "+httpConn);
	httpConn.setDoInput(true);
	httpConn.setDoOutput(true);
	
	httpConn.setRequestMethod("POST");
	httpConn.setRequestProperty("Content-type", "text/xml;charset=UTF-8");
	
//	String data = "<soapenv:Envelope xmlns:soapenv=" +
//	        "\"http://schemas.xmlsoap.org/soap/envelope/\" " +
//	         "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" " +
//	        "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
//	        +"<soapenv:Body>"+
//	        "<referCustomer xmlns=\"http://service.web.oiobama.oio.sales.jp/\">" +     
//			 "<CPNO>40850B</CPNO>" +     
//			"</referCustomer>" +   
//	      "</soapenv:Body>"
//	      +"</soapenv:Envelope>";
	
	
	String data = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
		    "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">"
		    + "<soapenv:Body>"+   
		    "<referCustomer xmlns=\"http://service.web.oiobama.oio.sales.jp/\">" +     
		 "<CPNO>40850B</CPNO>" +     
		"</referCustomer>" +   
		 "</soapenv:Body>" +    
		"</soapenv:Envelope>";	
	OutputStream out = httpConn.getOutputStream();
	out.write(data.getBytes());
	System.out.println("20200301 out== "+out);
	StringBuffer sb = new StringBuffer();
	String line = null;
	System.out.println("20200301 httpConn.getResponseCode()== "+httpConn.getResponseCode());
	if(httpConn.getResponseCode() == 200){
		
		InputStream in = httpConn.getInputStream();
		System.out.println("20200301 in== "+in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
	        
	    
	    while((line = reader.readLine()) != null){
	        sb.append(line);
	    }
	}
	System.out.println("20200301 sb== "+sb);
	SAXReader saxReader = new SAXReader();
	 Document doc = saxReader.read(new StringReader(sb.toString()));
	
	 List<Element> eles = doc.selectNodes("//return");
	    for(Element ele : eles){
	        System.out.println(ele.getText());
	    }

}
}
