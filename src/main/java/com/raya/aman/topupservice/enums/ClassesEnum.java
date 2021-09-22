package com.raya.aman.topupservice.enums;

public enum ClassesEnum {
	BILL_INQ_RES("com.paymentplaform.raya.gate.inq.BillsInquiryResponseType",
			"BillsInquiry", "getBillInquiryResponse", "setBillInquiryResponse"), BILL_PAY_RES(
			"com.paymentplaform.raya.gate.init.InitPaymentResponseType",
			"InitPayment", "getInitPaymentResponse", "setInitPaymentResponse"), TRANSFER_MOB(
			"com.paymentplaform.raya.gate.init.InitPaymentResponseType",
			"TransferMob", "getInitPaymentResponse", "setInitPaymentResponse"), CHANGE_PROF(
			"com.paymentplaform.raya.gate.change.ChangeProfileResponseType",
			"ChangeProfile", "getChangeProfileResponse",
			"setChangeProfileResponse"), ACTIVATE(
			"com.paymentplaform.raya.gate.activate.ActivateResponseType",
			"Activate", "getActivateResponse", "setActivateResponse"), SEARCH_TRX(
			"com.paymentplaform.raya.gate.search.SearchTransactionsResponseType",
			"SearchTransactions", "getSearchTransactionsResponse",
			"setSearchTransactionsResponse"), BALANCE_INQ(
			"com.paymentplaform.raya.gate.balance.InquiryBalanceResponseType",
			"InquireBalance", "getInquiryBalanceResponse",
			"setInquiryBalanceResponse"), LOAD_SERVICE(
			"com.paymentplaform.raya.gate.services.LoadServiceDirectoryResponseType",
			"ServiceDirectory", "getLoadServiceDirectoryResponse",
			"setLoadServiceDirectoryResponse"), DAILY_SUMM_SHEET(
			"com.paymentplaform.raya.gate.summary.DailySummaryResponseType",
			"DailySummaryInquiry", "getDailySummaryResponse",
			"setDailySummaryResponse"), Service_Directory_Pagination(
			"com.paymentplaform.raya.gate.pagservice.LoadSDPaginationResponseType",
			"ServiceDirectoryPagination", "getLoadSDPaginationResponse",
			"setLoadSDPaginationResponse"), CALCULATE_FEE(
			"com.paymentplaform.raya.gate.fee.FeeResponseType", "CalculateFee",
			"getFeeResponse", "setFeeResponse"), REVERSE_PAYMENT(
			"com.paymentplaform.raya.gate.rev.ReversePaymentResponseType",
			"ReversePayment", "getReversePaymentResponse",
			"setReversePaymentResponse");
	String clazz;
	String operation;
	String methodResponse;
	String methodReq;

	public String getMethodReq() {
		return methodReq;
	}

	public String getMethodResponse() {
		return methodResponse;
	}

	public String getClazz() {
		return clazz;
	}

	public String getOperation() {
		return operation;
	}

	ClassesEnum(String clazz, String opertion, String methodRes,
			String methodReq) {
		this.clazz = clazz;
		this.operation = opertion;
		this.methodResponse = methodRes;
		this.methodReq = methodReq;
	}

	public static ClassesEnum getClassName(String op) {

		for (ClassesEnum classesEnum : ClassesEnum.values()) {
			if (classesEnum.getOperation().equals(op))
				return classesEnum;
		}
		return null;
	}

	public static String getResMethod(String op) {

		for (ClassesEnum classesEnum : ClassesEnum.values()) {
			if (classesEnum.getOperation().equals(op))
				return classesEnum.methodResponse;
		}
		return null;
	}

}
