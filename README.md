# loan-app
Loan Application Service

We'll build a complete loan processing system with 3 main APIs:

1. **Submit Application** - Accept loan applications
2. **Underwriting Check** - Credit score evaluation
3. **KYC Check** - Identity verification

Each API will demonstrate different aspects of multithreading and concurrency.

## API 1: Submit Application

- **Method**: POST
- **Path**: `/application`
- **Purpose**: Accept and store loan applications

**Request:**

```json
{
  "name": "Rajesh Kumar",
  "amount": "100000"
}
```

**Response:**

```json
{
  "status": "accepted",
  "id": "032423423-23423423-234234234"
}
```

**Key Features:**

- Generates unique application ID
- Stores application in memory map
- Thread-safe application submission

## API 2: Underwriting Check

- **Method**: GET
- **Path**: `/underwriting?id=032423423-23423423-234234234`
- **Purpose**: Evaluate loan eligibility based on credit score

**Response (Approved):**

```json
{
  "status": "approved"
}
```

**Response (Rejected):**

```json
{
  "status": "rejected"
}
```

**Business Logic:**

- Random credit score generation (600-850)
- Score < 700 = rejected
- Score ≥ 700 = approved
- Validates application ID exists

## API 3: KYC Check
- **Method**: GET
- **Path**: `/kyc?id=032423423-23423423-234234234`
- **Purpose**: Verify customer identity and compliance

**Response (Approved):**

```json
{
  "status": "approved"
}
```

**Response (Rejected):**

```json
{
  "status": "rejected"
}
```

**Business Logic:**

- Random boolean generation (true/false)
- Simulates identity verification process
- Validates application ID exists
- Returns 404 if application not found

## TODO
- Complete LoanAppFormPosting, UnderwritingCallable and KYCVerificationCallable implementation
- In `LoanApprovalService` you need to complete the  `processLoanApplication` function


# Steps to run the local server

- Clone this repo
- `chmod +x local-server/main`
- `./main`

