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

import Invokers.ApiException;
import org.joda.time.DateTime;
import Model.PtsV1TransactionBatchesGet200Response;
import Model.PtsV1TransactionBatchesGet400Response;
import Model.PtsV1TransactionBatchesGet500Response;
import Model.PtsV1TransactionBatchesIdGet200Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionBatchesApi
 */
@Ignore
public class TransactionBatchesApiTest {

    private final TransactionBatchesApi api = new TransactionBatchesApi();

    
    /**
     * Get individual batch file
     *
     * Provide the search range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionBatchIdTest() throws ApiException {
        String id = null;
        PtsV1TransactionBatchesIdGet200Response response = api.getTransactionBatchId(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of batch files
     *
     * Provide the search range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionBatchesTest() throws ApiException {
        DateTime startTime = null;
        DateTime endTime = null;
        PtsV1TransactionBatchesGet200Response response = api.getTransactionBatches(startTime, endTime);

        // TODO: test validations
    }
    
}
