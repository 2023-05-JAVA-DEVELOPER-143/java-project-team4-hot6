package com.itwill.shop.product;

import java.sql.Date;

public class Product {
	private int product_no;
	private Date product_start_date;
	private String product_category;
	private String product_name;
	private String product_image;
	private int product_read_count;
	
	public Product() {
		super();
	}

	public Product(int product_no, Date product_start_date, String product_category, String product_name,
			String product_image, int product_read_count) {
		super();
		this.product_no = product_no;
		this.product_start_date = product_start_date;
		this.product_category = product_category;
		this.product_name = product_name;
		this.product_image = product_image;
		this.product_read_count = product_read_count;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public Date getProduct_start_date() {
		return product_start_date;
	}

	public void setProduct_start_date(Date product_start_date) {
		this.product_start_date = product_start_date;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_image() {
		return product_image;
	}

	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}

	public int getProduct_read_count() {
		return product_read_count;
	}

	public void setProduct_read_count(int product_read_count) {
		this.product_read_count = product_read_count;
	}

	@Override
	public String toString() {
		return "Product [product_no=" + product_no + ", product_start_date=" + product_start_date
				+ ", product_category=" + product_category + ", product_name=" + product_name + ", product_image="
				+ product_image + ", product_read_count=" + product_read_count + "]";
	}

}
