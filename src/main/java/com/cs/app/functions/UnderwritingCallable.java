/**
 * @author KK
 * @version 1.0
 */

package com.cs.app.functions;


import com.cs.app.client.HttpClientManager;
import com.cs.app.model.UnderwritingStatus;


import java.util.concurrent.Callable;

public class UnderwritingCallable implements Callable<UnderwritingStatus> {

    private static final String UNDERWRITING_URL = "http://localhost:8080/underwriting";

    private final String applicationId;

    public UnderwritingCallable(String applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public UnderwritingStatus call() throws Exception {
        //TODO
        return null;
    }
}
