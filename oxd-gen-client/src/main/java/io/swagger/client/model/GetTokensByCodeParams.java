/*
 * oxd-server
 * oxd-server
 *
 * OpenAPI spec version: 4.2
 * Contact: yuriyz@gluu.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * GetTokensByCodeParams
 */


public class GetTokensByCodeParams {
  @SerializedName("oxd_id")
  private String oxdId = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("authentication_method")
  private String authenticationMethod = null;

  @SerializedName("algorithm")
  private String algorithm = null;

  public GetTokensByCodeParams oxdId(String oxdId) {
    this.oxdId = oxdId;
    return this;
  }

   /**
   * Get oxdId
   * @return oxdId
  **/
  @Schema(example = "bcad760f-91ba-46e1-a020-05e4281d91b6", required = true, description = "")
  public String getOxdId() {
    return oxdId;
  }

  public void setOxdId(String oxdId) {
    this.oxdId = oxdId;
  }

  public GetTokensByCodeParams code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(example = "0b9f1518-15aa-47b2-9477-d4c607447e18", required = true, description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GetTokensByCodeParams state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(example = "6q1ec90hn6ui4ipigv91hrbodj", required = true, description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public GetTokensByCodeParams authenticationMethod(String authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }

   /**
   * if value is missed then basic authentication is used. Otherwise it&#x27;s possible to set &#x60;private_key_jwt&#x60; value for Private Key authentication.
   * @return authenticationMethod
  **/
  @Schema(description = "if value is missed then basic authentication is used. Otherwise it's possible to set `private_key_jwt` value for Private Key authentication.")
  public String getAuthenticationMethod() {
    return authenticationMethod;
  }

  public void setAuthenticationMethod(String authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  public GetTokensByCodeParams algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * optional but is required if authentication_method&#x3D;private_key_jwt. Valid values are none, HS256, HS384, HS512, RS256, RS384, RS512, ES256, ES384, ES512
   * @return algorithm
  **/
  @Schema(description = "optional but is required if authentication_method=private_key_jwt. Valid values are none, HS256, HS384, HS512, RS256, RS384, RS512, ES256, ES384, ES512")
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTokensByCodeParams getTokensByCodeParams = (GetTokensByCodeParams) o;
    return Objects.equals(this.oxdId, getTokensByCodeParams.oxdId) &&
        Objects.equals(this.code, getTokensByCodeParams.code) &&
        Objects.equals(this.state, getTokensByCodeParams.state) &&
        Objects.equals(this.authenticationMethod, getTokensByCodeParams.authenticationMethod) &&
        Objects.equals(this.algorithm, getTokensByCodeParams.algorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oxdId, code, state, authenticationMethod, algorithm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTokensByCodeParams {\n");
    
    sb.append("    oxdId: ").append(toIndentedString(oxdId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
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
