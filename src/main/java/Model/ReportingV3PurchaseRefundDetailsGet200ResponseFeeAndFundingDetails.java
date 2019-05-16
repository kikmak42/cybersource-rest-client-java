/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fee Funding Section
 */
@ApiModel(description = "Fee Funding Section")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-09T16:47:53.059+05:30")
public class ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails {
  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("interchangePerItemFee")
  private String interchangePerItemFee = null;

  @SerializedName("discountPercentage")
  private String discountPercentage = null;

  @SerializedName("discountAmount")
  private String discountAmount = null;

  @SerializedName("discountPerItemFee")
  private String discountPerItemFee = null;

  @SerializedName("totalFee")
  private String totalFee = null;

  @SerializedName("feeCurrency")
  private String feeCurrency = null;

  @SerializedName("duesAssessments")
  private String duesAssessments = null;

  @SerializedName("fundingAmount")
  private String fundingAmount = null;

  @SerializedName("fundingCurrency")
  private String fundingCurrency = null;

  public ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request.
   * @return requestId
  **/
  @ApiModelProperty(example = "12345678901234567890123456", value = "An unique identification number assigned by CyberSource to identify the submitted request.")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails interchangePerItemFee(String interchangePerItemFee) {
    this.interchangePerItemFee = interchangePerItemFee;
    return this;
  }

   /**
   * interchange Per Item Fee
   * @return interchangePerItemFee
  **/
  @ApiModelProperty(example = "2.7", value = "interchange Per Item Fee")
  public String getInterchangePerItemFee() {
    return interchangePerItemFee;
  }

  public void setInterchangePerItemFee(String interchangePerItemFee) {
    this.interchangePerItemFee = interchangePerItemFee;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails discountPercentage(String discountPercentage) {
    this.discountPercentage = discountPercentage;
    return this;
  }

   /**
   * Discount Percentage
   * @return discountPercentage
  **/
  @ApiModelProperty(example = "2.39", value = "Discount Percentage")
  public String getDiscountPercentage() {
    return discountPercentage;
  }

  public void setDiscountPercentage(String discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails discountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Discount Amount
   * @return discountAmount
  **/
  @ApiModelProperty(example = "0.429", value = "Discount Amount")
  public String getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails discountPerItemFee(String discountPerItemFee) {
    this.discountPerItemFee = discountPerItemFee;
    return this;
  }

   /**
   * Discount Per Item Fee
   * @return discountPerItemFee
  **/
  @ApiModelProperty(example = "0.002", value = "Discount Per Item Fee")
  public String getDiscountPerItemFee() {
    return discountPerItemFee;
  }

  public void setDiscountPerItemFee(String discountPerItemFee) {
    this.discountPerItemFee = discountPerItemFee;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails totalFee(String totalFee) {
    this.totalFee = totalFee;
    return this;
  }

   /**
   * Total Fee
   * @return totalFee
  **/
  @ApiModelProperty(example = "0.429", value = "Total Fee")
  public String getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(String totalFee) {
    this.totalFee = totalFee;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails feeCurrency(String feeCurrency) {
    this.feeCurrency = feeCurrency;
    return this;
  }

   /**
   * Fee Currency
   * @return feeCurrency
  **/
  @ApiModelProperty(example = "1", value = "Fee Currency")
  public String getFeeCurrency() {
    return feeCurrency;
  }

  public void setFeeCurrency(String feeCurrency) {
    this.feeCurrency = feeCurrency;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails duesAssessments(String duesAssessments) {
    this.duesAssessments = duesAssessments;
    return this;
  }

   /**
   * Dues Assessments
   * @return duesAssessments
  **/
  @ApiModelProperty(example = "0", value = "Dues Assessments")
  public String getDuesAssessments() {
    return duesAssessments;
  }

  public void setDuesAssessments(String duesAssessments) {
    this.duesAssessments = duesAssessments;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails fundingAmount(String fundingAmount) {
    this.fundingAmount = fundingAmount;
    return this;
  }

   /**
   * Funding Amount
   * @return fundingAmount
  **/
  @ApiModelProperty(example = "2.50", value = "Funding Amount")
  public String getFundingAmount() {
    return fundingAmount;
  }

  public void setFundingAmount(String fundingAmount) {
    this.fundingAmount = fundingAmount;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails fundingCurrency(String fundingCurrency) {
    this.fundingCurrency = fundingCurrency;
    return this;
  }

   /**
   * Funding Currency (ISO 4217)
   * @return fundingCurrency
  **/
  @ApiModelProperty(example = "USD", value = "Funding Currency (ISO 4217)")
  public String getFundingCurrency() {
    return fundingCurrency;
  }

  public void setFundingCurrency(String fundingCurrency) {
    this.fundingCurrency = fundingCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails reportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails = (ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails) o;
    return Objects.equals(this.requestId, reportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails.requestId) &&
        Objects.equals(this.interchangePerItemFee, reportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails.interchangePerItemFee) &&
        Objects.equals(this.discountPercentage, reportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails.discountPercentage) &&
        Objects.equals(this.discountAmount, reportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails.discountAmount) &&
        Objects.equals(this.discountPerItemFee, reportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails.discountPerItemFee) &&
        Objects.equals(this.totalFee, reportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails.totalFee) &&
        Objects.equals(this.feeCurrency, reportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails.feeCurrency) &&
        Objects.equals(this.duesAssessments, reportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails.duesAssessments) &&
        Objects.equals(this.fundingAmount, reportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails.fundingAmount) &&
        Objects.equals(this.fundingCurrency, reportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails.fundingCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, interchangePerItemFee, discountPercentage, discountAmount, discountPerItemFee, totalFee, feeCurrency, duesAssessments, fundingAmount, fundingCurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    interchangePerItemFee: ").append(toIndentedString(interchangePerItemFee)).append("\n");
    sb.append("    discountPercentage: ").append(toIndentedString(discountPercentage)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountPerItemFee: ").append(toIndentedString(discountPerItemFee)).append("\n");
    sb.append("    totalFee: ").append(toIndentedString(totalFee)).append("\n");
    sb.append("    feeCurrency: ").append(toIndentedString(feeCurrency)).append("\n");
    sb.append("    duesAssessments: ").append(toIndentedString(duesAssessments)).append("\n");
    sb.append("    fundingAmount: ").append(toIndentedString(fundingAmount)).append("\n");
    sb.append("    fundingCurrency: ").append(toIndentedString(fundingCurrency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

