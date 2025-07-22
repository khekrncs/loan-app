/**
 * @author KK
 * @version 1.0
 */

package com.cs.app;

import com.cs.app.model.LoanDecisionResult;
import com.cs.app.model.LoanInput;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoanApprovalService {

    private final ExecutorService virtualExecutor = Executors.newVirtualThreadPerTaskExecutor();

    public LoanDecisionResult processLoanApplication(LoanInput loanInput) {
        //TODO
        return null;
    }

    private void printDecisionResult(LoanDecisionResult result) {
        System.out.printf("  👤 Applicant: %s%n", result.applicantName());
        System.out.printf("  🆔 Application ID: %s%n", result.applicationId());
        System.out.printf("  📊 Underwriting: %s%n", result.underwritingStatus());
        System.out.printf("  🆔 KYC: %s%n", result.kycStatus());
        System.out.printf("  🎯 FINAL STATUS: %s%n", result.finalStatus());
        System.out.printf("  💭 Reason: %s%n", result.reason());
        System.out.println("-" + "-".repeat(80));
    }

    private void shutdownExecutor() {
        virtualExecutor.shutdown();
    }

    public static void main(String[] args) {

    }
}
