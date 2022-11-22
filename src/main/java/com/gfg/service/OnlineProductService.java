package com.gfg.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gfg.model.OnlineProductSale;

import java.util.Arrays;
import java.util.List;

public class OnlineProductService {

	Logger logger = LoggerFactory.getLogger(OnlineProductService.class);

	public List<OnlineProductSale> getOnlineProductsForSale() {
        logger.debug("Product service returning list of products");

		return Arrays.asList(new OnlineProductSale("Dell Laptop", 31000.00), new OnlineProductSale("Samsung Mobile", 16000.00),
				new OnlineProductSale("Samsung Tablet", 15000.00), new OnlineProductSale("Sony Camera", 23000.00));
	}
}
