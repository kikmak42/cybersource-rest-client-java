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
 * PtsV2PaymentsReversalsPost201ResponseProcessorInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-07T15:32:29.568+05:30")
public class PtsV2PaymentsReversalsPost201ResponseProcessorInformation {
  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("responseCode")
  private String responseCode = null;

  @SerializedName("responseCategoryCode")
  private String responseCategoryCode = null;

  @SerializedName("forwardedAcquirerCode")
  private String forwardedAcquirerCode = null;

  @SerializedName("masterCardServiceCode")
  private String masterCardServiceCode = null;

  @SerializedName("masterCardServiceReplyCode")
  private String masterCardServiceReplyCode = null;

  public PtsV2PaymentsReversalsPost201ResponseProcessorInformation transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Processor transaction ID.  This value identifies the transaction on a host system. This value is supported only for Moneris. It contains this information:   - Terminal used to process the transaction  - Shift during which the transaction took place  - Batch number  - Transaction number within the batch  You must store this value. If you give the customer a receipt, display this value on the receipt.  Example For the value 66012345001069003:   - Terminal ID &#x3D; 66012345  - Shift number &#x3D; 001  - Batch number &#x3D; 069  - Transaction number &#x3D; 003 
   * @return transactionId
  **/
  @ApiModelProperty(value = "Processor transaction ID.  This value identifies the transaction on a host system. This value is supported only for Moneris. It contains this information:   - Terminal used to process the transaction  - Shift during which the transaction took place  - Batch number  - Transaction number within the batch  You must store this value. If you give the customer a receipt, display this value on the receipt.  Example For the value 66012345001069003:   - Terminal ID = 66012345  - Shift number = 001  - Batch number = 069  - Transaction number = 003 ")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public PtsV2PaymentsReversalsPost201ResponseProcessorInformation responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  Important Do not use this field to evaluate the result of the authorization. 
   * @return responseCode
  **/
  @ApiModelProperty(value = "For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  Important Do not use this field to evaluate the result of the authorization. ")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public PtsV2PaymentsReversalsPost201ResponseProcessorInformation responseCategoryCode(String responseCategoryCode) {
    this.responseCategoryCode = responseCategoryCode;
    return this;
  }

   /**
   * Processor-defined response category code. The associated detail error code is in the auth_auth_response field or the auth_reversal_auth_ response field depending on which service you requested.  This field is supported only for:   - Japanese issuers  - Domestic transactions in Japan  - Comercio Latino—processor transaction ID required for troubleshooting  **Maximum length for processors**:   - Comercio Latino: 32  - All other processors: 3 
   * @return responseCategoryCode
  **/
  @ApiModelProperty(value = "Processor-defined response category code. The associated detail error code is in the auth_auth_response field or the auth_reversal_auth_ response field depending on which service you requested.  This field is supported only for:   - Japanese issuers  - Domestic transactions in Japan  - Comercio Latino—processor transaction ID required for troubleshooting  **Maximum length for processors**:   - Comercio Latino: 32  - All other processors: 3 ")
  public String getResponseCategoryCode() {
    return responseCategoryCode;
  }

  public void setResponseCategoryCode(String responseCategoryCode) {
    this.responseCategoryCode = responseCategoryCode;
  }

  public PtsV2PaymentsReversalsPost201ResponseProcessorInformation forwardedAcquirerCode(String forwardedAcquirerCode) {
    this.forwardedAcquirerCode = forwardedAcquirerCode;
    return this;
  }

   /**
   * Name of the Japanese acquirer that processed the transaction. Returned only for CCS (CAFIS) and JCN Gateway. Please contact the CyberSource Japan Support Group for more information. 
   * @return forwardedAcquirerCode
  **/
  @ApiModelProperty(value = "Name of the Japanese acquirer that processed the transaction. Returned only for CCS (CAFIS) and JCN Gateway. Please contact the CyberSource Japan Support Group for more information. ")
  public String getForwardedAcquirerCode() {
    return forwardedAcquirerCode;
  }

  public void setForwardedAcquirerCode(String forwardedAcquirerCode) {
    this.forwardedAcquirerCode = forwardedAcquirerCode;
  }

  public PtsV2PaymentsReversalsPost201ResponseProcessorInformation masterCardServiceCode(String masterCardServiceCode) {
    this.masterCardServiceCode = masterCardServiceCode;
    return this;
  }

   /**
   * Mastercard service that was used for the transaction. Mastercard provides this value to CyberSource.  Possible value:  - 53: Mastercard card-on-file token service 
   * @return masterCardServiceCode
  **/
  @ApiModelProperty(value = "Mastercard service that was used for the transaction. Mastercard provides this value to CyberSource.  Possible value:  - 53: Mastercard card-on-file token service ")
  public String getMasterCardServiceCode() {
    return masterCardServiceCode;
  }

  public void setMasterCardServiceCode(String masterCardServiceCode) {
    this.masterCardServiceCode = masterCardServiceCode;
  }

  public PtsV2PaymentsReversalsPost201ResponseProcessorInformation masterCardServiceReplyCode(String masterCardServiceReplyCode) {
    this.masterCardServiceReplyCode = masterCardServiceReplyCode;
    return this;
  }

   /**
   * Result of the Mastercard card-on-file token service. Mastercard provides this value to CyberSource.  Possible values:   - **C**: Service completed successfully.  - **F**: One of the following:    - Incorrect Mastercard POS entry mode. The Mastercard POS entry mode should be 81 for an authorization or      authorization reversal.    - Incorrect Mastercard POS entry mode. The Mastercard POS entry mode should be 01 for a tokenized request.    - Token requestor ID is missing or formatted incorrectly.  - **I**: One of the following:    - Invalid token requestor ID.    - Suspended or deactivated token.    - Invalid token (not in mapping table).  - **T**: Invalid combination of token requestor ID and token.  - **U**: Expired token.  - **W**: Primary account number (PAN) listed in electronic warning bulletin.  Note This field is returned only for **CyberSource through VisaNet**. 
   * @return masterCardServiceReplyCode
  **/
  @ApiModelProperty(value = "Result of the Mastercard card-on-file token service. Mastercard provides this value to CyberSource.  Possible values:   - **C**: Service completed successfully.  - **F**: One of the following:    - Incorrect Mastercard POS entry mode. The Mastercard POS entry mode should be 81 for an authorization or      authorization reversal.    - Incorrect Mastercard POS entry mode. The Mastercard POS entry mode should be 01 for a tokenized request.    - Token requestor ID is missing or formatted incorrectly.  - **I**: One of the following:    - Invalid token requestor ID.    - Suspended or deactivated token.    - Invalid token (not in mapping table).  - **T**: Invalid combination of token requestor ID and token.  - **U**: Expired token.  - **W**: Primary account number (PAN) listed in electronic warning bulletin.  Note This field is returned only for **CyberSource through VisaNet**. ")
  public String getMasterCardServiceReplyCode() {
    return masterCardServiceReplyCode;
  }

  public void setMasterCardServiceReplyCode(String masterCardServiceReplyCode) {
    this.masterCardServiceReplyCode = masterCardServiceReplyCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsReversalsPost201ResponseProcessorInformation ptsV2PaymentsReversalsPost201ResponseProcessorInformation = (PtsV2PaymentsReversalsPost201ResponseProcessorInformation) o;
    return Objects.equals(this.transactionId, ptsV2PaymentsReversalsPost201ResponseProcessorInformation.transactionId) &&
        Objects.equals(this.responseCode, ptsV2PaymentsReversalsPost201ResponseProcessorInformation.responseCode) &&
        Objects.equals(this.responseCategoryCode, ptsV2PaymentsReversalsPost201ResponseProcessorInformation.responseCategoryCode) &&
        Objects.equals(this.forwardedAcquirerCode, ptsV2PaymentsReversalsPost201ResponseProcessorInformation.forwardedAcquirerCode) &&
        Objects.equals(this.masterCardServiceCode, ptsV2PaymentsReversalsPost201ResponseProcessorInformation.masterCardServiceCode) &&
        Objects.equals(this.masterCardServiceReplyCode, ptsV2PaymentsReversalsPost201ResponseProcessorInformation.masterCardServiceReplyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, responseCode, responseCategoryCode, forwardedAcquirerCode, masterCardServiceCode, masterCardServiceReplyCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsReversalsPost201ResponseProcessorInformation {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseCategoryCode: ").append(toIndentedString(responseCategoryCode)).append("\n");
    sb.append("    forwardedAcquirerCode: ").append(toIndentedString(forwardedAcquirerCode)).append("\n");
    sb.append("    masterCardServiceCode: ").append(toIndentedString(masterCardServiceCode)).append("\n");
    sb.append("    masterCardServiceReplyCode: ").append(toIndentedString(masterCardServiceReplyCode)).append("\n");
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

