package LiveProject;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class Selenium_Activity {
    WebDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    @BeforeMethod
    public void browserinitiate(){
        //Create a firefox Instance
        driver = new FirefoxDriver();
    }

    @Test(priority = 0)
    public void Activity1() {
        //Open the link
        driver.get("https://alchemy.hguy.co/jobs/");
        //get the page Title
        String title = driver.getTitle();
        //verify if the title matches to 'Alchemy Jobs – Job Board Application'
        if (title.equalsIgnoreCase("Alchemy Jobs – Job Board Application"))
        System.out.println("Activity1 Title is matched");
    }


    @Test(priority = 1)
    public void Activity2(){
        //Open the link
        driver.get("https://alchemy.hguy.co/jobs/");
        //get the header
        String header = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
        System.out.println("header of the page is: " +header);
        //verify the header matches to 'Welcome to Alchemy Jobs'
        if(header.equalsIgnoreCase("Welcome to Alchemy Jobs"))
        System.out.println("Activity2 header is matched");
    }

    @Test(priority = 2)
    public void Activity3(){
        //Open the link
        driver.get("https://alchemy.hguy.co/jobs/");
        //Get the url of the header image.
        String url = driver.findElement(By.xpath("//div[@class='post-thumb-img-content post-thumb']")).getAttribute("src");
        System.out.println("Activity3 Image url is: " +url);
    }

    @Test(priority = 3)
    public void Activity4(){
        //Open the link
        driver.get("https://alchemy.hguy.co/jobs/");
        //get the second header
        String header2 = driver.findElement(By.xpath("//h2[contains(text(), 'Quia quis non')]")).getText();
        System.out.println("Header2 text is: " +header2);
        //verify if the header matches to 'Quia quis non'
        if (header2.equalsIgnoreCase("Quia quis non"))
        System.out.println("Activity4 header is matched");
    }

    @Test(priority = 4)
    public void Activity5(){
        //Open the link
        driver.get("https://alchemy.hguy.co/jobs/");
        //Select the menu item that says “Jobs” and click it.
        driver.findElement(By.xpath("//a[@href= 'https://alchemy.hguy.co/jobs/jobs/']")).click();
        //wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //get the page Title
        String title = driver.getTitle();
        System.out.println("page title is: " +title);
        //check you are on correct page
        if(title.equalsIgnoreCase("Jobs-Alchemy jobs"))
            System.out.println("Activity5 user is in correct page");
    }

    @Test(priority = 5)
    public void Activity6(){
        //Open the link
        driver.get("https://alchemy.hguy.co/jobs/");
        //Select the menu item that says “Jobs” and click it.
        driver.findElement(By.xpath("(//a[contains(text(),'Jobs')])[2]")).click();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Search for a particular job
        By searchbox = By.xpath("//input[@id='search_keywords']");
        driver.findElement(searchbox).sendKeys("Banking");
        //Click Search jobs button
        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //select any job
        By searchresult = By.xpath("//span[contains(text(), 'Search completed')]");
        driver.findElement(By.xpath("(//div[@class='position'])[1]")).click();
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Click 'Apply for Job' button
        By button = By.xpath("//input[@value='Apply for job']");
        driver.findElement(button).click();
        //wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //print the mailid to console
        String text = driver.findElement(By.xpath("(//a[@href='https://alchemy.hguy.co/jobs/post-a-job/'])[2]")).getText();
        System.out.println("Activity6 mailid is: " +text);
    }

    @Test(priority = 6)
    public void Activity7(){
        //Open the link
        driver.get("https://alchemy.hguy.co/jobs/");
        //click on 'post a job button'
        driver.findElement(By.xpath("//a[contains(text(),'Post a Job')]")).click();
        //Wait till page loads Have an Account?
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Fill the details
        driver.findElement(By.xpath("//input[@id='create_account_email']")).sendKeys("k4@gmail.com");
        String JobTitle = "Banking";
        driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys(JobTitle);
        String JobLocation = "London";
        driver.findElement(By.id("job_location")).sendKeys(JobLocation);
        WebElement JobType = driver.findElement(By.id("job_type"));
        Select option = new Select(JobType);
        option.selectByVisibleText("Full Time");
        driver.switchTo().frame(0);
        WebElement description = driver.findElement(By.xpath("//body[@id='tinymce']"));
        //description.click();
        description.sendKeys("Job posting");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@id='application']")).sendKeys("https://alchemy.hguy.co/jobs/post-a-job/");
        String Companyname = "Alchemy";
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys(Companyname);
        driver.findElement(By.xpath("//input[@id='company_website']")).sendKeys("https://alchemy.hguy.co/jobs/post-a-job/");
        driver.findElement(By.xpath("//input[@id='company_tagline']")).sendKeys("trainers");
        driver.findElement(By.xpath("//input[@id='company_video']")).sendKeys("https://alchemy.hguy.co/jobs/post-a-job/");
        driver.findElement(By.xpath("//input[@id='company_twitter']")).sendKeys("twitter");
        driver.findElement(By.xpath("//input[@name='submit_job']")).click();
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        By Submitlisting = By.xpath("//input[@class='button job-manager-button-submit-listing']");
        driver.findElement(Submitlisting).click();
        //wait until the job is successfully submitted
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Search for the newly created job
        //Select the menu item that says “Jobs” and click it.
        driver.findElement(By.xpath("//a[@href= 'https://alchemy.hguy.co/jobs/jobs/']")).click();
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Search for a particular job
        By searchbox = By.xpath("//input[@id='search_keywords']");
        driver.findElement(searchbox).sendKeys(JobTitle);
        //Click Search jobs button
        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Verify if the newly created job is available
        String searchJobtitle = driver.findElement(By.xpath("//strong[contains(text(),'Alchemy')]")).getText();
        String searchJobLocation = driver.findElement(By.xpath("(//div[@class='location'])[1]")).getText();
        if(JobTitle.equalsIgnoreCase(searchJobtitle) && JobLocation.equalsIgnoreCase(searchJobLocation))
            System.out.println("Activity7 job listing was posted in Jobs page");
    }
    @Test(priority = 7)
    public void Activity8(){
        //open https://alchemy.hguy.co/jobs/wp-admin
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        //Enter username and password
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
        //click login button
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
        //verify that login is successful - verify the header of the page
        String header = driver.findElement(By.xpath("//h1[contains(text(), 'Dashboard')]")).getText();
        if(header.equalsIgnoreCase("Dashboard"))
            System.out.println("Activity8 Login is successfull");
    }

    @Test(priority = 8)
    public void Activity9() throws InterruptedException {
        //open ‘https://alchemy.hguy.co/jobs/wp-admin
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        //Enter username and password
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
        //click login button
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
        //Locate the left hand menu and click the menu item that says “Job Listings”.
        driver.findElement(By.xpath("//div[contains(text(), 'Job Listings')]")).click();
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Click Add New button
        By AddNewbutton = By.xpath("//a[@class='page-title-action']");
        driver.findElement(AddNewbutton).click();
        Thread.sleep(2000);
        //Close the pop up if exists
        WebElement popup = driver.findElement(By.xpath("//div[@class='components-modal__header']"));
        if (popup.isDisplayed())
            driver.findElement(By.xpath("(//button[@class='components-button has-icon'])[5]")).click();
        //Scroll the page to the bottom
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //Enter the values in all fields
        String Jobtext = "text";
        driver.findElement(By.xpath("//textarea[@class='editor-post-title__input']")).sendKeys(Jobtext);
        driver.findElement(By.xpath("//input[@name='_company_website']")).sendKeys("Alchemy.com");
        driver.findElement(By.xpath("//input[@name='_company_twitter']")).sendKeys("t@t.com");
        driver.findElement(By.xpath("//input[@name='_company_video']")).sendKeys("https://google.com");
        driver.findElement(By.xpath("//input[@name='_filled']")).click();
        /*driver.findElement(By.xpath("//input[@id='_job_expires']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).isSelected();*/
        driver.findElement(By.xpath("//input[@id='_job_location']")).sendKeys("London");
        driver.findElement(By.xpath("//input[@id='_company_name']")).sendKeys("Alchemy");
        driver.findElement(By.xpath("//input[@id='_company_tagline']")).sendKeys("testing");
        driver.findElement(By.xpath("//input[@id='_featured']")).click();
        driver.findElement(By.xpath("//button[@class='components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary']")).click();
        driver.findElement(By.xpath("//button[@class='components-button editor-post-publish-button editor-post-publish-button__button is-primary']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //view the job created
        driver.findElement(By.xpath("//a[@class='components-button is-secondary']")).click();
        //verify the job created
        String jobtitle = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
        if(jobtitle.equalsIgnoreCase(Jobtext))
            System.out.println("Activity9 Job is created");
    }

   @AfterMethod
    public void teardown(){
        //close the browser
        driver.close();
    }
}
