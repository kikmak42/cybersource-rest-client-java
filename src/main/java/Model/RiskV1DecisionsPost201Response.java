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
import Model.PtsV2PaymentsPost201ResponseErrorInformation;
import Model.PtsV2PaymentsPost201ResponseLinks;
import Model.RiskV1DecisionsPost201ResponsePaymentInformation;
import Model.RiskV1DecisionsPost201ResponseRiskInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RiskV1DecisionsPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class RiskV1DecisionsPost201Response {
  @SerializedName("_links")
  private PtsV2PaymentsPost201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("submitTimeLocal")
  private String submitTimeLocal = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("riskInformation")
  private RiskV1DecisionsPost201ResponseRiskInformation riskInformation = null;

  @SerializedName("paymentInformation")
  private RiskV1DecisionsPost201ResponsePaymentInformation paymentInformation = null;

  @SerializedName("errorInformation")
  private PtsV2PaymentsPost201ResponseErrorInformation errorInformation = null;

  public RiskV1DecisionsPost201Response links(PtsV2PaymentsPost201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV2PaymentsPost201ResponseLinks links) {
    this.links = links;
  }

  public RiskV1DecisionsPost201Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request. It is also appended to the endpoint of the resource.
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number assigned by CyberSource to identify the submitted request. It is also appended to the endpoint of the resource.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RiskV1DecisionsPost201Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; Example &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` Example `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public RiskV1DecisionsPost201Response submitTimeLocal(String submitTimeLocal) {
    this.submitTimeLocal = submitTimeLocal;
    return this;
  }

   /**
   * Time that the transaction was submitted in local time.
   * @return submitTimeLocal
  **/
  @ApiModelProperty(value = "Time that the transaction was submitted in local time.")
  public String getSubmitTimeLocal() {
    return submitTimeLocal;
  }

  public void setSubmitTimeLocal(String submitTimeLocal) {
    this.submitTimeLocal = submitTimeLocal;
  }

  public RiskV1DecisionsPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:   - &#x60;ACCEPTED&#x60;   - &#x60;REJECTED&#x60;   - &#x60;PENDING_REVIEW&#x60; 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:   - `ACCEPTED`   - `REJECTED`   - `PENDING_REVIEW` ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public RiskV1DecisionsPost201Response riskInformation(RiskV1DecisionsPost201ResponseRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
    return this;
  }

   /**
   * Get riskInformation
   * @return riskInformation
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseRiskInformation getRiskInformation() {
    return riskInformation;
  }

  public void setRiskInformation(RiskV1DecisionsPost201ResponseRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
  }

  public RiskV1DecisionsPost201Response paymentInformation(RiskV1DecisionsPost201ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponsePaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(RiskV1DecisionsPost201ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public RiskV1DecisionsPost201Response errorInformation(PtsV2PaymentsPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }

   /**
   * Get errorInformation
   * @return errorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseErrorInformation getErrorInformation() {
    return errorInformation;
  }

  public void setErrorInformation(PtsV2PaymentsPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1DecisionsPost201Response riskV1DecisionsPost201Response = (RiskV1DecisionsPost201Response) o;
    return Objects.equals(this.links, riskV1DecisionsPost201Response.links) &&
        Objects.equals(this.id, riskV1DecisionsPost201Response.id) &&
        Objects.equals(this.submitTimeUtc, riskV1DecisionsPost201Response.submitTimeUtc) &&
        Objects.equals(this.submitTimeLocal, riskV1DecisionsPost201Response.submitTimeLocal) &&
        Objects.equals(this.status, riskV1DecisionsPost201Response.status) &&
        Objects.equals(this.riskInformation, riskV1DecisionsPost201Response.riskInformation) &&
        Objects.equals(this.paymentInformation, riskV1DecisionsPost201Response.paymentInformation) &&
        Objects.equals(this.errorInformation, riskV1DecisionsPost201Response.errorInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, submitTimeLocal, status, riskInformation, paymentInformation, errorInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1DecisionsPost201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    submitTimeLocal: ").append(toIndentedString(submitTimeLocal)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    riskInformation: ").append(toIndentedString(riskInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
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

