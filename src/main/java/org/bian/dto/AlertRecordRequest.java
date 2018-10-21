package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AlertRecordRequest
 */
public class AlertRecordRequest   {
  private String customerReference = null;

  private String customerCreditRatingAssessmentReference = null;

  private String productInstanceReference = null;

  private String employeeBusinessUnitReference = null;

  private String customerCreditAlertType = null;

  private String customerCreditAlertDescription = null;

  private String dateTime = null;


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
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerCreditAlertType
  **/

  public String getCustomerCreditAlertType() {
    return customerCreditAlertType;
  }

  public void setCustomerCreditAlertType(String customerCreditAlertType) {
    this.customerCreditAlertType = customerCreditAlertType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerCreditAlertDescription
  **/

  public String getCustomerCreditAlertDescription() {
    return customerCreditAlertDescription;
  }

  public void setCustomerCreditAlertDescription(String customerCreditAlertDescription) {
    this.customerCreditAlertDescription = customerCreditAlertDescription;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return dateTime
  **/

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }


}

