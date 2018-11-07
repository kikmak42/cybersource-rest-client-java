/*
 * CyberSource Flex API
 * Simple PAN tokenization service
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
import Model.InlineResponse20012ApplicationInformationApplications;
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
 * InlineResponse20012ApplicationInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T18:13:53.731+05:30")
public class InlineResponse20012ApplicationInformation {
  @SerializedName("status")
  private String status = null;

  @SerializedName("reasonCode")
  private String reasonCode = null;

  @SerializedName("rCode")
  private String rCode = null;

  @SerializedName("rFlag")
  private String rFlag = null;

  @SerializedName("applications")
  private List<InlineResponse20012ApplicationInformationApplications> applications = null;

  public InlineResponse20012ApplicationInformation status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse20012ApplicationInformation reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return reasonCode
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public InlineResponse20012ApplicationInformation rCode(String rCode) {
    this.rCode = rCode;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return rCode
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getRCode() {
    return rCode;
  }

  public void setRCode(String rCode) {
    this.rCode = rCode;
  }

  public InlineResponse20012ApplicationInformation rFlag(String rFlag) {
    this.rFlag = rFlag;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return rFlag
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getRFlag() {
    return rFlag;
  }

  public void setRFlag(String rFlag) {
    this.rFlag = rFlag;
  }

  public InlineResponse20012ApplicationInformation applications(List<InlineResponse20012ApplicationInformationApplications> applications) {
    this.applications = applications;
    return this;
  }

  public InlineResponse20012ApplicationInformation addApplicationsItem(InlineResponse20012ApplicationInformationApplications applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<InlineResponse20012ApplicationInformationApplications>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

   /**
   * Get applications
   * @return applications
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20012ApplicationInformationApplications> getApplications() {
    return applications;
  }

  public void setApplications(List<InlineResponse20012ApplicationInformationApplications> applications) {
    this.applications = applications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012ApplicationInformation inlineResponse20012ApplicationInformation = (InlineResponse20012ApplicationInformation) o;
    return Objects.equals(this.status, inlineResponse20012ApplicationInformation.status) &&
        Objects.equals(this.reasonCode, inlineResponse20012ApplicationInformation.reasonCode) &&
        Objects.equals(this.rCode, inlineResponse20012ApplicationInformation.rCode) &&
        Objects.equals(this.rFlag, inlineResponse20012ApplicationInformation.rFlag) &&
        Objects.equals(this.applications, inlineResponse20012ApplicationInformation.applications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, reasonCode, rCode, rFlag, applications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012ApplicationInformation {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    rCode: ").append(toIndentedString(rCode)).append("\n");
    sb.append("    rFlag: ").append(toIndentedString(rFlag)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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
