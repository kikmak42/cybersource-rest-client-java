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
import Model.Reportingv3reportsReportPreferences;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RequestBody1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class RequestBody1 {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("reportDefinitionName")
  private String reportDefinitionName = null;

  @SerializedName("reportFields")
  private List<String> reportFields = new ArrayList<String>();

  /**
   * Gets or Sets reportMimeType
   */
  @JsonAdapter(ReportMimeTypeEnum.Adapter.class)
  public enum ReportMimeTypeEnum {
    APPLICATION_XML("application/xml"),
    
    TEXT_CSV("text/csv");

    private String value;

    ReportMimeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReportMimeTypeEnum fromValue(String text) {
      for (ReportMimeTypeEnum b : ReportMimeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReportMimeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReportMimeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReportMimeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReportMimeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reportMimeType")
  private ReportMimeTypeEnum reportMimeType = null;

  /**
   * The frequency for which subscription is created.
   */
  @JsonAdapter(ReportFrequencyEnum.Adapter.class)
  public enum ReportFrequencyEnum {
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    MONTHLY("MONTHLY"),
    
    ADHOC("ADHOC");

    private String value;

    ReportFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReportFrequencyEnum fromValue(String text) {
      for (ReportFrequencyEnum b : ReportFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReportFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReportFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReportFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReportFrequencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reportFrequency")
  private ReportFrequencyEnum reportFrequency = null;

  @SerializedName("reportName")
  private String reportName = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("startDay")
  private Integer startDay = null;

  @SerializedName("reportFilters")
  private Map<String, List<String>> reportFilters = null;

  @SerializedName("reportPreferences")
  private Reportingv3reportsReportPreferences reportPreferences = null;

  @SerializedName("groupName")
  private String groupName = null;

  public RequestBody1 organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Valid CyberSource organizationId
   * @return organizationId
  **/
  @ApiModelProperty(example = "Merchant 1", value = "Valid CyberSource organizationId")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public RequestBody1 reportDefinitionName(String reportDefinitionName) {
    this.reportDefinitionName = reportDefinitionName;
    return this;
  }

   /**
   * Valid Report Definition Name
   * @return reportDefinitionName
  **/
  @ApiModelProperty(example = "TransactionDetailReportClass", required = true, value = "Valid Report Definition Name")
  public String getReportDefinitionName() {
    return reportDefinitionName;
  }

  public void setReportDefinitionName(String reportDefinitionName) {
    this.reportDefinitionName = reportDefinitionName;
  }

  public RequestBody1 reportFields(List<String> reportFields) {
    this.reportFields = reportFields;
    return this;
  }

  public RequestBody1 addReportFieldsItem(String reportFieldsItem) {
    this.reportFields.add(reportFieldsItem);
    return this;
  }

   /**
   * Get reportFields
   * @return reportFields
  **/
  @ApiModelProperty(example = "[\"Request.RequestID\",\"Request.TransactionDate\",\"Request.MerchantID\"]", required = true, value = "")
  public List<String> getReportFields() {
    return reportFields;
  }

  public void setReportFields(List<String> reportFields) {
    this.reportFields = reportFields;
  }

  public RequestBody1 reportMimeType(ReportMimeTypeEnum reportMimeType) {
    this.reportMimeType = reportMimeType;
    return this;
  }

   /**
   * Get reportMimeType
   * @return reportMimeType
  **/
  @ApiModelProperty(example = "application/xml", required = true, value = "")
  public ReportMimeTypeEnum getReportMimeType() {
    return reportMimeType;
  }

  public void setReportMimeType(ReportMimeTypeEnum reportMimeType) {
    this.reportMimeType = reportMimeType;
  }

  public RequestBody1 reportFrequency(ReportFrequencyEnum reportFrequency) {
    this.reportFrequency = reportFrequency;
    return this;
  }

   /**
   * The frequency for which subscription is created.
   * @return reportFrequency
  **/
  @ApiModelProperty(example = "DAILY", required = true, value = "The frequency for which subscription is created.")
  public ReportFrequencyEnum getReportFrequency() {
    return reportFrequency;
  }

  public void setReportFrequency(ReportFrequencyEnum reportFrequency) {
    this.reportFrequency = reportFrequency;
  }

  public RequestBody1 reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Get reportName
   * @return reportName
  **/
  @ApiModelProperty(example = "My Daily Subdcription", required = true, value = "")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public RequestBody1 timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(example = "America/Chicago", required = true, value = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public RequestBody1 startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The hour at which the report generation should start. It should be in hhmm format.
   * @return startTime
  **/
  @ApiModelProperty(example = "0900", required = true, value = "The hour at which the report generation should start. It should be in hhmm format.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public RequestBody1 startDay(Integer startDay) {
    this.startDay = startDay;
    return this;
  }

   /**
   * This is the start day if the frequency is WEEKLY or MONTHLY. The value varies from 1-7 for WEEKLY and 1-31 for MONTHLY. For WEEKLY 1 means Sunday and 7 means Saturday. By default the value is 1.
   * minimum: 1
   * maximum: 31
   * @return startDay
  **/
  @ApiModelProperty(value = "This is the start day if the frequency is WEEKLY or MONTHLY. The value varies from 1-7 for WEEKLY and 1-31 for MONTHLY. For WEEKLY 1 means Sunday and 7 means Saturday. By default the value is 1.")
  public Integer getStartDay() {
    return startDay;
  }

  public void setStartDay(Integer startDay) {
    this.startDay = startDay;
  }

  public RequestBody1 reportFilters(Map<String, List<String>> reportFilters) {
    this.reportFilters = reportFilters;
    return this;
  }

  public RequestBody1 putReportFiltersItem(String key, List<String> reportFiltersItem) {
    if (this.reportFilters == null) {
      this.reportFilters = new HashMap<String, List<String>>();
    }
    this.reportFilters.put(key, reportFiltersItem);
    return this;
  }

   /**
   * List of filters to apply
   * @return reportFilters
  **/
  @ApiModelProperty(example = "{\"Application.Name\":[\"ics_auth\",\"ics_bill\"]}", value = "List of filters to apply")
  public Map<String, List<String>> getReportFilters() {
    return reportFilters;
  }

  public void setReportFilters(Map<String, List<String>> reportFilters) {
    this.reportFilters = reportFilters;
  }

  public RequestBody1 reportPreferences(Reportingv3reportsReportPreferences reportPreferences) {
    this.reportPreferences = reportPreferences;
    return this;
  }

   /**
   * Get reportPreferences
   * @return reportPreferences
  **/
  @ApiModelProperty(value = "")
  public Reportingv3reportsReportPreferences getReportPreferences() {
    return reportPreferences;
  }

  public void setReportPreferences(Reportingv3reportsReportPreferences reportPreferences) {
    this.reportPreferences = reportPreferences;
  }

  public RequestBody1 groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Valid GroupName
   * @return groupName
  **/
  @ApiModelProperty(example = "CEMEA Group", value = "Valid GroupName")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBody1 requestBody1 = (RequestBody1) o;
    return Objects.equals(this.organizationId, requestBody1.organizationId) &&
        Objects.equals(this.reportDefinitionName, requestBody1.reportDefinitionName) &&
        Objects.equals(this.reportFields, requestBody1.reportFields) &&
        Objects.equals(this.reportMimeType, requestBody1.reportMimeType) &&
        Objects.equals(this.reportFrequency, requestBody1.reportFrequency) &&
        Objects.equals(this.reportName, requestBody1.reportName) &&
        Objects.equals(this.timezone, requestBody1.timezone) &&
        Objects.equals(this.startTime, requestBody1.startTime) &&
        Objects.equals(this.startDay, requestBody1.startDay) &&
        Objects.equals(this.reportFilters, requestBody1.reportFilters) &&
        Objects.equals(this.reportPreferences, requestBody1.reportPreferences) &&
        Objects.equals(this.groupName, requestBody1.groupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, reportDefinitionName, reportFields, reportMimeType, reportFrequency, reportName, timezone, startTime, startDay, reportFilters, reportPreferences, groupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBody1 {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    reportDefinitionName: ").append(toIndentedString(reportDefinitionName)).append("\n");
    sb.append("    reportFields: ").append(toIndentedString(reportFields)).append("\n");
    sb.append("    reportMimeType: ").append(toIndentedString(reportMimeType)).append("\n");
    sb.append("    reportFrequency: ").append(toIndentedString(reportFrequency)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    startDay: ").append(toIndentedString(startDay)).append("\n");
    sb.append("    reportFilters: ").append(toIndentedString(reportFilters)).append("\n");
    sb.append("    reportPreferences: ").append(toIndentedString(reportPreferences)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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

