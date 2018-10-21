/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerCreditRatingApiServiceImpl implements CustomerCreditRatingApiService {

	public CreditRatingRecordResponse record(String crReferenceId, CreditRatingRecordRequest request){
		return JsonReader.read("record-CreditRatingRecordResponse.json",new TypeReference<CreditRatingRecordResponse>(){});
	}
	
	public AlertRecordResponse record(String crReferenceId, AlertRecordRequest request){
		return JsonReader.read("record-AlertRecordResponse.json",new TypeReference<AlertRecordResponse>(){});
	}
	
	public CreditRatingBaseWithId requestPost(CreditRatingBase request){
		return JsonReader.read("requestPost-CreditRatingBaseWithId.json",new TypeReference<CreditRatingBaseWithId>(){});
	}
	
	public CreditRatingBaseWithId requestPut(String crReferenceId, CreditRatingBase request){
		return JsonReader.read("requestPut-CreditRatingBaseWithId.json",new TypeReference<CreditRatingBaseWithId>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CreditRatingBaseWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CreditRatingBaseWithId.json",new TypeReference<CreditRatingBaseWithId>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CreditRatingAlerts retrieveAlerts(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CreditRatingAlerts.json",new TypeReference<CreditRatingAlerts>(){});
	}
	
	public CreditRatingExternalRating retrieveExternalRatings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CreditRatingExternalRating.json",new TypeReference<CreditRatingExternalRating>(){});
	}
	
	public CreditRatingInternalAnalysisBase retrieveInternalAnalysis(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CreditRatingInternalAnalysisBase.json",new TypeReference<CreditRatingInternalAnalysisBase>(){});
	}
	
}
