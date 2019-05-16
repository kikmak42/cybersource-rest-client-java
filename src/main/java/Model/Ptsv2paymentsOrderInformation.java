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
import Model.Ptsv2paymentsOrderInformationAmountDetails;
import Model.Ptsv2paymentsOrderInformationBillTo;
import Model.Ptsv2paymentsOrderInformationInvoiceDetails;
import Model.Ptsv2paymentsOrderInformationLineItems;
import Model.Ptsv2paymentsOrderInformationShipTo;
import Model.Ptsv2paymentsOrderInformationShippingDetails;
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
 * Ptsv2paymentsOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-09T16:47:53.059+05:30")
public class Ptsv2paymentsOrderInformation {
  @SerializedName("amountDetails")
  private Ptsv2paymentsOrderInformationAmountDetails amountDetails = null;

  @SerializedName("billTo")
  private Ptsv2paymentsOrderInformationBillTo billTo = null;

  @SerializedName("shipTo")
  private Ptsv2paymentsOrderInformationShipTo shipTo = null;

  @SerializedName("lineItems")
  private List<Ptsv2paymentsOrderInformationLineItems> lineItems = null;

  @SerializedName("invoiceDetails")
  private Ptsv2paymentsOrderInformationInvoiceDetails invoiceDetails = null;

  @SerializedName("shippingDetails")
  private Ptsv2paymentsOrderInformationShippingDetails shippingDetails = null;

  public Ptsv2paymentsOrderInformation amountDetails(Ptsv2paymentsOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(Ptsv2paymentsOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public Ptsv2paymentsOrderInformation billTo(Ptsv2paymentsOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(Ptsv2paymentsOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }

  public Ptsv2paymentsOrderInformation shipTo(Ptsv2paymentsOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsOrderInformationShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(Ptsv2paymentsOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public Ptsv2paymentsOrderInformation lineItems(List<Ptsv2paymentsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Ptsv2paymentsOrderInformation addLineItemsItem(Ptsv2paymentsOrderInformationLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<Ptsv2paymentsOrderInformationLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<Ptsv2paymentsOrderInformationLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<Ptsv2paymentsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
  }

  public Ptsv2paymentsOrderInformation invoiceDetails(Ptsv2paymentsOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
    return this;
  }

   /**
   * Get invoiceDetails
   * @return invoiceDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsOrderInformationInvoiceDetails getInvoiceDetails() {
    return invoiceDetails;
  }

  public void setInvoiceDetails(Ptsv2paymentsOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
  }

  public Ptsv2paymentsOrderInformation shippingDetails(Ptsv2paymentsOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
    return this;
  }

   /**
   * Get shippingDetails
   * @return shippingDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsOrderInformationShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  public void setShippingDetails(Ptsv2paymentsOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsOrderInformation ptsv2paymentsOrderInformation = (Ptsv2paymentsOrderInformation) o;
    return Objects.equals(this.amountDetails, ptsv2paymentsOrderInformation.amountDetails) &&
        Objects.equals(this.billTo, ptsv2paymentsOrderInformation.billTo) &&
        Objects.equals(this.shipTo, ptsv2paymentsOrderInformation.shipTo) &&
        Objects.equals(this.lineItems, ptsv2paymentsOrderInformation.lineItems) &&
        Objects.equals(this.invoiceDetails, ptsv2paymentsOrderInformation.invoiceDetails) &&
        Objects.equals(this.shippingDetails, ptsv2paymentsOrderInformation.shippingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails, billTo, shipTo, lineItems, invoiceDetails, shippingDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsOrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    invoiceDetails: ").append(toIndentedString(invoiceDetails)).append("\n");
    sb.append("    shippingDetails: ").append(toIndentedString(shippingDetails)).append("\n");
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

