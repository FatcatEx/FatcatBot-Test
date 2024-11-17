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
package com.linecorp.bot.oauth.client;

import com.linecorp.bot.client.base.ApiClientBuilder;
import com.linecorp.bot.client.base.Result;
import com.linecorp.bot.oauth.model.ChannelAccessTokenKeyIdsResponse;
import com.linecorp.bot.oauth.model.IssueChannelAccessTokenResponse;
import com.linecorp.bot.oauth.model.IssueShortLivedChannelAccessTokenResponse;
import com.linecorp.bot.oauth.model.IssueStatelessChannelAccessTokenResponse;
import com.linecorp.bot.oauth.model.VerifyChannelAccessTokenResponse;
import java.net.URI;
import java.util.concurrent.CompletableFuture;
import retrofit2.http.*;

@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public interface ChannelAccessTokenClient {

  /**
   * Gets all valid channel access token key IDs.
   *
   * @param clientAssertionType &#x60;urn:ietf:params:oauth:client-assertion-type:jwt-bearer&#x60;
   *     (required)
   * @param clientAssertion A JSON Web Token (JWT) (opens new window)the client needs to create and
   *     sign with the private key. (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#get-all-valid-channel-access-token-key-ids-v2-1">
   *     Documentation</a>
   */
  @GET("/oauth2/v2.1/tokens/kid")
  CompletableFuture<Result<ChannelAccessTokenKeyIdsResponse>> getsAllValidChannelAccessTokenKeyIds(
      @Query("client_assertion_type") String clientAssertionType,
      @Query("client_assertion") String clientAssertion);

  /**
   * Issue short-lived channel access token
   *
   * @param grantType &#x60;client_credentials&#x60; (required)
   * @param clientId Channel ID. (required)
   * @param clientSecret Channel secret. (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#issue-shortlived-channel-access-token">
   *     Documentation</a>
   */
  @POST("/v2/oauth/accessToken")
  @FormUrlEncoded
  CompletableFuture<Result<IssueShortLivedChannelAccessTokenResponse>> issueChannelToken(
      @Field("grant_type") String grantType,
      @Field("client_id") String clientId,
      @Field("client_secret") String clientSecret);

  /**
   * Issues a channel access token that allows you to specify a desired expiration date. This method
   * lets you use JWT assertion for authentication.
   *
   * @param grantType client_credentials (required)
   * @param clientAssertionType urn:ietf:params:oauth:client-assertion-type:jwt-bearer (required)
   * @param clientAssertion A JSON Web Token the client needs to create and sign with the private
   *     key of the Assertion Signing Key. (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#issue-channel-access-token-v2-1">
   *     Documentation</a>
   */
  @POST("/oauth2/v2.1/token")
  @FormUrlEncoded
  CompletableFuture<Result<IssueChannelAccessTokenResponse>> issueChannelTokenByJWT(
      @Field("grant_type") String grantType,
      @Field("client_assertion_type") String clientAssertionType,
      @Field("client_assertion") String clientAssertion);

  /**
   * Issues a new stateless channel access token, which doesn&#39;t have max active token limit
   * unlike the other token types. The newly issued token is only valid for 15 minutes but can not
   * be revoked until it naturally expires.
   *
   * @param grantType &#x60;client_credentials&#x60; (optional)
   * @param clientAssertionType URL-encoded value of
   *     &#x60;urn:ietf:params:oauth:client-assertion-type:jwt-bearer&#x60; (optional)
   * @param clientAssertion A JSON Web Token the client needs to create and sign with the private
   *     key of the Assertion Signing Key. (optional)
   * @param clientId Channel ID. (optional)
   * @param clientSecret Channel secret. (optional)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#issue-stateless-channel-access-token">
   *     Documentation</a>
   */
  @POST("/oauth2/v3/token")
  @FormUrlEncoded
  CompletableFuture<Result<IssueStatelessChannelAccessTokenResponse>> issueStatelessChannelToken(
      @Field("grant_type") String grantType,
      @Field("client_assertion_type") String clientAssertionType,
      @Field("client_assertion") String clientAssertion,
      @Field("client_id") String clientId,
      @Field("client_secret") String clientSecret);

  /**
   * Revoke short-lived or long-lived channel access token
   *
   * @param accessToken Channel access token (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#revoke-longlived-or-shortlived-channel-access-token">
   *     Documentation</a>
   */
  @POST("/v2/oauth/revoke")
  @FormUrlEncoded
  CompletableFuture<Result<Void>> revokeChannelToken(@Field("access_token") String accessToken);

  /**
   * Revoke channel access token v2.1
   *
   * @param clientId Channel ID (required)
   * @param clientSecret Channel Secret (required)
   * @param accessToken Channel access token (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#revoke-channel-access-token-v2-1">
   *     Documentation</a>
   */
  @POST("/oauth2/v2.1/revoke")
  @FormUrlEncoded
  CompletableFuture<Result<Void>> revokeChannelTokenByJWT(
      @Field("client_id") String clientId,
      @Field("client_secret") String clientSecret,
      @Field("access_token") String accessToken);

  /**
   * Verify the validity of short-lived and long-lived channel access tokens
   *
   * @param accessToken A short-lived or long-lived channel access token. (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#verify-channel-access-token">
   *     Documentation</a>
   */
  @POST("/v2/oauth/verify")
  @FormUrlEncoded
  CompletableFuture<Result<VerifyChannelAccessTokenResponse>> verifyChannelToken(
      @Field("access_token") String accessToken);

  /**
   * You can verify whether a Channel access token with a user-specified expiration (Channel Access
   * Token v2.1) is valid.
   *
   * @param accessToken Channel access token with a user-specified expiration (Channel Access Token
   *     v2.1). (required)
   * @see <a
   *     href="https://developers.line.biz/en/reference/messaging-api/#verify-channel-access-token-v2-1">
   *     Documentation</a>
   */
  @GET("/oauth2/v2.1/verify")
  CompletableFuture<Result<VerifyChannelAccessTokenResponse>> verifyChannelTokenByJWT(
      @Query("access_token") String accessToken);

  public static ApiClientBuilder<ChannelAccessTokenClient> builder() {
    return new ApiClientBuilder<>(
        URI.create("https://api.line.me"),
        ChannelAccessTokenClient.class,
        new ChannelAccessTokenExceptionBuilder());
  }
}