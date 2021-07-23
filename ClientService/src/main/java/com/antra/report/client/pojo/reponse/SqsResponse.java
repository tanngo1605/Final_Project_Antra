package com.antra.report.client.pojo.reponse;

import com.antra.report.client.pojo.request.RequestMethods;

public class SqsResponse {
    private String fileId;
    private String reqId;
    private String fileLocation;
    private long fileSize;
    private boolean failed;
    private RequestMethods requestMethod;

    public String getFileId() {
        return fileId;
    }

    public RequestMethods getRequestMethod() {
        return requestMethod;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public boolean isFailed() {
        return failed;
    }

    public void setFailed(boolean failed) {
        this.failed = failed;
    }

    @Override
    public String toString() {
        return "SqsResponse [failed=" + failed + ", fileId=" + fileId + ", fileLocation=" + fileLocation + ", fileSize="
                + fileSize + ", reqId=" + reqId + ", requestMethod=" + requestMethod + "]";
    }

}
