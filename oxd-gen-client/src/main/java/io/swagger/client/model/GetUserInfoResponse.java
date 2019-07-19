/*
 * oxd-server
 * oxd-server
 *
 * OpenAPI spec version: 4.0.0
 * Contact: yuriyz@gluu.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * GetUserInfoResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-25T10:27:43.455Z")
public class GetUserInfoResponse {
  @SerializedName("claims")
  private Map<String, List<String>> claims = new HashMap<>();

  public GetUserInfoResponse claims(Map<String, List<String>> claims) {
    this.claims = claims;
    return this;
  }

  public GetUserInfoResponse putClaimsItem(String key, List<String> claimsItem) {
    this.claims.put(key, claimsItem);
    return this;
  }

   /**
   * Get claims
   * @return claims
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, List<String>> getClaims() {
    return claims;
  }

  public void setClaims(Map<String, List<String>> claims) {
    this.claims = claims;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserInfoResponse getUserInfoResponse = (GetUserInfoResponse) o;
    return Objects.equals(this.claims, getUserInfoResponse.claims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claims);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserInfoResponse {\n");
    
    sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

