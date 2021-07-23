package com.antra.report.client.pojo.request;

import javax.validation.constraints.NotBlank;

public class DeleteReportRequest {
    @NotBlank
    private String reqId;

    private RequestMethods requestMethod = RequestMethods.DELETE;
    // private String requestMethod = "DELETE";

    public String getReqId() {
        return reqId;
    }

    public RequestMethods getRequestMethod() {
        return requestMethod;
    }

    // public String getRequestMethod() {
    //     return requestMethod;
    // }

}
