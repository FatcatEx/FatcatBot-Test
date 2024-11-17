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
package com.linecorp.bot.liff.model;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LiffFeatures */
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record LiffFeatures(
    /**
     * &#x60;true&#x60; if the LIFF app supports Bluetooth® Low Energy for LINE Things.
     * &#x60;false&#x60; otherwise.
     */
    @JsonProperty("ble") Boolean ble,
    /**
     * &#x60;true&#x60; to use the 2D code reader in the LIFF app. false otherwise. The default
     * value is &#x60;false&#x60;.
     */
    @JsonProperty("qrCode") Boolean qrCode) {

  public static class Builder {
    private Boolean ble;
    private Boolean qrCode;

    public Builder() {}

    public Builder ble(Boolean ble) {
      this.ble = ble;
      return this;
    }

    public Builder qrCode(Boolean qrCode) {
      this.qrCode = qrCode;
      return this;
    }

    public LiffFeatures build() {
      return new LiffFeatures(ble, qrCode);
    }
  }
}