package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CreditRatingExternalRating
 */
public class CreditRatingExternalRating   {
  private String customerCreditRatingAssessmentReference = null;

  private String ratingAgencyReference = null;

  private String ratingAgencyAccessServiceSessionReference = null;

  private String ratingAgencyAccessSchedule = null;

  private String customerReference = null;

  private String ratingAgencyCreditReportType = null;

  private String ratingAgencyCreditReportReference = null;

  private Object ratingAgencyCreditReport = null;

  private String ratingAgengyCreditReportDateTime = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return ratingAgencyReference
  **/

  public String getRatingAgencyReference() {
    return ratingAgencyReference;
  }

  public void setRatingAgencyReference(String ratingAgencyReference) {
    this.ratingAgencyReference = ratingAgencyReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return ratingAgencyAccessServiceSessionReference
  **/

  public String getRatingAgencyAccessServiceSessionReference() {
    return ratingAgencyAccessServiceSessionReference;
  }

  public void setRatingAgencyAccessServiceSessionReference(String ratingAgencyAccessServiceSessionReference) {
    this.ratingAgencyAccessServiceSessionReference = ratingAgencyAccessServiceSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return ratingAgencyAccessSchedule
  **/

  public String getRatingAgencyAccessSchedule() {
    return ratingAgencyAccessSchedule;
  }

  public void setRatingAgencyAccessSchedule(String ratingAgencyAccessSchedule) {
    this.ratingAgencyAccessSchedule = ratingAgencyAccessSchedule;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code 
   * @return ratingAgencyCreditReportType
  **/

  public String getRatingAgencyCreditReportType() {
    return ratingAgencyCreditReportType;
  }

  public void setRatingAgencyCreditReportType(String ratingAgencyCreditReportType) {
    this.ratingAgencyCreditReportType = ratingAgencyCreditReportType;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return ratingAgencyCreditReport
  **/

  public Object getRatingAgencyCreditReport() {
    return ratingAgencyCreditReport;
  }

  public void setRatingAgencyCreditReport(Object ratingAgencyCreditReport) {
    this.ratingAgencyCreditReport = ratingAgencyCreditReport;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return ratingAgengyCreditReportDateTime
  **/

  public String getRatingAgengyCreditReportDateTime() {
    return ratingAgengyCreditReportDateTime;
  }

  public void setRatingAgengyCreditReportDateTime(String ratingAgengyCreditReportDateTime) {
    this.ratingAgengyCreditReportDateTime = ratingAgengyCreditReportDateTime;
  }


}

