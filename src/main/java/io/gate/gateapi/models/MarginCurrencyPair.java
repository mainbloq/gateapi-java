/*
 * Gate API v4
 * APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * OpenAPI spec version: 4.6.0
 * Contact: support@mail.gate.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.gate.gateapi.models;

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
 * MarginCurrencyPair
 */

public class MarginCurrencyPair {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BASE = "base";
  @SerializedName(SERIALIZED_NAME_BASE)
  private String base;

  public static final String SERIALIZED_NAME_QUOTE = "quote";
  @SerializedName(SERIALIZED_NAME_QUOTE)
  private String quote;

  public static final String SERIALIZED_NAME_LEVERAGE = "leverage";
  @SerializedName(SERIALIZED_NAME_LEVERAGE)
  private Integer leverage;

  public static final String SERIALIZED_NAME_MIN_BASE_AMOUNT = "min_base_amount";
  @SerializedName(SERIALIZED_NAME_MIN_BASE_AMOUNT)
  private String minBaseAmount;

  public static final String SERIALIZED_NAME_MIN_QUOTE_AMOUNT = "min_quote_amount";
  @SerializedName(SERIALIZED_NAME_MIN_QUOTE_AMOUNT)
  private String minQuoteAmount;

  public static final String SERIALIZED_NAME_MAX_QUOTE_AMOUNT = "max_quote_amount";
  @SerializedName(SERIALIZED_NAME_MAX_QUOTE_AMOUNT)
  private String maxQuoteAmount;

  public MarginCurrencyPair id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Currency pair
   * @return id
  **/
  @ApiModelProperty(value = "Currency pair")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MarginCurrencyPair base(String base) {
    this.base = base;
    return this;
  }

   /**
   * Base currency
   * @return base
  **/
  @ApiModelProperty(value = "Base currency")
  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public MarginCurrencyPair quote(String quote) {
    this.quote = quote;
    return this;
  }

   /**
   * Quote currency
   * @return quote
  **/
  @ApiModelProperty(value = "Quote currency")
  public String getQuote() {
    return quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }

  public MarginCurrencyPair leverage(Integer leverage) {
    this.leverage = leverage;
    return this;
  }

   /**
   * Leverage
   * @return leverage
  **/
  @ApiModelProperty(value = "Leverage")
  public Integer getLeverage() {
    return leverage;
  }

  public void setLeverage(Integer leverage) {
    this.leverage = leverage;
  }

  public MarginCurrencyPair minBaseAmount(String minBaseAmount) {
    this.minBaseAmount = minBaseAmount;
    return this;
  }

   /**
   * Minimum base currency to loan, &#x60;null&#x60; means no limit
   * @return minBaseAmount
  **/
  @ApiModelProperty(value = "Minimum base currency to loan, `null` means no limit")
  public String getMinBaseAmount() {
    return minBaseAmount;
  }

  public void setMinBaseAmount(String minBaseAmount) {
    this.minBaseAmount = minBaseAmount;
  }

  public MarginCurrencyPair minQuoteAmount(String minQuoteAmount) {
    this.minQuoteAmount = minQuoteAmount;
    return this;
  }

   /**
   * Minimum quote currency to loan, &#x60;null&#x60; means no limit
   * @return minQuoteAmount
  **/
  @ApiModelProperty(value = "Minimum quote currency to loan, `null` means no limit")
  public String getMinQuoteAmount() {
    return minQuoteAmount;
  }

  public void setMinQuoteAmount(String minQuoteAmount) {
    this.minQuoteAmount = minQuoteAmount;
  }

  public MarginCurrencyPair maxQuoteAmount(String maxQuoteAmount) {
    this.maxQuoteAmount = maxQuoteAmount;
    return this;
  }

   /**
   * Maximum borrowable amount for quote currency. Base currency limit is calculated by quote maximum and market price. &#x60;null&#x60; means no limit
   * @return maxQuoteAmount
  **/
  @ApiModelProperty(value = "Maximum borrowable amount for quote currency. Base currency limit is calculated by quote maximum and market price. `null` means no limit")
  public String getMaxQuoteAmount() {
    return maxQuoteAmount;
  }

  public void setMaxQuoteAmount(String maxQuoteAmount) {
    this.maxQuoteAmount = maxQuoteAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarginCurrencyPair marginCurrencyPair = (MarginCurrencyPair) o;
    return Objects.equals(this.id, marginCurrencyPair.id) &&
        Objects.equals(this.base, marginCurrencyPair.base) &&
        Objects.equals(this.quote, marginCurrencyPair.quote) &&
        Objects.equals(this.leverage, marginCurrencyPair.leverage) &&
        Objects.equals(this.minBaseAmount, marginCurrencyPair.minBaseAmount) &&
        Objects.equals(this.minQuoteAmount, marginCurrencyPair.minQuoteAmount) &&
        Objects.equals(this.maxQuoteAmount, marginCurrencyPair.maxQuoteAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, base, quote, leverage, minBaseAmount, minQuoteAmount, maxQuoteAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarginCurrencyPair {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
    sb.append("    minBaseAmount: ").append(toIndentedString(minBaseAmount)).append("\n");
    sb.append("    minQuoteAmount: ").append(toIndentedString(minQuoteAmount)).append("\n");
    sb.append("    maxQuoteAmount: ").append(toIndentedString(maxQuoteAmount)).append("\n");
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
