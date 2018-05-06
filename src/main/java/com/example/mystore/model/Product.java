package com.example.mystore.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.mysql.jdbc.Blob;


@Entity
@Table(name = "PRODUCTS")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

		@Column(name = "HJMPTS")
	    private BigInteger hjmpts;

	    @Column(name = "CREATEDTS")
	    private Timestamp createDts;

	    @Column(name = "MODIFIEDTS")
	    private Timestamp modifieDts; 

	    @Column(name = "TYPEPKSTRING")
	    private BigInteger typePkString; 
	    
	    @Column(name = "OWNERPKSTRING")
	    private BigInteger ownerPkString; 
	    
		@Id
	    @GeneratedValue//(strategy = GenerationType.IDENTITY)
	    @Column(name = "PK", unique = true, nullable = false)
	    private BigInteger pk; 
	    
	    @Column(name = "P_CODE", columnDefinition="VARCHAR(255)")
	    private String pCode; 

	    @Column(name = "P_UNIT")
	    private BigInteger pUnit; 

	    @Column(name = "P_THUMBNAIL")
	    private BigInteger pThumbnail; 

	    @Column(name = "P_PICTURE")
	    private BigInteger pPicture; 

	    @Column(name = "P_CATALOG")
	    private BigInteger pCatalog; 

	    @Column(name = "P_CATALOGVERSION")
        private BigInteger pCatalogVersion; 

	    @Column(name = "P_ONLINEDATE")
	    private Timestamp pOnLineDate; 

	    @Column(name = "P_OFFLINEDATE")
	    private Timestamp pOffLineDate; 

	    @Column(name = "P_EAN", columnDefinition="VARCHAR(255)")
	    private String pEan; 

	    @Column(name = "P_SUPPLIERALTERNATIVEAID", columnDefinition="VARCHAR(255)")
	    private BigInteger pSupplierAlternativeAid; 

	    @Column(name = "P_BUYERIDS")
	    @Lob
	    private Blob pBuyersID; 

	    @Column(name = "P_MANUFACTURERAID", columnDefinition="VARCHAR(255)")
	    private String pManufactureAid; 
	    
	    @Column(name = "P_MANUFACTURERNAME", columnDefinition="VARCHAR(255)")
	    private String pManufacturerName; 

	    @Column(name = "P_ERPGROUPBUYER", columnDefinition="VARCHAR(255)")
	    private String pErpGroupBuyer; 

	    @Column(name = "P_ERPGROUPSUPPLIER", columnDefinition="VARCHAR(255)")
	    private String pErpGroupSupplier; 

	    @Column(name = "P_DELIVERYTIME")
	    private Double pDeliveryTime; 

	    @Lob
	    @Column(name = "P_SPECIALTREATMENTCLASSES")
	    private Blob pSpecialTreatmentClasses; 

	    @Column(name = "P_ORDER")
	    private Integer pOrder; 

	    @Column(name = "P_APPROVALSTATUS")
	    private BigInteger pApprovalStatus; 

	    @Column(name = "P_CONTENTUNIT")
	    private BigInteger pContentUnit; 

	    @Column(name = "P_NUMBERCONTENTUNITS")
	    private Double pNumberContentunits; 

	    @Column(name = "P_MINORDERQUANTITY")
	    private Integer pMinOrderQuantity; 

	    @Column(name = "P_MAXORDERQUANTITY")
	    private Integer pMaxOrderQuantity; 

	    @Column(name = "P_ORDERQUANTITYINTERVAL")
	    private Integer pOrderQuantityInterval; 

	    @Column(name = "P_PRICEQUANTITY")
	    private Integer pPriceQuantity; 

	    @Column(name = "P_NORMAL")
	    private String pNormal; 

	    @Column(name = "P_THUMBNAILS")
	    private String pThumbnails; 

	    @Column(name = "P_DETAIL")
	    private String pDetail; 

	    @Column(name = "P_LOGO")
	    private String pLogo; 

	    @Column(name = "P_DATA_SHEET")
	    private String pDataSheet; 
	    
	    @Column(name = "P_OTHERS")
	    private String pOthers; 

	    @Column(name = "P_STARTLINENUMBER")
	    private Integer pStartLineNumber; 

	    @Column(name = "P_ENDLINENUMBER")
	    private Integer pEndLineNumber; 

	    @Column(name = "P_VARIANTTYPE")
        private BigInteger pVariantType; 

	    @Column(name = "P_EUROPE1PRICEFACTORY_PPG")
	    private BigInteger pEurope1PriceFactoryPPG; 

	    @Column(name = "P_EUROPE1PRICEFACTORY_PTG")
	    private BigInteger pEurope1PriceFactoryPTG; 

	    @Column(name = "P_EUROPE1PRICEFACTORY_PDG")
	    private BigInteger pEurope1PriceFactoryPDG; 

	    @Column(name = "P_BAND")
	    private BigInteger pBand; 

	    @Column(name = "ACLTS")
	    private BigInteger aclts; 

	    @Column(name = "PROPTS")
	    private BigInteger propts; 

	    @Column(name = "P_BASEPRODUCT")
	    private BigInteger pBaseProduct; 

	    @Column(name = "P_VENUE", columnDefinition="VARCHAR(255)")
	    private String pVenue; 

	    @Column(name = "P_DATE")
	    private Timestamp pDate; 

	    @Column(name = "P_CONCERTTYPE")
	    private BigInteger pConcertType;

		public BigInteger getHjmpts() {
			return hjmpts;
		}

		public void setHjmpts(BigInteger hjmpts) {
			this.hjmpts = hjmpts;
		}

		public Timestamp getCreateDts() {
			return createDts;
		}

		public void setCreateDts(Timestamp createDts) {
			this.createDts = createDts;
		}

		public Timestamp getModifieDts() {
			return modifieDts;
		}

		public void setModifieDts(Timestamp modifieDts) {
			this.modifieDts = modifieDts;
		}

		public BigInteger getTypePkString() {
			return typePkString;
		}

		public void setTypePkString(BigInteger typePkString) {
			this.typePkString = typePkString;
		}

		public BigInteger getOwnerPkString() {
			return ownerPkString;
		}

		public void setOwnerPkString(BigInteger ownerPkString) {
			this.ownerPkString = ownerPkString;
		}

		public BigInteger getPk() {
			return pk;
		}

		public String getpCode() {
			return pCode;
		}

		public void setpCode(String pCode) {
			this.pCode = pCode;
		}

		public BigInteger getpUnit() {
			return pUnit;
		}

		public void setpUnit(BigInteger pUnit) {
			this.pUnit = pUnit;
		}

		public BigInteger getpThumbnail() {
			return pThumbnail;
		}

		public void setpThumbnail(BigInteger pThumbnail) {
			this.pThumbnail = pThumbnail;
		}

		public BigInteger getpPicture() {
			return pPicture;
		}

		public void setpPicture(BigInteger pPicture) {
			this.pPicture = pPicture;
		}

		public BigInteger getpCatalog() {
			return pCatalog;
		}

		public void setpCatalog(BigInteger pCatalog) {
			this.pCatalog = pCatalog;
		}

		public BigInteger getpCatalogVersion() {
			return pCatalogVersion;
		}

		public void setpCatalogVersion(BigInteger pCatalogVersion) {
			this.pCatalogVersion = pCatalogVersion;
		}

		public Timestamp getpOnLineDate() {
			return pOnLineDate;
		}

		public void setpOnLineDate(Timestamp pOnLineDate) {
			this.pOnLineDate = pOnLineDate;
		}

		public Timestamp getpOffLineDate() {
			return pOffLineDate;
		}

		public void setpOffLineDate(Timestamp pOffLineDate) {
			this.pOffLineDate = pOffLineDate;
		}

		public String getpEan() {
			return pEan;
		}

		public void setpEan(String pEan) {
			this.pEan = pEan;
		}

		public BigInteger getpSupplierAlternativeAid() {
			return pSupplierAlternativeAid;
		}

		public void setpSupplierAlternativeAid(BigInteger pSupplierAlternativeAid) {
			this.pSupplierAlternativeAid = pSupplierAlternativeAid;
		}

		public Blob getpBuyersID() {
			return pBuyersID;
		}

		public void setpBuyersID(Blob pBuyersID) {
			this.pBuyersID = pBuyersID;
		}

		public String getpManufactureAid() {
			return pManufactureAid;
		}

		public void setpManufactureAid(String pManufactureAid) {
			this.pManufactureAid = pManufactureAid;
		}

		public String getpManufacturerName() {
			return pManufacturerName;
		}

		public void setpManufacturerName(String pManufacturerName) {
			this.pManufacturerName = pManufacturerName;
		}

		public String getpErpGroupBuyer() {
			return pErpGroupBuyer;
		}

		public void setpErpGroupBuyer(String pErpGroupBuyer) {
			this.pErpGroupBuyer = pErpGroupBuyer;
		}

		public String getpErpGroupSupplier() {
			return pErpGroupSupplier;
		}

		public void setpErpGroupSupplier(String pErpGroupSupplier) {
			this.pErpGroupSupplier = pErpGroupSupplier;
		}

		public Double getpDeliveryTime() {
			return pDeliveryTime;
		}

		public void setpDeliveryTime(Double pDeliveryTime) {
			this.pDeliveryTime = pDeliveryTime;
		}

		public Blob getpSpecialTreatmentClasses() {
			return pSpecialTreatmentClasses;
		}

		public void setpSpecialTreatmentClasses(Blob pSpecialTreatmentClasses) {
			this.pSpecialTreatmentClasses = pSpecialTreatmentClasses;
		}

		public Integer getpOrder() {
			return pOrder;
		}

		public void setpOrder(Integer pOrder) {
			this.pOrder = pOrder;
		}

		public BigInteger getpApprovalStatus() {
			return pApprovalStatus;
		}

		public void setpApprovalStatus(BigInteger pApprovalStatus) {
			this.pApprovalStatus = pApprovalStatus;
		}

		public BigInteger getpContentUnit() {
			return pContentUnit;
		}

		public void setpContentUnit(BigInteger pContentUnit) {
			this.pContentUnit = pContentUnit;
		}

		public Double getpNumberContentunits() {
			return pNumberContentunits;
		}

		public void setpNumberContentunits(Double pNumberContentunits) {
			this.pNumberContentunits = pNumberContentunits;
		}

		public Integer getpMinOrderQuantity() {
			return pMinOrderQuantity;
		}

		public void setpMinOrderQuantity(Integer pMinOrderQuantity) {
			this.pMinOrderQuantity = pMinOrderQuantity;
		}

		public Integer getpMaxOrderQuantity() {
			return pMaxOrderQuantity;
		}

		public void setpMaxOrderQuantity(Integer pMaxOrderQuantity) {
			this.pMaxOrderQuantity = pMaxOrderQuantity;
		}

		public Integer getpOrderQuantityInterval() {
			return pOrderQuantityInterval;
		}

		public void setpOrderQuantityInterval(Integer pOrderQuantityInterval) {
			this.pOrderQuantityInterval = pOrderQuantityInterval;
		}

		public Integer getpPriceQuantity() {
			return pPriceQuantity;
		}

		public void setpPriceQuantity(Integer pPriceQuantity) {
			this.pPriceQuantity = pPriceQuantity;
		}

		public String getpNormal() {
			return pNormal;
		}

		public void setpNormal(String pNormal) {
			this.pNormal = pNormal;
		}

		public String getpThumbnails() {
			return pThumbnails;
		}

		public void setpThumbnails(String pThumbnails) {
			this.pThumbnails = pThumbnails;
		}

		public String getpDetail() {
			return pDetail;
		}

		public void setpDetail(String pDetail) {
			this.pDetail = pDetail;
		}

		public String getpLogo() {
			return pLogo;
		}

		public void setpLogo(String pLogo) {
			this.pLogo = pLogo;
		}

		public String getpDataSheet() {
			return pDataSheet;
		}

		public void setpDataSheet(String pDataSheet) {
			this.pDataSheet = pDataSheet;
		}

		public String getpOthers() {
			return pOthers;
		}

		public void setpOthers(String pOthers) {
			this.pOthers = pOthers;
		}

		public Integer getpStartLineNumber() {
			return pStartLineNumber;
		}

		public void setpStartLineNumber(Integer pStartLineNumber) {
			this.pStartLineNumber = pStartLineNumber;
		}

		public Integer getpEndLineNumber() {
			return pEndLineNumber;
		}

		public void setpEndLineNumber(Integer pEndLineNumber) {
			this.pEndLineNumber = pEndLineNumber;
		}

		public BigInteger getpVariantType() {
			return pVariantType;
		}

		public void setpVariantType(BigInteger pVariantType) {
			this.pVariantType = pVariantType;
		}

		public BigInteger getpEurope1PriceFactoryPPG() {
			return pEurope1PriceFactoryPPG;
		}

		public void setpEurope1PriceFactoryPPG(BigInteger pEurope1PriceFactoryPPG) {
			this.pEurope1PriceFactoryPPG = pEurope1PriceFactoryPPG;
		}

		public BigInteger getpEurope1PriceFactoryPTG() {
			return pEurope1PriceFactoryPTG;
		}

		public void setpEurope1PriceFactoryPTG(BigInteger pEurope1PriceFactoryPTG) {
			this.pEurope1PriceFactoryPTG = pEurope1PriceFactoryPTG;
		}

		public BigInteger getpEurope1PriceFactoryPDG() {
			return pEurope1PriceFactoryPDG;
		}

		public void setpEurope1PriceFactoryPDG(BigInteger pEurope1PriceFactoryPDG) {
			this.pEurope1PriceFactoryPDG = pEurope1PriceFactoryPDG;
		}

		public BigInteger getpBand() {
			return pBand;
		}

		public void setpBand(BigInteger pBand) {
			this.pBand = pBand;
		}

		public BigInteger getAclts() {
			return aclts;
		}

		public void setAclts(BigInteger aclts) {
			this.aclts = aclts;
		}

		public BigInteger getPropts() {
			return propts;
		}

		public void setPropts(BigInteger propts) {
			this.propts = propts;
		}

		public BigInteger getpBaseProduct() {
			return pBaseProduct;
		}

		public void setpBaseProduct(BigInteger pBaseProduct) {
			this.pBaseProduct = pBaseProduct;
		}

		public String getpVenue() {
			return pVenue;
		}

		public void setpVenue(String pVenue) {
			this.pVenue = pVenue;
		}

		public Timestamp getpDate() {
			return pDate;
		}

		public void setpDate(Timestamp pDate) {
			this.pDate = pDate;
		}

		public BigInteger getpConcertType() {
			return pConcertType;
		}

		public void setpConcertType(BigInteger pConcertType) {
			this.pConcertType = pConcertType;
		} 


}
