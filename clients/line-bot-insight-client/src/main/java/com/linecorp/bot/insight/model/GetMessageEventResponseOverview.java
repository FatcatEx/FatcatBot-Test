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



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Summary of message statistics. */
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record GetMessageEventResponseOverview(
    /** Request ID. */
    @JsonProperty("requestId") String requestId,
    /** UNIX timestamp for message delivery time in seconds. */
    @JsonProperty("timestamp") Long timestamp,
    /**
     * Number of messages delivered. This property shows values of less than 20. However, if all
     * messages have not been sent, it will be null.
     */
    @JsonProperty("delivered") Long delivered,
    /** Number of users who opened the message, meaning they displayed at least 1 bubble. */
    @JsonProperty("uniqueImpression") Long uniqueImpression,
    /** Number of users who opened any URL in the message. */
    @JsonProperty("uniqueClick") Long uniqueClick,
    /** Number of users who started playing any video or audio in the message. */
    @JsonProperty("uniqueMediaPlayed") Long uniqueMediaPlayed,
    /** Number of users who played the entirety of any video or audio in the message. */
    @JsonProperty("uniqueMediaPlayed100Percent") Long uniqueMediaPlayed100Percent) {

  public static class Builder {
    private String requestId;
    private Long timestamp;
    private Long delivered;
    private Long uniqueImpression;
    private Long uniqueClick;
    private Long uniqueMediaPlayed;
    private Long uniqueMediaPlayed100Percent;

    public Builder() {}

    public Builder requestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    public Builder timestamp(Long timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    public Builder delivered(Long delivered) {
      this.delivered = delivered;
      return this;
    }

    public Builder uniqueImpression(Long uniqueImpression) {
      this.uniqueImpression = uniqueImpression;
      return this;
    }

    public Builder uniqueClick(Long uniqueClick) {
      this.uniqueClick = uniqueClick;
      return this;
    }

    public Builder uniqueMediaPlayed(Long uniqueMediaPlayed) {
      this.uniqueMediaPlayed = uniqueMediaPlayed;
      return this;
    }

    public Builder uniqueMediaPlayed100Percent(Long uniqueMediaPlayed100Percent) {
      this.uniqueMediaPlayed100Percent = uniqueMediaPlayed100Percent;
      return this;
    }

    public GetMessageEventResponseOverview build() {
      return new GetMessageEventResponseOverview(
          requestId,
          timestamp,
          delivered,
          uniqueImpression,
          uniqueClick,
          uniqueMediaPlayed,
          uniqueMediaPlayed100Percent);
    }
  }
}