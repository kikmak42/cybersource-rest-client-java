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
import Model.PtsV2PaymentsPost201ResponseLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201ResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-09T16:47:53.059+05:30")
public class PtsV2PaymentsPost201ResponseLinks {
  @SerializedName("self")
  private PtsV2PaymentsPost201ResponseLinksSelf self = null;

  @SerializedName("reversal")
  private PtsV2PaymentsPost201ResponseLinksSelf reversal = null;

  @SerializedName("capture")
  private PtsV2PaymentsPost201ResponseLinksSelf capture = null;

  public PtsV2PaymentsPost201ResponseLinks self(PtsV2PaymentsPost201ResponseLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getSelf() {
    return self;
  }

  public void setSelf(PtsV2PaymentsPost201ResponseLinksSelf self) {
    this.self = self;
  }

  public PtsV2PaymentsPost201ResponseLinks reversal(PtsV2PaymentsPost201ResponseLinksSelf reversal) {
    this.reversal = reversal;
    return this;
  }

   /**
   * Get reversal
   * @return reversal
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getReversal() {
    return reversal;
  }

  public void setReversal(PtsV2PaymentsPost201ResponseLinksSelf reversal) {
    this.reversal = reversal;
  }

  public PtsV2PaymentsPost201ResponseLinks capture(PtsV2PaymentsPost201ResponseLinksSelf capture) {
    this.capture = capture;
    return this;
  }

   /**
   * Get capture
   * @return capture
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getCapture() {
    return capture;
  }

  public void setCapture(PtsV2PaymentsPost201ResponseLinksSelf capture) {
    this.capture = capture;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseLinks ptsV2PaymentsPost201ResponseLinks = (PtsV2PaymentsPost201ResponseLinks) o;
    return Objects.equals(this.self, ptsV2PaymentsPost201ResponseLinks.self) &&
        Objects.equals(this.reversal, ptsV2PaymentsPost201ResponseLinks.reversal) &&
        Objects.equals(this.capture, ptsV2PaymentsPost201ResponseLinks.capture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, reversal, capture);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    reversal: ").append(toIndentedString(reversal)).append("\n");
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
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

