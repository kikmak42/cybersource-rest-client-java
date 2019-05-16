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
 * Ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-09T16:47:53.059+05:30")
public class Ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts {
  @SerializedName("code")
  private String code = null;

  @SerializedName("amount")
  private String amount = null;

  public Ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Additional amount type. This field is supported only for **American Express Direct**.  For processor-specific information, see the additional_amount_type field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return code
  **/
  @ApiModelProperty(value = "Additional amount type. This field is supported only for **American Express Direct**.  For processor-specific information, see the additional_amount_type field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Additional amount. This field is supported only for **American Express Direct**.  For processor-specific information, see the additional_amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return amount
  **/
  @ApiModelProperty(value = "Additional amount. This field is supported only for **American Express Direct**.  For processor-specific information, see the additional_amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts = (Ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts) o;
    return Objects.equals(this.code, ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts.code) &&
        Objects.equals(this.amount, ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

