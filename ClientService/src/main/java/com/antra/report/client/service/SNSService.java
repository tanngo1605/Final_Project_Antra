package com.antra.report.client.service;

import com.antra.report.client.pojo.request.DeleteReportRequest;
import com.antra.report.client.pojo.request.ReportRequest;

public interface SNSService {
    void sendReportNotification(ReportRequest request);
    void sendDeleteReportNotification(DeleteReportRequest req);
}
