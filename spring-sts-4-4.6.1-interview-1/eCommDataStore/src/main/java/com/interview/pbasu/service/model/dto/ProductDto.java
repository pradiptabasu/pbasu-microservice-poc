package com.interview.pbasu.service.model.dto;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

public class ProductDto {
	private UUID productSerial;
	private String productSKU;
	private String productName;
	private String productType;
	private String productBrand;
	private float productPrice;
	private String productColor;
	private String productSize;
	private String productSeller;

	public String getProductSKU() {
		return productSKU;
	}

	public void setProductSKU(String productSKU) {
		this.productSKU = productSKU;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public String getProductSeller() {
		return productSeller;
	}

	public void setProductSeller(String productSeller) {
		this.productSeller = productSeller;
	}

	public UUID getProductSerial() {
		return productSerial;
	}

	public void setProductSerial(UUID productSerial) {
		this.productSerial = productSerial;
	}

	public ProductDto() {
	}

	public ProductDto(UUID productSerial, String productSKU, String productName, String productType,
			String productBrand, float productPrice, String productColor, String productSize, String productSeller) {
		super();
		this.productSerial = productSerial;
		this.productSKU = productSKU;
		this.productName = productName;
		this.productType = productType;
		this.productBrand = productBrand;
		this.productPrice = productPrice;
		this.productColor = productColor;
		this.productSize = productSize;
		this.productSeller = productSeller;
	}

	@Override
	public String toString() {
		return "Product [productSerial=" + productSerial + ", productSKU=" + productSKU
				+ ", productName=" + productName + ", productType=" + productType + ", productBrand=" + productBrand
				+ ", productPrice=" + productPrice + ", productColor=" + productColor + ", productSize=" + productSize
				+ ", productSeller=" + productSeller + "]";
	}

}