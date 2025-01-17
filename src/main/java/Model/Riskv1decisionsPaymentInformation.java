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
import Model.Riskv1decisionsPaymentInformationCard;
import Model.Riskv1decisionsPaymentInformationTokenizedCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains the payment data for this transaction.
 */
@ApiModel(description = "Contains the payment data for this transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class Riskv1decisionsPaymentInformation {
  @SerializedName("card")
  private Riskv1decisionsPaymentInformationCard card = null;

  @SerializedName("tokenizedCard")
  private Riskv1decisionsPaymentInformationTokenizedCard tokenizedCard = null;

  public Riskv1decisionsPaymentInformation card(Riskv1decisionsPaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsPaymentInformationCard getCard() {
    return card;
  }

  public void setCard(Riskv1decisionsPaymentInformationCard card) {
    this.card = card;
  }

  public Riskv1decisionsPaymentInformation tokenizedCard(Riskv1decisionsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsPaymentInformationTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(Riskv1decisionsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsPaymentInformation riskv1decisionsPaymentInformation = (Riskv1decisionsPaymentInformation) o;
    return Objects.equals(this.card, riskv1decisionsPaymentInformation.card) &&
        Objects.equals(this.tokenizedCard, riskv1decisionsPaymentInformation.tokenizedCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, tokenizedCard);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsPaymentInformation {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
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

