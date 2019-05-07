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
import Model.Ptsv2paymentsIssuerInformation;
import Model.Ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions;
import Model.Ptsv2paymentsidcapturesProcessingInformationCaptureOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsidcapturesProcessingInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-07T15:32:29.568+05:30")
public class Ptsv2paymentsidcapturesProcessingInformation {
  @SerializedName("paymentSolution")
  private String paymentSolution = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("linkId")
  private String linkId = null;

  @SerializedName("reportGroup")
  private String reportGroup = null;

  @SerializedName("visaCheckoutId")
  private String visaCheckoutId = null;

  @SerializedName("purchaseLevel")
  private String purchaseLevel = null;

  @SerializedName("issuer")
  private Ptsv2paymentsIssuerInformation issuer = null;

  @SerializedName("authorizationOptions")
  private Ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions authorizationOptions = null;

  @SerializedName("captureOptions")
  private Ptsv2paymentsidcapturesProcessingInformationCaptureOptions captureOptions = null;

  public Ptsv2paymentsidcapturesProcessingInformation paymentSolution(String paymentSolution) {
    this.paymentSolution = paymentSolution;
    return this;
  }

   /**
   * Type of digital payment solution for the transaction. Possible Values:   - **visacheckout**: Visa Checkout. This value is required for Visa Checkout transactions. See Visa Checkout Using the SCMP API.  - **005**: Masterpass. This value is required for Masterpass transactions on OmniPay Direct. See \&quot;Masterpass,\&quot; page 153. 
   * @return paymentSolution
  **/
  @ApiModelProperty(value = "Type of digital payment solution for the transaction. Possible Values:   - **visacheckout**: Visa Checkout. This value is required for Visa Checkout transactions. See Visa Checkout Using the SCMP API.  - **005**: Masterpass. This value is required for Masterpass transactions on OmniPay Direct. See \"Masterpass,\" page 153. ")
  public String getPaymentSolution() {
    return paymentSolution;
  }

  public void setPaymentSolution(String paymentSolution) {
    this.paymentSolution = paymentSolution;
  }

  public Ptsv2paymentsidcapturesProcessingInformation reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * Please check with Cybersource customer support to see if your merchant account is configured correctly so you can include this field in your request. * For Payouts: max length for FDCCompass is String (22). 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "Please check with Cybersource customer support to see if your merchant account is configured correctly so you can include this field in your request. * For Payouts: max length for FDCCompass is String (22). ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public Ptsv2paymentsidcapturesProcessingInformation linkId(String linkId) {
    this.linkId = linkId;
    return this;
  }

   /**
   * Value that links the current authorization request to the original authorization request. Set this value to the ID that was returned in the reply message from the original authorization request.  This value is used for:   - Partial authorizations: See \&quot;Partial Authorizations,\&quot; page 88.  - Split shipments: See \&quot;Split Shipments,\&quot; page 210. 
   * @return linkId
  **/
  @ApiModelProperty(value = "Value that links the current authorization request to the original authorization request. Set this value to the ID that was returned in the reply message from the original authorization request.  This value is used for:   - Partial authorizations: See \"Partial Authorizations,\" page 88.  - Split shipments: See \"Split Shipments,\" page 210. ")
  public String getLinkId() {
    return linkId;
  }

  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }

  public Ptsv2paymentsidcapturesProcessingInformation reportGroup(String reportGroup) {
    this.reportGroup = reportGroup;
    return this;
  }

   /**
   * Attribute that lets you define custom grouping for your processor reports. This field is supported only for **Worldpay VAP**.  See \&quot;Report Groups,\&quot; page 234. 
   * @return reportGroup
  **/
  @ApiModelProperty(value = "Attribute that lets you define custom grouping for your processor reports. This field is supported only for **Worldpay VAP**.  See \"Report Groups,\" page 234. ")
  public String getReportGroup() {
    return reportGroup;
  }

  public void setReportGroup(String reportGroup) {
    this.reportGroup = reportGroup;
  }

  public Ptsv2paymentsidcapturesProcessingInformation visaCheckoutId(String visaCheckoutId) {
    this.visaCheckoutId = visaCheckoutId;
    return this;
  }

   /**
   * Identifier for the **Visa Checkout** order. Visa Checkout provides a unique order ID for every transaction in the Visa Checkout **callID** field.  For more details, see Visa Checkout Using the SCMP API. 
   * @return visaCheckoutId
  **/
  @ApiModelProperty(value = "Identifier for the **Visa Checkout** order. Visa Checkout provides a unique order ID for every transaction in the Visa Checkout **callID** field.  For more details, see Visa Checkout Using the SCMP API. ")
  public String getVisaCheckoutId() {
    return visaCheckoutId;
  }

  public void setVisaCheckoutId(String visaCheckoutId) {
    this.visaCheckoutId = visaCheckoutId;
  }

  public Ptsv2paymentsidcapturesProcessingInformation purchaseLevel(String purchaseLevel) {
    this.purchaseLevel = purchaseLevel;
    return this;
  }

   /**
   * Set this field to 3 to indicate that the request includes Level III data.
   * @return purchaseLevel
  **/
  @ApiModelProperty(value = "Set this field to 3 to indicate that the request includes Level III data.")
  public String getPurchaseLevel() {
    return purchaseLevel;
  }

  public void setPurchaseLevel(String purchaseLevel) {
    this.purchaseLevel = purchaseLevel;
  }

  public Ptsv2paymentsidcapturesProcessingInformation issuer(Ptsv2paymentsIssuerInformation issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsIssuerInformation getIssuer() {
    return issuer;
  }

  public void setIssuer(Ptsv2paymentsIssuerInformation issuer) {
    this.issuer = issuer;
  }

  public Ptsv2paymentsidcapturesProcessingInformation authorizationOptions(Ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions authorizationOptions) {
    this.authorizationOptions = authorizationOptions;
    return this;
  }

   /**
   * Get authorizationOptions
   * @return authorizationOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions getAuthorizationOptions() {
    return authorizationOptions;
  }

  public void setAuthorizationOptions(Ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions authorizationOptions) {
    this.authorizationOptions = authorizationOptions;
  }

  public Ptsv2paymentsidcapturesProcessingInformation captureOptions(Ptsv2paymentsidcapturesProcessingInformationCaptureOptions captureOptions) {
    this.captureOptions = captureOptions;
    return this;
  }

   /**
   * Get captureOptions
   * @return captureOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidcapturesProcessingInformationCaptureOptions getCaptureOptions() {
    return captureOptions;
  }

  public void setCaptureOptions(Ptsv2paymentsidcapturesProcessingInformationCaptureOptions captureOptions) {
    this.captureOptions = captureOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidcapturesProcessingInformation ptsv2paymentsidcapturesProcessingInformation = (Ptsv2paymentsidcapturesProcessingInformation) o;
    return Objects.equals(this.paymentSolution, ptsv2paymentsidcapturesProcessingInformation.paymentSolution) &&
        Objects.equals(this.reconciliationId, ptsv2paymentsidcapturesProcessingInformation.reconciliationId) &&
        Objects.equals(this.linkId, ptsv2paymentsidcapturesProcessingInformation.linkId) &&
        Objects.equals(this.reportGroup, ptsv2paymentsidcapturesProcessingInformation.reportGroup) &&
        Objects.equals(this.visaCheckoutId, ptsv2paymentsidcapturesProcessingInformation.visaCheckoutId) &&
        Objects.equals(this.purchaseLevel, ptsv2paymentsidcapturesProcessingInformation.purchaseLevel) &&
        Objects.equals(this.issuer, ptsv2paymentsidcapturesProcessingInformation.issuer) &&
        Objects.equals(this.authorizationOptions, ptsv2paymentsidcapturesProcessingInformation.authorizationOptions) &&
        Objects.equals(this.captureOptions, ptsv2paymentsidcapturesProcessingInformation.captureOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentSolution, reconciliationId, linkId, reportGroup, visaCheckoutId, purchaseLevel, issuer, authorizationOptions, captureOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidcapturesProcessingInformation {\n");
    
    sb.append("    paymentSolution: ").append(toIndentedString(paymentSolution)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    reportGroup: ").append(toIndentedString(reportGroup)).append("\n");
    sb.append("    visaCheckoutId: ").append(toIndentedString(visaCheckoutId)).append("\n");
    sb.append("    purchaseLevel: ").append(toIndentedString(purchaseLevel)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    authorizationOptions: ").append(toIndentedString(authorizationOptions)).append("\n");
    sb.append("    captureOptions: ").append(toIndentedString(captureOptions)).append("\n");
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

