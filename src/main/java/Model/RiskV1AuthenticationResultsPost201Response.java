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
import Model.PtsV2PaymentsReversalsPost201ResponseLinks;
import Model.Ptsv2payoutsClientReferenceInformation;
import Model.RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RiskV1AuthenticationResultsPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class RiskV1AuthenticationResultsPost201Response {
  @SerializedName("_links")
  private PtsV2PaymentsReversalsPost201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("submitTimeLocal")
  private String submitTimeLocal = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("clientReferenceInformation")
  private Ptsv2payoutsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("consumerAuthenticationInformation")
  private RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation consumerAuthenticationInformation = null;

  @SerializedName("errorInformation")
  private PtsV2PaymentsPost201ResponseErrorInformation errorInformation = null;

  public RiskV1AuthenticationResultsPost201Response links(PtsV2PaymentsReversalsPost201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsReversalsPost201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV2PaymentsReversalsPost201ResponseLinks links) {
    this.links = links;
  }

  public RiskV1AuthenticationResultsPost201Response id(String id) {
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

  public RiskV1AuthenticationResultsPost201Response submitTimeUtc(String submitTimeUtc) {
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

  public RiskV1AuthenticationResultsPost201Response submitTimeLocal(String submitTimeLocal) {
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

  public RiskV1AuthenticationResultsPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status for payerAuthentication 201 enroll and validate calls. Possible values are: - AUTHENTICATION_SUCCESSFUL - PENDING_AUTHENTICATION 
   * @return status
  **/
  @ApiModelProperty(value = "The status for payerAuthentication 201 enroll and validate calls. Possible values are: - AUTHENTICATION_SUCCESSFUL - PENDING_AUTHENTICATION ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public RiskV1AuthenticationResultsPost201Response reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason of the status. Possible values are: - Authentication_Completed_Or_Skipped_Sucessfully - Pending_Authentication 
   * @return reason
  **/
  @ApiModelProperty(value = "The reason of the status. Possible values are: - Authentication_Completed_Or_Skipped_Sucessfully - Pending_Authentication ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public RiskV1AuthenticationResultsPost201Response message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The message describing the reason of the status. Value is: - The cardholder is enrolled in Payer Authentication. Please authenticate the cardholder before continuing with the transaction. 
   * @return message
  **/
  @ApiModelProperty(value = "The message describing the reason of the status. Value is: - The cardholder is enrolled in Payer Authentication. Please authenticate the cardholder before continuing with the transaction. ")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RiskV1AuthenticationResultsPost201Response clientReferenceInformation(Ptsv2payoutsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2payoutsClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Ptsv2payoutsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public RiskV1AuthenticationResultsPost201Response consumerAuthenticationInformation(RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
    return this;
  }

   /**
   * Get consumerAuthenticationInformation
   * @return consumerAuthenticationInformation
  **/
  @ApiModelProperty(value = "")
  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation getConsumerAuthenticationInformation() {
    return consumerAuthenticationInformation;
  }

  public void setConsumerAuthenticationInformation(RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
  }

  public RiskV1AuthenticationResultsPost201Response errorInformation(PtsV2PaymentsPost201ResponseErrorInformation errorInformation) {
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
    RiskV1AuthenticationResultsPost201Response riskV1AuthenticationResultsPost201Response = (RiskV1AuthenticationResultsPost201Response) o;
    return Objects.equals(this.links, riskV1AuthenticationResultsPost201Response.links) &&
        Objects.equals(this.id, riskV1AuthenticationResultsPost201Response.id) &&
        Objects.equals(this.submitTimeUtc, riskV1AuthenticationResultsPost201Response.submitTimeUtc) &&
        Objects.equals(this.submitTimeLocal, riskV1AuthenticationResultsPost201Response.submitTimeLocal) &&
        Objects.equals(this.status, riskV1AuthenticationResultsPost201Response.status) &&
        Objects.equals(this.reason, riskV1AuthenticationResultsPost201Response.reason) &&
        Objects.equals(this.message, riskV1AuthenticationResultsPost201Response.message) &&
        Objects.equals(this.clientReferenceInformation, riskV1AuthenticationResultsPost201Response.clientReferenceInformation) &&
        Objects.equals(this.consumerAuthenticationInformation, riskV1AuthenticationResultsPost201Response.consumerAuthenticationInformation) &&
        Objects.equals(this.errorInformation, riskV1AuthenticationResultsPost201Response.errorInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, submitTimeLocal, status, reason, message, clientReferenceInformation, consumerAuthenticationInformation, errorInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1AuthenticationResultsPost201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    submitTimeLocal: ").append(toIndentedString(submitTimeLocal)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    consumerAuthenticationInformation: ").append(toIndentedString(consumerAuthenticationInformation)).append("\n");
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

