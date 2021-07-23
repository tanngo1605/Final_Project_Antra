package com.antra.report.client.service;

import com.antra.report.client.pojo.FileType;
import com.antra.report.client.pojo.reponse.ReportVO;
import com.antra.report.client.pojo.reponse.SqsResponse;
import com.antra.report.client.pojo.request.DeleteReportRequest;
import com.antra.report.client.pojo.request.ReportRequest;

import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;
import java.util.List;

public interface ReportService {
    ReportVO generateReportsSync(ReportRequest request);

    ReportVO generateReportsAsync(ReportRequest request);

    void updateAsyncPDFReport(SqsResponse response);

    void updateAsyncExcelReport(SqsResponse response);

    void deleteReportAsync(DeleteReportRequest req);

    List<ReportVO> getReportList();

    InputStream getFileBodyByReqId(String reqId, FileType type);

    @Transactional
    void deleteReport(String reqId);
}
