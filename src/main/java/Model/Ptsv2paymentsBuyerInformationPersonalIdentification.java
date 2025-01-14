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
 * Ptsv2paymentsBuyerInformationPersonalIdentification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class Ptsv2paymentsBuyerInformationPersonalIdentification {
  /**
   * The type of the identification.  Possible values:   - &#x60;NATIONAL&#x60;   - &#x60;CPF&#x60;   - &#x60;CPNJ&#x60;   - &#x60;CURP&#x60;   - &#x60;SSN&#x60;   - &#x60;DRIVER_LICENSE&#x60;  This field is supported only on the following processors.  #### ComercioLatino Set this field to the Cadastro de Pessoas Fisicas (CPF).  #### CyberSource Latin American Processing Supported for Redecard in Brazil. Set this field to the Cadastro de Pessoas Fisicas (CPF), which is required for AVS for Redecard in Brazil. **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America. The information in this field description is for the specific processing connection called CyberSource Latin American Processing. It is not for any other Latin American processors that CyberSource supports. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NATIONAL("NATIONAL"),
    
    CPF("CPF"),
    
    CPNJ("CPNJ"),
    
    CURP("CURP"),
    
    SSN("SSN"),
    
    DRIVER_LICENSE("DRIVER_LICENSE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("issuedBy")
  private String issuedBy = null;

  public Ptsv2paymentsBuyerInformationPersonalIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the identification.  Possible values:   - &#x60;NATIONAL&#x60;   - &#x60;CPF&#x60;   - &#x60;CPNJ&#x60;   - &#x60;CURP&#x60;   - &#x60;SSN&#x60;   - &#x60;DRIVER_LICENSE&#x60;  This field is supported only on the following processors.  #### ComercioLatino Set this field to the Cadastro de Pessoas Fisicas (CPF).  #### CyberSource Latin American Processing Supported for Redecard in Brazil. Set this field to the Cadastro de Pessoas Fisicas (CPF), which is required for AVS for Redecard in Brazil. **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America. The information in this field description is for the specific processing connection called CyberSource Latin American Processing. It is not for any other Latin American processors that CyberSource supports. 
   * @return type
  **/
  @ApiModelProperty(value = "The type of the identification.  Possible values:   - `NATIONAL`   - `CPF`   - `CPNJ`   - `CURP`   - `SSN`   - `DRIVER_LICENSE`  This field is supported only on the following processors.  #### ComercioLatino Set this field to the Cadastro de Pessoas Fisicas (CPF).  #### CyberSource Latin American Processing Supported for Redecard in Brazil. Set this field to the Cadastro de Pessoas Fisicas (CPF), which is required for AVS for Redecard in Brazil. **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America. The information in this field description is for the specific processing connection called CyberSource Latin American Processing. It is not for any other Latin American processors that CyberSource supports. ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Ptsv2paymentsBuyerInformationPersonalIdentification id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The value of the identification type. This field is supported only on the following processors.  #### ComercioLatino Set this field to the Cadastro de Pessoas Fisicas (CPF).  #### CyberSource Latin American Processing Supported for Redecard in Brazil. Set this field to the Cadastro de Pessoas Fisicas (CPF), which is required for AVS for Redecard in Brazil. **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America. The information in this field description is for the specific processing connection called CyberSource Latin American Processing. It is not for any other Latin American processors that CyberSource supports.  For processor-specific information, see the &#x60;personal_id&#x60; field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)    If &#x60;type &#x3D; PASSPORT&#x60;, this is the cardholder&#39;s passport number. Recommended for Discover ProtectBuy. 
   * @return id
  **/
  @ApiModelProperty(value = "The value of the identification type. This field is supported only on the following processors.  #### ComercioLatino Set this field to the Cadastro de Pessoas Fisicas (CPF).  #### CyberSource Latin American Processing Supported for Redecard in Brazil. Set this field to the Cadastro de Pessoas Fisicas (CPF), which is required for AVS for Redecard in Brazil. **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America. The information in this field description is for the specific processing connection called CyberSource Latin American Processing. It is not for any other Latin American processors that CyberSource supports.  For processor-specific information, see the `personal_id` field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)    If `type = PASSPORT`, this is the cardholder's passport number. Recommended for Discover ProtectBuy. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Ptsv2paymentsBuyerInformationPersonalIdentification issuedBy(String issuedBy) {
    this.issuedBy = issuedBy;
    return this;
  }

   /**
   * The government agency that issued the driver&#39;s license or passport.  If **type**&#x60; &#x3D; DRIVER_LICENSE&#x60;, this is the State or province where the customer’s driver’s license was issued.  If **type**&#x60; &#x3D; PASSPORT&#x60;, this is the Issuing country for the cardholder’s passport. Recommended for Discover ProtectBuy.  Use the two-character State, Province, and Territory Codes for the United States and Canada.  #### TeleCheck Contact your TeleCheck representative to find out whether this field is required or optional.  #### All Other Processors Not used.  For details about the country that issued the passport, see &#x60;customer_passport_country&#x60; field description in [CyberSource Payer Authentication Using the SCMP API] (https://apps.cybersource.com/library/documentation/dev_guides/Payer_Authentication_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  For details about the state or province that issued the passport, see &#x60;driver_license_state&#x60; field description in [Electronic Check Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return issuedBy
  **/
  @ApiModelProperty(value = "The government agency that issued the driver's license or passport.  If **type**` = DRIVER_LICENSE`, this is the State or province where the customer’s driver’s license was issued.  If **type**` = PASSPORT`, this is the Issuing country for the cardholder’s passport. Recommended for Discover ProtectBuy.  Use the two-character State, Province, and Territory Codes for the United States and Canada.  #### TeleCheck Contact your TeleCheck representative to find out whether this field is required or optional.  #### All Other Processors Not used.  For details about the country that issued the passport, see `customer_passport_country` field description in [CyberSource Payer Authentication Using the SCMP API] (https://apps.cybersource.com/library/documentation/dev_guides/Payer_Authentication_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  For details about the state or province that issued the passport, see `driver_license_state` field description in [Electronic Check Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getIssuedBy() {
    return issuedBy;
  }

  public void setIssuedBy(String issuedBy) {
    this.issuedBy = issuedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsBuyerInformationPersonalIdentification ptsv2paymentsBuyerInformationPersonalIdentification = (Ptsv2paymentsBuyerInformationPersonalIdentification) o;
    return Objects.equals(this.type, ptsv2paymentsBuyerInformationPersonalIdentification.type) &&
        Objects.equals(this.id, ptsv2paymentsBuyerInformationPersonalIdentification.id) &&
        Objects.equals(this.issuedBy, ptsv2paymentsBuyerInformationPersonalIdentification.issuedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, issuedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsBuyerInformationPersonalIdentification {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuedBy: ").append(toIndentedString(issuedBy)).append("\n");
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

