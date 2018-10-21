/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Monitor;

@BianRestController
public class CustomerCreditRatingApiController {

	@Autowired
	CustomerCreditRatingApiService service;
	
	@Monitor.Record
	public BianResponse<CreditRatingRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CreditRatingRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Monitor.RequestPost
	public BianResponse<CreditRatingBaseWithId> requestPost(@RequestBody BianRequest<CreditRatingBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Monitor.RequestPut
	public BianResponse<CreditRatingBaseWithId> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CreditRatingBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Monitor.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Monitor.Retrieve
	public BianResponse<CreditRatingBaseWithId> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Monitor.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Monitor.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("alerts")
	@Monitor.Retrieve
	public BianResponse<CreditRatingAlerts> retrieveAlerts(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAlerts(crReferenceId, bqReferenceId));
	}
	
	@BQ("external-ratings")
	@Monitor.Retrieve
	public BianResponse<CreditRatingExternalRating> retrieveExternalRatings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveExternalRatings(crReferenceId, bqReferenceId));
	}
	
	@BQ("internal-analysis")
	@Monitor.Retrieve
	public BianResponse<CreditRatingInternalAnalysisBase> retrieveInternalAnalysis(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInternalAnalysis(crReferenceId, bqReferenceId));
	}
	
}
