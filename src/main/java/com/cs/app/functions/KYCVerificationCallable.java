/**
 * @author KK
 * @version 1.0
 */

package com.cs.app.functions;


import com.cs.app.model.KYCStatus;

import java.util.concurrent.Callable;

public class KYCVerificationCallable implements Callable<KYCStatus> {

    private static final String KYC_URL = "http://localhost:8080/kyc";

    private final String applicationId;

    public KYCVerificationCallable(String applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public KYCStatus call() throws Exception {
        // TODO
        return null;
    }
}
