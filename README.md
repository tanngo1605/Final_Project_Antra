# Antra SEP java evaluation project

# New Implemented Feature: Delete a report. In brief, the delete of a report is done asynchronously. 

I created a AJAX call with Delete method associate with a data row from front end.

I created a new SNS with "deleteData_topic" and make two Excel_Request_Queue and PDF_Request_Queue subcribe to this new topic.

When the delete request is invoked from front end, Client Service will publish the reqId to the "deleteData_topic" SNS.

So PDF and Excel services can know what data to delete in their databases.

After finishing deleting, the response from PDF and Excel services will be sent back to PDF_Response_Queue and Excel_Response_Queue to inform with the Client Service that data is deleted successfully. 

Then the Client Service will also delete the data with the associated reqId in its own database to make sure this data row will not appear on the front end anymore.
