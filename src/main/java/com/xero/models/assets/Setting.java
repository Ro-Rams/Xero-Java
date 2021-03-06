/*
 * Xero Assets API
 * This the Xero Assets API
 *
 * OpenAPI spec version: 1.1.2
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.assets;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Setting
 */

public class Setting {
  @JsonProperty("assetNumberPrefix")
  private String assetNumberPrefix = null;

  @JsonProperty("assetNumberSequence")
  private Integer assetNumberSequence = null;

  @JsonProperty("assetStartDate")
  private String assetStartDate = null;

  @JsonProperty("lastDepreciationDate")
  private String lastDepreciationDate = null;

  @JsonProperty("defaultGainOnDisposalAccountId")
  private String defaultGainOnDisposalAccountId = null;

  @JsonProperty("defaultLossOnDisposalAccountId")
  private String defaultLossOnDisposalAccountId = null;

  @JsonProperty("defaultCapitalGainOnDisposalAccount")
  private String defaultCapitalGainOnDisposalAccount = null;

  @JsonProperty("optInForTax")
  private Boolean optInForTax = null;

  public Setting assetNumberPrefix(String assetNumberPrefix) {
    this.assetNumberPrefix = assetNumberPrefix;
    return this;
  }

   /**
   * Get assetNumberPrefix
   * @return assetNumberPrefix
  **/
  @ApiModelProperty(example = "StraightLine", value = "")
  public String getAssetNumberPrefix() {
    return assetNumberPrefix;
  }

  public void setAssetNumberPrefix(String assetNumberPrefix) {
    this.assetNumberPrefix = assetNumberPrefix;
  }

  public Setting assetNumberSequence(Integer assetNumberSequence) {
    this.assetNumberSequence = assetNumberSequence;
    return this;
  }

   /**
   * Get assetNumberSequence
   * @return assetNumberSequence
  **/
  @ApiModelProperty(value = "")
  public Integer getAssetNumberSequence() {
    return assetNumberSequence;
  }

  public void setAssetNumberSequence(Integer assetNumberSequence) {
    this.assetNumberSequence = assetNumberSequence;
  }

  public Setting assetStartDate(String assetStartDate) {
    this.assetStartDate = assetStartDate;
    return this;
  }

   /**
   * Get assetStartDate
   * @return assetStartDate
  **/
  @ApiModelProperty(example = "StraightLine", value = "")
  public String getAssetStartDate() {
    return assetStartDate;
  }

  public void setAssetStartDate(String assetStartDate) {
    this.assetStartDate = assetStartDate;
  }

  public Setting lastDepreciationDate(String lastDepreciationDate) {
    this.lastDepreciationDate = lastDepreciationDate;
    return this;
  }

   /**
   * Get lastDepreciationDate
   * @return lastDepreciationDate
  **/
  @ApiModelProperty(example = "StraightLine", value = "")
  public String getLastDepreciationDate() {
    return lastDepreciationDate;
  }

  public void setLastDepreciationDate(String lastDepreciationDate) {
    this.lastDepreciationDate = lastDepreciationDate;
  }

  public Setting defaultGainOnDisposalAccountId(String defaultGainOnDisposalAccountId) {
    this.defaultGainOnDisposalAccountId = defaultGainOnDisposalAccountId;
    return this;
  }

   /**
   * Get defaultGainOnDisposalAccountId
   * @return defaultGainOnDisposalAccountId
  **/
  @ApiModelProperty(example = "StraightLine", value = "")
  public String getDefaultGainOnDisposalAccountId() {
    return defaultGainOnDisposalAccountId;
  }

  public void setDefaultGainOnDisposalAccountId(String defaultGainOnDisposalAccountId) {
    this.defaultGainOnDisposalAccountId = defaultGainOnDisposalAccountId;
  }

  public Setting defaultLossOnDisposalAccountId(String defaultLossOnDisposalAccountId) {
    this.defaultLossOnDisposalAccountId = defaultLossOnDisposalAccountId;
    return this;
  }

   /**
   * Get defaultLossOnDisposalAccountId
   * @return defaultLossOnDisposalAccountId
  **/
  @ApiModelProperty(example = "StraightLine", value = "")
  public String getDefaultLossOnDisposalAccountId() {
    return defaultLossOnDisposalAccountId;
  }

  public void setDefaultLossOnDisposalAccountId(String defaultLossOnDisposalAccountId) {
    this.defaultLossOnDisposalAccountId = defaultLossOnDisposalAccountId;
  }

  public Setting defaultCapitalGainOnDisposalAccount(String defaultCapitalGainOnDisposalAccount) {
    this.defaultCapitalGainOnDisposalAccount = defaultCapitalGainOnDisposalAccount;
    return this;
  }

   /**
   * Get defaultCapitalGainOnDisposalAccount
   * @return defaultCapitalGainOnDisposalAccount
  **/
  @ApiModelProperty(example = "StraightLine", value = "")
  public String getDefaultCapitalGainOnDisposalAccount() {
    return defaultCapitalGainOnDisposalAccount;
  }

  public void setDefaultCapitalGainOnDisposalAccount(String defaultCapitalGainOnDisposalAccount) {
    this.defaultCapitalGainOnDisposalAccount = defaultCapitalGainOnDisposalAccount;
  }

  public Setting optInForTax(Boolean optInForTax) {
    this.optInForTax = optInForTax;
    return this;
  }

   /**
   * Get optInForTax
   * @return optInForTax
  **/
  @ApiModelProperty(value = "")
  public Boolean getOptInForTax() {
    return optInForTax;
  }

  public void setOptInForTax(Boolean optInForTax) {
    this.optInForTax = optInForTax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Setting setting = (Setting) o;
    return Objects.equals(this.assetNumberPrefix, setting.assetNumberPrefix) &&
        Objects.equals(this.assetNumberSequence, setting.assetNumberSequence) &&
        Objects.equals(this.assetStartDate, setting.assetStartDate) &&
        Objects.equals(this.lastDepreciationDate, setting.lastDepreciationDate) &&
        Objects.equals(this.defaultGainOnDisposalAccountId, setting.defaultGainOnDisposalAccountId) &&
        Objects.equals(this.defaultLossOnDisposalAccountId, setting.defaultLossOnDisposalAccountId) &&
        Objects.equals(this.defaultCapitalGainOnDisposalAccount, setting.defaultCapitalGainOnDisposalAccount) &&
        Objects.equals(this.optInForTax, setting.optInForTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetNumberPrefix, assetNumberSequence, assetStartDate, lastDepreciationDate, defaultGainOnDisposalAccountId, defaultLossOnDisposalAccountId, defaultCapitalGainOnDisposalAccount, optInForTax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Setting {\n");
    
    sb.append("    assetNumberPrefix: ").append(toIndentedString(assetNumberPrefix)).append("\n");
    sb.append("    assetNumberSequence: ").append(toIndentedString(assetNumberSequence)).append("\n");
    sb.append("    assetStartDate: ").append(toIndentedString(assetStartDate)).append("\n");
    sb.append("    lastDepreciationDate: ").append(toIndentedString(lastDepreciationDate)).append("\n");
    sb.append("    defaultGainOnDisposalAccountId: ").append(toIndentedString(defaultGainOnDisposalAccountId)).append("\n");
    sb.append("    defaultLossOnDisposalAccountId: ").append(toIndentedString(defaultLossOnDisposalAccountId)).append("\n");
    sb.append("    defaultCapitalGainOnDisposalAccount: ").append(toIndentedString(defaultCapitalGainOnDisposalAccount)).append("\n");
    sb.append("    optInForTax: ").append(toIndentedString(optInForTax)).append("\n");
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

