/*Copyright (c) 2019 Mastercard
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*Loyalty Benefits API
 * The Loyalty Benefits API provides benefits management including presentment and selection.  It also supports insurance certificate generation for insurance benefits that need certificates.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: loyalty-benefits-support@mastercard.flowdock.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.*/
package com.mastercard.developer.example;

import java.util.ArrayList;
import java.util.List;

import com.mastercard.developer.interceptors.OkHttp2OAuth1Interceptor;
import com.mastercard.developer.loyalty_benefits_client.ApiClient;
import com.mastercard.developer.loyalty_benefits_client.ApiException;
import com.mastercard.developer.loyalty_benefits_client.api.BenefitsApi;
import com.mastercard.developer.loyalty_benefits_client.api.BundleProfileApi;
import com.mastercard.developer.loyalty_benefits_client.model.Account;
import com.mastercard.developer.loyalty_benefits_client.model.AccountExternal;
import com.mastercard.developer.loyalty_benefits_client.model.Address;
import com.mastercard.developer.loyalty_benefits_client.model.AssignedBenefits;
import com.mastercard.developer.loyalty_benefits_client.model.Benefits;
import com.mastercard.developer.loyalty_benefits_client.model.BenefitsSelection;
import com.mastercard.developer.loyalty_benefits_client.model.BenefitsSelectionAdditionalInformation;
import com.mastercard.developer.loyalty_benefits_client.model.BilheteRequest;
import com.mastercard.developer.loyalty_benefits_client.model.BilheteRequestAdditionalInformation;
import com.mastercard.developer.loyalty_benefits_client.model.BilheteRequestAdditionalInformationCardholder;
import com.mastercard.developer.loyalty_benefits_client.model.BilheteRequestAdditionalInformationDependents;
import com.mastercard.developer.loyalty_benefits_client.model.BilheteRequestAdditionalInformationPartner;
import com.mastercard.developer.loyalty_benefits_client.model.BundleUser;
import com.mastercard.developer.loyalty_benefits_client.model.BundleUserData;
import com.mastercard.developer.loyalty_benefits_client.model.BundleUserResponse;
import com.mastercard.developer.loyalty_benefits_client.model.Credentials;
import com.mastercard.developer.loyalty_benefits_client.model.Email;
import com.mastercard.developer.loyalty_benefits_client.model.Identification;
import com.mastercard.developer.loyalty_benefits_client.model.Name;
import com.mastercard.developer.loyalty_benefits_client.model.User;
import com.mastercard.developer.loyalty_benefits_client.model.UserProduct;

public class BenefitsApiDemo {

	public static void main(String[] args) throws Exception {

		RequestHelper.loadProperties();

		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath(RequestHelper.getBaseURL());
		apiClient.getHttpClient().interceptors()
				.add(new OkHttp2OAuth1Interceptor(RequestHelper.getConsumerkey(), RequestHelper.getPrivateKey()));
		apiClient.setDebugging(true);
		
		BenefitsApi benefitsApi = new BenefitsApi(apiClient);
		
		if(runThisScenario(args,"registration")) {
			BundleProfileApi bundleProfileApi = new BundleProfileApi(apiClient);
			executeRegistrationScenario(bundleProfileApi);
		}
		
		if(runThisScenario(args,"getbenefits")) {
			executeBenefitsRetrieveScenario(benefitsApi);
		}

		if(runThisScenario(args,"selectbenefits")) {
			executeBenefitSelectionScenario(benefitsApi);
		}

		if(runThisScenario(args,"assignedbenefits")) {
			executeAssignedBenefitsRetrieveScenario(benefitsApi);
		}

		if(runThisScenario(args,"insurance-certificates")) {
			executeSubmitBilheteScenario(benefitsApi);
		}
		
		if(runThisScenario(args,"error")) {
			executeBenefitsRetrieveErrorScenario(benefitsApi);
		}
	}

	private static void executeRegistrationScenario(BundleProfileApi bundleProfileApi) {
		BundleUser bundleUser = getRegistrationObject();
		try {
			printMessage("STARTING BENEFITS REGISTRATION FROM COMMAND LINE RUNNER");
			BundleUserResponse result = bundleProfileApi.createUser(bundleUser);
			System.out.println("Parsed Response---------------");
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("Exception when calling Benefits Registration");
			e.printStackTrace();
		}
	}

	private static void executeBenefitsRetrieveScenario(BenefitsApi benefitsApi) {
		Integer ica = 1216;
		String productName = "black";
		String channel = "web";
		String preferredLanguage = "pt-BR";
		try {
			printMessage("STARTING GET AVAILABLE BENEFITS FROM COMMAND LINE RUNNER");
			Benefits result = benefitsApi.loyaltyBenefitsProductBenefitsGet(ica, productName, channel,
					preferredLanguage);
			System.out.println("Parsed Response---------------");
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("Exception when calling Get Benefits");
			e.printStackTrace();
		}
	}

	private static void executeBenefitSelectionScenario(BenefitsApi benefitsApi) {
		BenefitsSelection benefitsSelection = getBenefitSelectionObject();
		try {
			printMessage("STARTING BENEFITS SELECTION FROM COMMAND LINE RUNNER");
			benefitsApi.loyaltyBenefitsBenefitSelectionsPost(benefitsSelection);
			System.out.println("Benefit Selection Successfull");
		} catch (Exception e) {
			System.err.println("Exception while Benefit Selection");
			e.printStackTrace();
		}
	}

	private static void executeAssignedBenefitsRetrieveScenario(BenefitsApi benefitsApi) {
		Integer ica = 1216;
		String panLastFourDigits = "2244";
		String channel = "tablet";
		String preferredLanguage = "en-GB";
		String userId = "user1235";
		try {
			printMessage("STARTING GET ASSIGNED BENEFITS FROM COMMAND LINE RUNNER");
			AssignedBenefits result = benefitsApi.loyaltyBenefitsAssignedBenefitsGet(ica, userId, panLastFourDigits,
					channel, preferredLanguage);
			System.out.println("Parsed Response---------------");
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("Exception when calling Assigned Benefits");
			e.printStackTrace();
		}
	}
	
	private static void executeSubmitBilheteScenario(BenefitsApi benefitsApi) {
		BilheteRequest bilheteRequest = getBilheteRequest();
		try {
			printMessage("STARTING INSURANCE CERTIFICATES FROM COMMAND LINE RUNNER");
			benefitsApi.insuranceCertificatesPost(bilheteRequest);
			System.out.println("Insurance Certificates request submitted successful");
		} catch (Exception e) {
			System.err.println("Exception in Insurance Certificates execution");
			e.printStackTrace();
		}
	}
	
	private static void executeBenefitsRetrieveErrorScenario(BenefitsApi benefitsApi) {
		Integer ica = 1;
		String productName = "KWrkp2V4c";
		String channel = "rpBLflhhahT";
		String preferredLanguage = "Mvr2Avshto";
		try {
			printMessage("STARTING GET AVAILABLE BENEFITS ERROR SCENARIO FROM COMMAND LINE RUNNER");
			benefitsApi.loyaltyBenefitsProductBenefitsGet(ica, productName, channel,
					preferredLanguage);
		} catch (ApiException e) {
			System.err.println("Exception when calling BenefitsApi#GetBenefits");
			System.out.println("Parsed Response---------------");
			System.out.println(e.getResponseBody());
		}
	}

	private static void printMessage(String scenario) {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");
		System.out.println(scenario + "---------------");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");
	}

	private static BenefitsSelection getBenefitSelectionObject() {

		BenefitsSelection benefitsSelection = new BenefitsSelection();
		benefitsSelection.setUserId("user1235");
		benefitsSelection.setPanLastFourDigits("2244");
		benefitsSelection.setIca(1216);
		benefitsSelection.setCardProductType("Black");
		benefitsSelection.setMemberId("3154");

		List<String> benefitIds = new ArrayList<>();
		benefitIds.add("BEN7890");
		benefitsSelection.setBenefitIds(benefitIds);

		BenefitsSelectionAdditionalInformation additionalInformation = new BenefitsSelectionAdditionalInformation();
		additionalInformation.setCardholder(new BilheteRequestAdditionalInformationCardholder("John", "Smith",
				"1992-02-02", "BRA", "999.999.999-99", "Rua Francisco Pereira da Silva 1480", "Guarulhos", "SP",
				"1930288", "Parque Paulistano", "john.smith@mail.com", "11", "1111-1111"));
		additionalInformation.setPartner(
				new BilheteRequestAdditionalInformationPartner("John", "Smith", "999.999.999-99", "1992-02-02"));
		List<BilheteRequestAdditionalInformationDependents> dependents = new ArrayList<>();
		dependents.add(
				new BilheteRequestAdditionalInformationDependents("John", "Smith", "999.999.999-99", "1991-01-02"));
		additionalInformation.setDependents(dependents);
		benefitsSelection.setAdditionalInformation(getAdditionalInformation());

		return benefitsSelection;

	}
	
	private static BilheteRequest getBilheteRequest() {

		BilheteRequest bilheteRequest = new BilheteRequest();
		bilheteRequest.setUserId("user1235");
		bilheteRequest.setPanLastFourDigits("2244");
		bilheteRequest.setIca(4567);
		bilheteRequest.setCardProductType("black");
		bilheteRequest.setMemberId("3154");

		BilheteRequestAdditionalInformation bilheteRequestAdditionalInformation = new BilheteRequestAdditionalInformation();
		bilheteRequestAdditionalInformation.setCardholder(new BilheteRequestAdditionalInformationCardholder("John", "Smith",
				"1992-01-02", "BRA", "999.999.999-99", "Rua Francisco Pereira da Silva 1480", "Guarulhos", "SP",
				"1930288", "Parque Paulistano", "john.smith@mail.com", "11", "1111-1111"));
		bilheteRequestAdditionalInformation.setPartner(
				new BilheteRequestAdditionalInformationPartner("John", "Smith", "999.999.999-99", "1992-02-02"));
		List<BilheteRequestAdditionalInformationDependents> dependents = new ArrayList<>();
		dependents.add(
				new BilheteRequestAdditionalInformationDependents("John", "Smith", "999.999.999-99", "1992-01-01"));
		bilheteRequestAdditionalInformation.setDependents(dependents);
		bilheteRequest.setAdditionalInformation(bilheteRequestAdditionalInformation);

		return bilheteRequest;

	}

	private static BenefitsSelectionAdditionalInformation getAdditionalInformation() {
		BenefitsSelectionAdditionalInformation additionalInformation = new BenefitsSelectionAdditionalInformation();
		additionalInformation.setCardholder(new BilheteRequestAdditionalInformationCardholder("John", "Smith",
				"1992-02-02", "BRA", "999.999.999-99", "Rua Francisco Pereira da Silva 1480", "Guarulhos", "SP",
				"1930288", "Parque Paulistano", "john.smith@mail.com", "11", "1111-1111"));
		additionalInformation.setPartner(
				new BilheteRequestAdditionalInformationPartner("John", "Smith", "999.999.999-99", "1992-02-02"));
		List<BilheteRequestAdditionalInformationDependents> dependents = new ArrayList<>();
		dependents.add(
				new BilheteRequestAdditionalInformationDependents("John", "Smith", "999.999.999-99", "1991-01-02"));
		additionalInformation.setDependents(dependents);
		return additionalInformation;
	}

	private static BundleUser getRegistrationObject() {
		BundleUser bundleUser = new BundleUser();
		BundleUserData bundleUserData = new BundleUserData();
		User user = new User();
		UserProduct userProduct = new UserProduct();
		Address address = new Address();
		Email email = new Email();
		Identification identification = new Identification();
		Name name = new Name();
		List<Identification> identifications = new ArrayList<>();
		List<Email> emails = new ArrayList<>();
		List<Address> addresses = new ArrayList<>();

		address.setCountry("US");
		address.setLocality("city");
		address.setPostalCode("10011");
		address.setRegion("NY");
		address.setStreetAddress("114 5th Ave");
		addresses.add(address);
		user.setAddresses(addresses);

		email.setValue("john5033379289074369@gmail.com");
		emails.add(email);
		user.setEmails(emails);


		identification.setCountry("BR");
		identification.setType("CPF");
		identification.setValue("496881234");
		identifications.add(identification);
		user.setIdentifications(identifications);

		name.setGivenName("Sally");
		name.setFamilyName("Smitherines");
		user.setName(name);

		user.setPreferredLanguage("en");
		user.setUserId("user123-partnerBank");

		Account account = new Account();
		account.setCardExpiryDate("02/2024");
		account.setNameOnCard("SALLY SMITHERINES");
		account.setPan("1234xxxxxxxx5678");

		AccountExternal accountExternal = new AccountExternal();
		accountExternal.setAccountType("SingleMember");
		accountExternal.setIca("13973");
		accountExternal.setCardProductType("Black");
		accountExternal.setExternalMembershipReferenceId("7987984542126");
		account.setObject(accountExternal);

		List<Account> accounts = new ArrayList<>();
		accounts.add(account);
		
		Credentials productCredentials = new Credentials();
		productCredentials.setUsername("username");
		productCredentials.setPassword("password");
		userProduct.setProduct("benefits");
		userProduct.setAccounts(accounts);
		List<UserProduct> products = new ArrayList<>();
		products.add(userProduct);

		bundleUserData.setProducts(products);
		bundleUserData.setUser(user);
		bundleUser.setData(bundleUserData);

		return bundleUser;

	}

	private static boolean runThisScenario(String[] args, String scenario) {
		return (args!=null && args.length>0 && args[0].contains(scenario)) || (args == null || args.length == 0);
	}
}