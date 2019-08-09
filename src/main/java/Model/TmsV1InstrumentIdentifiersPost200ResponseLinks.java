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
import Model.TmsV1InstrumentIdentifiersPost200ResponseLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TmsV1InstrumentIdentifiersPost200ResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-09T15:30:56.583+05:30")
public class TmsV1InstrumentIdentifiersPost200ResponseLinks {
  @SerializedName("self")
  private TmsV1InstrumentIdentifiersPost200ResponseLinksSelf self = null;

  @SerializedName("ancestor")
  private TmsV1InstrumentIdentifiersPost200ResponseLinksSelf ancestor = null;

  @SerializedName("successor")
  private TmsV1InstrumentIdentifiersPost200ResponseLinksSelf successor = null;

  public TmsV1InstrumentIdentifiersPost200ResponseLinks self(TmsV1InstrumentIdentifiersPost200ResponseLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseLinksSelf getSelf() {
    return self;
  }

  public void setSelf(TmsV1InstrumentIdentifiersPost200ResponseLinksSelf self) {
    this.self = self;
  }

  public TmsV1InstrumentIdentifiersPost200ResponseLinks ancestor(TmsV1InstrumentIdentifiersPost200ResponseLinksSelf ancestor) {
    this.ancestor = ancestor;
    return this;
  }

   /**
   * Get ancestor
   * @return ancestor
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseLinksSelf getAncestor() {
    return ancestor;
  }

  public void setAncestor(TmsV1InstrumentIdentifiersPost200ResponseLinksSelf ancestor) {
    this.ancestor = ancestor;
  }

  public TmsV1InstrumentIdentifiersPost200ResponseLinks successor(TmsV1InstrumentIdentifiersPost200ResponseLinksSelf successor) {
    this.successor = successor;
    return this;
  }

   /**
   * Get successor
   * @return successor
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseLinksSelf getSuccessor() {
    return successor;
  }

  public void setSuccessor(TmsV1InstrumentIdentifiersPost200ResponseLinksSelf successor) {
    this.successor = successor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentIdentifiersPost200ResponseLinks tmsV1InstrumentIdentifiersPost200ResponseLinks = (TmsV1InstrumentIdentifiersPost200ResponseLinks) o;
    return Objects.equals(this.self, tmsV1InstrumentIdentifiersPost200ResponseLinks.self) &&
        Objects.equals(this.ancestor, tmsV1InstrumentIdentifiersPost200ResponseLinks.ancestor) &&
        Objects.equals(this.successor, tmsV1InstrumentIdentifiersPost200ResponseLinks.successor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, ancestor, successor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPost200ResponseLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    ancestor: ").append(toIndentedString(ancestor)).append("\n");
    sb.append("    successor: ").append(toIndentedString(successor)).append("\n");
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

