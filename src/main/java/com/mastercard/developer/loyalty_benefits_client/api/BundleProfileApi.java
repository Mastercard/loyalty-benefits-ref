/*
 * Copyright (c) 2019 Mastercard
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 * Loyalty Benefits API
 * The Loyalty Benefits API provides benefits management including presentment and selection.  It also supports insurance certificate generation for insurance benefits that need certificates.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: loyalty-benefits-support@mastercard.flowdock.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.loyalty_benefits_client.api;

import com.mastercard.developer.loyalty_benefits_client.ApiCallback;
import com.mastercard.developer.loyalty_benefits_client.ApiClient;
import com.mastercard.developer.loyalty_benefits_client.ApiException;
import com.mastercard.developer.loyalty_benefits_client.ApiResponse;
import com.mastercard.developer.loyalty_benefits_client.Configuration;
import com.mastercard.developer.loyalty_benefits_client.Pair;
import com.mastercard.developer.loyalty_benefits_client.ProgressRequestBody;
import com.mastercard.developer.loyalty_benefits_client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.mastercard.developer.loyalty_benefits_client.model.BundleUser;
import com.mastercard.developer.loyalty_benefits_client.model.BundleUserResponse;
import com.mastercard.developer.loyalty_benefits_client.model.Errors;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BundleProfileApi {
    private ApiClient apiClient;

    public BundleProfileApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BundleProfileApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createUser
     * @param bundleUser Bundle Profile body (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createUserCall(BundleUser bundleUser, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = bundleUser;

        // create path and map variables
        String localVarPath = "/bundle/profile/benefits/reference/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createUserValidateBeforeCall(BundleUser bundleUser, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'bundleUser' is set
        if (bundleUser == null) {
            throw new ApiException("Missing the required parameter 'bundleUser' when calling createUser(Async)");
        }
        

        com.squareup.okhttp.Call call = createUserCall(bundleUser, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Profile
     * Create Profile user and associated product service(s) consents and card account(s)
     * @param bundleUser Bundle Profile body (required)
     * @return BundleUserResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BundleUserResponse createUser(BundleUser bundleUser) throws ApiException {
        ApiResponse<BundleUserResponse> resp = createUserWithHttpInfo(bundleUser);
        return resp.getData();
    }

    /**
     * Create Profile
     * Create Profile user and associated product service(s) consents and card account(s)
     * @param bundleUser Bundle Profile body (required)
     * @return ApiResponse&lt;BundleUserResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BundleUserResponse> createUserWithHttpInfo(BundleUser bundleUser) throws ApiException {
        com.squareup.okhttp.Call call = createUserValidateBeforeCall(bundleUser, null, null);
        Type localVarReturnType = new TypeToken<BundleUserResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Profile (asynchronously)
     * Create Profile user and associated product service(s) consents and card account(s)
     * @param bundleUser Bundle Profile body (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createUserAsync(BundleUser bundleUser, final ApiCallback<BundleUserResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createUserValidateBeforeCall(bundleUser, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BundleUserResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
