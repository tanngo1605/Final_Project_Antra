package com.antra.report.client.pojo.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;

public class DeleteReportRequest {
    @NotBlank
    private String reqId;

    /*
     * @NotBlank private String excelFileId, pdfFileId;
     */
    private String excelFileId;
    private String pdfFileId;

    private RequestMethods requestMethod = RequestMethods.DELETE;
    // private String requestMethod = "DELETE";

    public String getReqId() {
        return reqId;
    }

    public String getPdfFileId() {
        return pdfFileId;
    }

    public void setPdfFileId(String pdfFileId) {
        this.pdfFileId = pdfFileId;
    }

    public String getExcelFileId() {
        return excelFileId;
    }

    public void setExcelFileId(String excelFileId) {
        this.excelFileId = excelFileId;
    }

    public RequestMethods getRequestMethod() {
        return requestMethod;
    }

    // public String getRequestMethod() {
    // return requestMethod;
    // }

}
