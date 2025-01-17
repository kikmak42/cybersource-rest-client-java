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
import Model.ReportingV3ReportDefinitionsNameGet200ResponseAttributes;
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
 * ReportingV3ReportDefinitionsNameGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class ReportingV3ReportDefinitionsNameGet200Response {
  @SerializedName("type")
  private String type = null;

  @SerializedName("reportDefinitionId")
  private Integer reportDefinitionId = null;

  @SerializedName("reportDefintionName")
  private String reportDefintionName = null;

  @SerializedName("attributes")
  private List<ReportingV3ReportDefinitionsNameGet200ResponseAttributes> attributes = null;

  /**
   * Gets or Sets supportedFormats
   */
  @JsonAdapter(SupportedFormatsEnum.Adapter.class)
  public enum SupportedFormatsEnum {
    APPLICATION_XML("application/xml"),
    
    TEXT_CSV("text/csv");

    private String value;

    SupportedFormatsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SupportedFormatsEnum fromValue(String text) {
      for (SupportedFormatsEnum b : SupportedFormatsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SupportedFormatsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SupportedFormatsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SupportedFormatsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SupportedFormatsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("supportedFormats")
  private List<SupportedFormatsEnum> supportedFormats = null;

  @SerializedName("description")
  private String description = null;

  public ReportingV3ReportDefinitionsNameGet200Response type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ReportingV3ReportDefinitionsNameGet200Response reportDefinitionId(Integer reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
    return this;
  }

   /**
   * Get reportDefinitionId
   * @return reportDefinitionId
  **/
  @ApiModelProperty(value = "")
  public Integer getReportDefinitionId() {
    return reportDefinitionId;
  }

  public void setReportDefinitionId(Integer reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
  }

  public ReportingV3ReportDefinitionsNameGet200Response reportDefintionName(String reportDefintionName) {
    this.reportDefintionName = reportDefintionName;
    return this;
  }

   /**
   * Get reportDefintionName
   * @return reportDefintionName
  **/
  @ApiModelProperty(value = "")
  public String getReportDefintionName() {
    return reportDefintionName;
  }

  public void setReportDefintionName(String reportDefintionName) {
    this.reportDefintionName = reportDefintionName;
  }

  public ReportingV3ReportDefinitionsNameGet200Response attributes(List<ReportingV3ReportDefinitionsNameGet200ResponseAttributes> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ReportingV3ReportDefinitionsNameGet200Response addAttributesItem(ReportingV3ReportDefinitionsNameGet200ResponseAttributes attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<ReportingV3ReportDefinitionsNameGet200ResponseAttributes>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public List<ReportingV3ReportDefinitionsNameGet200ResponseAttributes> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<ReportingV3ReportDefinitionsNameGet200ResponseAttributes> attributes) {
    this.attributes = attributes;
  }

  public ReportingV3ReportDefinitionsNameGet200Response supportedFormats(List<SupportedFormatsEnum> supportedFormats) {
    this.supportedFormats = supportedFormats;
    return this;
  }

  public ReportingV3ReportDefinitionsNameGet200Response addSupportedFormatsItem(SupportedFormatsEnum supportedFormatsItem) {
    if (this.supportedFormats == null) {
      this.supportedFormats = new ArrayList<SupportedFormatsEnum>();
    }
    this.supportedFormats.add(supportedFormatsItem);
    return this;
  }

   /**
   * Get supportedFormats
   * @return supportedFormats
  **/
  @ApiModelProperty(value = "")
  public List<SupportedFormatsEnum> getSupportedFormats() {
    return supportedFormats;
  }

  public void setSupportedFormats(List<SupportedFormatsEnum> supportedFormats) {
    this.supportedFormats = supportedFormats;
  }

  public ReportingV3ReportDefinitionsNameGet200Response description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ReportDefinitionsNameGet200Response reportingV3ReportDefinitionsNameGet200Response = (ReportingV3ReportDefinitionsNameGet200Response) o;
    return Objects.equals(this.type, reportingV3ReportDefinitionsNameGet200Response.type) &&
        Objects.equals(this.reportDefinitionId, reportingV3ReportDefinitionsNameGet200Response.reportDefinitionId) &&
        Objects.equals(this.reportDefintionName, reportingV3ReportDefinitionsNameGet200Response.reportDefintionName) &&
        Objects.equals(this.attributes, reportingV3ReportDefinitionsNameGet200Response.attributes) &&
        Objects.equals(this.supportedFormats, reportingV3ReportDefinitionsNameGet200Response.supportedFormats) &&
        Objects.equals(this.description, reportingV3ReportDefinitionsNameGet200Response.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, reportDefinitionId, reportDefintionName, attributes, supportedFormats, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ReportDefinitionsNameGet200Response {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reportDefinitionId: ").append(toIndentedString(reportDefinitionId)).append("\n");
    sb.append("    reportDefintionName: ").append(toIndentedString(reportDefintionName)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    supportedFormats: ").append(toIndentedString(supportedFormats)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

