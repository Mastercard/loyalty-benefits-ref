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
import com.mastercard.developer.loyalty_benefits_client.model.BenefitsSelectionAdditionalInformation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BenefitsSelection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-30T13:58:23.312-06:00[America/Chicago]")
public class BenefitsSelection {
  public static final String SERIALIZED_NAME_ICA = "ica";
  @SerializedName(SERIALIZED_NAME_ICA)
  private Integer ica;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;
  
  public static final String SERIALIZED_NAME_MEMBER_ID = "memberId";
  @SerializedName(SERIALIZED_NAME_MEMBER_ID)
  private String memberId;

  public static final String SERIALIZED_NAME_CARD_PRODUCT_TYPE = "cardProductType";
  @SerializedName(SERIALIZED_NAME_CARD_PRODUCT_TYPE)
  private String cardProductType;

  public static final String SERIALIZED_NAME_PAN_LAST_FOUR_DIGITS = "panLastFourDigits";
  @SerializedName(SERIALIZED_NAME_PAN_LAST_FOUR_DIGITS)
  private String panLastFourDigits;

  public static final String SERIALIZED_NAME_BENEFIT_IDS = "benefitIds";
  @SerializedName(SERIALIZED_NAME_BENEFIT_IDS)
  private List<String> benefitIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ADDITIONAL_INFORMATION = "additionalInformation";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFORMATION)
  private BenefitsSelectionAdditionalInformation additionalInformation = null;

  public BenefitsSelection ica(Integer ica) {
    this.ica = ica;
    return this;
  }

   /**
   * Card Issuer&#39;s ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution.
   * @return ica
  **/
  @ApiModelProperty(example = "4567", required = true, value = "Card Issuer's ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution.")
  public Integer getIca() {
    return ica;
  }

  public void setIca(Integer ica) {
    this.ica = ica;
  }
  
  public void setMemberId(String memberId) {
	  this.memberId = memberId;
  }

  public BenefitsSelection userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Opaque identifier for the consumer. Issuer/Acquirer to send it complies to IETF RFC2396; MC provisions it depends on the use case, such as user123-partnerBank
   * @return userId
  **/
  @ApiModelProperty(example = "user1235", required = true, value = "Opaque identifier for the consumer. Issuer/Acquirer to send it complies to IETF RFC2396; MC provisions it depends on the use case, such as user123-partnerBank")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public BenefitsSelection cardProductType(String cardProductType) {
    this.cardProductType = cardProductType;
    return this;
  }

   /**
   * Card product for which benefits have been set up by issuer during onboarding (i.e. black, gold)
   * @return cardProductType
  **/
  @ApiModelProperty(example = "black", required = true, value = "Card product for which benefits have been set up by issuer during onboarding (i.e. black, gold)")
  public String getCardProductType() {
    return cardProductType;
  }

  public void setCardProductType(String cardProductType) {
    this.cardProductType = cardProductType;
  }

  public BenefitsSelection panLastFourDigits(String panLastFourDigits) {
    this.panLastFourDigits = panLastFourDigits;
    return this;
  }

   /**
   * Last four digits of user&#39;s registered 16 digit credit card number
   * @return panLastFourDigits
  **/
  @ApiModelProperty(example = "2244", required = true, value = "Last four digits of user's registered 16 digit credit card number")
  public String getPanLastFourDigits() {
    return panLastFourDigits;
  }

  public void setPanLastFourDigits(String panLastFourDigits) {
    this.panLastFourDigits = panLastFourDigits;
  }

  public BenefitsSelection benefitIds(List<String> benefitIds) {
    this.benefitIds = benefitIds;
    return this;
  }

  public BenefitsSelection addBenefitIdsItem(String benefitIdsItem) {
    this.benefitIds.add(benefitIdsItem);
    return this;
  }

   /**
   * Array of benefit IDs to assign to user. Typically holds benefitIds selected by user.
   * @return benefitIds
  **/
  @ApiModelProperty(required = true, value = "Array of benefit IDs to assign to user. Typically holds benefitIds selected by user.")
  public List<String> getBenefitIds() {
    return benefitIds;
  }

  public void setBenefitIds(List<String> benefitIds) {
    this.benefitIds = benefitIds;
  }

  public BenefitsSelection additionalInformation(BenefitsSelectionAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @ApiModelProperty(value = "")
  public BenefitsSelectionAdditionalInformation getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(BenefitsSelectionAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenefitsSelection benefitsSelection = (BenefitsSelection) o;
    return Objects.equals(this.ica, benefitsSelection.ica) &&
        Objects.equals(this.userId, benefitsSelection.userId) &&
        Objects.equals(this.cardProductType, benefitsSelection.cardProductType) &&
        Objects.equals(this.panLastFourDigits, benefitsSelection.panLastFourDigits) &&
        Objects.equals(this.benefitIds, benefitsSelection.benefitIds) &&
        Objects.equals(this.additionalInformation, benefitsSelection.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ica, userId, cardProductType, panLastFourDigits, benefitIds, additionalInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitsSelection {\n");
    
    sb.append("    ica: ").append(toIndentedString(ica)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    cardProductType: ").append(toIndentedString(cardProductType)).append("\n");
    sb.append("    panLastFourDigits: ").append(toIndentedString(panLastFourDigits)).append("\n");
    sb.append("    benefitIds: ").append(toIndentedString(benefitIds)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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
