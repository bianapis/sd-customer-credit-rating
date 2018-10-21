package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CreditRatingBaseWithId
 */
public class CreditRatingBaseWithId   {
  private String customerCreditRatingAssessmentReference = null;

  private String customerCreditRatingAssessment = null;

  private String customerBehaviorModel = null;

  private String ratingAgencyCreditReportReference = null;

  private String internalCreditAnalysisReportReference = null;

  private String customerReference = null;

  private String customerCreditRatingAssessmentType = null;

  private String customerCreditRatingNarrative = null;

  private String customerCreditRatingSchedule = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerCreditRatingAssessmentReference
  **/

  public String getCustomerCreditRatingAssessmentReference() {
    return customerCreditRatingAssessmentReference;
  }

  public void setCustomerCreditRatingAssessmentReference(String customerCreditRatingAssessmentReference) {
    this.customerCreditRatingAssessmentReference = customerCreditRatingAssessmentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerCreditRatingAssessment
  **/

  public String getCustomerCreditRatingAssessment() {
    return customerCreditRatingAssessment;
  }

  public void setCustomerCreditRatingAssessment(String customerCreditRatingAssessment) {
    this.customerCreditRatingAssessment = customerCreditRatingAssessment;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerBehaviorModel
  **/

  public String getCustomerBehaviorModel() {
    return customerBehaviorModel;
  }

  public void setCustomerBehaviorModel(String customerBehaviorModel) {
    this.customerBehaviorModel = customerBehaviorModel;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return ratingAgencyCreditReportReference
  **/

  public String getRatingAgencyCreditReportReference() {
    return ratingAgencyCreditReportReference;
  }

  public void setRatingAgencyCreditReportReference(String ratingAgencyCreditReportReference) {
    this.ratingAgencyCreditReportReference = ratingAgencyCreditReportReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return internalCreditAnalysisReportReference
  **/

  public String getInternalCreditAnalysisReportReference() {
    return internalCreditAnalysisReportReference;
  }

  public void setInternalCreditAnalysisReportReference(String internalCreditAnalysisReportReference) {
    this.internalCreditAnalysisReportReference = internalCreditAnalysisReportReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerCreditRatingAssessmentType
  **/

  public String getCustomerCreditRatingAssessmentType() {
    return customerCreditRatingAssessmentType;
  }

  public void setCustomerCreditRatingAssessmentType(String customerCreditRatingAssessmentType) {
    this.customerCreditRatingAssessmentType = customerCreditRatingAssessmentType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerCreditRatingNarrative
  **/

  public String getCustomerCreditRatingNarrative() {
    return customerCreditRatingNarrative;
  }

  public void setCustomerCreditRatingNarrative(String customerCreditRatingNarrative) {
    this.customerCreditRatingNarrative = customerCreditRatingNarrative;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerCreditRatingSchedule
  **/

  public String getCustomerCreditRatingSchedule() {
    return customerCreditRatingSchedule;
  }

  public void setCustomerCreditRatingSchedule(String customerCreditRatingSchedule) {
    this.customerCreditRatingSchedule = customerCreditRatingSchedule;
  }


}

