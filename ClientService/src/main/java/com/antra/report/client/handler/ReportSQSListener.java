package com.antra.report.client.handler;

import com.antra.report.client.pojo.reponse.SqsResponse;
import com.antra.report.client.pojo.request.RequestMethods;
import com.antra.report.client.service.ReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class ReportSQSListener {

    private static final Logger log = LoggerFactory.getLogger(ReportSQSListener.class);

    private ReportService reportService;

    public ReportSQSListener(ReportService reportService) {
        this.reportService = reportService;
    }

    @SqsListener(value = "PDF_Response_Queue")
    public void responseQueueListenerPdf(SqsResponse response) {
        log.info("Get response from sqs : {}", response.toString());
        if (response.getRequestMethod() == RequestMethods.DELETE) {
            reportService.deleteReport(response.getReqId());
            return;
        }

        reportService.updateAsyncPDFReport(response);
    }

    @SqsListener(value = "Excel_Response_Queue")
    public void responseQueueListenerExcel(SqsResponse response) {
        log.info("Get response from sqs : {}", response.toString());
        if (response.getRequestMethod() == RequestMethods.DELETE) {
            // reportService.deleteReport(response.getReqId());
            return;
        }

        reportService.updateAsyncExcelReport(response);
    }

    // @SqsListener(value = "Excel_Response_Queue", deletionPolicy =
    // SqsMessageDeletionPolicy.NEVER)
    // public void responseQueueListenerExcelManualAcknowledge(SqsResponse response,
    // Acknowledgment ack) {
    // log.info("Get response from sqs : {}", response);
    // log.info("Manually Acknowledge");
    // //queueListener(request.getPdfRequest());
    // reportService.updateAsyncExcelReport(response);
    // ack.acknowledge();
    // }
}
