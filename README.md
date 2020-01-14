# loyalty-benefits-client

Loyalty Benefits API
- API version: 1.0.0
  - Build date: 2019-12-30T13:58:23.312-06:00[America/Chicago]

The Loyalty Benefits API provides benefits management including presentment and selection.  It also supports insurance certificate generation for insurance benefits that need certificates.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.mastercard.developer</groupId>
  <artifactId>loyalty-benefits-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.mastercard.developer:loyalty-benefits-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/loyalty-benefits-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.mastercard.developer.loyalty_benefits_client.*;
import com.mastercard.developer.loyalty_benefits_client.auth.*;
import com.mastercard.developer.loyalty_benefits_client.model.*;
import com.mastercard.developer.loyalty_benefits_client.api.BenefitsApi;

import java.io.File;
import java.util.*;

public class BenefitsApiExample {

    public static void main(String[] args) {
        
        BenefitsApi apiInstance = new BenefitsApi();
        Integer ica = 4567; // Integer | Card Issuer's ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution.
        String userId = user1235; // String | Opaque identifier for the consumer. This is the same userId used while enrolling for benefits via Bundle Profile API.
        String panLastFourDigits = 2244; // String | Last four digits of user's registered 16 digit credit card number
        String channel = mobile; // String | Delivery channel.  One of mobile, tablet, or web
        String preferredLanguage = pt-BR; // String | User's preferred language in localized ISO 639-1 format such as pt-BR
        try {
            AssignedBenefits result = apiInstance.loyaltyBenefitsAssignedBenefitsGet(ica, userId, panLastFourDigits, channel, preferredLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BenefitsApi#loyaltyBenefitsAssignedBenefitsGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.mastercard.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BenefitsApi* | [**loyaltyBenefitsAssignedBenefitsGet**](docs/BenefitsApi.md#loyaltyBenefitsAssignedBenefitsGet) | **GET** /loyalty/benefits/assigned-benefits | List of assigned benefits
*BenefitsApi* | [**loyaltyBenefitsBenefitSelectionsPost**](docs/BenefitsApi.md#loyaltyBenefitsBenefitSelectionsPost) | **POST** /loyalty/benefits/benefit-selections | Select optional benefits
*BenefitsApi* | [**loyaltyBenefitsProductBenefitsGet**](docs/BenefitsApi.md#loyaltyBenefitsProductBenefitsGet) | **GET** /loyalty/benefits/product-benefits | List all default and selectable benefits for the card product
*BundleProfileApi* | [**createUser**](docs/BundleProfileApi.md#createUser) | **POST** /bundle/profile/users | Create Profile
*InsuranceApi* | [**loyaltyInsuranceClaimSearchesPost**](docs/InsuranceApi.md#loyaltyInsuranceClaimSearchesPost) | **POST** /loyalty/insurance/claim-searches | Retrieve the claim status
*InsuranceApi* | [**loyaltyInsuranceUserDataTokensPost**](docs/InsuranceApi.md#loyaltyInsuranceUserDataTokensPost) | **POST** /loyalty/insurance/user-data-tokens | Create a user data token for submitting a new claim


## Documentation for Models

 - [Account](docs/Account.md)
 - [Address](docs/Address.md)
 - [Answers](docs/Answers.md)
 - [AssignedBenefit](docs/AssignedBenefit.md)
 - [AssignedBenefitCategory](docs/AssignedBenefitCategory.md)
 - [AssignedBenefitSubCategory](docs/AssignedBenefitSubCategory.md)
 - [AssignedBenefits](docs/AssignedBenefits.md)
 - [AssignedBenefitsBenefitSelectionWindow](docs/AssignedBenefitsBenefitSelectionWindow.md)
 - [Benefit](docs/Benefit.md)
 - [BenefitAttribute](docs/BenefitAttribute.md)
 - [BenefitCategory](docs/BenefitCategory.md)
 - [BenefitDetail](docs/BenefitDetail.md)
 - [BenefitDetailContent](docs/BenefitDetailContent.md)
 - [BenefitDetailContentPostselection](docs/BenefitDetailContentPostselection.md)
 - [BenefitDocuments](docs/BenefitDocuments.md)
 - [BenefitEligibilityQuestions](docs/BenefitEligibilityQuestions.md)
 - [BenefitSubCategory](docs/BenefitSubCategory.md)
 - [Benefits](docs/Benefits.md)
 - [BenefitsProgramTerms](docs/BenefitsProgramTerms.md)
 - [BenefitsSelection](docs/BenefitsSelection.md)
 - [BenefitsSelectionAdditionalInformation](docs/BenefitsSelectionAdditionalInformation.md)
 - [BilheteRequest](docs/BilheteRequest.md)
 - [BilheteRequestAdditionalInformation](docs/BilheteRequestAdditionalInformation.md)
 - [BilheteRequestAdditionalInformationCardholder](docs/BilheteRequestAdditionalInformationCardholder.md)
 - [BilheteRequestAdditionalInformationDependents](docs/BilheteRequestAdditionalInformationDependents.md)
 - [BilheteRequestAdditionalInformationPartner](docs/BilheteRequestAdditionalInformationPartner.md)
 - [BundleUser](docs/BundleUser.md)
 - [BundleUserData](docs/BundleUserData.md)
 - [BundleUserPatch](docs/BundleUserPatch.md)
 - [BundleUserResponse](docs/BundleUserResponse.md)
 - [BundleUserResponseData](docs/BundleUserResponseData.md)
 - [BundleUserResponseErrors](docs/BundleUserResponseErrors.md)
 - [ClaimFeature](docs/ClaimFeature.md)
 - [ClaimStatus](docs/ClaimStatus.md)
 - [ClaimStatusRequest](docs/ClaimStatusRequest.md)
 - [Consent](docs/Consent.md)
 - [EligibilityQuestions](docs/EligibilityQuestions.md)
 - [Email](docs/Email.md)
 - [Error](docs/Error.md)
 - [ErrorItem](docs/ErrorItem.md)
 - [ErrorItems](docs/ErrorItems.md)
 - [ErrorItemsErrors](docs/ErrorItemsErrors.md)
 - [Errors](docs/Errors.md)
 - [ErrorsErrors](docs/ErrorsErrors.md)
 - [Identification](docs/Identification.md)
 - [Im](docs/Im.md)
 - [IsRegistered](docs/IsRegistered.md)
 - [Name](docs/Name.md)
 - [PatchDocument](docs/PatchDocument.md)
 - [PhoneNumber](docs/PhoneNumber.md)
 - [Photo](docs/Photo.md)
 - [Questions](docs/Questions.md)
 - [RequiredClaimDocuments](docs/RequiredClaimDocuments.md)
 - [SubmitClaimUserData](docs/SubmitClaimUserData.md)
 - [SubmitClaimUserToken](docs/SubmitClaimUserToken.md)
 - [User](docs/User.md)
 - [UserProduct](docs/UserProduct.md)
 - [UserProductResponse](docs/UserProductResponse.md)
 - [UserReadAccountResponse](docs/UserReadAccountResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

loyalty-benefits-support@mastercard.flowdock.com

## Steps to run the application from command line


- Create a new project from Mastercard DevZone - stage.developer.mastercard.com or developer.mastercard.com


- Select "Loyalty Benefits" from Choose API dropdown and hit continue.


- Get Sandbox keys and store your .p12 certificate along with the readme/documentation.


- Please save this Sandbox Keys, .p12, key store password and alias as you are going to use these to run the application.


- Clone this repository and set up as Maven project


- Update the following keys in application.properties file.
	- *mastercard.benefits.ref.app.consumer.key*: This can be found in the project you created on developerZone
	- *mastercard.benefits.ref.app.keystore.path*: Path where you saved your certs i.e., .p12 file you received while creating a project
	- *mastercard.benefits.ref.app.keystore.password*: This is the password you get with Sandbox cert.
	- *mastercard.benefits.ref.app.keystore.alias*: This is the alias you get with Sandbox cert.


- Example:

```
	mastercard.benefits.ref.app.url = https://sandbox.api.mastercard.com
	mastercard.benefits.ref.app.consumer.key = Abcdfefgjhilklmnopqrstuvwxyz-dxcq_zD7IiPa0df175e!22a7fddba5
	mastercard.benefits.ref.app.keystore.path = C:\path\provided.p12
	mastercard.benefits.ref.app.keystore.password = pwd
	mastercard.benefits.ref.app.keystore.alias = alias
```


- Do a clean build either through IDE or command prompt, if you are doing it through command prompt then the below command should be executed in the directory which contains this repository's pom file Example: mvn clean install


- Run the application using this command: java -jar path of the Jar relative to the current directory/loyalty-benefits-client-1.0.0.jar


- Argument: An argument which defines the feature user wants to run through command line. If you don't specify this argument, it will run all the features(registration,getbenefits,selectbenefits,assignedbenefits and error) one after the other

registration : Registration for benefits service

getbenefits : Retrieve all available benefits

selectbenefits : Select Benefits to add to card holder

assignedbenefits : Retrieve benefits assigned to the user

error: An error scenario example

- Command line example to run one feature of the application:
`java -jar target/loyalty-benefits-client-1.0.0.jar getbenefits` using this command the application runs only getbenefits feature. 
 
- To run more than one feature then specify the features with comma separated. Example: `java -jar target/loyalty-benefits-client-1.0.0.jar registration,getbenefits,error` here it executes only these 3 features.

- To run all the features use this command: `java -jar target/loyalty-benefits-client-1.0.0.jar`. 

- To run the feature one after the other execute the command `java -jar target/loyalty-benefits-client-1.0.0.jar registration` then again run the command with different feature `java -jar target/loyalty-benefits-client-1.0.0.jar getbenefits` and so on.


## Reference App testing against Mock Service

- This app by default is compatible with the mock service of mastercard which only responds if it matches the exact request which the mock service expects (irrespective of required and optional fields).
- The word `reference` in the URL path indicates that it is going to test against the mock service, in order to build a client to test against the actual service remove the word `reference` in the path.
- You can expect the following response if the request doesn't match with expectation of the mock service.

```
<html>
    <head>
        <title>404 Not Found</title>
    </head>
    <body>
        <h1>Not Found</h1>
        <p>The requested URL was not found on this server.</p>
        <hr/>
        <p>
            <i>The DevTest VSE service could not match your request to a recorded request.&nbsp; Consider expanding your service image.</i>
        </p>
        <br/>
        <font size="-2">Produced by a DevTest virtualized web server.</font>
    </body>
</html>

```

## Testing in Sandbox environment

- To test this in Sandbox environment please contact Mastercard representative to set up you or your organization in this environment because if this does not happen the authorization fails in the Loyalty Benefits Service API. All the URLs have a prefix `reference` in this reference application for all resources of Loyalty Benefits Service API so that it deals with sample data. You need to remove this `reference` word from the URLs when testing against real data. Example: `/loyalty/benefits/reference` just for reference application and `/loyalty/benefits` to test against real data. 
    
 
-  [Generate API Clients](https://developer.mastercard.com/blog/consuming-mastercard-apis-in-client-applications) to consume Mastercard APIs.
Find the [service documentation](https://developer.mastercard.com/documentation/loyalty-benefits) for more information. 



- Client libraries can be generated for a simplified integration with the reference service, [for more details](https://developer.mastercard.com/blog/consuming-mastercard-apis-in-client-applications)


Copyright (c) 2019 Mastercard

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License