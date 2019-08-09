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
 * CardInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-09T15:30:56.583+05:30")
public class CardInfo {
  @SerializedName("cardNumber")
  private String cardNumber = null;

  @SerializedName("cardExpirationMonth")
  private String cardExpirationMonth = null;

  @SerializedName("cardExpirationYear")
  private String cardExpirationYear = null;

  @SerializedName("cardType")
  private String cardType = null;

  public CardInfo cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Encrypted or plain text card number. If the encryption type of “None” was used in the Generate Key request, this value can be set to the plaintext card number/Personal Account Number (PAN). If the encryption type of RsaOaep256 was used in the Generate Key request, this value needs to be the RSA OAEP 256 encrypted card number. The card number should be encrypted on the cardholders’ device. The [WebCrypto API] (https://github.com/CyberSource/cybersource-flex-samples/blob/master/java/spring-boot/src/main/resources/public/flex.js) can be used with the JWK obtained in the Generate Key request.
   * @return cardNumber
  **/
  @ApiModelProperty(required = true, value = "Encrypted or plain text card number. If the encryption type of “None” was used in the Generate Key request, this value can be set to the plaintext card number/Personal Account Number (PAN). If the encryption type of RsaOaep256 was used in the Generate Key request, this value needs to be the RSA OAEP 256 encrypted card number. The card number should be encrypted on the cardholders’ device. The [WebCrypto API] (https://github.com/CyberSource/cybersource-flex-samples/blob/master/java/spring-boot/src/main/resources/public/flex.js) can be used with the JWK obtained in the Generate Key request.")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public CardInfo cardExpirationMonth(String cardExpirationMonth) {
    this.cardExpirationMonth = cardExpirationMonth;
    return this;
  }

   /**
   * Two digit expiration month
   * @return cardExpirationMonth
  **/
  @ApiModelProperty(value = "Two digit expiration month")
  public String getCardExpirationMonth() {
    return cardExpirationMonth;
  }

  public void setCardExpirationMonth(String cardExpirationMonth) {
    this.cardExpirationMonth = cardExpirationMonth;
  }

  public CardInfo cardExpirationYear(String cardExpirationYear) {
    this.cardExpirationYear = cardExpirationYear;
    return this;
  }

   /**
   * Four digit expiration year
   * @return cardExpirationYear
  **/
  @ApiModelProperty(value = "Four digit expiration year")
  public String getCardExpirationYear() {
    return cardExpirationYear;
  }

  public void setCardExpirationYear(String cardExpirationYear) {
    this.cardExpirationYear = cardExpirationYear;
  }

  public CardInfo cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Card Type. This field is required. Refer to the CyberSource Credit Card Services documentation for supported card types.
   * @return cardType
  **/
  @ApiModelProperty(required = true, value = "Card Type. This field is required. Refer to the CyberSource Credit Card Services documentation for supported card types.")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardInfo cardInfo = (CardInfo) o;
    return Objects.equals(this.cardNumber, cardInfo.cardNumber) &&
        Objects.equals(this.cardExpirationMonth, cardInfo.cardExpirationMonth) &&
        Objects.equals(this.cardExpirationYear, cardInfo.cardExpirationYear) &&
        Objects.equals(this.cardType, cardInfo.cardType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, cardExpirationMonth, cardExpirationYear, cardType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardInfo {\n");
    
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardExpirationMonth: ").append(toIndentedString(cardExpirationMonth)).append("\n");
    sb.append("    cardExpirationYear: ").append(toIndentedString(cardExpirationYear)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
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

