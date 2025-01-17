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
 * Riskv1authenticationsOrderInformationShipTo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class Riskv1authenticationsOrderInformationShipTo {
  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("destinationCode")
  private Integer destinationCode = null;

  @SerializedName("method")
  private String method = null;

  public Riskv1authenticationsOrderInformationShipTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of the shipping address.
   * @return address1
  **/
  @ApiModelProperty(value = "First line of the shipping address.")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Riskv1authenticationsOrderInformationShipTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Second line of the shipping address.
   * @return address2
  **/
  @ApiModelProperty(value = "Second line of the shipping address.")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Riskv1authenticationsOrderInformationShipTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province of the shipping address. Use the State, Province, and Territory Codes for the United States and Canada. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "State or province of the shipping address. Use the State, Province, and Territory Codes for the United States and Canada. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Riskv1authenticationsOrderInformationShipTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of the shipping address. Use the two-character ISO Standard Country Codes.
   * @return country
  **/
  @ApiModelProperty(value = "Country of the shipping address. Use the two-character ISO Standard Country Codes.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Riskv1authenticationsOrderInformationShipTo locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City of the shipping address.
   * @return locality
  **/
  @ApiModelProperty(value = "City of the shipping address.")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Riskv1authenticationsOrderInformationShipTo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the recipient.  **Processor specific maximum length**  - Litle: 25 - All other processors: 60 
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of the recipient.  **Processor specific maximum length**  - Litle: 25 - All other processors: 60 ")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Riskv1authenticationsOrderInformationShipTo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the recipient.  **Processor-specific maximum length**  - Litle: 25 - All other processors: 60 
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of the recipient.  **Processor-specific maximum length**  - Litle: 25 - All other processors: 60 ")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Riskv1authenticationsOrderInformationShipTo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number associated with the shipping address.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Phone number associated with the shipping address.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Riskv1authenticationsOrderInformationShipTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code for the shipping address. The postal code must consist of 5 to 9 digits.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  Example A1B 2C3  **American Express Direct**\\ Before sending the postal code to the processor, CyberSource removes all nonalphanumeric characters and, if the remaining value is longer than nine characters, truncates the value starting from the right side. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code for the shipping address. The postal code must consist of 5 to 9 digits.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  Example A1B 2C3  **American Express Direct**\\ Before sending the postal code to the processor, CyberSource removes all nonalphanumeric characters and, if the remaining value is longer than nine characters, truncates the value starting from the right side. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Riskv1authenticationsOrderInformationShipTo destinationCode(Integer destinationCode) {
    this.destinationCode = destinationCode;
    return this;
  }

   /**
   * Indicates destination chosen for the transaction. Possible values: - 01- Ship to cardholder billing address - 02- Ship to another verified address on file with merchant - 03- Ship to address that is different than billing address - 04- Ship to store (store address should be populated on request) - 05- Digital goods - 06- Travel and event tickets, not shipped - 07- Other 
   * @return destinationCode
  **/
  @ApiModelProperty(value = "Indicates destination chosen for the transaction. Possible values: - 01- Ship to cardholder billing address - 02- Ship to another verified address on file with merchant - 03- Ship to address that is different than billing address - 04- Ship to store (store address should be populated on request) - 05- Digital goods - 06- Travel and event tickets, not shipped - 07- Other ")
  public Integer getDestinationCode() {
    return destinationCode;
  }

  public void setDestinationCode(Integer destinationCode) {
    this.destinationCode = destinationCode;
  }

  public Riskv1authenticationsOrderInformationShipTo method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Shipping method for the product. Possible values: - lowcost: Lowest-cost service - sameday: Courier or same-day service - oneday: Next-day or overnight service - twoday: Two-day service - threeday: Three-day service - pickup: Store pick-up - other: Other shipping method - none: No shipping method because product is a service or subscription Required for American Express SafeKey (U.S.). 
   * @return method
  **/
  @ApiModelProperty(value = "Shipping method for the product. Possible values: - lowcost: Lowest-cost service - sameday: Courier or same-day service - oneday: Next-day or overnight service - twoday: Two-day service - threeday: Three-day service - pickup: Store pick-up - other: Other shipping method - none: No shipping method because product is a service or subscription Required for American Express SafeKey (U.S.). ")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsOrderInformationShipTo riskv1authenticationsOrderInformationShipTo = (Riskv1authenticationsOrderInformationShipTo) o;
    return Objects.equals(this.address1, riskv1authenticationsOrderInformationShipTo.address1) &&
        Objects.equals(this.address2, riskv1authenticationsOrderInformationShipTo.address2) &&
        Objects.equals(this.administrativeArea, riskv1authenticationsOrderInformationShipTo.administrativeArea) &&
        Objects.equals(this.country, riskv1authenticationsOrderInformationShipTo.country) &&
        Objects.equals(this.locality, riskv1authenticationsOrderInformationShipTo.locality) &&
        Objects.equals(this.firstName, riskv1authenticationsOrderInformationShipTo.firstName) &&
        Objects.equals(this.lastName, riskv1authenticationsOrderInformationShipTo.lastName) &&
        Objects.equals(this.phoneNumber, riskv1authenticationsOrderInformationShipTo.phoneNumber) &&
        Objects.equals(this.postalCode, riskv1authenticationsOrderInformationShipTo.postalCode) &&
        Objects.equals(this.destinationCode, riskv1authenticationsOrderInformationShipTo.destinationCode) &&
        Objects.equals(this.method, riskv1authenticationsOrderInformationShipTo.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, administrativeArea, country, locality, firstName, lastName, phoneNumber, postalCode, destinationCode, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsOrderInformationShipTo {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    destinationCode: ").append(toIndentedString(destinationCode)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

