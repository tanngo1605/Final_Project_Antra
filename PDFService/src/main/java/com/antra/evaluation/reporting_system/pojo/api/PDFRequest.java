package com.antra.evaluation.reporting_system.pojo.api;

import java.util.List;

public class PDFRequest {
    private String reqId;
    private List<String> headers;
    private String description;
    private List<List<String>> data;
    private String submitter;
    private RequestMethods requestMethod;
    private String pdfFileId;

    public String getReqId() {
        return reqId;
    }

    public String getPdfFileId() {
        return pdfFileId;
    }

    public void setPdfFileId(String pdfFileId) {
        this.pdfFileId = pdfFileId;
    }

    public RequestMethods getRequestMethod() {
        return requestMethod;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getHeaders() {
        return headers;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public List<List<String>> getData() {
        return data;
    }

    public void setData(List<List<String>> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PDFRequest [data=" + data + ", description=" + description + ", headers=" + headers + ", pdfFileId="
                + pdfFileId + ", reqId=" + reqId + ", requestMethod=" + requestMethod + ", submitter=" + submitter
                + "]";
    }

}
