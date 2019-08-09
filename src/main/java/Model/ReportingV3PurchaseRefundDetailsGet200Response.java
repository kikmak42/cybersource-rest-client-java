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
import Model.ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations;
import Model.ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails;
import Model.ReportingV3PurchaseRefundDetailsGet200ResponseOthers;
import Model.ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails;
import Model.ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses;
import Model.ReportingV3PurchaseRefundDetailsGet200ResponseSettlements;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportingV3PurchaseRefundDetailsGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-09T15:30:56.583+05:30")
public class ReportingV3PurchaseRefundDetailsGet200Response {
  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("pageResults")
  private Integer pageResults = null;

  @SerializedName("requestDetails")
  private List<ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails> requestDetails = null;

  @SerializedName("settlements")
  private List<ReportingV3PurchaseRefundDetailsGet200ResponseSettlements> settlements = null;

  @SerializedName("authorizations")
  private List<ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations> authorizations = null;

  @SerializedName("feeAndFundingDetails")
  private List<ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails> feeAndFundingDetails = null;

  @SerializedName("others")
  private List<ReportingV3PurchaseRefundDetailsGet200ResponseOthers> others = null;

  @SerializedName("settlementStatuses")
  private List<ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses> settlementStatuses = null;

  public ReportingV3PurchaseRefundDetailsGet200Response offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @ApiModelProperty(value = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public ReportingV3PurchaseRefundDetailsGet200Response limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ReportingV3PurchaseRefundDetailsGet200Response pageResults(Integer pageResults) {
    this.pageResults = pageResults;
    return this;
  }

   /**
   * Get pageResults
   * @return pageResults
  **/
  @ApiModelProperty(value = "")
  public Integer getPageResults() {
    return pageResults;
  }

  public void setPageResults(Integer pageResults) {
    this.pageResults = pageResults;
  }

  public ReportingV3PurchaseRefundDetailsGet200Response requestDetails(List<ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails> requestDetails) {
    this.requestDetails = requestDetails;
    return this;
  }

  public ReportingV3PurchaseRefundDetailsGet200Response addRequestDetailsItem(ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails requestDetailsItem) {
    if (this.requestDetails == null) {
      this.requestDetails = new ArrayList<ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails>();
    }
    this.requestDetails.add(requestDetailsItem);
    return this;
  }

   /**
   * List of Request Info values
   * @return requestDetails
  **/
  @ApiModelProperty(value = "List of Request Info values")
  public List<ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails> getRequestDetails() {
    return requestDetails;
  }

  public void setRequestDetails(List<ReportingV3PurchaseRefundDetailsGet200ResponseRequestDetails> requestDetails) {
    this.requestDetails = requestDetails;
  }

  public ReportingV3PurchaseRefundDetailsGet200Response settlements(List<ReportingV3PurchaseRefundDetailsGet200ResponseSettlements> settlements) {
    this.settlements = settlements;
    return this;
  }

  public ReportingV3PurchaseRefundDetailsGet200Response addSettlementsItem(ReportingV3PurchaseRefundDetailsGet200ResponseSettlements settlementsItem) {
    if (this.settlements == null) {
      this.settlements = new ArrayList<ReportingV3PurchaseRefundDetailsGet200ResponseSettlements>();
    }
    this.settlements.add(settlementsItem);
    return this;
  }

   /**
   * List of Settlement Info values
   * @return settlements
  **/
  @ApiModelProperty(value = "List of Settlement Info values")
  public List<ReportingV3PurchaseRefundDetailsGet200ResponseSettlements> getSettlements() {
    return settlements;
  }

  public void setSettlements(List<ReportingV3PurchaseRefundDetailsGet200ResponseSettlements> settlements) {
    this.settlements = settlements;
  }

  public ReportingV3PurchaseRefundDetailsGet200Response authorizations(List<ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations> authorizations) {
    this.authorizations = authorizations;
    return this;
  }

  public ReportingV3PurchaseRefundDetailsGet200Response addAuthorizationsItem(ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations authorizationsItem) {
    if (this.authorizations == null) {
      this.authorizations = new ArrayList<ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations>();
    }
    this.authorizations.add(authorizationsItem);
    return this;
  }

   /**
   * List of Authorization Info values
   * @return authorizations
  **/
  @ApiModelProperty(value = "List of Authorization Info values")
  public List<ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations> getAuthorizations() {
    return authorizations;
  }

  public void setAuthorizations(List<ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations> authorizations) {
    this.authorizations = authorizations;
  }

  public ReportingV3PurchaseRefundDetailsGet200Response feeAndFundingDetails(List<ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails> feeAndFundingDetails) {
    this.feeAndFundingDetails = feeAndFundingDetails;
    return this;
  }

  public ReportingV3PurchaseRefundDetailsGet200Response addFeeAndFundingDetailsItem(ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails feeAndFundingDetailsItem) {
    if (this.feeAndFundingDetails == null) {
      this.feeAndFundingDetails = new ArrayList<ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails>();
    }
    this.feeAndFundingDetails.add(feeAndFundingDetailsItem);
    return this;
  }

   /**
   * List of Fee Funding Info values
   * @return feeAndFundingDetails
  **/
  @ApiModelProperty(value = "List of Fee Funding Info values")
  public List<ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails> getFeeAndFundingDetails() {
    return feeAndFundingDetails;
  }

  public void setFeeAndFundingDetails(List<ReportingV3PurchaseRefundDetailsGet200ResponseFeeAndFundingDetails> feeAndFundingDetails) {
    this.feeAndFundingDetails = feeAndFundingDetails;
  }

  public ReportingV3PurchaseRefundDetailsGet200Response others(List<ReportingV3PurchaseRefundDetailsGet200ResponseOthers> others) {
    this.others = others;
    return this;
  }

  public ReportingV3PurchaseRefundDetailsGet200Response addOthersItem(ReportingV3PurchaseRefundDetailsGet200ResponseOthers othersItem) {
    if (this.others == null) {
      this.others = new ArrayList<ReportingV3PurchaseRefundDetailsGet200ResponseOthers>();
    }
    this.others.add(othersItem);
    return this;
  }

   /**
   * List of Other Info values
   * @return others
  **/
  @ApiModelProperty(value = "List of Other Info values")
  public List<ReportingV3PurchaseRefundDetailsGet200ResponseOthers> getOthers() {
    return others;
  }

  public void setOthers(List<ReportingV3PurchaseRefundDetailsGet200ResponseOthers> others) {
    this.others = others;
  }

  public ReportingV3PurchaseRefundDetailsGet200Response settlementStatuses(List<ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses> settlementStatuses) {
    this.settlementStatuses = settlementStatuses;
    return this;
  }

  public ReportingV3PurchaseRefundDetailsGet200Response addSettlementStatusesItem(ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses settlementStatusesItem) {
    if (this.settlementStatuses == null) {
      this.settlementStatuses = new ArrayList<ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses>();
    }
    this.settlementStatuses.add(settlementStatusesItem);
    return this;
  }

   /**
   * List of Settlement Status Info values
   * @return settlementStatuses
  **/
  @ApiModelProperty(value = "List of Settlement Status Info values")
  public List<ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses> getSettlementStatuses() {
    return settlementStatuses;
  }

  public void setSettlementStatuses(List<ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses> settlementStatuses) {
    this.settlementStatuses = settlementStatuses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3PurchaseRefundDetailsGet200Response reportingV3PurchaseRefundDetailsGet200Response = (ReportingV3PurchaseRefundDetailsGet200Response) o;
    return Objects.equals(this.offset, reportingV3PurchaseRefundDetailsGet200Response.offset) &&
        Objects.equals(this.limit, reportingV3PurchaseRefundDetailsGet200Response.limit) &&
        Objects.equals(this.pageResults, reportingV3PurchaseRefundDetailsGet200Response.pageResults) &&
        Objects.equals(this.requestDetails, reportingV3PurchaseRefundDetailsGet200Response.requestDetails) &&
        Objects.equals(this.settlements, reportingV3PurchaseRefundDetailsGet200Response.settlements) &&
        Objects.equals(this.authorizations, reportingV3PurchaseRefundDetailsGet200Response.authorizations) &&
        Objects.equals(this.feeAndFundingDetails, reportingV3PurchaseRefundDetailsGet200Response.feeAndFundingDetails) &&
        Objects.equals(this.others, reportingV3PurchaseRefundDetailsGet200Response.others) &&
        Objects.equals(this.settlementStatuses, reportingV3PurchaseRefundDetailsGet200Response.settlementStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, pageResults, requestDetails, settlements, authorizations, feeAndFundingDetails, others, settlementStatuses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3PurchaseRefundDetailsGet200Response {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    pageResults: ").append(toIndentedString(pageResults)).append("\n");
    sb.append("    requestDetails: ").append(toIndentedString(requestDetails)).append("\n");
    sb.append("    settlements: ").append(toIndentedString(settlements)).append("\n");
    sb.append("    authorizations: ").append(toIndentedString(authorizations)).append("\n");
    sb.append("    feeAndFundingDetails: ").append(toIndentedString(feeAndFundingDetails)).append("\n");
    sb.append("    others: ").append(toIndentedString(others)).append("\n");
    sb.append("    settlementStatuses: ").append(toIndentedString(settlementStatuses)).append("\n");
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

