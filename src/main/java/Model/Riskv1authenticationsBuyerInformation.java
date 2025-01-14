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
import Model.Ptsv2paymentsBuyerInformationPersonalIdentification;
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
 * Riskv1authenticationsBuyerInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class Riskv1authenticationsBuyerInformation {
  @SerializedName("personalIdentification")
  private List<Ptsv2paymentsBuyerInformationPersonalIdentification> personalIdentification = null;

  @SerializedName("mobilePhone")
  private Integer mobilePhone = null;

  public Riskv1authenticationsBuyerInformation personalIdentification(List<Ptsv2paymentsBuyerInformationPersonalIdentification> personalIdentification) {
    this.personalIdentification = personalIdentification;
    return this;
  }

  public Riskv1authenticationsBuyerInformation addPersonalIdentificationItem(Ptsv2paymentsBuyerInformationPersonalIdentification personalIdentificationItem) {
    if (this.personalIdentification == null) {
      this.personalIdentification = new ArrayList<Ptsv2paymentsBuyerInformationPersonalIdentification>();
    }
    this.personalIdentification.add(personalIdentificationItem);
    return this;
  }

   /**
   * This array contains detailed information about the buyer&#39;s form of persoanl identification.
   * @return personalIdentification
  **/
  @ApiModelProperty(value = "This array contains detailed information about the buyer's form of persoanl identification.")
  public List<Ptsv2paymentsBuyerInformationPersonalIdentification> getPersonalIdentification() {
    return personalIdentification;
  }

  public void setPersonalIdentification(List<Ptsv2paymentsBuyerInformationPersonalIdentification> personalIdentification) {
    this.personalIdentification = personalIdentification;
  }

  public Riskv1authenticationsBuyerInformation mobilePhone(Integer mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

   /**
   * Cardholder’s mobile phone number. **Important** Required for Visa Secure transactions in Brazil. Do not use this request field for any other types of transactions. 
   * @return mobilePhone
  **/
  @ApiModelProperty(value = "Cardholder’s mobile phone number. **Important** Required for Visa Secure transactions in Brazil. Do not use this request field for any other types of transactions. ")
  public Integer getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(Integer mobilePhone) {
    this.mobilePhone = mobilePhone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsBuyerInformation riskv1authenticationsBuyerInformation = (Riskv1authenticationsBuyerInformation) o;
    return Objects.equals(this.personalIdentification, riskv1authenticationsBuyerInformation.personalIdentification) &&
        Objects.equals(this.mobilePhone, riskv1authenticationsBuyerInformation.mobilePhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalIdentification, mobilePhone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsBuyerInformation {\n");
    
    sb.append("    personalIdentification: ").append(toIndentedString(personalIdentification)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
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

