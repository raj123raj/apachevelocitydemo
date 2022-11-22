package com.gfg.model;

public class OnlineProductSale {

	private String productName;
	private double productPrice;

	public OnlineProductSale(String productName, double productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "OnlineProductSale{" + "productName='" + productName + '\'' + ", productPrice=" + productPrice + '}';
	}
}
