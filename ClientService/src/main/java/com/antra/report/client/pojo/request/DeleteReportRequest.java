package com.antra.report.client.pojo.request;

import javax.validation.constraints.NotBlank;

public class DeleteReportRequest {
    @NotBlank
    private String reqId;

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }
    
    
}
