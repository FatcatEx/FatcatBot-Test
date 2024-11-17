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



import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** FlexButton */
@JsonTypeName("button")
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record FlexButton(
    /** Get flex */
    @JsonProperty("flex") Integer flex,
    /** Get color */
    @JsonProperty("color") String color,
    /** Get style */
    @JsonProperty("style") Style style,
    /** Get action */
    @JsonProperty("action") Action action,
    /** Get gravity */
    @JsonProperty("gravity") Gravity gravity,
    /** Get margin */
    @JsonProperty("margin") String margin,
    /** Get position */
    @JsonProperty("position") Position position,
    /** Get offsetTop */
    @JsonProperty("offsetTop") String offsetTop,
    /** Get offsetBottom */
    @JsonProperty("offsetBottom") String offsetBottom,
    /** Get offsetStart */
    @JsonProperty("offsetStart") String offsetStart,
    /** Get offsetEnd */
    @JsonProperty("offsetEnd") String offsetEnd,
    /** Get height */
    @JsonProperty("height") Height height,
    /** Get adjustMode */
    @JsonProperty("adjustMode") AdjustMode adjustMode,
    /** Get scaling */
    @JsonProperty("scaling") Boolean scaling)
    implements FlexComponent {
  /** Gets or Sets style */
  public enum Style {
    @JsonProperty("primary")
    PRIMARY,
    @JsonProperty("secondary")
    SECONDARY,
    @JsonProperty("link")
    LINK,

    @JsonEnumDefaultValue
    UNDEFINED;
  }

  /** Gets or Sets gravity */
  public enum Gravity {
    @JsonProperty("top")
    TOP,
    @JsonProperty("bottom")
    BOTTOM,
    @JsonProperty("center")
    CENTER,

    @JsonEnumDefaultValue
    UNDEFINED;
  }

  /** Gets or Sets position */
  public enum Position {
    @JsonProperty("relative")
    RELATIVE,
    @JsonProperty("absolute")
    ABSOLUTE,

    @JsonEnumDefaultValue
    UNDEFINED;
  }

  /** Gets or Sets height */
  public enum Height {
    @JsonProperty("md")
    MD,
    @JsonProperty("sm")
    SM,

    @JsonEnumDefaultValue
    UNDEFINED;
  }

  /** Gets or Sets adjustMode */
  public enum AdjustMode {
    @JsonProperty("shrink-to-fit")
    SHRINK_TO_FIT,

    @JsonEnumDefaultValue
    UNDEFINED;
  }

  public static class Builder {
    private Integer flex;
    private String color;
    private Style style;
    private Action action;
    private Gravity gravity;
    private String margin;
    private Position position;
    private String offsetTop;
    private String offsetBottom;
    private String offsetStart;
    private String offsetEnd;
    private Height height;
    private AdjustMode adjustMode;
    private Boolean scaling;

    public Builder(Action action) {

      this.action = action;
    }

    public Builder flex(Integer flex) {
      this.flex = flex;
      return this;
    }

    public Builder color(String color) {
      this.color = color;
      return this;
    }

    public Builder style(Style style) {
      this.style = style;
      return this;
    }

    public Builder gravity(Gravity gravity) {
      this.gravity = gravity;
      return this;
    }

    public Builder margin(String margin) {
      this.margin = margin;
      return this;
    }

    public Builder position(Position position) {
      this.position = position;
      return this;
    }

    public Builder offsetTop(String offsetTop) {
      this.offsetTop = offsetTop;
      return this;
    }

    public Builder offsetBottom(String offsetBottom) {
      this.offsetBottom = offsetBottom;
      return this;
    }

    public Builder offsetStart(String offsetStart) {
      this.offsetStart = offsetStart;
      return this;
    }

    public Builder offsetEnd(String offsetEnd) {
      this.offsetEnd = offsetEnd;
      return this;
    }

    public Builder height(Height height) {
      this.height = height;
      return this;
    }

    public Builder adjustMode(AdjustMode adjustMode) {
      this.adjustMode = adjustMode;
      return this;
    }

    public Builder scaling(Boolean scaling) {
      this.scaling = scaling;
      return this;
    }

    public FlexButton build() {
      return new FlexButton(
          flex,
          color,
          style,
          action,
          gravity,
          margin,
          position,
          offsetTop,
          offsetBottom,
          offsetStart,
          offsetEnd,
          height,
          adjustMode,
          scaling);
    }
  }
}