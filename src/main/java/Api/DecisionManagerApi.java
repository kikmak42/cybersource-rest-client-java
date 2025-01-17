/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import Model.CreateDecisionManagerCaseRequest;
import Model.PtsV2PaymentsPost502Response;
import Model.RiskV1DecisionsPost201Response;
import Model.RiskV1DecisionsPost400Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecisionManagerApi {
    private ApiClient apiClient;

    public DecisionManagerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DecisionManagerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createDecisionManagerCase
     * @param createDecisionManagerCaseRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDecisionManagerCaseCall(CreateDecisionManagerCaseRequest createDecisionManagerCaseRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createDecisionManagerCaseRequest;
        
        // create path and map variables
        String localVarPath = "/risk/v1/decisions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createDecisionManagerCaseValidateBeforeCall(CreateDecisionManagerCaseRequest createDecisionManagerCaseRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'createDecisionManagerCaseRequest' is set
        if (createDecisionManagerCaseRequest == null) {
            throw new ApiException("Missing the required parameter 'createDecisionManagerCaseRequest' when calling createDecisionManagerCase(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createDecisionManagerCaseCall(createDecisionManagerCaseRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Decision Manager case
     * This is the combined request to the Decision Manager Service for a transaction sent to Cybersource. Decision Manager will return a decision based on the request values. 
     * @param createDecisionManagerCaseRequest  (required)
     * @return RiskV1DecisionsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RiskV1DecisionsPost201Response createDecisionManagerCase(CreateDecisionManagerCaseRequest createDecisionManagerCaseRequest) throws ApiException {
        ApiResponse<RiskV1DecisionsPost201Response> resp = createDecisionManagerCaseWithHttpInfo(createDecisionManagerCaseRequest);
        return resp.getData();
    }

    /**
     * Create Decision Manager case
     * This is the combined request to the Decision Manager Service for a transaction sent to Cybersource. Decision Manager will return a decision based on the request values. 
     * @param createDecisionManagerCaseRequest  (required)
     * @return ApiResponse&lt;RiskV1DecisionsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RiskV1DecisionsPost201Response> createDecisionManagerCaseWithHttpInfo(CreateDecisionManagerCaseRequest createDecisionManagerCaseRequest) throws ApiException {
        com.squareup.okhttp.Call call = createDecisionManagerCaseValidateBeforeCall(createDecisionManagerCaseRequest, null, null);
        Type localVarReturnType = new TypeToken<RiskV1DecisionsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Decision Manager case (asynchronously)
     * This is the combined request to the Decision Manager Service for a transaction sent to Cybersource. Decision Manager will return a decision based on the request values. 
     * @param createDecisionManagerCaseRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDecisionManagerCaseAsync(CreateDecisionManagerCaseRequest createDecisionManagerCaseRequest, final ApiCallback<RiskV1DecisionsPost201Response> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createDecisionManagerCaseValidateBeforeCall(createDecisionManagerCaseRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RiskV1DecisionsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
