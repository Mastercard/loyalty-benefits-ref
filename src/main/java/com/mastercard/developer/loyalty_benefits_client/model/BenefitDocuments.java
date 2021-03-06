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
 * BenefitDocuments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-30T13:58:23.312-06:00[America/Chicago]")
public class BenefitDocuments {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public BenefitDocuments id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Benefit document name
   * @return id
  **/
  @ApiModelProperty(example = "conditions-of-use", value = "Benefit document name")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BenefitDocuments name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Benefit document  value
   * @return name
  **/
  @ApiModelProperty(example = "Priority Pass Airport Lounge Conditions Of Use", value = "Benefit document  value")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BenefitDocuments format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Benefit document file format
   * @return format
  **/
  @ApiModelProperty(example = "pdf", value = "Benefit document file format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public BenefitDocuments url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Benefit document url
   * @return url
  **/
  @ApiModelProperty(example = "https://mastercard-qa.helix.affiniongroup.com/api_content/MC_DEMO/en-gb/benefits/resources/documents/priority_pass_conditions_of_use.pdf", value = "Benefit document url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenefitDocuments benefitDocuments = (BenefitDocuments) o;
    return Objects.equals(this.id, benefitDocuments.id) &&
        Objects.equals(this.name, benefitDocuments.name) &&
        Objects.equals(this.format, benefitDocuments.format) &&
        Objects.equals(this.url, benefitDocuments.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, format, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitDocuments {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

