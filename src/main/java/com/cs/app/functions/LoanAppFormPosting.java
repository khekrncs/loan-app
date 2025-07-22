/**
 * @author KK
 * @version 1.0
 */

package com.cs.app.functions;


import com.cs.app.client.HttpClientManager;
import com.cs.app.model.LoanInput;
import com.cs.app.model.LoanOutput;
import com.cs.app.utils.JsonUtils;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.Callable;

public class LoanAppFormPosting implements Callable<LoanOutput> {

    private static final String LOAN_APP_FORM_URL = "http://localhost:8080/application";

    private final LoanInput loanInput;

    public LoanAppFormPosting(LoanInput loanInput) {
        this.loanInput = loanInput;
    }

    @Override
    public LoanOutput call() throws Exception {
        //TODO

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(LOAN_APP_FORM_URL))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(loanInput.toString()))
                .build();

        HttpResponse<String> appFormResponse = HttpClientManager.getHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());

        return JsonUtils.fromJson(appFormResponse.body(), LoanOutput.class);
    }
}
