/*
 * Gate API v4
 * APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * OpenAPI spec version: 4.6.1
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
import java.math.BigDecimal;

/**
 * Contract
 */

public class Contract {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Futures contract type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INVERSE("inverse"),
    
    DIRECT("direct");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_QUANTO_MULTIPLIER = "quanto_multiplier";
  @SerializedName(SERIALIZED_NAME_QUANTO_MULTIPLIER)
  private String quantoMultiplier;

  public static final String SERIALIZED_NAME_LEVERAGE_MIN = "leverage_min";
  @SerializedName(SERIALIZED_NAME_LEVERAGE_MIN)
  private String leverageMin;

  public static final String SERIALIZED_NAME_LEVERAGE_MAX = "leverage_max";
  @SerializedName(SERIALIZED_NAME_LEVERAGE_MAX)
  private String leverageMax;

  public static final String SERIALIZED_NAME_MAINTENANCE_RATE = "maintenance_rate";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_RATE)
  private String maintenanceRate;

  /**
   * Mark price type, internal - based on internal trading, index - based on external index price
   */
  @JsonAdapter(MarkTypeEnum.Adapter.class)
  public enum MarkTypeEnum {
    INTERNAL("internal"),
    
    INDEX("index");

    private String value;

    MarkTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MarkTypeEnum fromValue(String text) {
      for (MarkTypeEnum b : MarkTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<MarkTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MarkTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MarkTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MarkTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_MARK_TYPE = "mark_type";
  @SerializedName(SERIALIZED_NAME_MARK_TYPE)
  private MarkTypeEnum markType;

  public static final String SERIALIZED_NAME_MARK_PRICE = "mark_price";
  @SerializedName(SERIALIZED_NAME_MARK_PRICE)
  private String markPrice;

  public static final String SERIALIZED_NAME_INDEX_PRICE = "index_price";
  @SerializedName(SERIALIZED_NAME_INDEX_PRICE)
  private String indexPrice;

  public static final String SERIALIZED_NAME_LAST_PRICE = "last_price";
  @SerializedName(SERIALIZED_NAME_LAST_PRICE)
  private String lastPrice;

  public static final String SERIALIZED_NAME_MAKER_FEE_RATE = "maker_fee_rate";
  @SerializedName(SERIALIZED_NAME_MAKER_FEE_RATE)
  private String makerFeeRate;

  public static final String SERIALIZED_NAME_TAKER_FEE_RATE = "taker_fee_rate";
  @SerializedName(SERIALIZED_NAME_TAKER_FEE_RATE)
  private String takerFeeRate;

  public static final String SERIALIZED_NAME_ORDER_PRICE_ROUND = "order_price_round";
  @SerializedName(SERIALIZED_NAME_ORDER_PRICE_ROUND)
  private String orderPriceRound;

  public static final String SERIALIZED_NAME_MARK_PRICE_ROUND = "mark_price_round";
  @SerializedName(SERIALIZED_NAME_MARK_PRICE_ROUND)
  private String markPriceRound;

  public static final String SERIALIZED_NAME_FUNDING_RATE = "funding_rate";
  @SerializedName(SERIALIZED_NAME_FUNDING_RATE)
  private String fundingRate;

  public static final String SERIALIZED_NAME_FUNDING_INTERVAL = "funding_interval";
  @SerializedName(SERIALIZED_NAME_FUNDING_INTERVAL)
  private Integer fundingInterval;

  public static final String SERIALIZED_NAME_FUNDING_NEXT_APPLY = "funding_next_apply";
  @SerializedName(SERIALIZED_NAME_FUNDING_NEXT_APPLY)
  private BigDecimal fundingNextApply;

  public static final String SERIALIZED_NAME_RISK_LIMIT_BASE = "risk_limit_base";
  @SerializedName(SERIALIZED_NAME_RISK_LIMIT_BASE)
  private String riskLimitBase;

  public static final String SERIALIZED_NAME_RISK_LIMIT_STEP = "risk_limit_step";
  @SerializedName(SERIALIZED_NAME_RISK_LIMIT_STEP)
  private String riskLimitStep;

  public static final String SERIALIZED_NAME_RISK_LIMIT_MAX = "risk_limit_max";
  @SerializedName(SERIALIZED_NAME_RISK_LIMIT_MAX)
  private String riskLimitMax;

  public static final String SERIALIZED_NAME_ORDER_SIZE_MIN = "order_size_min";
  @SerializedName(SERIALIZED_NAME_ORDER_SIZE_MIN)
  private Long orderSizeMin;

  public static final String SERIALIZED_NAME_ORDER_SIZE_MAX = "order_size_max";
  @SerializedName(SERIALIZED_NAME_ORDER_SIZE_MAX)
  private Long orderSizeMax;

  public static final String SERIALIZED_NAME_ORDER_PRICE_DEVIATE = "order_price_deviate";
  @SerializedName(SERIALIZED_NAME_ORDER_PRICE_DEVIATE)
  private String orderPriceDeviate;

  public static final String SERIALIZED_NAME_ORDERBOOK_ID = "orderbook_id";
  @SerializedName(SERIALIZED_NAME_ORDERBOOK_ID)
  private Long orderbookId;

  public static final String SERIALIZED_NAME_TRADE_ID = "trade_id";
  @SerializedName(SERIALIZED_NAME_TRADE_ID)
  private Long tradeId;

  public static final String SERIALIZED_NAME_TRADE_SIZE = "trade_size";
  @SerializedName(SERIALIZED_NAME_TRADE_SIZE)
  private Long tradeSize;

  public static final String SERIALIZED_NAME_POSITION_SIZE = "position_size";
  @SerializedName(SERIALIZED_NAME_POSITION_SIZE)
  private Long positionSize;

  public static final String SERIALIZED_NAME_CONFIG_CHANGE_TIME = "config_change_time";
  @SerializedName(SERIALIZED_NAME_CONFIG_CHANGE_TIME)
  private BigDecimal configChangeTime;

  public Contract name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Futures contract name
   * @return name
  **/
  @ApiModelProperty(value = "Futures contract name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Contract type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Futures contract type
   * @return type
  **/
  @ApiModelProperty(value = "Futures contract type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Contract quantoMultiplier(String quantoMultiplier) {
    this.quantoMultiplier = quantoMultiplier;
    return this;
  }

   /**
   * Multiplier used in converting from invoicing to settlement currency in quanto futures
   * @return quantoMultiplier
  **/
  @ApiModelProperty(value = "Multiplier used in converting from invoicing to settlement currency in quanto futures")
  public String getQuantoMultiplier() {
    return quantoMultiplier;
  }

  public void setQuantoMultiplier(String quantoMultiplier) {
    this.quantoMultiplier = quantoMultiplier;
  }

  public Contract leverageMin(String leverageMin) {
    this.leverageMin = leverageMin;
    return this;
  }

   /**
   * Minimum leverage
   * @return leverageMin
  **/
  @ApiModelProperty(value = "Minimum leverage")
  public String getLeverageMin() {
    return leverageMin;
  }

  public void setLeverageMin(String leverageMin) {
    this.leverageMin = leverageMin;
  }

  public Contract leverageMax(String leverageMax) {
    this.leverageMax = leverageMax;
    return this;
  }

   /**
   * Maximum leverage
   * @return leverageMax
  **/
  @ApiModelProperty(value = "Maximum leverage")
  public String getLeverageMax() {
    return leverageMax;
  }

  public void setLeverageMax(String leverageMax) {
    this.leverageMax = leverageMax;
  }

  public Contract maintenanceRate(String maintenanceRate) {
    this.maintenanceRate = maintenanceRate;
    return this;
  }

   /**
   * Maintenance rate of margin
   * @return maintenanceRate
  **/
  @ApiModelProperty(value = "Maintenance rate of margin")
  public String getMaintenanceRate() {
    return maintenanceRate;
  }

  public void setMaintenanceRate(String maintenanceRate) {
    this.maintenanceRate = maintenanceRate;
  }

  public Contract markType(MarkTypeEnum markType) {
    this.markType = markType;
    return this;
  }

   /**
   * Mark price type, internal - based on internal trading, index - based on external index price
   * @return markType
  **/
  @ApiModelProperty(value = "Mark price type, internal - based on internal trading, index - based on external index price")
  public MarkTypeEnum getMarkType() {
    return markType;
  }

  public void setMarkType(MarkTypeEnum markType) {
    this.markType = markType;
  }

  public Contract markPrice(String markPrice) {
    this.markPrice = markPrice;
    return this;
  }

   /**
   * Current mark price
   * @return markPrice
  **/
  @ApiModelProperty(value = "Current mark price")
  public String getMarkPrice() {
    return markPrice;
  }

  public void setMarkPrice(String markPrice) {
    this.markPrice = markPrice;
  }

  public Contract indexPrice(String indexPrice) {
    this.indexPrice = indexPrice;
    return this;
  }

   /**
   * Current index price
   * @return indexPrice
  **/
  @ApiModelProperty(value = "Current index price")
  public String getIndexPrice() {
    return indexPrice;
  }

  public void setIndexPrice(String indexPrice) {
    this.indexPrice = indexPrice;
  }

  public Contract lastPrice(String lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }

   /**
   * Last trading price
   * @return lastPrice
  **/
  @ApiModelProperty(value = "Last trading price")
  public String getLastPrice() {
    return lastPrice;
  }

  public void setLastPrice(String lastPrice) {
    this.lastPrice = lastPrice;
  }

  public Contract makerFeeRate(String makerFeeRate) {
    this.makerFeeRate = makerFeeRate;
    return this;
  }

   /**
   * Maker fee rate, where negative means rebate
   * @return makerFeeRate
  **/
  @ApiModelProperty(value = "Maker fee rate, where negative means rebate")
  public String getMakerFeeRate() {
    return makerFeeRate;
  }

  public void setMakerFeeRate(String makerFeeRate) {
    this.makerFeeRate = makerFeeRate;
  }

  public Contract takerFeeRate(String takerFeeRate) {
    this.takerFeeRate = takerFeeRate;
    return this;
  }

   /**
   * Taker fee rate
   * @return takerFeeRate
  **/
  @ApiModelProperty(value = "Taker fee rate")
  public String getTakerFeeRate() {
    return takerFeeRate;
  }

  public void setTakerFeeRate(String takerFeeRate) {
    this.takerFeeRate = takerFeeRate;
  }

  public Contract orderPriceRound(String orderPriceRound) {
    this.orderPriceRound = orderPriceRound;
    return this;
  }

   /**
   * Minimum order price increment
   * @return orderPriceRound
  **/
  @ApiModelProperty(value = "Minimum order price increment")
  public String getOrderPriceRound() {
    return orderPriceRound;
  }

  public void setOrderPriceRound(String orderPriceRound) {
    this.orderPriceRound = orderPriceRound;
  }

  public Contract markPriceRound(String markPriceRound) {
    this.markPriceRound = markPriceRound;
    return this;
  }

   /**
   * Minimum mark price increment
   * @return markPriceRound
  **/
  @ApiModelProperty(value = "Minimum mark price increment")
  public String getMarkPriceRound() {
    return markPriceRound;
  }

  public void setMarkPriceRound(String markPriceRound) {
    this.markPriceRound = markPriceRound;
  }

  public Contract fundingRate(String fundingRate) {
    this.fundingRate = fundingRate;
    return this;
  }

   /**
   * Current funding rate
   * @return fundingRate
  **/
  @ApiModelProperty(value = "Current funding rate")
  public String getFundingRate() {
    return fundingRate;
  }

  public void setFundingRate(String fundingRate) {
    this.fundingRate = fundingRate;
  }

  public Contract fundingInterval(Integer fundingInterval) {
    this.fundingInterval = fundingInterval;
    return this;
  }

   /**
   * Funding application interval, unit in seconds
   * @return fundingInterval
  **/
  @ApiModelProperty(value = "Funding application interval, unit in seconds")
  public Integer getFundingInterval() {
    return fundingInterval;
  }

  public void setFundingInterval(Integer fundingInterval) {
    this.fundingInterval = fundingInterval;
  }

  public Contract fundingNextApply(BigDecimal fundingNextApply) {
    this.fundingNextApply = fundingNextApply;
    return this;
  }

   /**
   * Next funding time
   * @return fundingNextApply
  **/
  @ApiModelProperty(value = "Next funding time")
  public BigDecimal getFundingNextApply() {
    return fundingNextApply;
  }

  public void setFundingNextApply(BigDecimal fundingNextApply) {
    this.fundingNextApply = fundingNextApply;
  }

  public Contract riskLimitBase(String riskLimitBase) {
    this.riskLimitBase = riskLimitBase;
    return this;
  }

   /**
   * Risk limit base
   * @return riskLimitBase
  **/
  @ApiModelProperty(value = "Risk limit base")
  public String getRiskLimitBase() {
    return riskLimitBase;
  }

  public void setRiskLimitBase(String riskLimitBase) {
    this.riskLimitBase = riskLimitBase;
  }

  public Contract riskLimitStep(String riskLimitStep) {
    this.riskLimitStep = riskLimitStep;
    return this;
  }

   /**
   * Step of adjusting risk limit
   * @return riskLimitStep
  **/
  @ApiModelProperty(value = "Step of adjusting risk limit")
  public String getRiskLimitStep() {
    return riskLimitStep;
  }

  public void setRiskLimitStep(String riskLimitStep) {
    this.riskLimitStep = riskLimitStep;
  }

  public Contract riskLimitMax(String riskLimitMax) {
    this.riskLimitMax = riskLimitMax;
    return this;
  }

   /**
   * Maximum risk limit the contract allowed
   * @return riskLimitMax
  **/
  @ApiModelProperty(value = "Maximum risk limit the contract allowed")
  public String getRiskLimitMax() {
    return riskLimitMax;
  }

  public void setRiskLimitMax(String riskLimitMax) {
    this.riskLimitMax = riskLimitMax;
  }

  public Contract orderSizeMin(Long orderSizeMin) {
    this.orderSizeMin = orderSizeMin;
    return this;
  }

   /**
   * Minimum order size the contract allowed
   * @return orderSizeMin
  **/
  @ApiModelProperty(value = "Minimum order size the contract allowed")
  public Long getOrderSizeMin() {
    return orderSizeMin;
  }

  public void setOrderSizeMin(Long orderSizeMin) {
    this.orderSizeMin = orderSizeMin;
  }

  public Contract orderSizeMax(Long orderSizeMax) {
    this.orderSizeMax = orderSizeMax;
    return this;
  }

   /**
   * Maximum order size the contract allowed
   * @return orderSizeMax
  **/
  @ApiModelProperty(value = "Maximum order size the contract allowed")
  public Long getOrderSizeMax() {
    return orderSizeMax;
  }

  public void setOrderSizeMax(Long orderSizeMax) {
    this.orderSizeMax = orderSizeMax;
  }

  public Contract orderPriceDeviate(String orderPriceDeviate) {
    this.orderPriceDeviate = orderPriceDeviate;
    return this;
  }

   /**
   * deviation between order price and current index price. If price of an order is denoted as order_price, it must meet the following condition:      abs(order_price - mark_price) &lt;&#x3D; mark_price * order_price_deviate
   * @return orderPriceDeviate
  **/
  @ApiModelProperty(value = "deviation between order price and current index price. If price of an order is denoted as order_price, it must meet the following condition:      abs(order_price - mark_price) <= mark_price * order_price_deviate")
  public String getOrderPriceDeviate() {
    return orderPriceDeviate;
  }

  public void setOrderPriceDeviate(String orderPriceDeviate) {
    this.orderPriceDeviate = orderPriceDeviate;
  }

  public Contract orderbookId(Long orderbookId) {
    this.orderbookId = orderbookId;
    return this;
  }

   /**
   * Current orderbook ID
   * @return orderbookId
  **/
  @ApiModelProperty(value = "Current orderbook ID")
  public Long getOrderbookId() {
    return orderbookId;
  }

  public void setOrderbookId(Long orderbookId) {
    this.orderbookId = orderbookId;
  }

  public Contract tradeId(Long tradeId) {
    this.tradeId = tradeId;
    return this;
  }

   /**
   * Current trade ID
   * @return tradeId
  **/
  @ApiModelProperty(value = "Current trade ID")
  public Long getTradeId() {
    return tradeId;
  }

  public void setTradeId(Long tradeId) {
    this.tradeId = tradeId;
  }

  public Contract tradeSize(Long tradeSize) {
    this.tradeSize = tradeSize;
    return this;
  }

   /**
   * Historical accumulation trade size
   * @return tradeSize
  **/
  @ApiModelProperty(value = "Historical accumulation trade size")
  public Long getTradeSize() {
    return tradeSize;
  }

  public void setTradeSize(Long tradeSize) {
    this.tradeSize = tradeSize;
  }

  public Contract positionSize(Long positionSize) {
    this.positionSize = positionSize;
    return this;
  }

   /**
   * Current total long position size
   * @return positionSize
  **/
  @ApiModelProperty(value = "Current total long position size")
  public Long getPositionSize() {
    return positionSize;
  }

  public void setPositionSize(Long positionSize) {
    this.positionSize = positionSize;
  }

  public Contract configChangeTime(BigDecimal configChangeTime) {
    this.configChangeTime = configChangeTime;
    return this;
  }

   /**
   * Configuration&#39;s last changed time
   * @return configChangeTime
  **/
  @ApiModelProperty(value = "Configuration's last changed time")
  public BigDecimal getConfigChangeTime() {
    return configChangeTime;
  }

  public void setConfigChangeTime(BigDecimal configChangeTime) {
    this.configChangeTime = configChangeTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contract contract = (Contract) o;
    return Objects.equals(this.name, contract.name) &&
        Objects.equals(this.type, contract.type) &&
        Objects.equals(this.quantoMultiplier, contract.quantoMultiplier) &&
        Objects.equals(this.leverageMin, contract.leverageMin) &&
        Objects.equals(this.leverageMax, contract.leverageMax) &&
        Objects.equals(this.maintenanceRate, contract.maintenanceRate) &&
        Objects.equals(this.markType, contract.markType) &&
        Objects.equals(this.markPrice, contract.markPrice) &&
        Objects.equals(this.indexPrice, contract.indexPrice) &&
        Objects.equals(this.lastPrice, contract.lastPrice) &&
        Objects.equals(this.makerFeeRate, contract.makerFeeRate) &&
        Objects.equals(this.takerFeeRate, contract.takerFeeRate) &&
        Objects.equals(this.orderPriceRound, contract.orderPriceRound) &&
        Objects.equals(this.markPriceRound, contract.markPriceRound) &&
        Objects.equals(this.fundingRate, contract.fundingRate) &&
        Objects.equals(this.fundingInterval, contract.fundingInterval) &&
        Objects.equals(this.fundingNextApply, contract.fundingNextApply) &&
        Objects.equals(this.riskLimitBase, contract.riskLimitBase) &&
        Objects.equals(this.riskLimitStep, contract.riskLimitStep) &&
        Objects.equals(this.riskLimitMax, contract.riskLimitMax) &&
        Objects.equals(this.orderSizeMin, contract.orderSizeMin) &&
        Objects.equals(this.orderSizeMax, contract.orderSizeMax) &&
        Objects.equals(this.orderPriceDeviate, contract.orderPriceDeviate) &&
        Objects.equals(this.orderbookId, contract.orderbookId) &&
        Objects.equals(this.tradeId, contract.tradeId) &&
        Objects.equals(this.tradeSize, contract.tradeSize) &&
        Objects.equals(this.positionSize, contract.positionSize) &&
        Objects.equals(this.configChangeTime, contract.configChangeTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, quantoMultiplier, leverageMin, leverageMax, maintenanceRate, markType, markPrice, indexPrice, lastPrice, makerFeeRate, takerFeeRate, orderPriceRound, markPriceRound, fundingRate, fundingInterval, fundingNextApply, riskLimitBase, riskLimitStep, riskLimitMax, orderSizeMin, orderSizeMax, orderPriceDeviate, orderbookId, tradeId, tradeSize, positionSize, configChangeTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contract {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quantoMultiplier: ").append(toIndentedString(quantoMultiplier)).append("\n");
    sb.append("    leverageMin: ").append(toIndentedString(leverageMin)).append("\n");
    sb.append("    leverageMax: ").append(toIndentedString(leverageMax)).append("\n");
    sb.append("    maintenanceRate: ").append(toIndentedString(maintenanceRate)).append("\n");
    sb.append("    markType: ").append(toIndentedString(markType)).append("\n");
    sb.append("    markPrice: ").append(toIndentedString(markPrice)).append("\n");
    sb.append("    indexPrice: ").append(toIndentedString(indexPrice)).append("\n");
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    makerFeeRate: ").append(toIndentedString(makerFeeRate)).append("\n");
    sb.append("    takerFeeRate: ").append(toIndentedString(takerFeeRate)).append("\n");
    sb.append("    orderPriceRound: ").append(toIndentedString(orderPriceRound)).append("\n");
    sb.append("    markPriceRound: ").append(toIndentedString(markPriceRound)).append("\n");
    sb.append("    fundingRate: ").append(toIndentedString(fundingRate)).append("\n");
    sb.append("    fundingInterval: ").append(toIndentedString(fundingInterval)).append("\n");
    sb.append("    fundingNextApply: ").append(toIndentedString(fundingNextApply)).append("\n");
    sb.append("    riskLimitBase: ").append(toIndentedString(riskLimitBase)).append("\n");
    sb.append("    riskLimitStep: ").append(toIndentedString(riskLimitStep)).append("\n");
    sb.append("    riskLimitMax: ").append(toIndentedString(riskLimitMax)).append("\n");
    sb.append("    orderSizeMin: ").append(toIndentedString(orderSizeMin)).append("\n");
    sb.append("    orderSizeMax: ").append(toIndentedString(orderSizeMax)).append("\n");
    sb.append("    orderPriceDeviate: ").append(toIndentedString(orderPriceDeviate)).append("\n");
    sb.append("    orderbookId: ").append(toIndentedString(orderbookId)).append("\n");
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    tradeSize: ").append(toIndentedString(tradeSize)).append("\n");
    sb.append("    positionSize: ").append(toIndentedString(positionSize)).append("\n");
    sb.append("    configChangeTime: ").append(toIndentedString(configChangeTime)).append("\n");
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

