package Testing;

import Drivers.ChromeDriverOptions;
import Drivers.DriverOptions;
import Drivers.EdgeDriverOptions;
import Drivers.FirefoxDriverOptions;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.collections.Lists;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WebTest {

    private static final Duration TIME_OUT = Duration.ofSeconds(10);
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;
    public static JavascriptExecutor jse;
    public static Functions f = new Functions();


    /**
     * Initialization of automatic testing.
     * Starts a cycle of checks according to the specified parameters:
     * type of browser being tested, screen resolutions, list of pages.
     */
    public static void main(String[] args) {
        System.out.println("Itexus: Start Contacts Form AutoTests!");

        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testng = new TestNG();
        List<String> suites = Lists.newArrayList();
        suites.add("tests.xml");
        testng.setTestSuites(suites);
        testng.run();
    }

    /** *** AUTOMATIC TESTS *** **/

    /* Check Landing Pages: */

    @Test
    public void BigCF_Home() throws InterruptedException {
        check(Config.Website + "/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Company() throws InterruptedException {
        check(Config.Website + "/company/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_HowWeWork() throws InterruptedException {
        check(Config.Website + "/how-we-work/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Technologies() throws InterruptedException {
        check(Config.Website + "/technologies/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Design() throws InterruptedException {
        check(Config.Website + "/design-services/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Startups() throws InterruptedException {
        check(Config.Website + "/startup-specialized-software-development-company/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Discovery() throws InterruptedException {
        check(Config.Website + "/discovery-phase-service/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Healthcare() throws InterruptedException {
        check(Config.Website + "/healthcare-software-development-services/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Booking() throws InterruptedException {
        check(Config.Website + "/booking-app-development/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_FAQ() throws InterruptedException {
        check(Config.Website + "/frequently-asked-questions/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Services() throws InterruptedException {
        check(Config.Website + "/services/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_FintechDevelopment() throws InterruptedException {
        check(Config.Website + "/fintech-software-development-company/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_FintechConsulting() throws InterruptedException {
        check(Config.Website + "/fintech-consulting-services/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_MobileBanking() throws InterruptedException {
        check(Config.Website + "/mobile-banking-app-development/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Ewallet() throws InterruptedException {
        check(Config.Website + "/ewallet-app-development/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Trading() throws InterruptedException {
        check(Config.Website + "/trading-platform-development/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_LoanLending() throws InterruptedException {
        check(Config.Website + "/lending-software-development/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Insurance() throws InterruptedException {
        check(Config.Website + "/insurance-software-development-company/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Banking() throws InterruptedException {
        check(Config.Website + "/banking-automation-services/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_HireFinancial() throws InterruptedException {
        check(Config.Website + "/hire-financial-software-developers/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Portfolio() throws InterruptedException {
        check(Config.Website + "/portfolio/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Reviews() throws InterruptedException {
        check(Config.Website + "/reviews/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_MobileApp() throws InterruptedException {
        check(Config.Website + "/mobile-app-development-services/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_DevOps() throws InterruptedException {
        check(Config.Website + "/devops/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_DotNet() throws InterruptedException {
        check(Config.Website + "/hire-net-developers/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Dedicated() throws InterruptedException {
        check(Config.Website + "/dedicated-development-teams/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Telemedicine() throws InterruptedException {
        check(Config.Website + "/telemedicine-app-development/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Telehealth() throws InterruptedException {
        check(Config.Website + "/white-label-telehealth-solution/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_WebSiteDevelopment() throws InterruptedException {
        check(Config.Website + "/website-development-services/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_AI() throws InterruptedException {
        check(Config.Website + "/ai/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_Contacts() throws InterruptedException {
        check(Config.Website + "/contacts/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void SmallCF_FAQ() throws InterruptedException {
        check(Config.Website + "/frequently-asked-questions/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Services() throws InterruptedException {
        check(Config.Website + "/services/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_FintechDevelopment() throws InterruptedException {
        check(Config.Website + "/fintech-software-development-company/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_FintechConsulting() throws InterruptedException {
        check(Config.Website + "/fintech-consulting-services/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_SmartContractsDevelopmentForInsuranceCompanies() throws InterruptedException {
        check(Config.Website + "/smart-contracts-development-for-insurance-companies/", Config.checkMethod.checkSmallContactForm);
    }

    /* -- end check landing pages. */

    /* Check Blog Posts: */

    @Test
    public void SmallCF_PlaidFintechSolutionsDevelopmentUseCasesAndCosts() throws InterruptedException {
        check(Config.Website + "/plaid-fintech-solutions-development-use-cases-and-costs/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_HireDedicatedDevelopmentTeam() throws InterruptedException {
        check(Config.Website + "/hire-dedicated-development-team/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_PersonalizedBankingDevelopmentBeingAheadOfCompetitors() throws InterruptedException {
        check(Config.Website + "/personalized-banking-development-being-ahead-of-competitors/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_EwalletAppDesignBestPracticesTrends() throws InterruptedException {
        check(Config.Website + "/ewallet-app-design-best-practices-trends/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_GoMobileBenefitsForBanksMobileBankingDevelopment() throws InterruptedException {
        check(Config.Website + "/go-mobile-benefits-for-banks-mobile-banking-development/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_StripeBasedFintechSolutionsDevelopmentUseCasesCosts() throws InterruptedException {
        check(Config.Website + "/stripe-based-fintech-solutions-development-use-cases-costs/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Top10StockTradingBotDevelopers() throws InterruptedException {
        check(Config.Website + "/top-10-stock-trading-bot-developers/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Top10PaymentAppDevelopmentCompanies() throws InterruptedException {
        check(Config.Website + "/top-10-payment-app-development-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TopFintechRubyDevelopersToHire() throws InterruptedException {
        check(Config.Website + "/top-fintech-ruby-developers-to-hire/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void BannerCF_HowToCreateAMoneyLendingAppFromScratchPracticalGuide() throws InterruptedException {
        check(Config.Website + "/how-to-create-a-money-lending-app-from-scratch-practical-guide/", Config.checkMethod.checkPostBannerForm);
    }

    @Test
    public void SmallCF_HowToBuildInDigitalOnboardingInBanking() throws InterruptedException {
        check(Config.Website + "/how-to-build-in-digital-onboarding-in-banking/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TopFintechAndroidDevelopersToHire() throws InterruptedException {
        check(Config.Website + "/top-fintech-android-developers-to-hire/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Top10FintechAppDesignAgencies() throws InterruptedException {
        check(Config.Website + "/top-10-fintech-app-design-agencies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_InvestmentAppDevelopmentCostCoreFeatures() throws InterruptedException {
        check(Config.Website + "/investment-app-development-cost-core-features/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_ResearchHowPaymentProvidersLoseProfits9SourcesOfRevenueLeakage() throws InterruptedException {
        check(Config.Website + "/research-how-payment-providers-lose-profits-9-sources-of-revenue-leakage/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_HowToBuildAnMVPInFintech() throws InterruptedException {
        check(Config.Website + "/how-to-build-an-mvp-in-fintech/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Top10WhiteLabelHealthProductsToBuyAndCustomize() throws InterruptedException {
        check(Config.Website + "/top-10-white-label-health-products-to-buy-and-customize/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Top10MobilePaymentAppDevelopmentCompanies() throws InterruptedException {
        check(Config.Website + "/top-10-mobile-payment-app-development-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TradingViewApiIntegrationUseCasesCosts() throws InterruptedException {
        check(Config.Website + "/tradingview-api-integration-use-cases-costs/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_GuideOnLoanOriginationSoftware() throws InterruptedException {
        check(Config.Website + "/guide-on-loan-origination-software/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TopChatbotDevelopmentCompanies() throws InterruptedException {
        check(Config.Website + "/top-chatbot-development-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_HowToDevelopSoftwareLikeTradingview() throws InterruptedException {
        check(Config.Website + "/how-to-develop-software-like-tradingview/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_MobilePaymentAppDevelopmentAllInOneGuide() throws InterruptedException {
        check(Config.Website + "/mobile-payment-app-development-all-in-one-guide/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_CoreFeaturesOfASuccessfulStockTradingApp() throws InterruptedException {
        check(Config.Website + "/core-features-of-a-successful-stock-trading-app/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_LendingSoftwareDevelopmentTrends() throws InterruptedException {
        check(Config.Website + "/lending-software-development-trends/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_BinanceDappDevelopmentHowToBuildBinanceBasedApplications() throws InterruptedException {
        check(Config.Website + "/binance-dapp-development-how-to-build-binance-based-applications/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_NeobanksDevelopmentVitalIntegrationsCostBenefitsUseCases() throws InterruptedException {
        check(Config.Website + "/neobanks-development-vital-integrations-cost-benefits-use-cases/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Top10InvestmentSoftwareDevelopmentCompanies() throws InterruptedException {
        check(Config.Website + "/top-10-investment-software-development-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_CostOfCreditScoreAppDevelopment() throws InterruptedException {
        check(Config.Website + "/cost-of-credit-score-app-development/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TopCreditScoringAppDevelopmentCompanies() throws InterruptedException {
        check(Config.Website + "/top-credit-scoring-app-development-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Top10DigitalWalletCompanies() throws InterruptedException {
        check(Config.Website + "/top-10-digital-wallet-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_MortgageSoftwareDevelopment() throws InterruptedException {
        check(Config.Website + "/mortgage-software-development/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TopFinancialSoftwareCompanies() throws InterruptedException {
        check(Config.Website + "/top-financial-software-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_DigitalWalletsTypesAndDevelopmentProcess() throws InterruptedException {
        check(Config.Website + "/digital-wallets-types-and-development-process/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_RegistrationOnboardingAutomationBestPracticesInBankingApps() throws InterruptedException {
        check(Config.Website + "/registration-onboarding-automation-best-practices-in-banking-apps/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TopFintechRecruitingFirms() throws InterruptedException {
        check(Config.Website + "/top-fintech-recruiting-firms/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_AllInOneGuideDigitalWalletDevelopment() throws InterruptedException {
        check(Config.Website + "/all-in-one-guide-digital-wallet-development/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_MfiSoftwareDevelopment() throws InterruptedException {
        check(Config.Website + "/mfi-software-development/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_GuideOnPayDayLoanSoftwareDevelopment() throws InterruptedException {
        check(Config.Website + "/guide-on-pay-day-loan-software-development/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_ListOfTop10InsuranceSoftwareDevelopmentCompanies() throws InterruptedException {
        check(Config.Website + "/list-of-top-10-insurance-software-development-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Top10DirectDepositPayrollSoftwareDevelopmentCompanies() throws InterruptedException {
        check(Config.Website + "/top-10-direct-deposit-payroll-software-development-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Top10TreasuryManagementSoftwareDevelopers() throws InterruptedException {
        check(Config.Website + "/top-10-treasury-management-software-developers/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Best10BankingAsAServicePlatformDevelopmentCompanies() throws InterruptedException {
        check(Config.Website + "/best-10-banking-as-a-service-platform-development-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_LendingSoftwareDevelopmentForCreditUnionsAndBanks() throws InterruptedException {
        check(Config.Website + "/lending-software-development-for-credit-unions-and-banks/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_FinancialCrimePreventionAmlSoftwareForFinancialInstitutionsReadyMadeCustom() throws InterruptedException {
        check(Config.Website + "/financial-crime-prevention-aml-software-for-financial-institutions-ready-made-custom/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_RobinhoodUiSecretsHowToDesignASkyRocketTradingApp() throws InterruptedException {
        check(Config.Website + "/robinhood-ui-secrets-how-to-design-a-sky-rocket-trading-app/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_AutomatingCustomerServiceInBankingInsuranceAndFinancialServicesSectors() throws InterruptedException {
        check(Config.Website + "/automating-customer-service-in-banking-insurance-and-financial-services-sectors/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TaxPaymentsAutomationWhyFinancialCompaniesNeedIt() throws InterruptedException {
        check(Config.Website + "/tax-payments-automation-why-financial-companies-need-it/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_CrowdfundingSoftwareDevelopmentCorePlayersFeaturesBusinessModel() throws InterruptedException {
        check(Config.Website + "/crowdfunding-software-development-core-players-features-business-model/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_MobileBankingAppDesignBestPracticesAndTrends() throws InterruptedException {
        check(Config.Website + "/mobile-banking-app-design-best-practices-and-trends/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_DebtCollectionAutomationSoftwareDevelopmentFromScratch() throws InterruptedException {
        check(Config.Website + "/debt-collection-automation-software-development-from-scratch/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_HowMuchDoesItCostToDevelopAnAutomatedTradingSystem() throws InterruptedException {
        check(Config.Website + "/how-much-does-it-cost-to-develop-an-automated-trading-system/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_HighFrequencyStockTradingHftSystemsDevelopment() throws InterruptedException {
        check(Config.Website + "/high-frequency-stock-trading-hft-systems-development/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_P2pLendingSoftwareDevelopmentCostFeatures() throws InterruptedException {
        check(Config.Website + "/p2p-lending-software-development-cost-features/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Top10SoftwareDevelopmentCompaniesForCreditUnions() throws InterruptedException {
        check(Config.Website + "/top-10-software-development-companies-for-credit-unions/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_InternationalMoneyTransferAppDevelopmentMustHaves() throws InterruptedException {
        check(Config.Website + "/international-money-transfer-app-development-must-haves/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Top10TradingSoftwareDevelopmentCompanies() throws InterruptedException {
        check(Config.Website + "/top-10-trading-software-development-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TopEWalletDevelopmentCompanies() throws InterruptedException {
        check(Config.Website + "/top-e-wallet-development-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_ListOfFinancialMvpDevelopmentCompanies() throws InterruptedException {
        check(Config.Website + "/list-of-financial-mvp-development-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Top10LendingAppDevelopmentCompanies() throws InterruptedException {
        check(Config.Website + "/top-10-lending-app-development-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_ListOfTopFintechDevelopersToHire() throws InterruptedException {
        check(Config.Website + "/list-of-top-fintech-developers-to-hire/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Top10BankingSoftwareDevelopmentCompanies() throws InterruptedException {
        check(Config.Website + "/top-10-banking-software-development-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_RetirementPlanningSoftwareDevelopmentEssentials() throws InterruptedException {
        check(Config.Website + "/retirement-planning-software-development-essentials/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_FinicityIntegrationForFintechDevelopment() throws InterruptedException {
        check(Config.Website + "/finicity-integration-for-fintech-development/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_WorkflowSoftwareDevelopmentForBrokerageCompanies() throws InterruptedException {
        check(Config.Website + "/workflow-software-development-for-brokerage-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_MinimumViableProductMvpDevelopment() throws InterruptedException {
        check(Config.Website + "/minimum-viable-product-mvp-development/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_BestFintechApisToUseInYourFinanceSoftwareBenefitsCostAndUseCases() throws InterruptedException {
        check(Config.Website + "/best-fintech-apis-to-use-in-your-finance-software-benefits-cost-and-use-cases/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_MobileBankingDevelopmentCostFeaturesSteps() throws InterruptedException {
        check(Config.Website + "/mobile-banking-development-cost-features-steps/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TopFintechConsultingCompanies() throws InterruptedException {
        check(Config.Website + "/top-fintech-consulting-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_HowMuchDoesItCostToDevelopAnInsuranceClaimsManagementSystem() throws InterruptedException {
        check(Config.Website + "/how-much-does-it-cost-to-develop-an-insurance-claims-management-system/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_PredictiveAnalyticsCapabilitiesForWealthManagementCompanies() throws InterruptedException {
        check(Config.Website + "/predictive-analytics-capabilities-for-wealth-management-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TheUltimateGuideToBuildingAMoneyLendingAppCostsTermsAndDevelopmentProcess() throws InterruptedException {
        check(Config.Website + "/the-ultimate-guide-to-building-a-money-lending-app-costs-terms-and-development-process/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_PersonalFinanceAppDevelopmentCostFeatures() throws InterruptedException {
        check(Config.Website + "/personal-finance-app-development-cost-features/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_HowToBuildAFinanceManagementAppLikeMint() throws InterruptedException {
        check(Config.Website + "/how-to-build-a-finance-management-app-like-mint/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_HowMuchDoesItCostToDevelopAPersonalFinanceApp() throws InterruptedException {
        check(Config.Website + "/how-much-does-it-cost-to-develop-a-personal-finance-app/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_BankingCustomerSupportAutomationDevelopmentGuide() throws InterruptedException {
        check(Config.Website + "/banking-customer-support-automation-development-guide/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_HowToIntegrateAMobilePaymentGateway() throws InterruptedException {
        check(Config.Website + "/how-to-integrate-a-mobile-payment-gateway/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_RecommendationEngineForPersonalizedBankingExperienceBankingMustHaveTech() throws InterruptedException {
        check(Config.Website + "/recommendation-engine-for-personalized-banking-experience-banking-must-have-tech/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_WinningLandingPagePracticesForFintechProducts() throws InterruptedException {
        check(Config.Website + "/winning-landing-page-practices-for-fintech-products/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_Top10CompaniesWithAndroidDevelopersToHire() throws InterruptedException {
        check(Config.Website + "/top-10-companies-with-android-developers-to-hire/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TheCostOfCustomSoftwareDevelopment() throws InterruptedException {
        check(Config.Website + "/the-cost-of-custom-software-development/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_RevampingLegacyBankingSoftwareStepByStepGuide() throws InterruptedException {
        check(Config.Website + "/revamping-legacy-banking-software-step-by-step-guide/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TopMobileDevelopersToHire() throws InterruptedException {
        check(Config.Website + "/top-mobile-developers-to-hire/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_CostOfFintechAppsDevelopment() throws InterruptedException {
        check(Config.Website + "/cost-of-fintech-apps-development/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_AndroidDeveloperHiringGuide() throws InterruptedException {
        check(Config.Website + "/android-developer-hiring-guide/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_HowToEnsureBankingAppSecurity() throws InterruptedException {
        check(Config.Website + "/how-to-ensure-banking-app-security/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TopWordpressDevelopmentCompanies() throws InterruptedException {
        check(Config.Website + "/top-wordpress-development-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_NicheSocialNetworkDevelopmentCostPeculiarities() throws InterruptedException {
        check(Config.Website + "/niche-social-network-development-cost-peculiarities/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TelehealthSolutionDevelopmentCostAppFeaturesPitfalls() throws InterruptedException {
        check(Config.Website + "/telehealth-solution-development-cost-app-features-pitfalls/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_NeobanksCorePlayersBusinessModelDevelopmentPeculiarities() throws InterruptedException {
        check(Config.Website + "/neobanks-core-players-business-model-development-peculiarities/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_EPrescribingSoftwareDevelopmentOnlyEssentials() throws InterruptedException {
        check(Config.Website + "/e-prescribing-software-development-only-essentials/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_InsuranceAutomationAiImplementationUseCases() throws InterruptedException {
        check(Config.Website + "/insurance-automation-ai-implementation-use-cases/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_WebsiteDevelopmentCostBreakdown() throws InterruptedException {
        check(Config.Website + "/website-development-cost-breakdown/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_WhenIsAProjectDiscoveryPhaseNeeded() throws InterruptedException {
        check(Config.Website + "/when-is-a-project-discovery-phase-needed/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_FundraisingForStartupInPartnershipWithSoftwareDevelopmentCompany() throws InterruptedException {
        check(Config.Website + "/fundraising-for-startup-in-partnership-with-software-development-company/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_EwalletWinningFeaturesEasyToUseApps() throws InterruptedException {
        check(Config.Website + "/ewallet-winning-features-easy-to-use-apps/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_NfcBankingAppDevelopmentImplementationUseCasesAndBenefits() throws InterruptedException {
        check(Config.Website + "/nfc-banking-app-development-implementation-use-cases-and-benefits/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_WealthManagementFirmsHowToGrowInClientsRevenue() throws InterruptedException {
        check(Config.Website + "/wealth-management-firms-how-to-grow-in-clients-revenue/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_HrProcessesAutomationFeelTheBenefitsOfWorkingRemotely() throws InterruptedException {
        check(Config.Website + "/hr-processes-automation-feel-the-benefits-of-working-remotely/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_HowDevopsServicesCanBenefitBusinesses() throws InterruptedException {
        check(Config.Website + "/how-devops-services-can-benefit-businesses/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_AlternativeTradingSystemsPeculiaritiesExamples() throws InterruptedException {
        check(Config.Website + "/alternative-trading-systems-peculiarities-examples/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_RoboAdvisorInWealthManagementBenefitsFeaturesToDevelop() throws InterruptedException {
        check(Config.Website + "/robo-advisor-in-wealth-management-benefits-features-to-develop/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_InsuranceAgencyManagementSystemDevelopmentThingsToConsider() throws InterruptedException {
        check(Config.Website + "/insurance-agency-management-system-development-things-to-consider/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_EWalletAppDevelopmentCostComponents() throws InterruptedException {
        check(Config.Website + "/e-wallet-app-development-cost-components/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_ListOfTop10FintechDevelopmentCompanies() throws InterruptedException {
        check(Config.Website + "/list-of-top-10-fintech-development-companies/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_HowFintechStartupsChangeFinancialIndustry() throws InterruptedException {
        check(Config.Website + "/how-fintech-startups-change-financial-industry/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_ImplementingMachineLearningComponent5IssuesToConsider() throws InterruptedException {
        check(Config.Website + "/implementing-machine-learning-component-5-issues-to-consider/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_MentalHealthAppDevelopmentTipsForBuildingATrulyUsefulAnxietyDepressionApps() throws InterruptedException {
        check(Config.Website + "/mental-health-app-development-tips-for-building-a-truly-useful-anxiety-depression-apps/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_HowRpaRoboticProcessAutomationHelpsFinanceCompaniesGainProfits() throws InterruptedException {
        check(Config.Website + "/how-rpa-robotic-process-automation-helps-finance-companies-gain-profits/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_3WaysNlpWinsCustomersForFintech() throws InterruptedException {
        check(Config.Website + "/3-ways-nlp-wins-customers-for-fintech/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_BankingMarketplaceDevelopmentAllYouNeedToKnow() throws InterruptedException {
        check(Config.Website + "/banking-marketplace-development-all-you-need-to-know/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_ListOfFintechFrontEndDevelopersToHire() throws InterruptedException {
        check(Config.Website + "/list-of-fintech-front-end-developers-to-hire/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_ListOfMobileBankingAppDevelopersToHire() throws InterruptedException {
        check(Config.Website + "/list-of-mobile-banking-app-developers-to-hire/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TopWhiteLabelMentalHealthAppsToBuy() throws InterruptedException {
        check(Config.Website + "/top-white-label-mental-health-apps-to-buy/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_KycIntegrationIntoFinancialSoftware() throws InterruptedException {
        check(Config.Website + "/kyc-integration-into-financial-software/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_TopFintechPythonDevelopersToHire() throws InterruptedException {
        check(Config.Website + "/top-fintech-python-developers-to-hire/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_DwollaIntegrationUseCasesAndDevelopers() throws InterruptedException {
        check(Config.Website + "/dwolla-integration-use-cases-and-developers/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_AntiMoneyLaunderingSoftwareDevelopmentAllInOneGuide() throws InterruptedException {
        check(Config.Website + "/anti-money-laundering-software-development-all-in-one-guide/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_LegalMarketplaceDevelopmentGuide() throws InterruptedException {
        check(Config.Website + "/legal-marketplace-development-guide/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_ListOfFintechBackendDevelopersToHire() throws InterruptedException {
        check(Config.Website + "/list-of-fintech-backend-developers-to-hire/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_InCarPaymentsIntegrationForAutomotiveIndustry() throws InterruptedException {
        check(Config.Website + "/in-car-payments-integration-for-automotive-industry/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_GamificationInBankingFinancialServices() throws InterruptedException {
        check(Config.Website + "/gamification-in-banking-financial-services/", Config.checkMethod.checkSmallContactForm);
    }

    @Test
    public void SmallCF_ListOfFintechKotlinDevelopers() throws InterruptedException {
        check(Config.Website + "/list-of-fintech-kotlin-developers/", Config.checkMethod.checkSmallContactForm);
    }

    /* -- end check blog posts. */

    /* Check Portfolio Cases: */

    @Test
    public void BigCF_PortfolioCase_MBA() throws InterruptedException {
        check(Config.Website + "/portfolio/mobile-banking-app/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_OBIBP() throws InterruptedException {
        check(Config.Website + "/portfolio/online-b2b-invoicing-billing-platform/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_APFAARS() throws InterruptedException {
        check(Config.Website + "/portfolio/ai-powered-financial-analysis-and-recommendation-system/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_SFARIST() throws InterruptedException {
        check(Config.Website + "/portfolio/system-for-algorithmic-robo-intraday-stock-trading/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_AFGILFS() throws InterruptedException {
        check(Config.Website + "/portfolio/app-for-getting-instant-loans-for-smes/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_WLMBA() throws InterruptedException {
        check(Config.Website + "/portfolio/white-label-mobile-banking-app/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_WMPWRARPCAMF() throws InterruptedException {
        check(Config.Website + "/portfolio/wealth-management-platform-with-robo-advisor-remote-portfolio-construction-and-monitoring-functionality/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_MBAFM() throws InterruptedException {
        check(Config.Website + "/portfolio/mobile-banking-app-for-migrants/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_STSP() throws InterruptedException {
        check(Config.Website + "/portfolio/stock-trading-signals-platform/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_HCMSFEHB() throws InterruptedException {
        check(Config.Website + "/portfolio/healthcare-claim-management-system-for-evaluating-hospital-bills/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_STB() throws InterruptedException {
        check(Config.Website + "/portfolio/stock-trading-bot/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_ASTPFAIIMC() throws InterruptedException {
        check(Config.Website + "/portfolio/automated-stock-trading-platform-for-an-international-investment-management-company/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_MBTA() throws InterruptedException {
        check(Config.Website + "/portfolio/mobile-bank-transfer-app/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_MEWA() throws InterruptedException {
        check(Config.Website + "/portfolio/mobile-e-wallet-application/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_CTMCS() throws InterruptedException {
        check(Config.Website + "/portfolio/corporate-travel-management-ctm-software/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_ONTPWVS() throws InterruptedException {
        check(Config.Website + "/portfolio/online-negotiation-training-platform-with-video-streaming/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_BAFSTIFLAHTBCS() throws InterruptedException {
        check(Config.Website + "/portfolio/banking-app-for-students-that-instills-financial-literacy-and-helps-to-build-credit-score/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_CPFTOTCS() throws InterruptedException {
        check(Config.Website + "/portfolio/centralized-platform-for-trading-over-the-counter-securities/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_DSFABFRS() throws InterruptedException {
        check(Config.Website + "/portfolio/devops-solution-for-ai-based-financial-recommendation-system/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_BAM() throws InterruptedException {
        check(Config.Website + "/portfolio/bot-answering-machine/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_TEFBE() throws InterruptedException {
        check(Config.Website + "/portfolio/team-extension-for-building-ewallet/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_AMFEHA() throws InterruptedException {
        check(Config.Website + "/portfolio/accounting-module-for-emr-healthcare-application/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_MSPFA() throws InterruptedException {
        check(Config.Website + "/portfolio/money-saving-personal-finance-assistant/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_AFPSL() throws InterruptedException {
        check(Config.Website + "/portfolio/app-for-paying-student-loans/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_HPFCARM() throws InterruptedException {
        check(Config.Website + "/portfolio/hr-platform-for-candidate-and-recruiter-matchmaking/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_ACTP() throws InterruptedException {
        check(Config.Website + "/portfolio/automated-crypto-trading-platform/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_CRIA() throws InterruptedException {
        check(Config.Website + "/portfolio/crypto-retirement-investment-app/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_DMS() throws InterruptedException {
        check(Config.Website + "/portfolio/document-management-system/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_CSSAFFO() throws InterruptedException {
        check(Config.Website + "/portfolio/credit-scoring-saas-app-for-financial-organizations/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_DIMS() throws InterruptedException {
        check(Config.Website + "/portfolio/digital-insurance-marketplace-solution/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_MAFCMQ() throws InterruptedException {
        check(Config.Website + "/portfolio/mobile-app-for-canadaqbank-mccee-qbank/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_PPMP() throws InterruptedException {
        check(Config.Website + "/portfolio/property-portfolio-management-platform/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_SCDFCIP() throws InterruptedException {
        check(Config.Website + "/portfolio/smart-contract-development-for-cryptocurrency-investment-platform/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_PFBICS() throws InterruptedException {
        check(Config.Website + "/portfolio/platform-for-building-improving-credit-score/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_DMFABSC() throws InterruptedException {
        check(Config.Website + "/portfolio/digital-marketplace-for-a-business-support-center/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_IMP() throws InterruptedException {
        check(Config.Website + "/portfolio/investment-management-platform/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_HMPFTCI() throws InterruptedException {
        check(Config.Website + "/portfolio/hr-management-platform-for-the-construction-industry/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_FDMPWARAV() throws InterruptedException {
        check(Config.Website + "/portfolio/financial-data-management-platform-with-analytics-reporting-and-visualization/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_APWCA() throws InterruptedException {
        check(Config.Website + "/portfolio/accounting-platform-with-crypto-assets/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_RMSWM() throws InterruptedException {
        check(Config.Website + "/portfolio/restaurant-management-software-with-marketplace/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_MOALCMSTTNF() throws InterruptedException {
        check(Config.Website + "/portfolio/migration-of-a-legal-case-management-system-to-the-net-framework/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_ASAWMFRI() throws InterruptedException {
        check(Config.Website + "/portfolio/ar-shopping-app-with-minigame-for-retail-industry/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_TGAFT() throws InterruptedException {
        check(Config.Website + "/portfolio/test-grading-app-for-teachers/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_TPFPWCD() throws InterruptedException {
        check(Config.Website + "/portfolio/telehealth-platform-for-patients-with-chronic-diseases/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_HSP() throws InterruptedException {
        check(Config.Website + "/portfolio/home-search-platform/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_SOACBCP() throws InterruptedException {
        check(Config.Website + "/portfolio/support-of-a-cloud-based-cms-platform/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_BWR() throws InterruptedException {
        check(Config.Website + "/portfolio/business-website-redesign/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_OMFCREA() throws InterruptedException {
        check(Config.Website + "/portfolio/online-marketplace-for-canadian-real-estate-agency/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_CPT() throws InterruptedException {
        check(Config.Website + "/portfolio/customer-persona-tool/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_PAIIBW() throws InterruptedException {
        check(Config.Website + "/portfolio/processes-automation-implemented-in-business-website/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_PCEEP() throws InterruptedException {
        check(Config.Website + "/portfolio/patient-centric-ehr-emr-platform/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_WBPFIEOAM() throws InterruptedException {
        check(Config.Website + "/portfolio/web-based-platform-for-improved-event-organization-and-management/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_WMPFA() throws InterruptedException {
        check(Config.Website + "/portfolio/web-mobile-pest-forecasting-application/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_AFAGRC() throws InterruptedException {
        check(Config.Website + "/portfolio/application-for-a-garland-remote-control/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_RMWDT() throws InterruptedException {
        check(Config.Website + "/portfolio/ready-made-woocommerce-design-templates/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_ARAIRAFM() throws InterruptedException {
        check(Config.Website + "/portfolio/augmented-reality-and-image-recognition-app-for-mcdonalds/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_ULAFCS() throws InterruptedException {
        check(Config.Website + "/portfolio/uber-like-app-for-cleaning-services/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_LSEAFAC() throws InterruptedException {
        check(Config.Website + "/portfolio/life-saving-emergency-app-for-ambulance-call/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_TPFWMH() throws InterruptedException {
        check(Config.Website + "/portfolio/telemedicine-platform-for-womens-mental-health/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_PFAA() throws InterruptedException {
        check(Config.Website + "/portfolio/personal-finance-assistant-app/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_HDAP() throws InterruptedException {
        check(Config.Website + "/portfolio/health-data-analytical-platform/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_ERCMS() throws InterruptedException {
        check(Config.Website + "/portfolio/enegry-resources-consumption-management-system/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_HAFTCAIEH() throws InterruptedException {
        check(Config.Website + "/portfolio/healthy-app-for-tracking-calories-and-improving-eating-habits/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_ACFSSG() throws InterruptedException {
        check(Config.Website + "/portfolio/app-companion-for-smart-swimming-goggles/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_AFCW1R() throws InterruptedException {
        check(Config.Website + "/portfolio/app-for-cooking-with-14k-recipes/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_MAFYA() throws InterruptedException {
        check(Config.Website + "/portfolio/mobile-app-for-young-athletes/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_WLSFMGIS() throws InterruptedException {
        check(Config.Website + "/portfolio/white-label-solution-for-managing-goods-in-stock/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_TFREAP() throws InterruptedException {
        check(Config.Website + "/portfolio/tool-for-real-estate-agents-performance/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_MSFDIP() throws InterruptedException {
        check(Config.Website + "/portfolio/modern-storefront-for-decor-items-provider/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_FMFC() throws InterruptedException {
        check(Config.Website + "/portfolio/freelance-marketplace-for-creatives/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_OPWFAWMP() throws InterruptedException {
        check(Config.Website + "/portfolio/one-page-website-for-a-wealth-management-platform/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_CROFBW() throws InterruptedException {
        check(Config.Website + "/portfolio/conversion-rate-optimization-for-business-website/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_DFAEWA() throws InterruptedException {
        check(Config.Website + "/portfolio/design-for-an-e-wallet-app/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_DFIMTA() throws InterruptedException {
        check(Config.Website + "/portfolio/design-for-international-money-transfer-app/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_DFMBAFM() throws InterruptedException {
        check(Config.Website + "/portfolio/design-for-mobile-banking-app-for-migrants/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_DFFDMP() throws InterruptedException {
        check(Config.Website + "/portfolio/design-for-finance-data-management-platform/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_DFTMP() throws InterruptedException {
        check(Config.Website + "/portfolio/design-for-talent-management-platform/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_DFMHTP() throws InterruptedException {
        check(Config.Website + "/portfolio/design-for-mental-health-telemedicine-platform/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_DFEMAFAC() throws InterruptedException {
        check(Config.Website + "/portfolio/design-for-emergency-mobile-app-for-ambulance-call/", Config.checkMethod.checkBigContactForm);
    }

    @Test
    public void BigCF_PortfolioCase_OB2CPWDL() throws InterruptedException {
        check(Config.Website + "/portfolio/online-b2c-platform-with-digital-lending/", Config.checkMethod.checkBigContactForm);
    }

    /* -- end check portfolio cases. */

    /* Check Careers and Vacancies Forms: */

    @Test
    public void CareerCF_Careers() throws InterruptedException {
        check(Config.Website + "/careers/", Config.checkMethod.checkCareerForm);
    }

    @Test
    public void Vacancies_CheckAllPublishPosts() throws InterruptedException {
        check(Config.Website + "/careers/", Config.checkMethod.checkAllPublicVacancies);
    }

    /* -- end check careers and vacancies contact forms. */

    /* Check Planning Tool Forms: */

    @Test
    public void PlanningCF_SoftwarePlanningTool() throws InterruptedException {
        check(Config.Website + "/plan-software-development/", Config.checkMethod.checkPlanningForm);
    }

    /* -- end check planning tool forms. */

    /** *** END AUTOMATIC TESTS. *** **/

    @BeforeMethod
    public static void TestPrepare() {
        prepareConfigData();
    }

    /* * *** -- end automatic tests -- *** * */

    /**
     * Running all test methods for specified pages.
     * @throws InterruptedException An exception that throws a message in case of an error.
     */
    public static void listLinks() throws InterruptedException {
        checkBigContactForm(Config.Website + "/");
        checkCareerForm(Config.Website + "/careers/");
        checkVacancyForm(Config.Website + "/careers/seo-manager/");
        checkSmallContactForm(Config.Website + "/top-10-stock-trading-bot-developers/");
        checkPostBannerForm(Config.Website + "/top-10-stock-trading-bot-developers/");
        checkPlanningForm(Config.Website + "/plan-software-development/");
        //checkAllPublicVacancies();
    }

    /**
     * This method sets all the parameters required for testing
     * (including those specified in the "main" and "listLinks" method).
     *
     * @param type The type of device whose viewport will be used for testing.
     * @param browser The type of browser that will be used for testing.
     */
    private static void applyConfigs(Config.deviceType type, Config.useBrowser browser) {
        Logger.log("Set configurations: device \"" + type.toString() + "\", browser \"" + browser.toString() + "\"");

        Dimension windowSize;

        switch (type) {
            default:
            case DESKTOP: {
                windowSize = new Dimension(Config.WINDOW_DESKTOP_SIZE[0], Config.WINDOW_DESKTOP_SIZE[1]);
                break;
            }
            case LAPTOP: {
                windowSize = new Dimension(Config.WINDOW_LAPTOP_SIZE[0], Config.WINDOW_LAPTOP_SIZE[1]);
                break;
            }
            case TABLET: {
                windowSize = new Dimension(Config.WINDOW_TABLET_SIZE[0], Config.WINDOW_TABLET_SIZE[1]);
                break;
            }
            case MOBILE: {
                windowSize = new Dimension(Config.WINDOW_MOBILE_SIZE[0], Config.WINDOW_MOBILE_SIZE[1]);
                break;
            }
            case DESKTOP_LANDSCAPE: {
                windowSize = new Dimension(Config.WINDOW_DESKTOP_SIZE[1], Config.WINDOW_DESKTOP_SIZE[0]);
                break;
            }
            case LAPTOP_LANDSCAPE: {
                windowSize = new Dimension(Config.WINDOW_LAPTOP_SIZE[1], Config.WINDOW_LAPTOP_SIZE[0]);
                break;
            }
            case TABLET_LANDSCAPE: {
                windowSize = new Dimension(Config.WINDOW_TABLET_SIZE[1], Config.WINDOW_TABLET_SIZE[0]);
                break;
            }
            case MOBILE_LANDSCAPE: {
                windowSize = new Dimension(Config.WINDOW_MOBILE_SIZE[1], Config.WINDOW_MOBILE_SIZE[0]);
                break;
            }
        }

        Config.currentDevice = type;

        switch (browser) {
            default:
            case CHROME: {
                System.setProperty("webdriver.chrome.driver", Config.chromeDriverPath);

                ChromeDriverOptions chromeOptions = new ChromeDriverOptions();
                setDriverOptions(chromeOptions, windowSize);
                ChromeOptions options = chromeOptions.getOptions();

                driver = new ChromeDriver(options);
                break;
            }
            case FIREFOX: {
                System.setProperty("webdriver.gecko.driver", Config.firefoxDriverPath);

                FirefoxDriverOptions firefoxOptions = new FirefoxDriverOptions();
                setDriverOptions(firefoxOptions, windowSize);
                FirefoxOptions options = firefoxOptions.getOptions();

                driver = new FirefoxDriver(options);
                break;
            }
            case EDGE: {
                System.setProperty("webdriver.edge.driver", Config.edgeDriverPath);

                EdgeDriverOptions edgeOptions = new EdgeDriverOptions();
                setDriverOptions(edgeOptions, windowSize);
                EdgeOptions options = edgeOptions.getOptions();

                driver = new EdgeDriver(options);
                break;
            }
        }

        wait = new WebDriverWait(driver, TIME_OUT);
        actions = new Actions(driver);
        jse = (JavascriptExecutor)driver;

        //driver.manage().window().maximize();

        driver.manage().window().setSize(windowSize);

        Logger.log("Set window size: " + windowSize.width + "x" + windowSize.height);
    }

    /**
     * The method prepares data about the browser and devices for use when performing the test
     */
    private static void prepareConfigData() {
        if (!Config.DO_REAL_TESTS) return;

        Logger.log("Preparing data for testing...");

        ConfigReader.appoint();

        Logger.log("Generating a list of browsers used in the test...");
        Config.generateListOfUsedBrowsers();
        Logger.log("Tested browsers: " + Config.browsersList.toString());

        Logger.log("Forming a list of tested devices...");
        Config.generateListOfUsedDevices();
        Logger.log("Tested devices: " + Config.devicesList.toString());
    }

    /**
     * Closes the browser with the current driver running.
     * It is necessary to perform after each use of the "applyConfigs" method
     * (because it will open the browser).
     */
    private static void closeBrowser() {
        driver.quit();
        Logger.log("The browser is closed from the driver");
    }

    /**
     * Universal setting of parameters for drivers of any browser
     *
     * @param options Driver Options (from Selenium driver)
     * @param windowSize Width and Height for browser window size
     * @param <T> Generic
     * @return options for current web driver
     */
    private static <T extends DriverOptions> T setDriverOptions(T options, Dimension windowSize) {
        String resolution = windowSize.width + "," + windowSize.height;

        if (Config.HEADLESS_MODE)
            options.addArguments("--headless"); // Запуск в фоновом режиме (без графического интерфейса)

        options.addArguments("--disable-background-networking"); // Отключение фоновых сетевых операций (снижение нагрузки)
        options.addArguments("--incognito"); // Активация режима "инкогнито" (для Chrome)
        options.addArguments("--no-sandbox"); // Отключение изоляции процессов (запуск без песочницы)
        options.addArguments("--disable-infobars"); // Отключение информационной панели в верхней части браузера
        options.addArguments("--disable-extensions"); // Отключение всех расширений браузера (могут видоизменять сайт)
        options.addArguments("--disable-notifications"); // Отключение оповещений браузера (например, об обновлениях)
        options.addArguments("--disable-dev-shm-usage"); // Отключение shm для обмена данными между процессами
        options.addArguments("--disable-translate"); // Отключение автоматического перевода (вдруг активирован)
        options.addArguments("--window-size=" + resolution); // Указание параметров окна браузера (для имитации устройств)

        //options.addArguments("--ignore-certificate-errors"); // Игнорирование SSL-ошибок (только для тестов на локалке)
        //options.addArguments("--disable-web-security"); // Отключение политики SOP (только для тестов на локалке)

        return options;
    }

    /**
     * The method that performs the test by the specified method on the specified page.
     *
     * @param checkPageURL The URL of the page where you need to find all the contact forms and test them.
     * @param checkMethod The testing method by which the found contact forms will be checked.
     *                    It is this parameter that specifies which forms need to be formatted.
     * @throws InterruptedException Error message
     */
    private static void check(String checkPageURL, Config.checkMethod checkMethod) throws InterruptedException {
        if (!Config.DO_REAL_TESTS) return;

        for (Config.useBrowser browser : Config.browsersList) {
            for (Config.deviceType device : Config.devicesList) {
                applyConfigs(device, browser);
                runSelectedCheck(checkMethod, checkPageURL);
                closeBrowser();
            }
        }
    }

    private static void runSelectedCheck(Config.checkMethod selectedMethod, String checkPageURL) throws InterruptedException {
        switch (selectedMethod) {
            case checkBigContactForm: {
                checkBigContactForm(checkPageURL);
                break;
            }
            case checkSmallContactForm: {
                checkSmallContactForm(checkPageURL);
                break;
            }
            case checkPostBannerForm: {
                checkPostBannerForm(checkPageURL);
                break;
            }
            case checkCareerForm: {
                checkCareerForm(checkPageURL);
                break;
            }
            case checkVacancyForm: {
                checkVacancyForm(checkPageURL);
                break;
            }
            case checkPlanningForm: {
                checkPlanningForm(checkPageURL);
                break;
            }
            case checkAllPublicVacancies: {
                checkAllPublicVacanciesForms(checkPageURL);
                break;
            }
            default: {} break;
        }
    }

    /**
     * Testing the main contact form located at the bottom of almost all landing pages of the site.
     *
     * @param pageURL Link to the page with the form (ex.: "https://example.com/page/").
     * @throws InterruptedException An exception that throws a message in case of an error.
     */
    public static void checkBigContactForm(String pageURL) throws InterruptedException {
        openPage(pageURL);

        String sectionClassName = "itx-mfb";

        int numberOfForms = countAvailableForms(sectionClassName);

        for (int i = 0; i < numberOfForms; i++) {
            if (numberOfForms > 1) {
                openPage(pageURL);
            }

            List<WebElement> sectionWithForms = driver.findElements(By.className(sectionClassName));
            WebElement form = sectionWithForms.get(i).findElement(By.tagName("form"));
            moveTo(form);

            setInput(form, "name", Config.FormName);
            setInput(form, "company", Config.FormCompany);
            setInput(form, "email", Config.FormEmail);
            setInput(form, "phone", Config.FormPhone);
            setInput(form, "message", Config.FormMessage);
            selectCheckbox(form, "label[for='policy']");
            selectCheckbox(form, "label[for='nda']");

            submit(form);

            waitToPageLoaded(Config.Website + Config.okPage);

            wait.until(driver -> ExpectedConditions.urlToBe(Config.Website + Config.okPage));
            assertEquals(driver.getCurrentUrl(), Config.Website + Config.okPage);
        }
    }

    /**
     * Testing the form on the career page.
     *
     * @param pageURL Link to the page with the form (ex.: "https://example.com/page/").
     * @throws InterruptedException An exception that throws a message in case of an error.
     */
    public static void checkCareerForm(String pageURL) throws InterruptedException {
        checkFormWithPosition(pageURL, "itx-mfb");
    }

    /**
     * Testing the form on the vacancies page.
     *
     * @param pageURL Link to the page with the form (ex.: "https://example.com/page/").
     * @throws InterruptedException An exception that throws a message in case of an error.
     */
    public static void checkVacancyForm(String pageURL) throws InterruptedException {
        checkFormWithPosition(pageURL, "careers-form");
    }

    /**
     * A universal method for checkVacancyForm() and checkCareerForm(),
     * which performs a test of forms with a given class.
     *
     * @param pageURL Link to the page with the form (ex.: "https://example.com/page/").
     * @throws InterruptedException An exception that throws a message in case of an error.
     */
    public static void checkFormWithPosition(String pageURL, String sectionClassName) throws InterruptedException {
        openPage(pageURL);

        int numberOfForms = countAvailableForms(sectionClassName);

        for (int i = 0; i < numberOfForms; i++) {
            if (numberOfForms > 1) {
                openPage(pageURL);
            }

            List<WebElement> sectionWithForms = driver.findElements(By.className(sectionClassName));
            WebElement form = sectionWithForms.get(i).findElement(By.tagName("form"));
            moveTo(form);

            setInput(form, "name", Config.FormName);
            setInput(form, "position", Config.FormPosition);
            setInput(form, "email", Config.FormEmail);
            setInput(form, "phone", Config.FormPhone);
            setInput(form, "message", Config.FormMessage);
            selectCheckbox(form, "label[for='policy']");

            submit(form);

            waitToPageLoaded(Config.Website + Config.okPage);

            wait.until(driver -> ExpectedConditions.urlToBe(Config.Website + Config.okPage));
            assertEquals(driver.getCurrentUrl(), Config.Website + Config.okPage);
        }
    }

    /**
     * The method checks all currently published open vacancies on the site
     *
     * @param pageURL Link to the page with the form (ex.: "https://example.com/careers/").
     * @throws InterruptedException An exception that throws a message in case of an error.
     */
    public static void checkAllPublicVacanciesForms(String pageURL) throws InterruptedException {

        List<String> linksList = new ArrayList<String>();
        String locatorWithJobsList = "jobs__items";
        String locatorWithJobItem = "jobs__item";

        openPage(pageURL);

        WebElement sectionWithJobsList = driver.findElement(By.className(locatorWithJobsList));
        List<WebElement> vacanciesLinks = sectionWithJobsList.findElements(By.className(locatorWithJobItem));

        for (WebElement vacanciesLink : vacanciesLinks) {
            linksList.add(vacanciesLink.getAttribute("href"));
        }
        for ( String link : linksList ) {
            checkFormWithPosition(link, "careers-form");
        }
        // List<WebElement> stores live links to the element. Therefore, it is not possible to do everything in one cycle,
        // because after opening a new vacancy page, links from the web element are deleted (it is impossible to find).
    }

    /**
     * Testing the interactive form "Software Planning Tool".
     *
     * @param pageURL Link to the page with the form (ex.: "https://example.com/page/").
     * @throws InterruptedException An exception that throws a message in case of an error.
     */
    public static void checkPlanningForm(String pageURL) throws InterruptedException {
        openPage(pageURL);

        String sectionElementId = "planning";
        String nextBtnId = "next";

        WebElement sectionElement = driver.findElement(By.id(sectionElementId));
        WebElement form = sectionElement.findElement(By.tagName("form"));

        WebElement nextBtn = driver.findElement(By.id(nextBtnId));

        moveTo(form);

        selectCheckbox(form, "label[for='web']");
        moveTo(nextBtn); click(nextBtn);

        selectCheckbox(form, "label[for='finance']");
        moveTo(nextBtn); click(nextBtn);

        selectCheckbox(form, "label[for='functional-prototype']");
        moveTo(nextBtn); click(nextBtn);

        selectCheckbox(form, "label[for='custom-design']");
        moveTo(nextBtn); click(nextBtn);

        moveTo(nextBtn); click(nextBtn);

        selectCheckbox(form, "label[for='asap']");
        moveTo(nextBtn); click(nextBtn);

        selectCheckbox(form, "label[for='send-template']");
        moveTo(nextBtn); click(nextBtn);

        selectCheckbox(form, "label[for='high-level']");
        moveTo(nextBtn); click(nextBtn);

        setInput(form, "details", Config.FormMessage);
        moveTo(nextBtn); click(nextBtn);

        setInput(form, "name", Config.FormName);
        setInput(form, "email", Config.FormEmail);
        selectCheckbox(form, "label[for='policy']");

        String showSubmitBtnForDevice;

        switch (Config.currentDevice) {
            default:
            case DESKTOP:
            case DESKTOP_LANDSCAPE:
            case LAPTOP:
            case LAPTOP_LANDSCAPE:
            case TABLET_LANDSCAPE: {
                showSubmitBtnForDevice = "desktop";
                break;
            }
            case TABLET:
            case MOBILE:
            case MOBILE_LANDSCAPE: {
                showSubmitBtnForDevice = "mobile";
                break;
            }
        }
        WebElement submitElement = form.findElement(By.className("steps-submit-" + showSubmitBtnForDevice));

        moveTo(submitElement);
        submit(submitElement);

        waitToPageLoaded(Config.Website + Config.okPage);

        wait.until(driver -> ExpectedConditions.urlToBe(Config.Website + Config.okPage));
        assertEquals(driver.getCurrentUrl(), Config.Website + Config.okPage);
    }

    /**
     * Testing small contact forms on landing pages and blog posts ({name, email, message}),
     * which are added to the page using a shortcode or gutenberg block.
     *
     * @param pageURL Link to the page with the form (ex.: "https://example.com/page/").
     * @throws InterruptedException An exception that throws a message in case of an error.
     */
    public static void checkSmallContactForm(String pageURL) throws InterruptedException {
        openPage(pageURL);

        String sectionClassName = "itx-cf-light";
        String contactFormName = "light_contact_form_";
        String agreeLabel = "cf_light__policy_";

        int numberOfForms = countAvailableForms(sectionClassName);

        for (int i = 0; i < numberOfForms; i++) {
            openPage(pageURL);

            WebElement form = driver.findElement(By.id(contactFormName + (i+1)));

            moveTo(form);

            setInput(form, "name", Config.FormName);
            setInput(form, "email", Config.FormEmail);
            setInput(form, "message", Config.FormMessage);
            selectCheckbox(form, "label[for='" + (agreeLabel + (i+1)) + "']");

            submit(form);

            waitToPageLoaded(Config.Website + Config.okPage);

            wait.until(driver -> ExpectedConditions.urlToBe(Config.Website + Config.okPage));
            assertEquals(driver.getCurrentUrl(), Config.Website + Config.okPage);
        }
    }

    /**
     * Testing a small banner with a contact form (name and email),
     * which is placed using a shortcode (mainly in blog posts).
     *
     * @param pageURL Link to the page with the form (ex.: "https://example.com/blog/post/").
     * @throws InterruptedException An exception that throws a message in case of an error.
     */
    public static void checkPostBannerForm(String pageURL) throws InterruptedException {
        openPage(pageURL);

        String sectionClassName = "banner-form-wrapper";
        String contactFormName = "post-banner-form--";
        String agreeLabel = "policy-banner--";

        int numberOfForms = countAvailableForms(sectionClassName);

        for (int i = 0; i < numberOfForms; i++) {
            openPage(pageURL);

            WebElement form = driver.findElement(By.id(contactFormName + (i+1)));

            moveTo(form);

            setInput(form, "name", Config.FormName);
            setInput(form, "email", Config.FormEmail);
            selectCheckbox(form, "label[for='" + (agreeLabel + (i+1)) + "']");

            submit(form);

            waitToPageLoaded(Config.Website + Config.okPage);

            wait.until(driver -> ExpectedConditions.urlToBe(Config.Website + Config.okPage));
            assertEquals(driver.getCurrentUrl(), Config.Website + Config.okPage);
        }
    }

    private static void setInput(WebElement parentElement, String inputName, String fillerText) {
        Logger.log("Set input with name \"" + inputName + "\" value: " + fillerText);
        WebElement currentInput = parentElement.findElement(By.name(inputName));
        actionClick(currentInput);
        currentInput.sendKeys(fillerText);
    }

    private static void selectCheckbox(WebElement parentElement, String labelSelector) {
        Logger.log("Set checkbox for: " + labelSelector);
        try {
            WebElement label = parentElement.findElement(By.cssSelector(labelSelector));
            moveTo(label);
            click(label);
        } catch (WebDriverException e) {
            throw new RuntimeException(e);
        }
    }

    private static int countAvailableForms(String formsClassName) throws InterruptedException {
        List<WebElement> cfs = driver.findElements(By.className(formsClassName));
        int numberOfForms = cfs.size();

        if (numberOfForms > 0) {
            Logger.log("Number of forms found: " + numberOfForms);
        } else {
            Logger.log("NO CORRESPONDING FORMS WERE FOUND ON THE CURRENT PAGE!");
        }

        return numberOfForms;
    }

    private static void closeCookiesModal() throws InterruptedException {
        Logger.log("Checking for a modal window \"Cookies\".");
        String cookieModalElement = "cookie-law-info-bar";
        String cookieCloseButton = "wt-cli-accept-all-btn";
        WebElement closeCookieForm = (new WebDriverWait(driver, TIME_OUT))
                .until(ExpectedConditions.presenceOfElementLocated(By.id(cookieModalElement)));
        if (checkIsShownCookieModal(cookieModalElement)) {
            Logger.log("\"Cookie\" modal detected.");
            driver.findElement(By.id(cookieCloseButton)).click();
            f.toWait(1575); // Animation of the modal closure
            Logger.log("\"Cookie\" modal closed.");
        }
    }

    private static void checkWidgetExist() {
        //ContactForms.Logger.log("Checking for live chat \"Tawk\" exist.");
        String widgetVisibleClass = "widget-visible";
        try {
            WebElement widgetVisibleElement = driver.findElement(By.className(widgetVisibleClass));
            //ContactForms.Logger.log("Chat \"Tawk\" found, removing...");
            ((JavascriptExecutor) driver).executeScript("arguments[0].remove()", widgetVisibleElement);
            Logger.log("Chat \"Tawk\" was founded and removed.");
        } catch (NoSuchElementException e) {
            //ContactForms.Logger.log("Chat \"Tawk\" not found, skipping...");
        }
    }

    private static boolean checkIsShownCookieModal(String cookieModalElement) {
        try {
            WebElement el = driver.findElement((By.id(cookieModalElement)));
            return el.isDisplayed() && el.isEnabled();
        }
        catch (WebDriverException e) {
            return false;
        }
    }

    private static void click(@NotNull WebElement element) {
        Logger.log("Click element");
        checkWidgetExist();
        element.click();
    }
    private static void actionClick(WebElement element) {
        Logger.log("actionClick element");
        actions.moveToElement(element).click();
    }
    private static void waitClick(WebElement element) {
        Logger.log("waitClick element");
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    private static void jsClick(WebElement element) {
        Logger.log("jsClick element");
        jse.executeScript("arguments[0].click();", element);
    }

    private static void submit(@NotNull WebElement parentElement) {
        Logger.log("Press submit button");
        WebElement btn = parentElement.findElement(By.cssSelector("button[type='submit']"));
        btn.click();
    }

    private static void moveTo(WebElement element) {
        Logger.log("moveTo element");
        jse.executeScript("arguments[0].scrollIntoView({behavior:'instant'})", element);
        actions.moveToElement(element);
        f.toWait(Config.waitTime);
    }
    private static void scrollTo(WebElement element) {
        Logger.log("scrollTo element");
        jse.executeScript("arguments[0].scrollIntoView()", element);
    }
    private static void scrollBy(int offset) {
        Logger.log("scrollBy " + offset + "px");
        WebElement body = driver.findElement(By.tagName("body"));
        jse.executeScript("window.scrollBy(0, " + offset + ")", body);
    }

    private static void openPage(String url) throws InterruptedException {
        Logger.log("Open page: " + url);
        driver.get(url);
        wait.until(driver -> ExpectedConditions.urlToBe(url));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));

        closeCookiesModal();
    }

    private static void waitToPageLoaded(String url) {
        Logger.log("Wait loaded page with url: " + url);
        wait.until(ExpectedConditions.urlToBe(url));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
    }

}
