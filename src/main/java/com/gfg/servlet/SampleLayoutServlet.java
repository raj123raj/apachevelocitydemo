package com.gfg.servlet;

import com.gfg.model.OnlineProductSale;
import com.gfg.service.OnlineProductService;

import org.apache.velocity.Template;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.VelocityLayoutServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class SampleLayoutServlet extends VelocityLayoutServlet {
	OnlineProductService service = new OnlineProductService();

	@Override
	public Template handleRequest(HttpServletRequest request, HttpServletResponse response, Context context) {

        Logger logger= LoggerFactory.getLogger(SampleLayoutServlet.class);

		List<OnlineProductSale> onlineProductsForSale = service.getOnlineProductsForSale();

		context.put("products", onlineProductsForSale);

		Template template = null;

		try {
			//Refering layoutdemo.vm from templates folder
			template = getTemplate("templates/layoutdemo.vm");

			response.setHeader("Template Returned", "Success");
		} catch (Exception e) {
			logger.error("Error while reading the template ",e);
		}

		return template;

	}

}
