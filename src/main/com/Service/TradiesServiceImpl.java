package main.com.Service;


import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import main.com.model.AuthFile;
import main.com.model.Tradie;


public class TradiesServiceImpl {
	public String Oauth() {
	try
	{
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpHost target = new HttpHost("https://api.onegov.nsw.gov.au");
		//HttpHost proxy = new HttpHost("gsw-03-proxy.topl.com.au", 3128, "http");
		//RequestConfig config = RequestConfig.custom().setProxy(proxy).setCookieSpec("easy").build();
		HttpGet getRequest = new HttpGet("oauth/client_credential/accesstoken?grant_type=client_credentials");
		//getRequest.setConfig(config);
		getRequest.addHeader("Accept", "application/xml");
		getRequest.addHeader("authorization ", "Basic RUZGZkY0YVBvRDIzMUlQSWJBN21sRXNGVW5McFViTWI6Q1cwSTFJcGU1S0ZHbllMVA==");
		HttpResponse response = httpClient.execute(target, getRequest);

		if (response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
		}

		String strResponse = EntityUtils.toString(response.getEntity());
		ObjectMapper mapper = new ObjectMapper();
		AuthFile ap = mapper.readValue(strResponse, AuthFile.class);

		return ap.getAccess_Token();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;
	}
	
	public List<Tradie> getAllTradiesList() {
		List<Tradie> Tradies = null;
		try {
			
			String AccessToken = Oauth();
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpHost target = new HttpHost("https://api.onegov.nsw.gov.au");
			//HttpHost proxy = new HttpHost("gsw-03-proxy.topl.com.au", 3128, "http");
			//RequestConfig config = RequestConfig.custom().setProxy(proxy).setCookieSpec("easy").build();
			HttpGet getRequest = new HttpGet("/tradesregister/v1/browse?searchText=Telecom");
			//getRequest.setConfig(config);
			getRequest.addHeader("Accept", "application/json");
			getRequest.addHeader("dataType ", "json");

			getRequest.addHeader("apikey ", "EFFfF4aPoD231IPIbA7mlEsFUnLpUbMb");

			getRequest.addHeader("Authorization ", "application/xml");

			getRequest.addHeader("Accept", "Bearer bTAqCGhnUK0lplr9jwGwRi1XnDeI");

			getRequest.addHeader("Content-Type", "application/json; charset=utf-8");
			HttpResponse response = httpClient.execute(target, getRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

			String strResponse = EntityUtils.toString(response.getEntity());
			ObjectMapper mapper = new ObjectMapper();
			Tradie tradie = mapper.readValue(strResponse, Tradie.class);
//			Tradie = ap.getTradies();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return Tradies;
	}
}


