package com.lin.luo.tian;

public class TradeAccount {
	private Integer id;
	private Long revisionNumber;
	private String contactEmail;
	private String fax;
	private String phone;
	private String portfolioId;
	private String portfolioName;
	private boolean isFaxUsedOnFM;
	private String shortName;
	private String mei;

	public TradeAccount() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getRevisionNumber() {
		return revisionNumber;
	}

	public void setRevisionNumber(Long revisionNumber) {
		this.revisionNumber = revisionNumber;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}

	public String getPortfolioName() {
		return portfolioName;
	}

	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}

	public boolean isFaxUsedOnFM() {
		return isFaxUsedOnFM;
	}

	public void setFaxUsedOnFM(boolean isFaxUsedOnFM) {
		this.isFaxUsedOnFM = isFaxUsedOnFM;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getMei() {
		return mei;
	}

	public void setMei(String mei) {
		this.mei = mei;
	}

}
