# ReversalApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authReversal**](ReversalApi.md#authReversal) | **POST** /pts/v2/payments/{id}/reversals | Process an Authorization Reversal


<a name="authReversal"></a>
# **authReversal**
> PtsV2PaymentsReversalsPost201Response authReversal(id, authReversalRequest)

Process an Authorization Reversal

Include the payment ID in the POST request to reverse the payment amount.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReversalApi;


ReversalApi apiInstance = new ReversalApi();
String id = "id_example"; // String | The payment ID returned from a previous payment request.
AuthReversalRequest authReversalRequest = new AuthReversalRequest(); // AuthReversalRequest | 
try {
    PtsV2PaymentsReversalsPost201Response result = apiInstance.authReversal(id, authReversalRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReversalApi#authReversal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The payment ID returned from a previous payment request. |
 **authReversalRequest** | [**AuthReversalRequest**](AuthReversalRequest.md)|  |

### Return type

[**PtsV2PaymentsReversalsPost201Response**](PtsV2PaymentsReversalsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

