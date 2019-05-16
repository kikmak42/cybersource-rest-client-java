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
 * Contains information about the buyer.
 */
@ApiModel(description = "Contains information about the buyer.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-09T16:47:53.059+05:30")
public class Riskv1decisionsBuyerInformation {
  @SerializedName("hashedPassword")
  private String hashedPassword = null;

  @SerializedName("dateOfBirth")
  private String dateOfBirth = null;

  @SerializedName("personalIdentification")
  private List<Ptsv2paymentsBuyerInformationPersonalIdentification> personalIdentification = null;

  public Riskv1decisionsBuyerInformation hashedPassword(String hashedPassword) {
    this.hashedPassword = hashedPassword;
    return this;
  }

   /**
   * The description for this field is not available. 
   * @return hashedPassword
  **/
  @ApiModelProperty(value = "The description for this field is not available. ")
  public String getHashedPassword() {
    return hashedPassword;
  }

  public void setHashedPassword(String hashedPassword) {
    this.hashedPassword = hashedPassword;
  }

  public Riskv1decisionsBuyerInformation dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Recipient’s date of birth. **Format**: &#x60;YYYYMMDD&#x60;.  This field is a pass-through, which means that CyberSource ensures that the value is eight numeric characters but otherwise does not verify the value or modify it in any way before sending it to the processor. If the field is not required for the transaction, CyberSource does not forward it to the processor.  For more details, see \&quot;Recipients,\&quot; page 224. 
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "Recipient’s date of birth. **Format**: `YYYYMMDD`.  This field is a pass-through, which means that CyberSource ensures that the value is eight numeric characters but otherwise does not verify the value or modify it in any way before sending it to the processor. If the field is not required for the transaction, CyberSource does not forward it to the processor.  For more details, see \"Recipients,\" page 224. ")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Riskv1decisionsBuyerInformation personalIdentification(List<Ptsv2paymentsBuyerInformationPersonalIdentification> personalIdentification) {
    this.personalIdentification = personalIdentification;
    return this;
  }

  public Riskv1decisionsBuyerInformation addPersonalIdentificationItem(Ptsv2paymentsBuyerInformationPersonalIdentification personalIdentificationItem) {
    if (this.personalIdentification == null) {
      this.personalIdentification = new ArrayList<Ptsv2paymentsBuyerInformationPersonalIdentification>();
    }
    this.personalIdentification.add(personalIdentificationItem);
    return this;
  }

   /**
   * Get personalIdentification
   * @return personalIdentification
  **/
  @ApiModelProperty(value = "")
  public List<Ptsv2paymentsBuyerInformationPersonalIdentification> getPersonalIdentification() {
    return personalIdentification;
  }

  public void setPersonalIdentification(List<Ptsv2paymentsBuyerInformationPersonalIdentification> personalIdentification) {
    this.personalIdentification = personalIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsBuyerInformation riskv1decisionsBuyerInformation = (Riskv1decisionsBuyerInformation) o;
    return Objects.equals(this.hashedPassword, riskv1decisionsBuyerInformation.hashedPassword) &&
        Objects.equals(this.dateOfBirth, riskv1decisionsBuyerInformation.dateOfBirth) &&
        Objects.equals(this.personalIdentification, riskv1decisionsBuyerInformation.personalIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashedPassword, dateOfBirth, personalIdentification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsBuyerInformation {\n");
    
    sb.append("    hashedPassword: ").append(toIndentedString(hashedPassword)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    personalIdentification: ").append(toIndentedString(personalIdentification)).append("\n");
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

