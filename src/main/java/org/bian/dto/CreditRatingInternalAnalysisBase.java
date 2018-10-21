package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CreditRatingInternalAnalysisBase
 */
public class CreditRatingInternalAnalysisBase   {
  private String customerCreditRatingAssessmentReference = null;

  private String internalCreditAnalysisReportReference = null;

  private String productServiceActivityReportReference = null;

  private String productServiceActivityReport = null;

  private String customerReference = null;

  private String customerBehaviorModel = null;

  private String internalCreditAnalysisReportType = null;

  private String internalCreditAnalysisReport = null;

  private String internalCreditAnalysisReportDateTime = null;


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
   * @return productServiceActivityReportReference
  **/

  public String getProductServiceActivityReportReference() {
    return productServiceActivityReportReference;
  }

  public void setProductServiceActivityReportReference(String productServiceActivityReportReference) {
    this.productServiceActivityReportReference = productServiceActivityReportReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return productServiceActivityReport
  **/

  public String getProductServiceActivityReport() {
    return productServiceActivityReport;
  }

  public void setProductServiceActivityReport(String productServiceActivityReport) {
    this.productServiceActivityReport = productServiceActivityReport;
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
   * @return customerBehaviorModel
  **/

  public String getCustomerBehaviorModel() {
    return customerBehaviorModel;
  }

  public void setCustomerBehaviorModel(String customerBehaviorModel) {
    this.customerBehaviorModel = customerBehaviorModel;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code 
   * @return internalCreditAnalysisReportType
  **/

  public String getInternalCreditAnalysisReportType() {
    return internalCreditAnalysisReportType;
  }

  public void setInternalCreditAnalysisReportType(String internalCreditAnalysisReportType) {
    this.internalCreditAnalysisReportType = internalCreditAnalysisReportType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return internalCreditAnalysisReport
  **/

  public String getInternalCreditAnalysisReport() {
    return internalCreditAnalysisReport;
  }

  public void setInternalCreditAnalysisReport(String internalCreditAnalysisReport) {
    this.internalCreditAnalysisReport = internalCreditAnalysisReport;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return internalCreditAnalysisReportDateTime
  **/

  public String getInternalCreditAnalysisReportDateTime() {
    return internalCreditAnalysisReportDateTime;
  }

  public void setInternalCreditAnalysisReportDateTime(String internalCreditAnalysisReportDateTime) {
    this.internalCreditAnalysisReportDateTime = internalCreditAnalysisReportDateTime;
  }


}

