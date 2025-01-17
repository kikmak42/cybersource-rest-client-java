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
 * Tmsv1instrumentidentifiersDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class Tmsv1instrumentidentifiersDetails {
  @SerializedName("name")
  private String name = null;

  @SerializedName("location")
  private String location = null;

  public Tmsv1instrumentidentifiersDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the field that threw the error.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the field that threw the error.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tmsv1instrumentidentifiersDetails location(String location) {
    this.location = location;
    return this;
  }

   /**
   * The location of the field that threw the error.
   * @return location
  **/
  @ApiModelProperty(value = "The location of the field that threw the error.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv1instrumentidentifiersDetails tmsv1instrumentidentifiersDetails = (Tmsv1instrumentidentifiersDetails) o;
    return Objects.equals(this.name, tmsv1instrumentidentifiersDetails.name) &&
        Objects.equals(this.location, tmsv1instrumentidentifiersDetails.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv1instrumentidentifiersDetails {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

