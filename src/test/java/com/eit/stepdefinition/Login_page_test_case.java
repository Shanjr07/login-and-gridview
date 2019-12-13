 package com.eit.stepdefinition;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.awt.AWTException;
import java.util.List;
import com.eit.objects.GridViewpage;
import com.eit.objects.Loginpage;
import com.eit.resource.base;


public class Login_page_test_case extends base { 
	@Parameters({"Url"})
	@BeforeMethod
	public void browse(String s1) throws AWTException, InterruptedException {
		openbrowser(s1);
	}
   @Parameters({ "CorporateId_Invalid","Username","password" })
   @Test(priority=1)
   public void English_and_Arabic_Login_with_incorrect_Corporate_ID_or_User_name(String s1,String s2,String s3)  {
	   Loginpage page1= new Loginpage();
	   langu(page1.getLang()).selectByIndex(1);
	   waits(page1.getCoopId());
	   send(s1,page1.getCoopId());
	   send(s2,page1.getUsername());
	   send(s3,page1.getPassword());
	   page1.getLogin().click();
	  String textvalue="Enter Correct CorporateID or User name";
	  tablewait();
	   String text = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text.equals(textvalue),"English_Login_with_incorrect_Corporate_ID_or_User_name = Expected Result:Enter Correct CorporateID or User name but it shows ->"+text);	   
       langu(page1.getLang()).selectByIndex(2);
	   waits(page1.getCoopId());
	   send(s1,page1.getCoopId());
	   send(s2,page1.getUsername());
	   send(s3,page1.getPassword());
	   page1.getAralogin().click();
	   tablewait();
	   String text2 = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text2.equals("من فضلك ادخل هوية صالحة "),"Arabic_Login_with_incorrect_Corporate_ID_or_User_nameExpected result  : أدخل معرف الشركة أو اسم المستخدم صالح  it shows ->"+text2);	   
   }
	@Parameters({ "CorporateId","Username","password_Invalid" })
   @Test(priority=2)
   public void English_Login_with_incorrect_Password(String s1,String s2,String s3) throws InterruptedException {
	   Loginpage page1= new Loginpage();
	   langu(page1.getLang()).selectByIndex(1);
	   waits(page1.getCoopId());
	   send(s1,page1.getCoopId());
	   send(s2,page1.getUsername());
	   send(s3,page1.getPassword());
	   page1.getLogin().click();
	   Thread.sleep(1450);
	   String text = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text.equals("Enter Correct Password"),"English_Login_with_incorrect_Password = Expected result : Enter Correct Password ->But it shows :"+text);	   
	   langu(page1.getLang()).selectByIndex(2);
	   waits(page1.getCoopId());
	   send(s1,page1.getCoopId());
	   send(s2,page1.getUsername());
	   send(s3,page1.getPassword());
	   page1.getAralogin().click();
	   Thread.sleep(1000);
	   String text2 = page1.getErrormess().getAttribute("textContent");
	   Assert.assertTrue(text2.equals("من فضلك ادخل رقم سري صحيح"),"Arabic_Login_with_incorrect_Password = Expected result : من فضلك ادخل رقم سري صحيح ->But it Shows :"+text2);
	   }	   
	@Parameters({ "CorporateId","Username","password" })
	@Test(priority=3)
   public void English_Valid_Login(String s1,String s2,String s3) {
	   Loginpage pagea1= new Loginpage();
	   GridViewpage page2 = new GridViewpage();
	   langu(pagea1.getLang()).selectByIndex(1);
	   waits(pagea1.getCoopId());
	   send(s1,pagea1.getCoopId());
	   send(s2,pagea1.getUsername());
	   send(s3,pagea1.getPassword());
	   clickaction(pagea1.getLogin());
	   waitsurl("gridview");
	   Assert.assertTrue(page2.getGrid().isDisplayed(),"English_Valid_Login Expected Result : It should display gridview page but it stays in same login page");
	   }
	@Parameters({ "CorporateId","Username","password" })
	   @Test(priority=4)
	   public void Arabic_Valid_Login(String s1,String s2,String s3) {
		   Loginpage page1a= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1a.getLang()).selectByIndex(2);
		   waits(page1a.getCoopId());
		   send(s1,page1a.getCoopId());
		   send(s2,page1a.getUsername());
		   send(s3,page1a.getPassword());
		   clickaction(page1a.getAralogin());
		   waitsurl("gridview");
		   Assert.assertTrue(page2.getGrid().isDisplayed(),"Arabic_Valid_Login Expected Result : It should display gridview page but it stays in same login page");
	   }
	@Parameters({ "CorporateId","Username","password" })
	   @Test(priority=5)
	   public void English_and_Arabic_Login_RememeberMe(String s1,String s2,String s3){
	   Loginpage page1= new Loginpage();
	   GridViewpage page2 = new GridViewpage();
	   langu(page1.getLang()).selectByIndex(1);
	   waits(page1.getCoopId());
	   send(s1,page1.getCoopId());
	   send(s2,page1.getUsername());
	   send(s3,page1.getPassword());
	   page1.getRememberme().click();
	   clickaction(page1.getLogin());
	   waitsurl("gridview");
	   page2.getLogout().click();
	   waits(page1.getCoopId());
	   driv.navigate().refresh();
	   waits(page1.getCoopId());
	   page1.getRememberme().click();
	   String co=Attrib(page1.getCoopId(),"value");
	   String email=Attrib(page1.getUsername(),"value");
	   String pass=Attrib(page1.getPassword(),"value");
	   if(co.isEmpty()||email.isEmpty()||pass.isEmpty()) {
	   remember=false;
	   }
	   else{
	   remember = true;
	   }
	   Assert.assertTrue(remember,"English_and_Arabic_Login_RememeberMe Expected result : Credential Details should be retained But It Shows Empty");  
	}
	@Parameters({ "CorporateId_Invalid","Username","EmailID" })
	     @Test(priority=6)
	   public void English_and_Arabic_ForgetPassword_with_incorrect_Corporate_ID_or_User_name(String s1,String s2,String s3) throws InterruptedException {
		   Loginpage page1= new Loginpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername()); 
		   clickaction(page1.getForget());
		   send(s3,page1.getEmail());
		   clickaction(page1.getSubmit());
		   Thread.sleep(1000);
		   String text = page1.getErrormess().getAttribute("textContent");
		   Assert.assertTrue(text.equals("Enter Correct Corporate Id or User name"),"English_ForgetPassword_with_incorrect_Corporate_ID_or_User_name Expected result :It should show [Enter Correct Corporate Id or User name] but it shows "+text);
		   langu(page1.getLang()).selectByIndex(2);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   page1.getUsername().clear();
		   send(s2,page1.getUsername()); 
		   clickaction(page1.getForget());
		   send(s3,page1.getEmail());
		   clickaction(page1.getSubmit());
		   Thread.sleep(1000);
		   String text2 = page1.getErrormess().getAttribute("textContent");
		   Assert.assertTrue(text2.equals("أدخل معرف الشركة صالح"),"Arabic_ForgetPassword_with_incorrect_Corporate_ID_or_User_name Expected result :It should show [ أدخل معرف الشركة أو اسم المستخدم صالح ] but it shows "+text2);	   
		   } 
	@Parameters({ "CorporateId","Username","EmailID"})
	   @Test(priority=7)
	   public void English_Forget_password_Entering_invalid_Email_ID_and_clicking_Submit_button_3_times_sequentially_and_after_that_enter_valid_Email_Id_and_click_Submit_enter_the_received_password_and_Click_login(String s1,String s2,String s3) throws InterruptedException, AWTException 
	   {   Loginpage page1= new Loginpage();
		   
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   clickaction(page1.getForget());
		   for(int i=0;i<3;i++) {
		    	if(i==0){mail="abc@gmail.com";}
		    	else if(i==1){mail="def@gmail.com";}
		    	else if(i==2) {mail="ghi@gmail.com";}
		    send(mail,page1.getEmail());
			clickaction(page1.getSubmit());
			Thread.sleep(4000);
			String text = page1.getErrormess().getAttribute("textContent");
		    Assert.assertTrue(text.equals("Please Enter the Correct Registered Email Id"),"English_Forget_password_Entering_invalid_Email_ID_and_clicking_Submit_button_3_times_sequentially_and_after_that_enter_valid_Email_Id_and_click_Submit_enter_the_received_password_and_Click_login Expected Result : it should show [Please Enter the Correct Registered Email Id] but it shows "+text);
		    page1.getEmail().clear();
		   }
		   send(s3,page1.getEmail());
			clickaction(page1.getSubmit());
			Thread.sleep(5000);
			String text = page1.getErrormess().getAttribute("textContent");
		    Assert.assertTrue(text.equals("Password has been sent to your Email Successfully .  Please check your Inbox"),"English_Forget_password_Entering_invalid_Email_ID_and_clicking_Submit_button_3_times_sequentially_and_after_that_enter_valid_Email_Id_and_click_Submit_enter_the_received_password_and_Click_login Expected Result : it should show [Password has been sent to your Email Successfully .  Please check your Inbox] but it shows "+text);
		    URLmail();
			send(s3,driv.findElement(By.id("identifierId")));
			clickaction(driv.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")));
		    Thread.sleep(1000);
			send("eitjagadeshan",driv.findElement(By.xpath("//input[@name='password']")));
			clickaction(driv.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")));
			Thread.sleep(10000);
			List<WebElement> trow = driv.findElements(By.tagName("tr"));
			            for(int i=0;i<trow.size();i++){
			            	WebElement TR= trow.get(i);
			            	List<WebElement> tdata = TR.findElements(By.tagName("td"));
			            	for(int j=0;j<tdata.size();j++) {
			                WebElement tdtext=tdata.get(j);
			            	String text1=tdtext.getText();
			                if(text1.equals("trackingalertsinfo")){  
			                   tdata.get(j).click();
			                      
			   }
			   }
			}
			            String text2= driv.findElement(By.id(":9o")).getText();
			            String sarray[]=text2.split(" ");
			           
			            	 pass=sarray[sarray.length-1];
			         driv.findElement(By.xpath("//div[@jslog='20283; u014N:cOuCgd,Kr2w4b']")).click();

			         openbrowser("https://ntrack.thegoldenelement.com/");
			         Loginpage page1a=new Loginpage();
			         GridViewpage page2 = new GridViewpage();
			         langu(page1a.getLang()).selectByIndex(1);
					   waits(page1a.getCoopId());
					   send(s1,page1a.getCoopId());
					   send(s2,page1a.getUsername());
			           send(pass,page1a.getPassword());
			           clickaction(page1a.getLogin());
			    	   waits(page2.getGrid());
			    	   Assert.assertTrue(page2.getGrid().isDisplayed());
			          
	   }
	@Parameters({ "CorporateId","Username","EmailID"})
	   @Test(priority=8)
	   public void Arabic_Forget_password_Entering_invalid_Email_ID_and_clicking_Submit_button_3_times_sequentially_and_after_that_enter_valid_Email_Id_and_click_Submit_enter_the_received_password_and_Click_login(String s1,String s2,String s3) 
			   throws InterruptedException, AWTException {
		   Loginpage apage1= new Loginpage();
		   langu(apage1.getLang()).selectByIndex(2);
		   waits(apage1.getCoopId());
		   send(s1,apage1.getCoopId());
		   send(s2,apage1.getUsername());
		   clickaction(apage1.getForget());
		   for(int i=0;i<3;i++) {
		    	if(i==0){mail="abc@gmail.com";}
		    	else if(i==1){mail="def@gmail.com";}
		    	else if(i==2) {mail="ghi@gmail.com";}
		    send(mail,apage1.getEmail());
			clickaction(apage1.getSubmit());
			Thread.sleep(4000);
			String text = apage1.getErrormess().getAttribute("textContent");
		    Assert.assertTrue(text.equals("من فضلك ادخل البريد الالكتروني المسجل"));
		    apage1.getEmail().clear();
		   }
		   send(s3,apage1.getEmail());
			clickaction(apage1.getSubmit());
			Thread.sleep(4000);
			String text = apage1.getErrormess().getAttribute("textContent");
		    Assert.assertTrue(text.equals("من فضلك ادخل البريد الالكتروني المسجل "));
		    URLmail();
			send(s3,driv.findElement(By.id("identifierId")));
			clickaction(driv.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")));
		    Thread.sleep(1000);
			send("eitjagadeshan",driv.findElement(By.xpath("//input[@name='password']")));
			clickaction(driv.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")));
			Thread.sleep(10000);
			List<WebElement> trow = driv.findElements(By.tagName("tr"));
			System.out.println(trow.size());
			            for(int i=0;i<trow.size();i++){
			            	WebElement TR= trow.get(i);
			            	List<WebElement> tdata = TR.findElements(By.tagName("td"));
			            	for(int j=0;j<tdata.size();j++) {
			                WebElement tdtext=tdata.get(j);
			            	String text1=tdtext.getText();
			                if(text1.equals("trackingalertsinfo")){  
			                   tdata.get(j).click();
			                      
			   }}
			}
			            String text2= driv.findElement(By.id(":9o")).getText();
			            String sarray[]=text2.split(" ");
			           
			            	 pass=sarray[sarray.length-1];
			         driv.findElement(By.xpath("//div[@jslog='20283; u014N:cOuCgd,Kr2w4b']")).click();
			         openbrowser("https://ntrack.thegoldenelement.com/");
			         Loginpage apage1a=new Loginpage();
			         GridViewpage page2 = new GridViewpage();
			         langu(apage1a.getLang()).selectByIndex(2);
					   waits(apage1a.getCoopId());
					   send(s1,apage1a.getCoopId());
					   send(s2,apage1a.getUsername());
			           send(pass,apage1a.getPassword());
			           clickaction(apage1a.getAralogin());
			           waitsurl("gridview");
			    	   waits(page2.getGrid());
			    	   Assert.assertTrue(page2.getGrid().isDisplayed());
			          
	   }
	   
	   @AfterMethod(alwaysRun = true)
	 
	/*  public void takeScreenShotOnFailure(ITestResult testResult) throws IOException, InterruptedException {
		   Thread.sleep(1000);
			if (testResult.getStatus() == ITestResult.FAILURE) {
				File screenShotName;
				File scrFile = ((TakesScreenshot)driv).getScreenshotAs(OutputType.FILE);
				screenShotName= new File("errorScreenshots\\" + testResult.getName() + "-" 
						+ Arrays.toString(testResult.getParameters()) +  ".png");
				FileUtils.copyFile(scrFile, screenShotName);
				 String filePath = screenShotName.toString();
				 String path = ("<img src=\"file://"+ filePath +"\" alt=\"\"/></img>");
				 Reporter.log("closed");
		   }*/
	   public void closee() throws InterruptedException {
		driv.close();
			driv.quit();
	   }
	  
}
