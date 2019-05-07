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
 * TssV2TransactionsGet200ResponseProcessingInformationBankTransferOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-07T15:32:29.568+05:30")
public class TssV2TransactionsGet200ResponseProcessingInformationBankTransferOptions {
  @SerializedName("secCode")
  private String secCode = null;

  public TssV2TransactionsGet200ResponseProcessingInformationBankTransferOptions secCode(String secCode) {
    this.secCode = secCode;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return secCode
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getSecCode() {
    return secCode;
  }

  public void setSecCode(String secCode) {
    this.secCode = secCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseProcessingInformationBankTransferOptions tssV2TransactionsGet200ResponseProcessingInformationBankTransferOptions = (TssV2TransactionsGet200ResponseProcessingInformationBankTransferOptions) o;
    return Objects.equals(this.secCode, tssV2TransactionsGet200ResponseProcessingInformationBankTransferOptions.secCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseProcessingInformationBankTransferOptions {\n");
    
    sb.append("    secCode: ").append(toIndentedString(secCode)).append("\n");
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

