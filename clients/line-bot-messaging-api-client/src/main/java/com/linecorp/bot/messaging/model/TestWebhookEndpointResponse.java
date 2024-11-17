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
package com.linecorp.bot.messaging.model;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * TestWebhookEndpointResponse
 *
 * @see <a href="https://developers.line.biz/en/reference/messaging-api/#test-webhook-endpoint">
 *     Documentation</a>
 */
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record TestWebhookEndpointResponse(
    /** Result of the communication from the LINE platform to the webhook URL. */
    @JsonProperty("success") Boolean success,
    /**
     * Time of the event in milliseconds. Even in the case of a redelivered webhook, it represents
     * the time the event occurred, not the time it was redelivered.
     */
    @JsonProperty("timestamp") OffsetDateTime timestamp,
    /**
     * The HTTP status code. If the webhook response isn&#39;t received, the status code is set to
     * zero or a negative number.
     */
    @JsonProperty("statusCode") Integer statusCode,
    /** Reason for the response. */
    @JsonProperty("reason") String reason,
    /** Details of the response. */
    @JsonProperty("detail") String detail) {

  public static class Builder {
    private Boolean success;
    private OffsetDateTime timestamp;
    private Integer statusCode;
    private String reason;
    private String detail;

    public Builder(OffsetDateTime timestamp, Integer statusCode, String reason, String detail) {

      this.timestamp = timestamp;

      this.statusCode = statusCode;

      this.reason = reason;

      this.detail = detail;
    }

    public Builder success(Boolean success) {
      this.success = success;
      return this;
    }

    public TestWebhookEndpointResponse build() {
      return new TestWebhookEndpointResponse(success, timestamp, statusCode, reason, detail);
    }
  }
}