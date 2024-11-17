/*
 * Copyright 2023 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */
package com.linecorp.bot.insight.model;



import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AppTypeTile */
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record AppTypeTile(
    /** users&#39; OS */
    @JsonProperty("appType") AppType appType,
    /** Percentage */
    @JsonProperty("percentage") Double percentage) {

  /** users&#39; OS */
  public enum AppType {
    @JsonProperty("ios")
    IOS,
    @JsonProperty("android")
    ANDROID,
    @JsonProperty("others")
    OTHERS,

    @JsonEnumDefaultValue
    UNDEFINED;
  }

  public static class Builder {
    private AppType appType;
    private Double percentage;

    public Builder() {}

    public Builder appType(AppType appType) {
      this.appType = appType;
      return this;
    }

    public Builder percentage(Double percentage) {
      this.percentage = percentage;
      return this;
    }

    public AppTypeTile build() {
      return new AppTypeTile(appType, percentage);
    }
  }
}