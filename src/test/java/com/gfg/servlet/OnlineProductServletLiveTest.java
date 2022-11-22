package com.gfg.servlet;

import static org.junit.Assert.assertEquals;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Test;

public class OnlineProductServletLiveTest {

    @Test
    public void whenRequestUsingHttpClient_thenCorrectResponse() throws Exception {

        HttpClient httpClient = new DefaultHttpClient();
        HttpGet method= new HttpGet("http://localhost:8080/apache-velocity/");

        HttpResponse httpResponse = httpClient.execute(method);

        assertEquals("Success", httpResponse.getHeaders("Template Returned")[0].getValue());

    }
}
