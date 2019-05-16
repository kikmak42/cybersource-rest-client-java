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
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformationPersonalIdentification;
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
 * TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-09T16:47:53.059+05:30")
public class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation {
  @SerializedName("companyTaxID")
  private String companyTaxID = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("dateOBirth")
  private String dateOBirth = null;

  @SerializedName("personalIdentification")
  private List<TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformationPersonalIdentification> personalIdentification = null;

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation companyTaxID(String companyTaxID) {
    this.companyTaxID = companyTaxID;
    return this;
  }

   /**
   * Tax identifier for the customer’s company.  **Important**: Contact your TeleCheck representative to find out whether this field is required or optional. 
   * @return companyTaxID
  **/
  @ApiModelProperty(example = "1234567890123456800", value = "Tax identifier for the customer’s company.  **Important**: Contact your TeleCheck representative to find out whether this field is required or optional. ")
  public String getCompanyTaxID() {
    return companyTaxID;
  }

  public void setCompanyTaxID(String companyTaxID) {
    this.companyTaxID = companyTaxID;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used by the customer. Accepts input in the ISO 4217 standard, stores as ISO 4217 Alpha.
   * @return currency
  **/
  @ApiModelProperty(example = "USD", value = "Currency used by the customer. Accepts input in the ISO 4217 standard, stores as ISO 4217 Alpha.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation dateOBirth(String dateOBirth) {
    this.dateOBirth = dateOBirth;
    return this;
  }

   /**
   * Date of birth of the customer.  Format: &#x60;YYYY-MM-DD&#x60; or &#x60;YYYYMMDD&#x60; 
   * @return dateOBirth
  **/
  @ApiModelProperty(example = "1960-12-30", value = "Date of birth of the customer.  Format: `YYYY-MM-DD` or `YYYYMMDD` ")
  public String getDateOBirth() {
    return dateOBirth;
  }

  public void setDateOBirth(String dateOBirth) {
    this.dateOBirth = dateOBirth;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation personalIdentification(List<TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformationPersonalIdentification> personalIdentification) {
    this.personalIdentification = personalIdentification;
    return this;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation addPersonalIdentificationItem(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformationPersonalIdentification personalIdentificationItem) {
    if (this.personalIdentification == null) {
      this.personalIdentification = new ArrayList<TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformationPersonalIdentification>();
    }
    this.personalIdentification.add(personalIdentificationItem);
    return this;
  }

   /**
   * Get personalIdentification
   * @return personalIdentification
  **/
  @ApiModelProperty(value = "")
  public List<TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformationPersonalIdentification> getPersonalIdentification() {
    return personalIdentification;
  }

  public void setPersonalIdentification(List<TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformationPersonalIdentification> personalIdentification) {
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
    TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation = (TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation) o;
    return Objects.equals(this.companyTaxID, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation.companyTaxID) &&
        Objects.equals(this.currency, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation.currency) &&
        Objects.equals(this.dateOBirth, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation.dateOBirth) &&
        Objects.equals(this.personalIdentification, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation.personalIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyTaxID, currency, dateOBirth, personalIdentification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformation {\n");
    
    sb.append("    companyTaxID: ").append(toIndentedString(companyTaxID)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateOBirth: ").append(toIndentedString(dateOBirth)).append("\n");
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

