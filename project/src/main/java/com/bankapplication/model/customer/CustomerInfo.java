package com.bankapplication.model.customer;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.bankapplication.dao.BankServicesDAOInterface;
import com.bankapplication.dao.impl.BankServicesDAOImpl;
import com.bankapplication.exception.BusinessException;
import com.bankapplication.model.RegisterModel;
import com.bankapplication.model.account.BankAccountRegister;

public class CustomerInfo {
	
	
	
	//log4j
		private static Logger logger = Logger.getLogger(BankAccountRegister.class);
		
	//Scanner
		
     Scanner scanner = new Scanner(System.in);
     
     
    // private variables declaration	
	private int customerId;
	private String firstName;
	private String lastName;
	private String addressStreetName;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private long SSN;
	private Date joinDate;
	private int customerRegisterId;
	
	//constructor
	
	public CustomerInfo(){
		
	}

	public CustomerInfo(int customerId,String firstName, String lastName, String addressStreetName, String city, String state,
			String zipCode, String phoneNumber, long sSN, Date joinDate, int customerRegisterId) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.addressStreetName = addressStreetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.SSN = sSN;
		this.joinDate = joinDate;
		this.customerRegisterId = customerRegisterId;
	}
	
	
	// Getter and Setter
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddressStreetName() {
		return addressStreetName;
	}

	public void setAddressStreetName(String addressStreetName) {
		this.addressStreetName = addressStreetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getSSN() {
		return SSN;
	}

	public void setSSN(long ssn) {
		this.SSN = ssn;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date localDate) {
		this.joinDate = localDate;
	}

	public int getCustomerRegisterId() {
		return customerRegisterId;
	}

//	public void setCustomerRegisterId(int customerRegisterId) {
//		CustomerRegisterId = customerRegisterId;
//	}
	
	public void setCustomerRegisterId(int CustomerRegisterId) {
	     this.customerRegisterId =CustomerRegisterId;
    }

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	
	}
	
	
	
	

		
	public void askCustomerDetail() {
			
			logger.fatal("Entere First Name :");
			setFirstName(scanner.nextLine().toLowerCase());
			logger.trace("FirstName:" + getFirstName() );
			
			logger.fatal("Entere Surname Name :");
			setLastName(scanner.nextLine().toLowerCase());
			logger.trace("SureName:" + getLastName());
			
			logger.fatal("Address :");
			setAddressStreetName(scanner.nextLine());
			logger.trace("Address:" + getAddressStreetName());
			
			logger.fatal("City :");
			setCity(scanner.nextLine().toLowerCase());
			logger.trace("City:" + getCity());
			
			logger.fatal("State :");
			setState(scanner.nextLine().toLowerCase());
			logger.trace("City:" + getState());
			
			logger.fatal("PhoneNumber :");
			setPhoneNumber(scanner.nextLine().toLowerCase());
			logger.trace("City:" + getPhoneNumber());
			
			logger.fatal("Please Enter 10 digit Social Security Number(SSN) : ");
			setSSN(Long.parseLong(scanner.nextLine()));
			logger.trace("City:" + getSSN());
			
			//Taking  java.util Date 
		    setJoinDate(new Date());
			logger.trace("JoiningDate:" + getJoinDate()); 
			
			
			
			
		
			// customerREgister id is taken for register database 
			// under construction
			
			/*
			BankServicesDAOInterface getbankuserid = new BankServicesDAOImpl();
			try {
				getbankuserid.getUserRegisterDetail(new RegisterModel().getUsername(),new RegisterModel().getPassword());
			} catch (BusinessException e) {
				e.printStackTrace();
			}
			
			try {
				setCustomerRegisterId(getbankuserid.getUserRegisterDetail(new RegisterModel().getUsername(),new RegisterModel().getPassword()).get(0).getId());
			} catch (BusinessException e) {
				e.printStackTrace();
			}
			*/
			
			setCustomerRegisterId(1);
			logger.trace("Customer_RegisterId:" + getCustomerRegisterId());
			
			
			
				
			////
		}

	@Override
	public String toString() {
		return "CustomerInfo [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", addressStreetName=" + addressStreetName + ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + ", phoneNumber=" + phoneNumber + ", SSN=" + SSN + ", joinDate=" + joinDate
				+ ", customerRegisterId=" + customerRegisterId + "]";
	}


	
	
	
	
	
	
	

	
	

}
