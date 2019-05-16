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
 * Riskv1decisionsCardVerification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-09T16:47:53.059+05:30")
public class Riskv1decisionsCardVerification {
  @SerializedName("resultCode")
  private String resultCode = null;

  public Riskv1decisionsCardVerification resultCode(String resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * Result of card verification. Returned by the authorization service in the &#x60;processorInformation.cardVerification.resultCode&#x60; reply field. If ics_auth and ics_score are requested at the same time, the value is automatically passed from ics_auth to ics_score. For more information on using this field, see \&quot;\&quot;Sending the Results of Address and Card Verification Tests,\&quot;\&quot; page 16. The field contains one of the following values:   - &#x60;I&#x60;: Card verification number failed processor&#39;s data   validation check.   - &#x60;M&#x60;: Card verification number matched.   - &#x60;N&#x60;: Card verification number not matched.   - &#x60;P&#x60;: Card verification number not processed.   - &#x60;S&#x60;: Card verification number is on the card but was not included in the request.   - &#x60;U&#x60;: Card verification is not supported by the issuing bank.   - &#x60;X&#x60;: Card verification is not supported by the payment card company.   - Space Character: Deprecated. Ignore this value.   - &#x60;1&#x60;: CyberSource does not support card verification for this processor or card type.   - &#x60;2&#x60;: Processor returned value unrecognized for card verification response.   - &#x60;3&#x60;: Processor did not return card verification result code. 
   * @return resultCode
  **/
  @ApiModelProperty(value = "Result of card verification. Returned by the authorization service in the `processorInformation.cardVerification.resultCode` reply field. If ics_auth and ics_score are requested at the same time, the value is automatically passed from ics_auth to ics_score. For more information on using this field, see \"\"Sending the Results of Address and Card Verification Tests,\"\" page 16. The field contains one of the following values:   - `I`: Card verification number failed processor's data   validation check.   - `M`: Card verification number matched.   - `N`: Card verification number not matched.   - `P`: Card verification number not processed.   - `S`: Card verification number is on the card but was not included in the request.   - `U`: Card verification is not supported by the issuing bank.   - `X`: Card verification is not supported by the payment card company.   - Space Character: Deprecated. Ignore this value.   - `1`: CyberSource does not support card verification for this processor or card type.   - `2`: Processor returned value unrecognized for card verification response.   - `3`: Processor did not return card verification result code. ")
  public String getResultCode() {
    return resultCode;
  }

  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsCardVerification riskv1decisionsCardVerification = (Riskv1decisionsCardVerification) o;
    return Objects.equals(this.resultCode, riskv1decisionsCardVerification.resultCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsCardVerification {\n");
    
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
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

