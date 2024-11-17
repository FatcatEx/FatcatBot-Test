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

/**
 * CreateRichMenuAliasRequest
 *
 * @see <a href="https://developers.line.biz/en/reference/messaging-api/#create-rich-menu-alias">
 *     Documentation</a>
 */
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record CreateRichMenuAliasRequest(
    /** Rich menu alias ID, which can be any ID, unique for each channel. */
    @JsonProperty("richMenuAliasId") String richMenuAliasId,
    /** The rich menu ID to be associated with the rich menu alias. */
    @JsonProperty("richMenuId") String richMenuId) {

  public static class Builder {
    private String richMenuAliasId;
    private String richMenuId;

    public Builder(String richMenuAliasId, String richMenuId) {

      this.richMenuAliasId = richMenuAliasId;

      this.richMenuId = richMenuId;
    }

    public CreateRichMenuAliasRequest build() {
      return new CreateRichMenuAliasRequest(richMenuAliasId, richMenuId);
    }
  }
}