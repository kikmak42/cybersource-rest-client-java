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
 * Ptsv2paymentsMerchantInformationMerchantDescriptor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class Ptsv2paymentsMerchantInformationMerchantDescriptor {
  @SerializedName("name")
  private String name = null;

  @SerializedName("alternateName")
  private String alternateName = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  public Ptsv2paymentsMerchantInformationMerchantDescriptor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Merchant&#39;s name.  For more details about the merchant-related fields, see the &#x60;merchant_descriptor&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  **Note** For Paymentech processor using Cybersource Payouts, the maximum data length is 22. 
   * @return name
  **/
  @ApiModelProperty(value = "Merchant's name.  For more details about the merchant-related fields, see the `merchant_descriptor` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  **Note** For Paymentech processor using Cybersource Payouts, the maximum data length is 22. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor alternateName(String alternateName) {
    this.alternateName = alternateName;
    return this;
  }

   /**
   * An alternate name for the merchant.  For the descriptions, used-by information, data types, and lengths for these fields, see the &#x60;merchant_descriptor_alternate&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)--&gt; 
   * @return alternateName
  **/
  @ApiModelProperty(value = "An alternate name for the merchant.  For the descriptions, used-by information, data types, and lengths for these fields, see the `merchant_descriptor_alternate` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)--> ")
  public String getAlternateName() {
    return alternateName;
  }

  public void setAlternateName(String alternateName) {
    this.alternateName = alternateName;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * For the descriptions, used-by information, data types, and lengths for these fields, see &#x60;merchant_descriptor_contact&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)--&gt; Contact information for the merchant.  **Note** These are the maximum data lengths for the following payment processors: - FDCCompass (13) - Paymentech (13) 
   * @return contact
  **/
  @ApiModelProperty(value = "For the descriptions, used-by information, data types, and lengths for these fields, see `merchant_descriptor_contact` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)--> Contact information for the merchant.  **Note** These are the maximum data lengths for the following payment processors: - FDCCompass (13) - Paymentech (13) ")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of merchant&#39;s address. For the descriptions, used-by information, data types, and lengths for these fields, see &#x60;merchant_descriptor_street&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return address1
  **/
  @ApiModelProperty(value = "First line of merchant's address. For the descriptions, used-by information, data types, and lengths for these fields, see `merchant_descriptor_street` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Merchant&#39;s City.  For the descriptions, used-by information, data types, and lengths for these fields, see the &#x60;merchant_descriptor_city&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return locality
  **/
  @ApiModelProperty(value = "Merchant's City.  For the descriptions, used-by information, data types, and lengths for these fields, see the `merchant_descriptor_city` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Merchant&#39;s country.  For the descriptions, used-by information, data types, and lengths for these fields, see the &#x60;merchant_descriptor_country&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return country
  **/
  @ApiModelProperty(value = "Merchant's country.  For the descriptions, used-by information, data types, and lengths for these fields, see the `merchant_descriptor_country` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Merchant&#39;s postal code.  For the descriptions, used-by information, data types, and lengths for these fields, see the &#x60;merchant_descriptor_postal_code&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Merchant's postal code.  For the descriptions, used-by information, data types, and lengths for these fields, see the `merchant_descriptor_postal_code` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * The state where the merchant is located.  For the descriptions, used-by information, data types, and lengths for these fields, see the &#x60;merchant_descriptor_state&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  Merchant State. For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "The state where the merchant is located.  For the descriptions, used-by information, data types, and lengths for these fields, see the `merchant_descriptor_state` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  Merchant State. For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsMerchantInformationMerchantDescriptor ptsv2paymentsMerchantInformationMerchantDescriptor = (Ptsv2paymentsMerchantInformationMerchantDescriptor) o;
    return Objects.equals(this.name, ptsv2paymentsMerchantInformationMerchantDescriptor.name) &&
        Objects.equals(this.alternateName, ptsv2paymentsMerchantInformationMerchantDescriptor.alternateName) &&
        Objects.equals(this.contact, ptsv2paymentsMerchantInformationMerchantDescriptor.contact) &&
        Objects.equals(this.address1, ptsv2paymentsMerchantInformationMerchantDescriptor.address1) &&
        Objects.equals(this.locality, ptsv2paymentsMerchantInformationMerchantDescriptor.locality) &&
        Objects.equals(this.country, ptsv2paymentsMerchantInformationMerchantDescriptor.country) &&
        Objects.equals(this.postalCode, ptsv2paymentsMerchantInformationMerchantDescriptor.postalCode) &&
        Objects.equals(this.administrativeArea, ptsv2paymentsMerchantInformationMerchantDescriptor.administrativeArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, alternateName, contact, address1, locality, country, postalCode, administrativeArea);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsMerchantInformationMerchantDescriptor {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alternateName: ").append(toIndentedString(alternateName)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
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

