/*
 * Copyright (c) 2019 Mastercard
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 * Loyalty Benefits API
 * The Loyalty Benefits API provides benefits management including presentment and selection.  It also supports insurance certificate generation for insurance benefits that need certificates.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: loyalty-benefits-support@mastercard.flowdock.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.loyalty_benefits_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ClaimStatusRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-30T13:58:23.312-06:00[America/Chicago]")
public class ClaimStatusRequest {
  public static final String SERIALIZED_NAME_CLAIM_ID = "claimId";
  @SerializedName(SERIALIZED_NAME_CLAIM_ID)
  private String claimId;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_PREFERRED_LANGUAGE = "preferredLanguage";
  @SerializedName(SERIALIZED_NAME_PREFERRED_LANGUAGE)
  private String preferredLanguage;

  public ClaimStatusRequest claimId(String claimId) {
    this.claimId = claimId;
    return this;
  }
  
  public ClaimStatusRequest(String claimId, String postalCode, String preferredLanguage) {
		this.claimId = claimId;
		this.postalCode = postalCode;
		this.preferredLanguage = preferredLanguage;
	}

   /**
   * Insurance claim identifier
   * @return claimId
  **/
  @ApiModelProperty(example = "C0011", required = true, value = "Insurance claim identifier")
  public String getClaimId() {
    return claimId;
  }

  public void setClaimId(String claimId) {
    this.claimId = claimId;
  }

  public ClaimStatusRequest postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code associated with insurance claim
   * @return postalCode
  **/
  @ApiModelProperty(example = "71000", required = true, value = "Postal code associated with insurance claim")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ClaimStatusRequest preferredLanguage(String preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
    return this;
  }

   /**
   * User&#39;s preferred language in localized ISO 639-1 format such as pt-BR
   * @return preferredLanguage
  **/
  @ApiModelProperty(example = "pt-BR", value = "User's preferred language in localized ISO 639-1 format such as pt-BR")
  public String getPreferredLanguage() {
    return preferredLanguage;
  }

  public void setPreferredLanguage(String preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimStatusRequest claimStatusRequest = (ClaimStatusRequest) o;
    return Objects.equals(this.claimId, claimStatusRequest.claimId) &&
        Objects.equals(this.postalCode, claimStatusRequest.postalCode) &&
        Objects.equals(this.preferredLanguage, claimStatusRequest.preferredLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimId, postalCode, preferredLanguage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimStatusRequest {\n");
    
    sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    preferredLanguage: ").append(toIndentedString(preferredLanguage)).append("\n");
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

