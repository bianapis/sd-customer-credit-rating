/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerCreditRatingApiService {

	CreditRatingRecordResponse record(String crReferenceId, CreditRatingRecordRequest request);
	
	AlertRecordResponse record(String crReferenceId, AlertRecordRequest request);
	
	CreditRatingBaseWithId requestPost(CreditRatingBase request);
	
	CreditRatingBaseWithId requestPut(String crReferenceId, CreditRatingBase request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	CreditRatingBaseWithId retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	CreditRatingAlerts retrieveAlerts(String crReferenceId, String bqReferenceId);
	
	CreditRatingExternalRating retrieveExternalRatings(String crReferenceId, String bqReferenceId);
	
	CreditRatingInternalAnalysisBase retrieveInternalAnalysis(String crReferenceId, String bqReferenceId);
	
}
