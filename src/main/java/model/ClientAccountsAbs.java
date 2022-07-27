
package model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.springframework.stereotype.Component;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Account" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OpeningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="ClosingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="AbsClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IsoCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AbsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Department" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BisCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="SapDepartmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ReferenceCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AdditionalAccountProperties" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AdditionalAccountProperty" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AccruedInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="AccruedInterestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="Contract" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                             &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SubproductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SubproductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="LoanDrawDownDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="ClosingDatePlanned" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="ClosingDateActual" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="PlasticCardsProductGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CheckingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="W4Contract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CreditAmountCcy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="InterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="InterestRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="InterestPayoutFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MinimumBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="IsInterestCapitalized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="IsPartialWithdrawalAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="IsReplenishable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="DebtAmountCcy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="DebtAmountRub" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="DebtBalanceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="OverdueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="OverdueStatementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="PenaltyForOverdueDebt" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                       &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PenaltyForInterest" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                       &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PenaltyForTrancheCommission" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                       &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Limit" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Current" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="Unused" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NetCreditFlow" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="AgreementValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="CalculatedValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="CalculatedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="LimitChangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="MainDebtAccruedInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="CommissionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="TotalOverdueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="OverdueInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="OverdueCommission" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="OtherPenalties" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="OtherPenalty" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                                 &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="DebtType" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="DebtRepayment" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                                 &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="InterestRepayment" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                                 &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="CommissionRepayment" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                                 &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="IsComplex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="IsTrancheContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="ParentContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ParentContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SpecType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SupplementaryAgreements" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="SupplementaryAgreement" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                                 &lt;element name="ClosingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                                 &lt;element name="IsMinimumBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                                 &lt;element name="IsMinimumMonthlyBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                                 &lt;element name="IsMinimumDailyBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                                 &lt;element name="IsMinimumCorporateMonthlyBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                                 &lt;element name="IsIndividual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                                 &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="OpeningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                                 &lt;element name="StartingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                                 &lt;element name="ClosingDateActual" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                                 &lt;element name="ValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                                 &lt;element name="InterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="MinimumBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="IsCollection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                                 &lt;element name="DealsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="DealsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SavingsAccountInfo" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="OpeningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                       &lt;element name="IsAvailableToClient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                       &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="IsAutoReplenishable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                       &lt;element name="AutoReplenishmentRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="AutoReplenishmentAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Contract" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                       &lt;element name="IsInterestCalculation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="StartingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="DealsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="IsEarlyDissolution" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="IsManualAccompaniment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="IsIndividual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="ReturnAccount" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Bic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Swift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="IsSignOfDirectWriteOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BlockingInfoList" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BlockingInfo" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                                       &lt;element name="IsBlockedForDebit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                       &lt;element name="IsBlockedForCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                       &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                       &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="AmountRub" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="AmountCcy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="OrderReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                       &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="OrderCancellationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                       &lt;element name="OrderCancellationReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                                       &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                       &lt;element name="Source"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="SourceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="Kpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Details" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Bic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Kpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="InterBankingOperationAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Swift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DboInfo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DboInfo" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="DboCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="DboName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IsSpecial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventTimestamp",
    "messageId",
    "account"
})
@XmlRootElement(name = "ClientAccountsAbs")
@Component
public class ClientAccountsAbs {

    @XmlElement(name = "EventTimestamp")
    protected long eventTimestamp;
    @XmlElement(name = "MessageId", required = true)
    protected String messageId;
    @XmlElement(name = "Account", required = true)
    protected List<ClientAccountsAbs.Account> account;

    /**
     * Gets the value of the eventTimestamp property.
     * 
     */
    public long getEventTimestamp() {
        return eventTimestamp;
    }

    /**
     * Sets the value of the eventTimestamp property.
     * 
     */
    public void setEventTimestamp(long value) {
        this.eventTimestamp = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientAccountsAbs.Account }
     * 
     * 
     */
    public List<ClientAccountsAbs.Account> getAccount() {
        if (account == null) {
            account = new ArrayList<ClientAccountsAbs.Account>();
        }
        return this.account;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OpeningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="ClosingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="AbsClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IsoCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AbsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Department" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BisCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="SapDepartmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ReferenceCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AdditionalAccountProperties" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AdditionalAccountProperty" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AccruedInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="AccruedInterestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="Contract" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                   &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SubproductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SubproductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="LoanDrawDownDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="ClosingDatePlanned" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="ClosingDateActual" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="PlasticCardsProductGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CheckingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="W4Contract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CreditAmountCcy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="InterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="InterestRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="InterestPayoutFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MinimumBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="IsInterestCapitalized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="IsPartialWithdrawalAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="IsReplenishable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="DebtAmountCcy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="DebtAmountRub" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="DebtBalanceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="OverdueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="OverdueStatementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="PenaltyForOverdueDebt" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PenaltyForInterest" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PenaltyForTrancheCommission" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Limit" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Current" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="Unused" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NetCreditFlow" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="AgreementValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="CalculatedValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="CalculatedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="LimitChangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="MainDebtAccruedInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="CommissionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="TotalOverdueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="OverdueInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="OverdueCommission" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="OtherPenalties" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="OtherPenalty" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                                       &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                       &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="DebtType" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="DebtRepayment" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                                       &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="InterestRepayment" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                                       &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="CommissionRepayment" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                                       &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="IsComplex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="IsTrancheContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="ParentContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ParentContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SpecType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SupplementaryAgreements" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="SupplementaryAgreement" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                                       &lt;element name="ClosingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                                       &lt;element name="IsMinimumBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                                       &lt;element name="IsMinimumMonthlyBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                                       &lt;element name="IsMinimumDailyBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                                       &lt;element name="IsMinimumCorporateMonthlyBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                                       &lt;element name="IsIndividual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                                       &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="OpeningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                                       &lt;element name="StartingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                                       &lt;element name="ClosingDateActual" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                                       &lt;element name="ValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                                       &lt;element name="InterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="MinimumBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                       &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="IsCollection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                                       &lt;element name="DealsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="DealsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SavingsAccountInfo" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="OpeningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                             &lt;element name="IsAvailableToClient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                             &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="IsAutoReplenishable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                             &lt;element name="AutoReplenishmentRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="AutoReplenishmentAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Contract" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                             &lt;element name="IsInterestCalculation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="StartingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="DealsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="IsEarlyDissolution" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="IsManualAccompaniment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="IsIndividual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="ReturnAccount" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Bic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Swift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="IsSignOfDirectWriteOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BlockingInfoList" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BlockingInfo" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                             &lt;element name="IsBlockedForDebit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                             &lt;element name="IsBlockedForCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                             &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="AmountRub" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="AmountCcy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="OrderReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                             &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="OrderCancellationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                             &lt;element name="OrderCancellationReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                             &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                             &lt;element name="Source"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="SourceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="Kpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Details" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Bic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Kpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="InterBankingOperationAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Swift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DboInfo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DboInfo" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="DboCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="DboName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="IsSpecial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "number",
        "id",
        "fullName",
        "openingDate",
        "closingDate",
        "absClientId",
        "status",
        "isActive",
        "isoCurrencyCode",
        "type",
        "absCode",
        "department",
        "additionalAccountProperties",
        "accruedInterest",
        "accruedInterestDate",
        "contract",
        "blockingInfoList",
        "details",
        "dboInfo",
        "isSpecial"
    })
    public static class Account {

        @XmlElement(name = "Number")
        protected String number;
        @XmlElement(name = "Id", required = true)
        protected String id;
        @XmlElement(name = "FullName")
        protected String fullName;
        @XmlElement(name = "OpeningDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar openingDate;
        @XmlElement(name = "ClosingDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar closingDate;
        @XmlElement(name = "AbsClientId")
        protected String absClientId;
        @XmlElement(name = "Status", required = true)
        protected BigInteger status;
        @XmlElement(name = "IsActive")
        protected Boolean isActive;
        @XmlElement(name = "IsoCurrencyCode")
        protected String isoCurrencyCode;
        @XmlElement(name = "Type")
        protected String type;
        @XmlElement(name = "AbsCode")
        protected String absCode;
        @XmlElement(name = "Department")
        protected ClientAccountsAbs.Account.Department department;
        @XmlElement(name = "AdditionalAccountProperties")
        protected ClientAccountsAbs.Account.AdditionalAccountProperties additionalAccountProperties;
        @XmlElement(name = "AccruedInterest")
        protected BigDecimal accruedInterest;
        @XmlElement(name = "AccruedInterestDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar accruedInterestDate;
        @XmlElement(name = "Contract")
        protected ClientAccountsAbs.Account.Contract contract;
        @XmlElement(name = "BlockingInfoList")
        protected ClientAccountsAbs.Account.BlockingInfoList blockingInfoList;
        @XmlElement(name = "Details")
        protected ClientAccountsAbs.Account.Details details;
        @XmlElement(name = "DboInfo")
        protected ClientAccountsAbs.Account.DboInfo dboInfo;
        @XmlElement(name = "IsSpecial")
        protected Boolean isSpecial;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the fullName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullName() {
            return fullName;
        }

        /**
         * Sets the value of the fullName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullName(String value) {
            this.fullName = value;
        }

        /**
         * Gets the value of the openingDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOpeningDate() {
            return openingDate;
        }

        /**
         * Sets the value of the openingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOpeningDate(XMLGregorianCalendar value) {
            this.openingDate = value;
        }

        /**
         * Gets the value of the closingDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getClosingDate() {
            return closingDate;
        }

        /**
         * Sets the value of the closingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setClosingDate(XMLGregorianCalendar value) {
            this.closingDate = value;
        }

        /**
         * Gets the value of the absClientId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsClientId() {
            return absClientId;
        }

        /**
         * Sets the value of the absClientId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsClientId(String value) {
            this.absClientId = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStatus(BigInteger value) {
            this.status = value;
        }

        /**
         * Gets the value of the isActive property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsActive() {
            return isActive;
        }

        /**
         * Sets the value of the isActive property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsActive(Boolean value) {
            this.isActive = value;
        }

        /**
         * Gets the value of the isoCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsoCurrencyCode() {
            return isoCurrencyCode;
        }

        /**
         * Sets the value of the isoCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsoCurrencyCode(String value) {
            this.isoCurrencyCode = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the absCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsCode() {
            return absCode;
        }

        /**
         * Sets the value of the absCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsCode(String value) {
            this.absCode = value;
        }

        /**
         * Gets the value of the department property.
         * 
         * @return
         *     possible object is
         *     {@link ClientAccountsAbs.Account.Department }
         *     
         */
        public ClientAccountsAbs.Account.Department getDepartment() {
            return department;
        }

        /**
         * Sets the value of the department property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClientAccountsAbs.Account.Department }
         *     
         */
        public void setDepartment(ClientAccountsAbs.Account.Department value) {
            this.department = value;
        }

        /**
         * Gets the value of the additionalAccountProperties property.
         * 
         * @return
         *     possible object is
         *     {@link ClientAccountsAbs.Account.AdditionalAccountProperties }
         *     
         */
        public ClientAccountsAbs.Account.AdditionalAccountProperties getAdditionalAccountProperties() {
            return additionalAccountProperties;
        }

        /**
         * Sets the value of the additionalAccountProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClientAccountsAbs.Account.AdditionalAccountProperties }
         *     
         */
        public void setAdditionalAccountProperties(ClientAccountsAbs.Account.AdditionalAccountProperties value) {
            this.additionalAccountProperties = value;
        }

        /**
         * Gets the value of the accruedInterest property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAccruedInterest() {
            return accruedInterest;
        }

        /**
         * Sets the value of the accruedInterest property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAccruedInterest(BigDecimal value) {
            this.accruedInterest = value;
        }

        /**
         * Gets the value of the accruedInterestDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAccruedInterestDate() {
            return accruedInterestDate;
        }

        /**
         * Sets the value of the accruedInterestDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAccruedInterestDate(XMLGregorianCalendar value) {
            this.accruedInterestDate = value;
        }

        /**
         * Gets the value of the contract property.
         * 
         * @return
         *     possible object is
         *     {@link ClientAccountsAbs.Account.Contract }
         *     
         */
        public ClientAccountsAbs.Account.Contract getContract() {
            return contract;
        }

        /**
         * Sets the value of the contract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClientAccountsAbs.Account.Contract }
         *     
         */
        public void setContract(ClientAccountsAbs.Account.Contract value) {
            this.contract = value;
        }

        /**
         * Gets the value of the blockingInfoList property.
         * 
         * @return
         *     possible object is
         *     {@link ClientAccountsAbs.Account.BlockingInfoList }
         *     
         */
        public ClientAccountsAbs.Account.BlockingInfoList getBlockingInfoList() {
            return blockingInfoList;
        }

        /**
         * Sets the value of the blockingInfoList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClientAccountsAbs.Account.BlockingInfoList }
         *     
         */
        public void setBlockingInfoList(ClientAccountsAbs.Account.BlockingInfoList value) {
            this.blockingInfoList = value;
        }

        /**
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link ClientAccountsAbs.Account.Details }
         *     
         */
        public ClientAccountsAbs.Account.Details getDetails() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClientAccountsAbs.Account.Details }
         *     
         */
        public void setDetails(ClientAccountsAbs.Account.Details value) {
            this.details = value;
        }

        /**
         * Gets the value of the dboInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ClientAccountsAbs.Account.DboInfo }
         *     
         */
        public ClientAccountsAbs.Account.DboInfo getDboInfo() {
            return dboInfo;
        }

        /**
         * Sets the value of the dboInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClientAccountsAbs.Account.DboInfo }
         *     
         */
        public void setDboInfo(ClientAccountsAbs.Account.DboInfo value) {
            this.dboInfo = value;
        }

        /**
         * Gets the value of the isSpecial property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsSpecial() {
            return isSpecial;
        }

        /**
         * Sets the value of the isSpecial property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsSpecial(Boolean value) {
            this.isSpecial = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="AdditionalAccountProperty" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "additionalAccountProperty"
        })
        public static class AdditionalAccountProperties {

            @XmlElement(name = "AdditionalAccountProperty", required = true)
            protected List<ClientAccountsAbs.Account.AdditionalAccountProperties.AdditionalAccountProperty> additionalAccountProperty;

            /**
             * Gets the value of the additionalAccountProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the additionalAccountProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAdditionalAccountProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ClientAccountsAbs.Account.AdditionalAccountProperties.AdditionalAccountProperty }
             * 
             * 
             */
            public List<ClientAccountsAbs.Account.AdditionalAccountProperties.AdditionalAccountProperty> getAdditionalAccountProperty() {
                if (additionalAccountProperty == null) {
                    additionalAccountProperty = new ArrayList<ClientAccountsAbs.Account.AdditionalAccountProperties.AdditionalAccountProperty>();
                }
                return this.additionalAccountProperty;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name",
                "value"
            })
            public static class AdditionalAccountProperty {

                @XmlElement(name = "Name", required = true)
                protected Object name;
                @XmlElement(name = "Value", required = true)
                protected Object value;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setName(Object value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setValue(Object value) {
                    this.value = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="BlockingInfo" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *                   &lt;element name="IsBlockedForDebit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                   &lt;element name="IsBlockedForCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                   &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="AmountRub" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="AmountCcy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="OrderReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                   &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="OrderCancellationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                   &lt;element name="OrderCancellationReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *                   &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                   &lt;element name="Source"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="SourceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="Kpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "blockingInfo"
        })
        public static class BlockingInfoList {

            @XmlElement(name = "BlockingInfo", required = true)
            protected List<ClientAccountsAbs.Account.BlockingInfoList.BlockingInfo> blockingInfo;

            /**
             * Gets the value of the blockingInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the blockingInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBlockingInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ClientAccountsAbs.Account.BlockingInfoList.BlockingInfo }
             * 
             * 
             */
            public List<ClientAccountsAbs.Account.BlockingInfoList.BlockingInfo> getBlockingInfo() {
                if (blockingInfo == null) {
                    blockingInfo = new ArrayList<ClientAccountsAbs.Account.BlockingInfoList.BlockingInfo>();
                }
                return this.blockingInfo;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
             *         &lt;element name="IsBlockedForDebit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *         &lt;element name="IsBlockedForCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
             *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="AmountRub" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="AmountCcy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="OrderReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="OrderCancellationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *         &lt;element name="OrderCancellationReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
             *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *         &lt;element name="Source"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="SourceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="Kpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "isBlockedForDebit",
                "isBlockedForCredit",
                "isActive",
                "type",
                "amountRub",
                "amountCcy",
                "orderReferenceNumber",
                "orderDate",
                "reason",
                "orderCancellationDate",
                "orderCancellationReferenceNumber",
                "startDate",
                "endDate",
                "source"
            })
            public static class BlockingInfo {

                @XmlElement(name = "Id")
                protected long id;
                @XmlElement(name = "IsBlockedForDebit")
                protected Boolean isBlockedForDebit;
                @XmlElement(name = "IsBlockedForCredit")
                protected Boolean isBlockedForCredit;
                @XmlElement(name = "IsActive")
                protected boolean isActive;
                @XmlElement(name = "Type")
                protected String type;
                @XmlElement(name = "AmountRub")
                protected BigDecimal amountRub;
                @XmlElement(name = "AmountCcy")
                protected BigDecimal amountCcy;
                @XmlElement(name = "OrderReferenceNumber")
                protected String orderReferenceNumber;
                @XmlElement(name = "OrderDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar orderDate;
                @XmlElement(name = "Reason")
                protected String reason;
                @XmlElement(name = "OrderCancellationDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar orderCancellationDate;
                @XmlElement(name = "OrderCancellationReferenceNumber")
                protected String orderCancellationReferenceNumber;
                @XmlElement(name = "StartDate", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar startDate;
                @XmlElement(name = "EndDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar endDate;
                @XmlElement(name = "Source", required = true)
                protected ClientAccountsAbs.Account.BlockingInfoList.BlockingInfo.Source source;

                /**
                 * Gets the value of the id property.
                 * 
                 */
                public long getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 */
                public void setId(long value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the isBlockedForDebit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isIsBlockedForDebit() {
                    return isBlockedForDebit;
                }

                /**
                 * Sets the value of the isBlockedForDebit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setIsBlockedForDebit(Boolean value) {
                    this.isBlockedForDebit = value;
                }

                /**
                 * Gets the value of the isBlockedForCredit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isIsBlockedForCredit() {
                    return isBlockedForCredit;
                }

                /**
                 * Sets the value of the isBlockedForCredit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setIsBlockedForCredit(Boolean value) {
                    this.isBlockedForCredit = value;
                }

                /**
                 * Gets the value of the isActive property.
                 * 
                 */
                public boolean isIsActive() {
                    return isActive;
                }

                /**
                 * Sets the value of the isActive property.
                 * 
                 */
                public void setIsActive(boolean value) {
                    this.isActive = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the amountRub property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmountRub() {
                    return amountRub;
                }

                /**
                 * Sets the value of the amountRub property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmountRub(BigDecimal value) {
                    this.amountRub = value;
                }

                /**
                 * Gets the value of the amountCcy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmountCcy() {
                    return amountCcy;
                }

                /**
                 * Sets the value of the amountCcy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmountCcy(BigDecimal value) {
                    this.amountCcy = value;
                }

                /**
                 * Gets the value of the orderReferenceNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrderReferenceNumber() {
                    return orderReferenceNumber;
                }

                /**
                 * Sets the value of the orderReferenceNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrderReferenceNumber(String value) {
                    this.orderReferenceNumber = value;
                }

                /**
                 * Gets the value of the orderDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getOrderDate() {
                    return orderDate;
                }

                /**
                 * Sets the value of the orderDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setOrderDate(XMLGregorianCalendar value) {
                    this.orderDate = value;
                }

                /**
                 * Gets the value of the reason property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReason() {
                    return reason;
                }

                /**
                 * Sets the value of the reason property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReason(String value) {
                    this.reason = value;
                }

                /**
                 * Gets the value of the orderCancellationDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getOrderCancellationDate() {
                    return orderCancellationDate;
                }

                /**
                 * Sets the value of the orderCancellationDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setOrderCancellationDate(XMLGregorianCalendar value) {
                    this.orderCancellationDate = value;
                }

                /**
                 * Gets the value of the orderCancellationReferenceNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrderCancellationReferenceNumber() {
                    return orderCancellationReferenceNumber;
                }

                /**
                 * Sets the value of the orderCancellationReferenceNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrderCancellationReferenceNumber(String value) {
                    this.orderCancellationReferenceNumber = value;
                }

                /**
                 * Gets the value of the startDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getStartDate() {
                    return startDate;
                }

                /**
                 * Sets the value of the startDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setStartDate(XMLGregorianCalendar value) {
                    this.startDate = value;
                }

                /**
                 * Gets the value of the endDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getEndDate() {
                    return endDate;
                }

                /**
                 * Sets the value of the endDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setEndDate(XMLGregorianCalendar value) {
                    this.endDate = value;
                }

                /**
                 * Gets the value of the source property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ClientAccountsAbs.Account.BlockingInfoList.BlockingInfo.Source }
                 *     
                 */
                public ClientAccountsAbs.Account.BlockingInfoList.BlockingInfo.Source getSource() {
                    return source;
                }

                /**
                 * Sets the value of the source property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ClientAccountsAbs.Account.BlockingInfoList.BlockingInfo.Source }
                 *     
                 */
                public void setSource(ClientAccountsAbs.Account.BlockingInfoList.BlockingInfo.Source value) {
                    this.source = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="SourceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="Kpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "sourceCode",
                    "tin",
                    "kpp",
                    "name",
                    "code"
                })
                public static class Source {

                    @XmlElement(name = "SourceCode", required = true)
                    protected String sourceCode;
                    @XmlElement(name = "Tin")
                    protected String tin;
                    @XmlElement(name = "Kpp")
                    protected String kpp;
                    @XmlElement(name = "Name", required = true)
                    protected String name;
                    @XmlElement(name = "Code")
                    protected String code;

                    /**
                     * Gets the value of the sourceCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSourceCode() {
                        return sourceCode;
                    }

                    /**
                     * Sets the value of the sourceCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSourceCode(String value) {
                        this.sourceCode = value;
                    }

                    /**
                     * Gets the value of the tin property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTin() {
                        return tin;
                    }

                    /**
                     * Sets the value of the tin property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTin(String value) {
                        this.tin = value;
                    }

                    /**
                     * Gets the value of the kpp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getKpp() {
                        return kpp;
                    }

                    /**
                     * Sets the value of the kpp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setKpp(String value) {
                        this.kpp = value;
                    }

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the code property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SubproductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SubproductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="LoanDrawDownDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="ClosingDatePlanned" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="ClosingDateActual" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="PlasticCardsProductGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CheckingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="W4Contract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CreditAmountCcy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="InterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="InterestRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="InterestPayoutFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MinimumBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="IsInterestCapitalized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IsPartialWithdrawalAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IsReplenishable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="DebtAmountCcy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="DebtAmountRub" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="DebtBalanceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="OverdueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="OverdueStatementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="PenaltyForOverdueDebt" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PenaltyForInterest" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PenaltyForTrancheCommission" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Limit" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Current" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="Unused" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NetCreditFlow" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="AgreementValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="CalculatedValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="CalculatedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="LimitChangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="MainDebtAccruedInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="CommissionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="TotalOverdueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="OverdueInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="OverdueCommission" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="OtherPenalties" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="OtherPenalty" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="DebtType" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="DebtRepayment" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                             &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="InterestRepayment" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                             &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="CommissionRepayment" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                             &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="IsComplex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IsTrancheContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="ParentContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ParentContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SpecType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SupplementaryAgreements" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="SupplementaryAgreement" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                             &lt;element name="ClosingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                             &lt;element name="IsMinimumBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                             &lt;element name="IsMinimumMonthlyBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                             &lt;element name="IsMinimumDailyBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                             &lt;element name="IsMinimumCorporateMonthlyBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                             &lt;element name="IsIndividual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                             &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="OpeningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                             &lt;element name="StartingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                             &lt;element name="ClosingDateActual" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                             &lt;element name="ValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                             &lt;element name="InterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="MinimumBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                             &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="IsCollection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                             &lt;element name="DealsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="DealsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SavingsAccountInfo" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="OpeningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                   &lt;element name="IsAvailableToClient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="IsAutoReplenishable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                   &lt;element name="AutoReplenishmentRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="AutoReplenishmentAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Contract" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                   &lt;element name="IsInterestCalculation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="StartingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="DealsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="IsEarlyDissolution" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IsManualAccompaniment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IsIndividual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="ReturnAccount" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Bic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Swift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="IsSignOfDirectWriteOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "productCode",
            "subproductCode",
            "productName",
            "subproductName",
            "number",
            "signingDate",
            "loanDrawDownDate",
            "closingDatePlanned",
            "closingDateActual",
            "type",
            "plasticCardsProductGroupCode",
            "checkingAccount",
            "w4Contract",
            "creditAmountCcy",
            "interestRate",
            "validityPeriod",
            "interestRateType",
            "interestPayoutFrequency",
            "minimumBalance",
            "isInterestCapitalized",
            "isPartialWithdrawalAllowed",
            "isReplenishable",
            "nextPaymentAmount",
            "nextPaymentDate",
            "debtAmountCcy",
            "debtAmountRub",
            "debtBalanceDate",
            "overdueAmount",
            "overdueStatementDate",
            "penaltyForOverdueDebt",
            "penaltyForInterest",
            "penaltyForTrancheCommission",
            "limit",
            "netCreditFlow",
            "mainDebtAccruedInterest",
            "commissionAmount",
            "totalOverdueAmount",
            "overdueInterest",
            "overdueCommission",
            "otherPenalties",
            "debtType",
            "isComplex",
            "isTrancheContract",
            "parentContractId",
            "parentContractNumber",
            "specType",
            "supplementaryAgreements",
            "savingsAccountInfo",
            "startingDate",
            "returnDate",
            "dealsAmount",
            "isEarlyDissolution",
            "isManualAccompaniment",
            "isIndividual",
            "returnAccount",
            "isSignOfDirectWriteOff"
        })
        public static class Contract {

            @XmlElement(name = "Id")
            protected long id;
            @XmlElement(name = "ProductCode")
            protected String productCode;
            @XmlElement(name = "SubproductCode")
            protected String subproductCode;
            @XmlElement(name = "ProductName")
            protected String productName;
            @XmlElement(name = "SubproductName")
            protected String subproductName;
            @XmlElement(name = "Number")
            protected String number;
            @XmlElement(name = "SigningDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar signingDate;
            @XmlElement(name = "LoanDrawDownDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar loanDrawDownDate;
            @XmlElement(name = "ClosingDatePlanned")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar closingDatePlanned;
            @XmlElement(name = "ClosingDateActual")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar closingDateActual;
            @XmlElement(name = "Type", required = true)
            protected String type;
            @XmlElement(name = "PlasticCardsProductGroupCode")
            protected String plasticCardsProductGroupCode;
            @XmlElement(name = "CheckingAccount")
            protected String checkingAccount;
            @XmlElement(name = "W4Contract")
            protected String w4Contract;
            @XmlElement(name = "CreditAmountCcy")
            protected BigDecimal creditAmountCcy;
            @XmlElement(name = "InterestRate")
            protected String interestRate;
            @XmlElement(name = "ValidityPeriod")
            protected BigInteger validityPeriod;
            @XmlElement(name = "InterestRateType")
            protected String interestRateType;
            @XmlElement(name = "InterestPayoutFrequency")
            protected String interestPayoutFrequency;
            @XmlElement(name = "MinimumBalance")
            protected BigDecimal minimumBalance;
            @XmlElement(name = "IsInterestCapitalized")
            protected Boolean isInterestCapitalized;
            @XmlElement(name = "IsPartialWithdrawalAllowed")
            protected Boolean isPartialWithdrawalAllowed;
            @XmlElement(name = "IsReplenishable")
            protected Boolean isReplenishable;
            @XmlElement(name = "NextPaymentAmount")
            protected BigDecimal nextPaymentAmount;
            @XmlElement(name = "NextPaymentDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar nextPaymentDate;
            @XmlElement(name = "DebtAmountCcy")
            protected BigDecimal debtAmountCcy;
            @XmlElement(name = "DebtAmountRub")
            protected BigDecimal debtAmountRub;
            @XmlElement(name = "DebtBalanceDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar debtBalanceDate;
            @XmlElement(name = "OverdueAmount")
            protected BigDecimal overdueAmount;
            @XmlElement(name = "OverdueStatementDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar overdueStatementDate;
            @XmlElement(name = "PenaltyForOverdueDebt")
            protected ClientAccountsAbs.Account.Contract.PenaltyForOverdueDebt penaltyForOverdueDebt;
            @XmlElement(name = "PenaltyForInterest")
            protected ClientAccountsAbs.Account.Contract.PenaltyForInterest penaltyForInterest;
            @XmlElement(name = "PenaltyForTrancheCommission")
            protected ClientAccountsAbs.Account.Contract.PenaltyForTrancheCommission penaltyForTrancheCommission;
            @XmlElement(name = "Limit")
            protected ClientAccountsAbs.Account.Contract.Limit limit;
            @XmlElement(name = "NetCreditFlow")
            protected ClientAccountsAbs.Account.Contract.NetCreditFlow netCreditFlow;
            @XmlElement(name = "MainDebtAccruedInterest")
            protected BigDecimal mainDebtAccruedInterest;
            @XmlElement(name = "CommissionAmount")
            protected BigDecimal commissionAmount;
            @XmlElement(name = "TotalOverdueAmount")
            protected BigDecimal totalOverdueAmount;
            @XmlElement(name = "OverdueInterest")
            protected BigDecimal overdueInterest;
            @XmlElement(name = "OverdueCommission")
            protected BigDecimal overdueCommission;
            @XmlElement(name = "OtherPenalties")
            protected ClientAccountsAbs.Account.Contract.OtherPenalties otherPenalties;
            @XmlElement(name = "DebtType")
            protected ClientAccountsAbs.Account.Contract.DebtType debtType;
            @XmlElement(name = "IsComplex")
            protected Boolean isComplex;
            @XmlElement(name = "IsTrancheContract")
            protected Boolean isTrancheContract;
            @XmlElement(name = "ParentContractId")
            protected String parentContractId;
            @XmlElement(name = "ParentContractNumber")
            protected String parentContractNumber;
            @XmlElement(name = "SpecType")
            protected String specType;
            @XmlElement(name = "SupplementaryAgreements")
            protected ClientAccountsAbs.Account.Contract.SupplementaryAgreements supplementaryAgreements;
            @XmlElement(name = "SavingsAccountInfo")
            protected ClientAccountsAbs.Account.Contract.SavingsAccountInfo savingsAccountInfo;
            @XmlElement(name = "StartingDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar startingDate;
            @XmlElement(name = "ReturnDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar returnDate;
            @XmlElement(name = "DealsAmount")
            protected BigDecimal dealsAmount;
            @XmlElement(name = "IsEarlyDissolution")
            protected Boolean isEarlyDissolution;
            @XmlElement(name = "IsManualAccompaniment")
            protected Boolean isManualAccompaniment;
            @XmlElement(name = "IsIndividual")
            protected Boolean isIndividual;
            @XmlElement(name = "ReturnAccount")
            protected ClientAccountsAbs.Account.Contract.ReturnAccount returnAccount;
            @XmlElement(name = "IsSignOfDirectWriteOff")
            protected Boolean isSignOfDirectWriteOff;

            /**
             * Gets the value of the id property.
             * 
             */
            public long getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             */
            public void setId(long value) {
                this.id = value;
            }

            /**
             * Gets the value of the productCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductCode() {
                return productCode;
            }

            /**
             * Sets the value of the productCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductCode(String value) {
                this.productCode = value;
            }

            /**
             * Gets the value of the subproductCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubproductCode() {
                return subproductCode;
            }

            /**
             * Sets the value of the subproductCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubproductCode(String value) {
                this.subproductCode = value;
            }

            /**
             * Gets the value of the productName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductName() {
                return productName;
            }

            /**
             * Sets the value of the productName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductName(String value) {
                this.productName = value;
            }

            /**
             * Gets the value of the subproductName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubproductName() {
                return subproductName;
            }

            /**
             * Sets the value of the subproductName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubproductName(String value) {
                this.subproductName = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Gets the value of the signingDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getSigningDate() {
                return signingDate;
            }

            /**
             * Sets the value of the signingDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setSigningDate(XMLGregorianCalendar value) {
                this.signingDate = value;
            }

            /**
             * Gets the value of the loanDrawDownDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getLoanDrawDownDate() {
                return loanDrawDownDate;
            }

            /**
             * Sets the value of the loanDrawDownDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setLoanDrawDownDate(XMLGregorianCalendar value) {
                this.loanDrawDownDate = value;
            }

            /**
             * Gets the value of the closingDatePlanned property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getClosingDatePlanned() {
                return closingDatePlanned;
            }

            /**
             * Sets the value of the closingDatePlanned property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setClosingDatePlanned(XMLGregorianCalendar value) {
                this.closingDatePlanned = value;
            }

            /**
             * Gets the value of the closingDateActual property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getClosingDateActual() {
                return closingDateActual;
            }

            /**
             * Sets the value of the closingDateActual property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setClosingDateActual(XMLGregorianCalendar value) {
                this.closingDateActual = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the plasticCardsProductGroupCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlasticCardsProductGroupCode() {
                return plasticCardsProductGroupCode;
            }

            /**
             * Sets the value of the plasticCardsProductGroupCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlasticCardsProductGroupCode(String value) {
                this.plasticCardsProductGroupCode = value;
            }

            /**
             * Gets the value of the checkingAccount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckingAccount() {
                return checkingAccount;
            }

            /**
             * Sets the value of the checkingAccount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckingAccount(String value) {
                this.checkingAccount = value;
            }

            /**
             * Gets the value of the w4Contract property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getW4Contract() {
                return w4Contract;
            }

            /**
             * Sets the value of the w4Contract property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setW4Contract(String value) {
                this.w4Contract = value;
            }

            /**
             * Gets the value of the creditAmountCcy property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCreditAmountCcy() {
                return creditAmountCcy;
            }

            /**
             * Sets the value of the creditAmountCcy property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCreditAmountCcy(BigDecimal value) {
                this.creditAmountCcy = value;
            }

            /**
             * Gets the value of the interestRate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInterestRate() {
                return interestRate;
            }

            /**
             * Sets the value of the interestRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInterestRate(String value) {
                this.interestRate = value;
            }

            /**
             * Gets the value of the validityPeriod property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getValidityPeriod() {
                return validityPeriod;
            }

            /**
             * Sets the value of the validityPeriod property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setValidityPeriod(BigInteger value) {
                this.validityPeriod = value;
            }

            /**
             * Gets the value of the interestRateType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInterestRateType() {
                return interestRateType;
            }

            /**
             * Sets the value of the interestRateType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInterestRateType(String value) {
                this.interestRateType = value;
            }

            /**
             * Gets the value of the interestPayoutFrequency property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInterestPayoutFrequency() {
                return interestPayoutFrequency;
            }

            /**
             * Sets the value of the interestPayoutFrequency property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInterestPayoutFrequency(String value) {
                this.interestPayoutFrequency = value;
            }

            /**
             * Gets the value of the minimumBalance property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMinimumBalance() {
                return minimumBalance;
            }

            /**
             * Sets the value of the minimumBalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMinimumBalance(BigDecimal value) {
                this.minimumBalance = value;
            }

            /**
             * Gets the value of the isInterestCapitalized property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsInterestCapitalized() {
                return isInterestCapitalized;
            }

            /**
             * Sets the value of the isInterestCapitalized property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsInterestCapitalized(Boolean value) {
                this.isInterestCapitalized = value;
            }

            /**
             * Gets the value of the isPartialWithdrawalAllowed property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsPartialWithdrawalAllowed() {
                return isPartialWithdrawalAllowed;
            }

            /**
             * Sets the value of the isPartialWithdrawalAllowed property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsPartialWithdrawalAllowed(Boolean value) {
                this.isPartialWithdrawalAllowed = value;
            }

            /**
             * Gets the value of the isReplenishable property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsReplenishable() {
                return isReplenishable;
            }

            /**
             * Sets the value of the isReplenishable property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsReplenishable(Boolean value) {
                this.isReplenishable = value;
            }

            /**
             * Gets the value of the nextPaymentAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNextPaymentAmount() {
                return nextPaymentAmount;
            }

            /**
             * Sets the value of the nextPaymentAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNextPaymentAmount(BigDecimal value) {
                this.nextPaymentAmount = value;
            }

            /**
             * Gets the value of the nextPaymentDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getNextPaymentDate() {
                return nextPaymentDate;
            }

            /**
             * Sets the value of the nextPaymentDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setNextPaymentDate(XMLGregorianCalendar value) {
                this.nextPaymentDate = value;
            }

            /**
             * Gets the value of the debtAmountCcy property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDebtAmountCcy() {
                return debtAmountCcy;
            }

            /**
             * Sets the value of the debtAmountCcy property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDebtAmountCcy(BigDecimal value) {
                this.debtAmountCcy = value;
            }

            /**
             * Gets the value of the debtAmountRub property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDebtAmountRub() {
                return debtAmountRub;
            }

            /**
             * Sets the value of the debtAmountRub property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDebtAmountRub(BigDecimal value) {
                this.debtAmountRub = value;
            }

            /**
             * Gets the value of the debtBalanceDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDebtBalanceDate() {
                return debtBalanceDate;
            }

            /**
             * Sets the value of the debtBalanceDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDebtBalanceDate(XMLGregorianCalendar value) {
                this.debtBalanceDate = value;
            }

            /**
             * Gets the value of the overdueAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getOverdueAmount() {
                return overdueAmount;
            }

            /**
             * Sets the value of the overdueAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setOverdueAmount(BigDecimal value) {
                this.overdueAmount = value;
            }

            /**
             * Gets the value of the overdueStatementDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getOverdueStatementDate() {
                return overdueStatementDate;
            }

            /**
             * Sets the value of the overdueStatementDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setOverdueStatementDate(XMLGregorianCalendar value) {
                this.overdueStatementDate = value;
            }

            /**
             * Gets the value of the penaltyForOverdueDebt property.
             * 
             * @return
             *     possible object is
             *     {@link ClientAccountsAbs.Account.Contract.PenaltyForOverdueDebt }
             *     
             */
            public ClientAccountsAbs.Account.Contract.PenaltyForOverdueDebt getPenaltyForOverdueDebt() {
                return penaltyForOverdueDebt;
            }

            /**
             * Sets the value of the penaltyForOverdueDebt property.
             * 
             * @param value
             *     allowed object is
             *     {@link ClientAccountsAbs.Account.Contract.PenaltyForOverdueDebt }
             *     
             */
            public void setPenaltyForOverdueDebt(ClientAccountsAbs.Account.Contract.PenaltyForOverdueDebt value) {
                this.penaltyForOverdueDebt = value;
            }

            /**
             * Gets the value of the penaltyForInterest property.
             * 
             * @return
             *     possible object is
             *     {@link ClientAccountsAbs.Account.Contract.PenaltyForInterest }
             *     
             */
            public ClientAccountsAbs.Account.Contract.PenaltyForInterest getPenaltyForInterest() {
                return penaltyForInterest;
            }

            /**
             * Sets the value of the penaltyForInterest property.
             * 
             * @param value
             *     allowed object is
             *     {@link ClientAccountsAbs.Account.Contract.PenaltyForInterest }
             *     
             */
            public void setPenaltyForInterest(ClientAccountsAbs.Account.Contract.PenaltyForInterest value) {
                this.penaltyForInterest = value;
            }

            /**
             * Gets the value of the penaltyForTrancheCommission property.
             * 
             * @return
             *     possible object is
             *     {@link ClientAccountsAbs.Account.Contract.PenaltyForTrancheCommission }
             *     
             */
            public ClientAccountsAbs.Account.Contract.PenaltyForTrancheCommission getPenaltyForTrancheCommission() {
                return penaltyForTrancheCommission;
            }

            /**
             * Sets the value of the penaltyForTrancheCommission property.
             * 
             * @param value
             *     allowed object is
             *     {@link ClientAccountsAbs.Account.Contract.PenaltyForTrancheCommission }
             *     
             */
            public void setPenaltyForTrancheCommission(ClientAccountsAbs.Account.Contract.PenaltyForTrancheCommission value) {
                this.penaltyForTrancheCommission = value;
            }

            /**
             * Gets the value of the limit property.
             * 
             * @return
             *     possible object is
             *     {@link ClientAccountsAbs.Account.Contract.Limit }
             *     
             */
            public ClientAccountsAbs.Account.Contract.Limit getLimit() {
                return limit;
            }

            /**
             * Sets the value of the limit property.
             * 
             * @param value
             *     allowed object is
             *     {@link ClientAccountsAbs.Account.Contract.Limit }
             *     
             */
            public void setLimit(ClientAccountsAbs.Account.Contract.Limit value) {
                this.limit = value;
            }

            /**
             * Gets the value of the netCreditFlow property.
             * 
             * @return
             *     possible object is
             *     {@link ClientAccountsAbs.Account.Contract.NetCreditFlow }
             *     
             */
            public ClientAccountsAbs.Account.Contract.NetCreditFlow getNetCreditFlow() {
                return netCreditFlow;
            }

            /**
             * Sets the value of the netCreditFlow property.
             * 
             * @param value
             *     allowed object is
             *     {@link ClientAccountsAbs.Account.Contract.NetCreditFlow }
             *     
             */
            public void setNetCreditFlow(ClientAccountsAbs.Account.Contract.NetCreditFlow value) {
                this.netCreditFlow = value;
            }

            /**
             * Gets the value of the mainDebtAccruedInterest property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMainDebtAccruedInterest() {
                return mainDebtAccruedInterest;
            }

            /**
             * Sets the value of the mainDebtAccruedInterest property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMainDebtAccruedInterest(BigDecimal value) {
                this.mainDebtAccruedInterest = value;
            }

            /**
             * Gets the value of the commissionAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCommissionAmount() {
                return commissionAmount;
            }

            /**
             * Sets the value of the commissionAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCommissionAmount(BigDecimal value) {
                this.commissionAmount = value;
            }

            /**
             * Gets the value of the totalOverdueAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalOverdueAmount() {
                return totalOverdueAmount;
            }

            /**
             * Sets the value of the totalOverdueAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalOverdueAmount(BigDecimal value) {
                this.totalOverdueAmount = value;
            }

            /**
             * Gets the value of the overdueInterest property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getOverdueInterest() {
                return overdueInterest;
            }

            /**
             * Sets the value of the overdueInterest property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setOverdueInterest(BigDecimal value) {
                this.overdueInterest = value;
            }

            /**
             * Gets the value of the overdueCommission property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getOverdueCommission() {
                return overdueCommission;
            }

            /**
             * Sets the value of the overdueCommission property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setOverdueCommission(BigDecimal value) {
                this.overdueCommission = value;
            }

            /**
             * Gets the value of the otherPenalties property.
             * 
             * @return
             *     possible object is
             *     {@link ClientAccountsAbs.Account.Contract.OtherPenalties }
             *     
             */
            public ClientAccountsAbs.Account.Contract.OtherPenalties getOtherPenalties() {
                return otherPenalties;
            }

            /**
             * Sets the value of the otherPenalties property.
             * 
             * @param value
             *     allowed object is
             *     {@link ClientAccountsAbs.Account.Contract.OtherPenalties }
             *     
             */
            public void setOtherPenalties(ClientAccountsAbs.Account.Contract.OtherPenalties value) {
                this.otherPenalties = value;
            }

            /**
             * Gets the value of the debtType property.
             * 
             * @return
             *     possible object is
             *     {@link ClientAccountsAbs.Account.Contract.DebtType }
             *     
             */
            public ClientAccountsAbs.Account.Contract.DebtType getDebtType() {
                return debtType;
            }

            /**
             * Sets the value of the debtType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ClientAccountsAbs.Account.Contract.DebtType }
             *     
             */
            public void setDebtType(ClientAccountsAbs.Account.Contract.DebtType value) {
                this.debtType = value;
            }

            /**
             * Gets the value of the isComplex property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsComplex() {
                return isComplex;
            }

            /**
             * Sets the value of the isComplex property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsComplex(Boolean value) {
                this.isComplex = value;
            }

            /**
             * Gets the value of the isTrancheContract property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsTrancheContract() {
                return isTrancheContract;
            }

            /**
             * Sets the value of the isTrancheContract property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsTrancheContract(Boolean value) {
                this.isTrancheContract = value;
            }

            /**
             * Gets the value of the parentContractId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentContractId() {
                return parentContractId;
            }

            /**
             * Sets the value of the parentContractId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentContractId(String value) {
                this.parentContractId = value;
            }

            /**
             * Gets the value of the parentContractNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentContractNumber() {
                return parentContractNumber;
            }

            /**
             * Sets the value of the parentContractNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentContractNumber(String value) {
                this.parentContractNumber = value;
            }

            /**
             * Gets the value of the specType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpecType() {
                return specType;
            }

            /**
             * Sets the value of the specType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpecType(String value) {
                this.specType = value;
            }

            /**
             * Gets the value of the supplementaryAgreements property.
             * 
             * @return
             *     possible object is
             *     {@link ClientAccountsAbs.Account.Contract.SupplementaryAgreements }
             *     
             */
            public ClientAccountsAbs.Account.Contract.SupplementaryAgreements getSupplementaryAgreements() {
                return supplementaryAgreements;
            }

            /**
             * Sets the value of the supplementaryAgreements property.
             * 
             * @param value
             *     allowed object is
             *     {@link ClientAccountsAbs.Account.Contract.SupplementaryAgreements }
             *     
             */
            public void setSupplementaryAgreements(ClientAccountsAbs.Account.Contract.SupplementaryAgreements value) {
                this.supplementaryAgreements = value;
            }

            /**
             * Gets the value of the savingsAccountInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ClientAccountsAbs.Account.Contract.SavingsAccountInfo }
             *     
             */
            public ClientAccountsAbs.Account.Contract.SavingsAccountInfo getSavingsAccountInfo() {
                return savingsAccountInfo;
            }

            /**
             * Sets the value of the savingsAccountInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ClientAccountsAbs.Account.Contract.SavingsAccountInfo }
             *     
             */
            public void setSavingsAccountInfo(ClientAccountsAbs.Account.Contract.SavingsAccountInfo value) {
                this.savingsAccountInfo = value;
            }

            /**
             * Gets the value of the startingDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getStartingDate() {
                return startingDate;
            }

            /**
             * Sets the value of the startingDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setStartingDate(XMLGregorianCalendar value) {
                this.startingDate = value;
            }

            /**
             * Gets the value of the returnDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getReturnDate() {
                return returnDate;
            }

            /**
             * Sets the value of the returnDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setReturnDate(XMLGregorianCalendar value) {
                this.returnDate = value;
            }

            /**
             * Gets the value of the dealsAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDealsAmount() {
                return dealsAmount;
            }

            /**
             * Sets the value of the dealsAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDealsAmount(BigDecimal value) {
                this.dealsAmount = value;
            }

            /**
             * Gets the value of the isEarlyDissolution property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsEarlyDissolution() {
                return isEarlyDissolution;
            }

            /**
             * Sets the value of the isEarlyDissolution property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsEarlyDissolution(Boolean value) {
                this.isEarlyDissolution = value;
            }

            /**
             * Gets the value of the isManualAccompaniment property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsManualAccompaniment() {
                return isManualAccompaniment;
            }

            /**
             * Sets the value of the isManualAccompaniment property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsManualAccompaniment(Boolean value) {
                this.isManualAccompaniment = value;
            }

            /**
             * Gets the value of the isIndividual property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsIndividual() {
                return isIndividual;
            }

            /**
             * Sets the value of the isIndividual property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsIndividual(Boolean value) {
                this.isIndividual = value;
            }

            /**
             * Gets the value of the returnAccount property.
             * 
             * @return
             *     possible object is
             *     {@link ClientAccountsAbs.Account.Contract.ReturnAccount }
             *     
             */
            public ClientAccountsAbs.Account.Contract.ReturnAccount getReturnAccount() {
                return returnAccount;
            }

            /**
             * Sets the value of the returnAccount property.
             * 
             * @param value
             *     allowed object is
             *     {@link ClientAccountsAbs.Account.Contract.ReturnAccount }
             *     
             */
            public void setReturnAccount(ClientAccountsAbs.Account.Contract.ReturnAccount value) {
                this.returnAccount = value;
            }

            /**
             * Gets the value of the isSignOfDirectWriteOff property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsSignOfDirectWriteOff() {
                return isSignOfDirectWriteOff;
            }

            /**
             * Sets the value of the isSignOfDirectWriteOff property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsSignOfDirectWriteOff(Boolean value) {
                this.isSignOfDirectWriteOff = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="DebtRepayment" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *                   &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="InterestRepayment" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *                   &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="CommissionRepayment" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *                   &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "debtRepayment",
                "interestRepayment",
                "commissionRepayment"
            })
            public static class DebtType {

                @XmlElement(name = "DebtRepayment")
                protected ClientAccountsAbs.Account.Contract.DebtType.DebtRepayment debtRepayment;
                @XmlElement(name = "InterestRepayment")
                protected ClientAccountsAbs.Account.Contract.DebtType.InterestRepayment interestRepayment;
                @XmlElement(name = "CommissionRepayment")
                protected ClientAccountsAbs.Account.Contract.DebtType.CommissionRepayment commissionRepayment;

                /**
                 * Gets the value of the debtRepayment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ClientAccountsAbs.Account.Contract.DebtType.DebtRepayment }
                 *     
                 */
                public ClientAccountsAbs.Account.Contract.DebtType.DebtRepayment getDebtRepayment() {
                    return debtRepayment;
                }

                /**
                 * Sets the value of the debtRepayment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ClientAccountsAbs.Account.Contract.DebtType.DebtRepayment }
                 *     
                 */
                public void setDebtRepayment(ClientAccountsAbs.Account.Contract.DebtType.DebtRepayment value) {
                    this.debtRepayment = value;
                }

                /**
                 * Gets the value of the interestRepayment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ClientAccountsAbs.Account.Contract.DebtType.InterestRepayment }
                 *     
                 */
                public ClientAccountsAbs.Account.Contract.DebtType.InterestRepayment getInterestRepayment() {
                    return interestRepayment;
                }

                /**
                 * Sets the value of the interestRepayment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ClientAccountsAbs.Account.Contract.DebtType.InterestRepayment }
                 *     
                 */
                public void setInterestRepayment(ClientAccountsAbs.Account.Contract.DebtType.InterestRepayment value) {
                    this.interestRepayment = value;
                }

                /**
                 * Gets the value of the commissionRepayment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ClientAccountsAbs.Account.Contract.DebtType.CommissionRepayment }
                 *     
                 */
                public ClientAccountsAbs.Account.Contract.DebtType.CommissionRepayment getCommissionRepayment() {
                    return commissionRepayment;
                }

                /**
                 * Sets the value of the commissionRepayment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ClientAccountsAbs.Account.Contract.DebtType.CommissionRepayment }
                 *     
                 */
                public void setCommissionRepayment(ClientAccountsAbs.Account.Contract.DebtType.CommissionRepayment value) {
                    this.commissionRepayment = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
                 *         &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "nextPaymentDate",
                    "nextPaymentAmount"
                })
                public static class CommissionRepayment {

                    @XmlElement(name = "NextPaymentDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar nextPaymentDate;
                    @XmlElement(name = "NextPaymentAmount")
                    protected BigDecimal nextPaymentAmount;

                    /**
                     * Gets the value of the nextPaymentDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getNextPaymentDate() {
                        return nextPaymentDate;
                    }

                    /**
                     * Sets the value of the nextPaymentDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setNextPaymentDate(XMLGregorianCalendar value) {
                        this.nextPaymentDate = value;
                    }

                    /**
                     * Gets the value of the nextPaymentAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getNextPaymentAmount() {
                        return nextPaymentAmount;
                    }

                    /**
                     * Sets the value of the nextPaymentAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setNextPaymentAmount(BigDecimal value) {
                        this.nextPaymentAmount = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
                 *         &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "nextPaymentDate",
                    "nextPaymentAmount"
                })
                public static class DebtRepayment {

                    @XmlElement(name = "NextPaymentDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar nextPaymentDate;
                    @XmlElement(name = "NextPaymentAmount")
                    protected BigDecimal nextPaymentAmount;

                    /**
                     * Gets the value of the nextPaymentDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getNextPaymentDate() {
                        return nextPaymentDate;
                    }

                    /**
                     * Sets the value of the nextPaymentDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setNextPaymentDate(XMLGregorianCalendar value) {
                        this.nextPaymentDate = value;
                    }

                    /**
                     * Gets the value of the nextPaymentAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getNextPaymentAmount() {
                        return nextPaymentAmount;
                    }

                    /**
                     * Sets the value of the nextPaymentAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setNextPaymentAmount(BigDecimal value) {
                        this.nextPaymentAmount = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="NextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
                 *         &lt;element name="NextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "nextPaymentDate",
                    "nextPaymentAmount"
                })
                public static class InterestRepayment {

                    @XmlElement(name = "NextPaymentDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar nextPaymentDate;
                    @XmlElement(name = "NextPaymentAmount")
                    protected BigDecimal nextPaymentAmount;

                    /**
                     * Gets the value of the nextPaymentDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getNextPaymentDate() {
                        return nextPaymentDate;
                    }

                    /**
                     * Sets the value of the nextPaymentDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setNextPaymentDate(XMLGregorianCalendar value) {
                        this.nextPaymentDate = value;
                    }

                    /**
                     * Gets the value of the nextPaymentAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getNextPaymentAmount() {
                        return nextPaymentAmount;
                    }

                    /**
                     * Sets the value of the nextPaymentAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setNextPaymentAmount(BigDecimal value) {
                        this.nextPaymentAmount = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Current" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="Unused" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "type",
                "typeCode",
                "current",
                "max",
                "unused"
            })
            public static class Limit {

                @XmlElement(name = "Type")
                protected String type;
                @XmlElement(name = "TypeCode")
                protected String typeCode;
                @XmlElement(name = "Current")
                protected BigDecimal current;
                @XmlElement(name = "Max")
                protected BigDecimal max;
                @XmlElement(name = "Unused")
                protected BigDecimal unused;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the typeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTypeCode() {
                    return typeCode;
                }

                /**
                 * Sets the value of the typeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTypeCode(String value) {
                    this.typeCode = value;
                }

                /**
                 * Gets the value of the current property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCurrent() {
                    return current;
                }

                /**
                 * Sets the value of the current property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCurrent(BigDecimal value) {
                    this.current = value;
                }

                /**
                 * Gets the value of the max property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMax() {
                    return max;
                }

                /**
                 * Sets the value of the max property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMax(BigDecimal value) {
                    this.max = value;
                }

                /**
                 * Gets the value of the unused property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getUnused() {
                    return unused;
                }

                /**
                 * Sets the value of the unused property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setUnused(BigDecimal value) {
                    this.unused = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="AgreementValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="CalculatedValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="CalculatedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="LimitChangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "agreementValue",
                "calculatedValue",
                "calculatedLimit",
                "limitChangeDate"
            })
            public static class NetCreditFlow {

                @XmlElement(name = "AgreementValue")
                protected BigDecimal agreementValue;
                @XmlElement(name = "CalculatedValue")
                protected BigDecimal calculatedValue;
                @XmlElement(name = "CalculatedLimit")
                protected BigDecimal calculatedLimit;
                @XmlElement(name = "LimitChangeDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar limitChangeDate;

                /**
                 * Gets the value of the agreementValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAgreementValue() {
                    return agreementValue;
                }

                /**
                 * Sets the value of the agreementValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAgreementValue(BigDecimal value) {
                    this.agreementValue = value;
                }

                /**
                 * Gets the value of the calculatedValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCalculatedValue() {
                    return calculatedValue;
                }

                /**
                 * Sets the value of the calculatedValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCalculatedValue(BigDecimal value) {
                    this.calculatedValue = value;
                }

                /**
                 * Gets the value of the calculatedLimit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCalculatedLimit() {
                    return calculatedLimit;
                }

                /**
                 * Sets the value of the calculatedLimit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCalculatedLimit(BigDecimal value) {
                    this.calculatedLimit = value;
                }

                /**
                 * Gets the value of the limitChangeDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLimitChangeDate() {
                    return limitChangeDate;
                }

                /**
                 * Sets the value of the limitChangeDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLimitChangeDate(XMLGregorianCalendar value) {
                    this.limitChangeDate = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="OtherPenalty" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "otherPenalty"
            })
            public static class OtherPenalties {

                @XmlElement(name = "OtherPenalty", required = true)
                protected List<ClientAccountsAbs.Account.Contract.OtherPenalties.OtherPenalty> otherPenalty;

                /**
                 * Gets the value of the otherPenalty property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a <CODE>set</CODE> method for the otherPenalty property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOtherPenalty().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ClientAccountsAbs.Account.Contract.OtherPenalties.OtherPenalty }
                 * 
                 * 
                 */
                public List<ClientAccountsAbs.Account.Contract.OtherPenalties.OtherPenalty> getOtherPenalty() {
                    if (otherPenalty == null) {
                        otherPenalty = new ArrayList<ClientAccountsAbs.Account.Contract.OtherPenalties.OtherPenalty>();
                    }
                    return this.otherPenalty;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
                 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "date",
                    "amount",
                    "code",
                    "name"
                })
                public static class OtherPenalty {

                    @XmlElement(name = "Date")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar date;
                    @XmlElement(name = "Amount")
                    protected BigDecimal amount;
                    @XmlElement(name = "Code")
                    protected String code;
                    @XmlElement(name = "Name")
                    protected String name;

                    /**
                     * Gets the value of the date property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDate() {
                        return date;
                    }

                    /**
                     * Sets the value of the date property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDate(XMLGregorianCalendar value) {
                        this.date = value;
                    }

                    /**
                     * Gets the value of the amount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getAmount() {
                        return amount;
                    }

                    /**
                     * Sets the value of the amount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setAmount(BigDecimal value) {
                        this.amount = value;
                    }

                    /**
                     * Gets the value of the code property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "date",
                "amount"
            })
            public static class PenaltyForInterest {

                @XmlElement(name = "Date")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar date;
                @XmlElement(name = "Amount")
                protected BigDecimal amount;

                /**
                 * Gets the value of the date property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDate() {
                    return date;
                }

                /**
                 * Sets the value of the date property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDate(XMLGregorianCalendar value) {
                    this.date = value;
                }

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmount(BigDecimal value) {
                    this.amount = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "date",
                "amount"
            })
            public static class PenaltyForOverdueDebt {

                @XmlElement(name = "Date")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar date;
                @XmlElement(name = "Amount")
                protected BigDecimal amount;

                /**
                 * Gets the value of the date property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDate() {
                    return date;
                }

                /**
                 * Sets the value of the date property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDate(XMLGregorianCalendar value) {
                    this.date = value;
                }

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmount(BigDecimal value) {
                    this.amount = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "date",
                "amount"
            })
            public static class PenaltyForTrancheCommission {

                @XmlElement(name = "Date")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar date;
                @XmlElement(name = "Amount")
                protected BigDecimal amount;

                /**
                 * Gets the value of the date property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDate() {
                    return date;
                }

                /**
                 * Sets the value of the date property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDate(XMLGregorianCalendar value) {
                    this.date = value;
                }

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmount(BigDecimal value) {
                    this.amount = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Bic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Swift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "number",
                "type",
                "bic",
                "swift"
            })
            public static class ReturnAccount {

                @XmlElement(name = "Number")
                protected String number;
                @XmlElement(name = "Type")
                protected String type;
                @XmlElement(name = "Bic")
                protected String bic;
                @XmlElement(name = "Swift")
                protected String swift;

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumber(String value) {
                    this.number = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the bic property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBic() {
                    return bic;
                }

                /**
                 * Sets the value of the bic property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBic(String value) {
                    this.bic = value;
                }

                /**
                 * Gets the value of the swift property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSwift() {
                    return swift;
                }

                /**
                 * Sets the value of the swift property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSwift(String value) {
                    this.swift = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="OpeningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *         &lt;element name="IsAvailableToClient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="IsAutoReplenishable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *         &lt;element name="AutoReplenishmentRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="AutoReplenishmentAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Contract" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *         &lt;element name="IsInterestCalculation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name",
                "openingDate",
                "isAvailableToClient",
                "accountNumber",
                "isAutoReplenishable",
                "autoReplenishmentRate",
                "autoReplenishmentAccountNumber",
                "contract",
                "isInterestCalculation"
            })
            public static class SavingsAccountInfo {

                @XmlElement(name = "Name")
                protected String name;
                @XmlElement(name = "OpeningDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar openingDate;
                @XmlElement(name = "IsAvailableToClient")
                protected Boolean isAvailableToClient;
                @XmlElement(name = "AccountNumber")
                protected String accountNumber;
                @XmlElement(name = "IsAutoReplenishable")
                protected Boolean isAutoReplenishable;
                @XmlElement(name = "AutoReplenishmentRate")
                protected String autoReplenishmentRate;
                @XmlElement(name = "AutoReplenishmentAccountNumber")
                protected String autoReplenishmentAccountNumber;
                @XmlElement(name = "Contract")
                protected Long contract;
                @XmlElement(name = "IsInterestCalculation")
                protected Boolean isInterestCalculation;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the openingDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getOpeningDate() {
                    return openingDate;
                }

                /**
                 * Sets the value of the openingDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setOpeningDate(XMLGregorianCalendar value) {
                    this.openingDate = value;
                }

                /**
                 * Gets the value of the isAvailableToClient property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isIsAvailableToClient() {
                    return isAvailableToClient;
                }

                /**
                 * Sets the value of the isAvailableToClient property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setIsAvailableToClient(Boolean value) {
                    this.isAvailableToClient = value;
                }

                /**
                 * Gets the value of the accountNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccountNumber() {
                    return accountNumber;
                }

                /**
                 * Sets the value of the accountNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccountNumber(String value) {
                    this.accountNumber = value;
                }

                /**
                 * Gets the value of the isAutoReplenishable property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isIsAutoReplenishable() {
                    return isAutoReplenishable;
                }

                /**
                 * Sets the value of the isAutoReplenishable property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setIsAutoReplenishable(Boolean value) {
                    this.isAutoReplenishable = value;
                }

                /**
                 * Gets the value of the autoReplenishmentRate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAutoReplenishmentRate() {
                    return autoReplenishmentRate;
                }

                /**
                 * Sets the value of the autoReplenishmentRate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAutoReplenishmentRate(String value) {
                    this.autoReplenishmentRate = value;
                }

                /**
                 * Gets the value of the autoReplenishmentAccountNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAutoReplenishmentAccountNumber() {
                    return autoReplenishmentAccountNumber;
                }

                /**
                 * Sets the value of the autoReplenishmentAccountNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAutoReplenishmentAccountNumber(String value) {
                    this.autoReplenishmentAccountNumber = value;
                }

                /**
                 * Gets the value of the contract property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getContract() {
                    return contract;
                }

                /**
                 * Sets the value of the contract property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setContract(Long value) {
                    this.contract = value;
                }

                /**
                 * Gets the value of the isInterestCalculation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isIsInterestCalculation() {
                    return isInterestCalculation;
                }

                /**
                 * Sets the value of the isInterestCalculation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setIsInterestCalculation(Boolean value) {
                    this.isInterestCalculation = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="SupplementaryAgreement" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *                   &lt;element name="ClosingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *                   &lt;element name="IsMinimumBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *                   &lt;element name="IsMinimumMonthlyBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *                   &lt;element name="IsMinimumDailyBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *                   &lt;element name="IsMinimumCorporateMonthlyBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *                   &lt;element name="IsIndividual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *                   &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="OpeningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *                   &lt;element name="StartingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *                   &lt;element name="ClosingDateActual" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *                   &lt;element name="ValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *                   &lt;element name="InterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="MinimumBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="IsCollection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *                   &lt;element name="DealsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="DealsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "supplementaryAgreement"
            })
            public static class SupplementaryAgreements {

                @XmlElement(name = "SupplementaryAgreement", required = true)
                protected List<ClientAccountsAbs.Account.Contract.SupplementaryAgreements.SupplementaryAgreement> supplementaryAgreement;

                /**
                 * Gets the value of the supplementaryAgreement property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a <CODE>set</CODE> method for the supplementaryAgreement property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSupplementaryAgreement().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ClientAccountsAbs.Account.Contract.SupplementaryAgreements.SupplementaryAgreement }
                 * 
                 * 
                 */
                public List<ClientAccountsAbs.Account.Contract.SupplementaryAgreements.SupplementaryAgreement> getSupplementaryAgreement() {
                    if (supplementaryAgreement == null) {
                        supplementaryAgreement = new ArrayList<ClientAccountsAbs.Account.Contract.SupplementaryAgreements.SupplementaryAgreement>();
                    }
                    return this.supplementaryAgreement;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
                 *         &lt;element name="ClosingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
                 *         &lt;element name="IsMinimumBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
                 *         &lt;element name="IsMinimumMonthlyBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
                 *         &lt;element name="IsMinimumDailyBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
                 *         &lt;element name="IsMinimumCorporateMonthlyBalanceOptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
                 *         &lt;element name="IsIndividual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
                 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="OpeningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
                 *         &lt;element name="StartingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
                 *         &lt;element name="ClosingDateActual" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
                 *         &lt;element name="ValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
                 *         &lt;element name="InterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="MinimumBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="IsCollection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
                 *         &lt;element name="DealsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="DealsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "type",
                    "number",
                    "signingDate",
                    "closingDate",
                    "isMinimumBalanceOptionEnabled",
                    "isMinimumMonthlyBalanceOptionEnabled",
                    "isMinimumDailyBalanceOptionEnabled",
                    "isMinimumCorporateMonthlyBalanceOptionEnabled",
                    "isIndividual",
                    "productName",
                    "openingDate",
                    "startingDate",
                    "closingDateActual",
                    "validityPeriod",
                    "interestRate",
                    "minimumBalance",
                    "accountNumber",
                    "isCollection",
                    "dealsId",
                    "dealsNumber"
                })
                public static class SupplementaryAgreement {

                    @XmlElement(name = "Type")
                    protected String type;
                    @XmlElement(name = "Number")
                    protected String number;
                    @XmlElement(name = "SigningDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar signingDate;
                    @XmlElement(name = "ClosingDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar closingDate;
                    @XmlElement(name = "IsMinimumBalanceOptionEnabled")
                    protected Boolean isMinimumBalanceOptionEnabled;
                    @XmlElement(name = "IsMinimumMonthlyBalanceOptionEnabled")
                    protected Boolean isMinimumMonthlyBalanceOptionEnabled;
                    @XmlElement(name = "IsMinimumDailyBalanceOptionEnabled")
                    protected Boolean isMinimumDailyBalanceOptionEnabled;
                    @XmlElement(name = "IsMinimumCorporateMonthlyBalanceOptionEnabled")
                    protected Boolean isMinimumCorporateMonthlyBalanceOptionEnabled;
                    @XmlElement(name = "IsIndividual")
                    protected Boolean isIndividual;
                    @XmlElement(name = "ProductName")
                    protected String productName;
                    @XmlElement(name = "OpeningDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar openingDate;
                    @XmlElement(name = "StartingDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar startingDate;
                    @XmlElement(name = "ClosingDateActual")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar closingDateActual;
                    @XmlElement(name = "ValidityPeriod")
                    protected BigInteger validityPeriod;
                    @XmlElement(name = "InterestRate")
                    protected String interestRate;
                    @XmlElement(name = "MinimumBalance")
                    protected BigDecimal minimumBalance;
                    @XmlElement(name = "AccountNumber")
                    protected String accountNumber;
                    @XmlElement(name = "IsCollection")
                    protected Boolean isCollection;
                    @XmlElement(name = "DealsId")
                    protected String dealsId;
                    @XmlElement(name = "DealsNumber")
                    protected String dealsNumber;

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * Gets the value of the number property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumber() {
                        return number;
                    }

                    /**
                     * Sets the value of the number property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumber(String value) {
                        this.number = value;
                    }

                    /**
                     * Gets the value of the signingDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getSigningDate() {
                        return signingDate;
                    }

                    /**
                     * Sets the value of the signingDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setSigningDate(XMLGregorianCalendar value) {
                        this.signingDate = value;
                    }

                    /**
                     * Gets the value of the closingDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getClosingDate() {
                        return closingDate;
                    }

                    /**
                     * Sets the value of the closingDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setClosingDate(XMLGregorianCalendar value) {
                        this.closingDate = value;
                    }

                    /**
                     * Gets the value of the isMinimumBalanceOptionEnabled property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isIsMinimumBalanceOptionEnabled() {
                        return isMinimumBalanceOptionEnabled;
                    }

                    /**
                     * Sets the value of the isMinimumBalanceOptionEnabled property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setIsMinimumBalanceOptionEnabled(Boolean value) {
                        this.isMinimumBalanceOptionEnabled = value;
                    }

                    /**
                     * Gets the value of the isMinimumMonthlyBalanceOptionEnabled property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isIsMinimumMonthlyBalanceOptionEnabled() {
                        return isMinimumMonthlyBalanceOptionEnabled;
                    }

                    /**
                     * Sets the value of the isMinimumMonthlyBalanceOptionEnabled property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setIsMinimumMonthlyBalanceOptionEnabled(Boolean value) {
                        this.isMinimumMonthlyBalanceOptionEnabled = value;
                    }

                    /**
                     * Gets the value of the isMinimumDailyBalanceOptionEnabled property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isIsMinimumDailyBalanceOptionEnabled() {
                        return isMinimumDailyBalanceOptionEnabled;
                    }

                    /**
                     * Sets the value of the isMinimumDailyBalanceOptionEnabled property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setIsMinimumDailyBalanceOptionEnabled(Boolean value) {
                        this.isMinimumDailyBalanceOptionEnabled = value;
                    }

                    /**
                     * Gets the value of the isMinimumCorporateMonthlyBalanceOptionEnabled property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isIsMinimumCorporateMonthlyBalanceOptionEnabled() {
                        return isMinimumCorporateMonthlyBalanceOptionEnabled;
                    }

                    /**
                     * Sets the value of the isMinimumCorporateMonthlyBalanceOptionEnabled property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setIsMinimumCorporateMonthlyBalanceOptionEnabled(Boolean value) {
                        this.isMinimumCorporateMonthlyBalanceOptionEnabled = value;
                    }

                    /**
                     * Gets the value of the isIndividual property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isIsIndividual() {
                        return isIndividual;
                    }

                    /**
                     * Sets the value of the isIndividual property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setIsIndividual(Boolean value) {
                        this.isIndividual = value;
                    }

                    /**
                     * Gets the value of the productName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProductName() {
                        return productName;
                    }

                    /**
                     * Sets the value of the productName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProductName(String value) {
                        this.productName = value;
                    }

                    /**
                     * Gets the value of the openingDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getOpeningDate() {
                        return openingDate;
                    }

                    /**
                     * Sets the value of the openingDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setOpeningDate(XMLGregorianCalendar value) {
                        this.openingDate = value;
                    }

                    /**
                     * Gets the value of the startingDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getStartingDate() {
                        return startingDate;
                    }

                    /**
                     * Sets the value of the startingDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setStartingDate(XMLGregorianCalendar value) {
                        this.startingDate = value;
                    }

                    /**
                     * Gets the value of the closingDateActual property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getClosingDateActual() {
                        return closingDateActual;
                    }

                    /**
                     * Sets the value of the closingDateActual property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setClosingDateActual(XMLGregorianCalendar value) {
                        this.closingDateActual = value;
                    }

                    /**
                     * Gets the value of the validityPeriod property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getValidityPeriod() {
                        return validityPeriod;
                    }

                    /**
                     * Sets the value of the validityPeriod property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setValidityPeriod(BigInteger value) {
                        this.validityPeriod = value;
                    }

                    /**
                     * Gets the value of the interestRate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInterestRate() {
                        return interestRate;
                    }

                    /**
                     * Sets the value of the interestRate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInterestRate(String value) {
                        this.interestRate = value;
                    }

                    /**
                     * Gets the value of the minimumBalance property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMinimumBalance() {
                        return minimumBalance;
                    }

                    /**
                     * Sets the value of the minimumBalance property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMinimumBalance(BigDecimal value) {
                        this.minimumBalance = value;
                    }

                    /**
                     * Gets the value of the accountNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAccountNumber() {
                        return accountNumber;
                    }

                    /**
                     * Sets the value of the accountNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAccountNumber(String value) {
                        this.accountNumber = value;
                    }

                    /**
                     * Gets the value of the isCollection property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isIsCollection() {
                        return isCollection;
                    }

                    /**
                     * Sets the value of the isCollection property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setIsCollection(Boolean value) {
                        this.isCollection = value;
                    }

                    /**
                     * Gets the value of the dealsId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDealsId() {
                        return dealsId;
                    }

                    /**
                     * Sets the value of the dealsId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDealsId(String value) {
                        this.dealsId = value;
                    }

                    /**
                     * Gets the value of the dealsNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDealsNumber() {
                        return dealsNumber;
                    }

                    /**
                     * Sets the value of the dealsNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDealsNumber(String value) {
                        this.dealsNumber = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="DboInfo" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="DboCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="DboName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "dboInfo"
        })
        public static class DboInfo {

            @XmlElement(name = "DboInfo", required = true)
            protected List<ClientAccountsAbs.Account.DboInfo.DboInfoo> dboInfo;

            /**
             * Gets the value of the dboInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the dboInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDboInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ClientAccountsAbs.Account.DboInfo.DboInfo }
             * 
             * 
             */
            public List<ClientAccountsAbs.Account.DboInfo.DboInfoo> getDboInfo() {
                if (dboInfo == null) {
                    dboInfo = new ArrayList<ClientAccountsAbs.Account.DboInfo.DboInfoo>();
                }
                return this.dboInfo;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="DboCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="DboName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "dboCode",
                "dboName",
                "isActive"
            })
            public static class DboInfoo {

                @XmlElement(name = "DboCode", required = true)
                protected String dboCode;
                @XmlElement(name = "DboName", required = true)
                protected String dboName;
                @XmlElement(name = "IsActive")
                protected boolean isActive;

                /**
                 * Gets the value of the dboCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDboCode() {
                    return dboCode;
                }

                /**
                 * Sets the value of the dboCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDboCode(String value) {
                    this.dboCode = value;
                }

                /**
                 * Gets the value of the dboName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDboName() {
                    return dboName;
                }

                /**
                 * Sets the value of the dboName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDboName(String value) {
                    this.dboName = value;
                }

                /**
                 * Gets the value of the isActive property.
                 * 
                 */
                public boolean isIsActive() {
                    return isActive;
                }

                /**
                 * Sets the value of the isActive property.
                 * 
                 */
                public void setIsActive(boolean value) {
                    this.isActive = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="BisCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="SapDepartmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ReferenceCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "bisCode",
            "sapDepartmentId",
            "referenceCode",
            "branchCode"
        })
        public static class Department {

            @XmlElement(name = "BisCode")
            protected BigInteger bisCode;
            @XmlElement(name = "SapDepartmentId")
            protected String sapDepartmentId;
            @XmlElement(name = "ReferenceCode", required = true)
            protected BigInteger referenceCode;
            @XmlElement(name = "BranchCode", required = true)
            protected BigInteger branchCode;

            /**
             * Gets the value of the bisCode property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getBisCode() {
                return bisCode;
            }

            /**
             * Sets the value of the bisCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setBisCode(BigInteger value) {
                this.bisCode = value;
            }

            /**
             * Gets the value of the sapDepartmentId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSapDepartmentId() {
                return sapDepartmentId;
            }

            /**
             * Sets the value of the sapDepartmentId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSapDepartmentId(String value) {
                this.sapDepartmentId = value;
            }

            /**
             * Gets the value of the referenceCode property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getReferenceCode() {
                return referenceCode;
            }

            /**
             * Sets the value of the referenceCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setReferenceCode(BigInteger value) {
                this.referenceCode = value;
            }

            /**
             * Gets the value of the branchCode property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getBranchCode() {
                return branchCode;
            }

            /**
             * Sets the value of the branchCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setBranchCode(BigInteger value) {
                this.branchCode = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Bic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Kpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="InterBankingOperationAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Swift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "bankName",
            "bic",
            "tin",
            "kpp",
            "interBankingOperationAccount",
            "swift"
        })
        public static class Details {

            @XmlElement(name = "BankName", required = true)
            protected String bankName;
            @XmlElement(name = "Bic")
            protected String bic;
            @XmlElement(name = "Tin")
            protected String tin;
            @XmlElement(name = "Kpp")
            protected String kpp;
            @XmlElement(name = "InterBankingOperationAccount")
            protected String interBankingOperationAccount;
            @XmlElement(name = "Swift")
            protected String swift;

            /**
             * Gets the value of the bankName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankName() {
                return bankName;
            }

            /**
             * Sets the value of the bankName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankName(String value) {
                this.bankName = value;
            }

            /**
             * Gets the value of the bic property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBic() {
                return bic;
            }

            /**
             * Sets the value of the bic property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBic(String value) {
                this.bic = value;
            }

            /**
             * Gets the value of the tin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTin() {
                return tin;
            }

            /**
             * Sets the value of the tin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTin(String value) {
                this.tin = value;
            }

            /**
             * Gets the value of the kpp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKpp() {
                return kpp;
            }

            /**
             * Sets the value of the kpp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKpp(String value) {
                this.kpp = value;
            }

            /**
             * Gets the value of the interBankingOperationAccount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInterBankingOperationAccount() {
                return interBankingOperationAccount;
            }

            /**
             * Sets the value of the interBankingOperationAccount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInterBankingOperationAccount(String value) {
                this.interBankingOperationAccount = value;
            }

            /**
             * Gets the value of the swift property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSwift() {
                return swift;
            }

            /**
             * Sets the value of the swift property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSwift(String value) {
                this.swift = value;
            }

        }

    }

}
