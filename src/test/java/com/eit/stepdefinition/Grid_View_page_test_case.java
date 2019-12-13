package com.eit.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.eit.objects.GridViewpage;
import com.eit.objects.Loginpage;
import com.eit.resource.base;

public class Grid_View_page_test_case extends base {

	@BeforeMethod
	public void browse() throws AWTException, InterruptedException {
		openbrowser("https://ntrack.thegoldenelement.com/");
	}
	@Parameters({ "CorporateId","Username","password" })

	@Test(priority=1)
	   public void  English_Login_and_Gridview_checking_AllSelect_option(String s1,String s2,String s3) {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
		   page2.getAllSelect().click();
		   String vals=page2.getAllsecval().getText();
		   
		   Assert.assertTrue(vals.equals(listvalue(page2.getList())));		   
		   }
	@Parameters({ "CorporateId","Username","password" })
	@Test(priority=2)
	   public void English_Login_and_Gridview_checking_Running_option(String s1,String s2,String s3) {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
		   page2.getAllrun().click();
		   String vals=page2.getRunval().getText();
		   
		   Assert.assertTrue(vals.equals(listvalue(page2.getList())));		   
		   }
	@Parameters({ "CorporateId","Username","password" })
	 @Test(priority=3)
	   public void English_Login_and_Gridview_checking_Stop_option(String s1,String s2,String s3) {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
		   page2.getAllstop().click();
		   String vals=page2.getStopval().getText();
		   Assert.assertTrue(vals.equals(listvalue(page2.getList())));		   
		   }
	@Parameters({ "CorporateId","Username","password" })

	 @Test(priority=4)
	   public void English_Login_and_Gridview_checking_idel_option(String s1,String s2,String s3) {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
		   page2.getAllidel().click();
		   String vals=page2.getIdelval().getText();
		   Assert.assertTrue(vals.equals(listvalue(page2.getList())));		   
		   }
	@Parameters({ "CorporateId","Username","password" })
	 @Test(priority=5)
	   public void English_Login_and_Gridview_checking_Overspeed_option(String s1,String s2,String s3) {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
		   page2.getAlloverspe().click();
		   String vals=page2.getOvspeval().getText();
		   Assert.assertTrue(vals.equals(listvalue(page2.getList())));		   
		   }
	@Parameters({ "CorporateId","Username","password" })
	 @Test(priority=6)
	   public void English_Login_and_Gridview_checking_Offline_option(String s1,String s2,String s3) {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
		   page2.getAlloff().click();
		   String vals=page2.getOffval().getText();
		   
		   Assert.assertTrue(vals.equals(listvalue(page2.getList())));		   
		   }
	@Parameters({ "CorporateId","Username","password" })
	 @Test(priority=7)
	   public void English_Login_and_Gridview_checking_Yet_To_Transmit_option(String s1,String s2,String s3) {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
		   page2.getAllytt().click();
		   String vals=page2.getYttval().getText();
		   Assert.assertTrue(vals.equals(listvalue(page2.getList())));		   
		   }
	@Parameters({ "CorporateId","Username","password" })
	 @Test(priority=8)
	   public void English_Login_and_Gridview_checking_Online_option(String s1,String s2,String s3) {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
		   page2.getAllon().click();
		   String vals=page2.getOnval().getText();
		   Assert.assertTrue(vals.equals(listvalue(page2.getList())));		   
		   }
	@Parameters({ "CorporateId","Username","password" })
	 @Test(priority=9)
	   public void English_Login_and_Gridview_checking_Towed_option(String s1,String s2,String s3) {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
		   page2.getAlltow().click();
		   String vals=page2.getTowval().getText();
		   Assert.assertTrue(vals.equals(listvalue(page2.getList())));		   
		   }
	@Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=10)
	   public void English_Login_and_Gridview_checking_Filter_option_plateno(String s1,String s2,String s3,String s4) {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getFilter().click();
		   waits(page2.getPlate());
		   page2.getPlate().click();
		   vehiclename(page2.getAutolist(),s4,page2.getSearch());
		   page2.getClickop().click();
		   List<WebElement> lists=page2.getVehname().findElements(By.xpath("//li/div[3]/div"));
		   WebElement liess= lists.get(0);
		   String texts= liess.getText();
		   String sarray[]=texts.split("\\n");
		   pass=sarray[0];
		   System.out.println(pass);
		   String livename=page2.getLivedataname().getText();
		   System.out.println(livename);
		   Assert.assertTrue(pass.equals(livename));
		   }
	@Parameters({ "CorporateId","Username","password" })
	 @Test(priority=11)
	 public void English_Login_and_Gridview_checking_Filter_option_Operator_textbox(String s1,String s2,String s3) {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getFilter().click();
		   waits(page2.getPlate());
		   page2.getOperator().click();
		   vehiclename(page2.getAutolist(), "No Operator",page2.getSearch());
		   List<WebElement> en= page2.getVehname().findElements(By.xpath("//ul[@id='dashboardVehicles']/li/div/i"));
		   //System.out.println(en.size());
		   for(int i=0;i<en.size();i++) {
		   WebElement sss=en.get(i);
		   String st= sss.getAttribute("title");
		   if(st.equals("No Operator")) {
			 }
		   else {
			   count ++;
		   }}
		   if(count>0) {
		   Assert.assertTrue(false);}
		   else {
			   Assert.assertTrue(true);
			   System.out.println("passed");
		   }
		   }
		   
	@Parameters({ "CorporateId","Username","password" })
	 @Test(priority=12)
	 public void English_Login_and_Gridview_checking_Filter_option_Status_textbox(String s1,String s2,String s3) {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getFilter().click();
		   waits(page2.getPlate());
		   page2.getStatus().click();
		   vehiclename(page2.getAutolist(),"Offline",page2.getSearch());
           String vals=page2.getAllsecval().getText();
		   Assert.assertTrue(vals.equals(listvalue(page2.getList())));
            }
	@Parameters({ "CorporateId","Username","password" })
	 @Test(priority=13)
	 public void English_Login_and_Gridview_checking_Filter_option_Fleet_Manager_textbox(String s1,String s2,String s3) {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getFilter().click();
		   waits(page2.getPlate());
		   page2.getFleetmanager().click();
		   vehiclename(page2.getAutolist(),"test",page2.getSearch());
           String vals=page2.getAllsecval().getText();
		   Assert.assertTrue(vals.equals(listvalue(page2.getList())));
            }
	 
	@Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=14)
	 public void English_Login_and_Gridview_checking_Alert_option(String s1,String s2,String s3,String s4)  {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
		   listvaluenameclick(page2.getNameclick(),s4);
		   waits(page2.getContext());
		   //page2.getContext().click();
		   page2.getAlert().click();
		   List<WebElement> al=page2.getAlertlist();
		   
		   System.out.println(al.size());
		   if(al.size()<0) {
			   Assert.assertTrue(true);
			   System.out.println("passed");
		   }
		   
            }
	@Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=15)
	 public void English_Login_and_Gridview_checking_Maintain_option(String s1,String s2,String s3,String s4)   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
		   listvaluenameclick(page2.getNameclick(),s4);
		   waits(page2.getContext());
		   //page2.getContext().click();
		   page2.getMaintain().click();
		   Assert.assertTrue(page2.getMaintain().isSelected());
		   /*List<WebElement> al=page2.getAlertlist();
		   
		   System.out.println(al.size());
		   if(al.size()<0) {
			   Assert.assertTrue(true);
			   System.out.println("passed");
		   }*/
		   
            }
	@Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=15)
	 public void English_Login_and_Gridview_checking_LIVE_option(String s1,String s2,String s3,String s4)   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
		   waits(page2.getContext());
		   listvaluenameclick(page2.getNameclick(),s4);
		   waits(page2.getContext());
          page2.getLive().click();
          
          String s=page2.getLivenames().getText();
          System.out.println(s+""+s4);
          Assert.assertTrue(s4.equals(s));
          
           
	 }
	@Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=16)
	 public void English_Login_and_Gridview_Verifying_Lat_Lang_LIVE_module(String s1,String s2,String s3,String s4)  {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
		   waits(page2.getContext());
		   listvaluenameclick(page2.getNameclick(), s4);
		   waits(page2.getContext());
           page2.getLive().click();
String s = driv.findElement(By.xpath("//div[@id='preventiveSplit']/span[3]")).getText();
System.out.println(s);
String a[]=s.split(" ");
String v=a[a.length-1];
System.out.println(v+" rhjkl");
          driv.findElement(By.linkText(v)).click();
          String wi=driv.getWindowHandle();
          Set<String>page=driv.getWindowHandles();
          for(String vv:page) {
          if(!wi.equals(vv)) {
        	 driv.switchTo().window(vv);
          }
          }
           Assert.assertTrue(driv.getCurrentUrl().contains("maps"));
	 }
	@Parameters({ "CorporateId","Username","password" })
	 @Test(priority=17)
	 public void English_Login_and_Gridview_Verifying_Live_Data_module(String s1,String s2,String s3) throws InterruptedException, IOException  {
		 
		 Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   Thread.sleep(1000);
		   page2.getVehicledetail().click();
		   for(int ii=1;ii<9;ii++) {
			   String data="";
		   page2.getAllSelect().click();
		   
		   List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   
		   for(int i=0;i<li.size();i++) {
			   WebElement ele=li.get(i);
			   String es=ele.getText();
			   String ees[]=es.split("\\n");
			    eses=ees[0];
			  // System.out.println(eses);
			   for(int j=0;j<li.size();j++) {
			   if(eses.equals(Excelldata(ii,0))) {
				  ele.click();
				  
				  //Thread.sleep(2000);
				}
			   }
		   }
		   List <WebElement>d=driv.findElements(By.xpath("//div[@class='live-tracking-address']/span"));
		   //List<WebElement>e=driv.findElements(By.xpath("//div[@class='live-tracking-details']/div/span"));
		   for(int ij=0;ij<d.size();ij++) {
				WebElement eleme=d.get(ij);
				String s= eleme.getText();				 
				data= data+s;
				
				}
		   System.out.println(data);
		  // Excelldata(1, 1);
				for(int a=1;a<9;a++) {
					Assert.assertTrue(data.equals(Excelldata(a, 1)));
				}
				}
				}
	@Parameters({ "CorporateId","Username","password" })
	 @Test(priority=18)
	 public void English_Login_and_Gridview_Verifying_Vehicle_detail_module(String s1,String s2,String s3) throws IOException, InterruptedException  {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   String data="";
		   for(int ii=1;ii<9;ii++) {
		   page2.getAllSelect().click();
		   
		   List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   
		   for(int i=0;i<li.size();i++) {
			   WebElement ele=li.get(i);
			   String es=ele.getText();
			   String ees[]=es.split("\\n");
			    eses=ees[0];
			   //System.out.println(eses);
			   for(int j=0;j<li.size();j++) {
			   if(eses.equals(Excelldata(ii, 0))) {
				  ele.click();
				  
				   page2.getVehicledetail().click();
				  //Assert.assertTrue(true);
				 
			  
			  }
			   }}
		   
		   List <WebElement>de=driv.findElements(By.xpath("//table[@class='table table-bordered table-striped table-condensed flip-content']/tbody/tr"));
		   //List<WebElement>e=driv.findElements(By.xpath("//div[@class='live-tracking-details']/div/span"));
		   for(int ij=0;ij<de.size();ij++) {
				WebElement eleme=de.get(ij);
				List<WebElement>ta=eleme.findElements(By.tagName("td"));
				for(int j=0;j<ta.size()/2;j++) {
					WebElement ele=ta.get(j+1);
					String sec=ele.getText();
					//System.out.println(sec);
					data=data+sec+"\n";
					
				}
		   }
		   
		   
		   }
		   System.out.println(data);
		   
		 
		   
	 }
	@Parameters({ "CorporateId","Username","password" })
	 @Test(priority=19)
	
	 public void English_Login_and_Gridview_Verifying_maximize_and_Minimize_button(String s1,String s2,String s3) throws IOException, InterruptedException  {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   waits(page2.getContext());
		   driv.findElement(By.xpath("//img[@class='viewChangeMap']")).click();
		   Thread.sleep(2000);
		   driv.findElement(By.xpath("//img[@class='viewNormalMap']")).click();
	 
	 }
	@Parameters({ "CorporateId","Username","password" ,"vehiclename"})
	 @Test(priority=20)
		public void English_Login_and_Gridview_Verifying_Today_Status_chart_ContextMenu_Download_png_option(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   
		   for(int i=0;i<li.size();i++) {
			   WebElement ele=li.get(i);
			   String es=ele.getText();
			   String ees[]=es.split("\\n");
			    eses=ees[0];
			  // System.out.println(eses);
			   for(int j=0;j<li.size();j++) {
			   if(eses.equals(s4)) {
				  ele.click();
				  
				  //Thread.sleep(2000);
				}
			   }
		   }
		   waits(page2.getContext());
		   page2.getContext().click();
		   page2.getPngoption().click();
		   String file_name="chart.png";
		   Thread.sleep(1000);
		   Assert.assertTrue(isFileDownloaded("C:\\Users\\EIT-JAGADESHAN\\Downloads", file_name));
		   delete_file(file_name);
		   }
	@Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=21)
		public void English_Login_and_Gridview_Verifying_Today_Status_chart_ContextMenu_Download_jpeg_option(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   
		   for(int i=0;i<li.size();i++) {
			   WebElement ele=li.get(i);
			   String es=ele.getText();
			   String ees[]=es.split("\\n");
			    eses=ees[0];
			  // System.out.println(eses);
			   for(int j=0;j<li.size();j++) {
			   if(eses.equals(s4)) {
				  ele.click();
				  
				  //Thread.sleep(2000);
				}
			   }
		   }

		   waits(page2.getContext());
		   page2.getContext().click();
		   page2.getJepgoption().click();
		   String file_name="chart.jpeg";
		   Thread.sleep(1000);
		   Assert.assertTrue(isFileDownloaded("C:\\Users\\EIT-JAGADESHAN\\Downloads", file_name));
		   delete_file(file_name);
		   }
	@Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=22)
		public void English_Login_and_Gridview_Verifying_Today_Status_chart_ContextMenu_Download_pdf_option(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   
		   for(int i=0;i<li.size();i++) {
			   WebElement ele=li.get(i);
			   String es=ele.getText();
			   String ees[]=es.split("\\n");
			    eses=ees[0];
			  // System.out.println(eses);
			   for(int j=0;j<li.size();j++) {
			   if(eses.equals(s4)) {
				  ele.click();
				  
				  //Thread.sleep(2000);
				}
			   }
		   }

		   waits(page2.getContext());
		   page2.getContext().click();
		   page2.getPdfoption().click();
		   String file_name="chart.pdf";
		   Thread.sleep(1000);
		   Assert.assertTrue(isFileDownloaded("C:\\Users\\EIT-JAGADESHAN\\Downloads", file_name));
		   delete_file(file_name);
		   }
	@Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=23)
	 public void English_Login_and_Gridview_Verifying_Speed_trend_chart_ContextMenu_Download_png_option(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   
		   for(int i=0;i<li.size();i++) {
			   WebElement ele=li.get(i);
			   String es=ele.getText();
			   String ees[]=es.split("\\n");
			    eses=ees[0];
			  // System.out.println(eses);
			   for(int j=0;j<li.size();j++) {
			   if(eses.equals(s4)) {
				  ele.click();
				  
				  //Thread.sleep(2000);
				}
			   }
		   }

		   waits(page2.getContext());
		   clickaction(page2.getLinecontext());	  
		   page2.getPngoption().click();
		   String file_name="chart.png";
		   Thread.sleep(1000);
		   Assert.assertTrue(isFileDownloaded("C:\\Users\\EIT-JAGADESHAN\\Downloads", file_name));
		   delete_file(file_name);
		   }
	@Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=24)
	 public void English_Login_and_Gridview_Verifying_Speed_trend_chart_ContextMenu_Download_jpeg_option(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   
		   for(int i=0;i<li.size();i++) {
			   WebElement ele=li.get(i);
			   String es=ele.getText();
			   String ees[]=es.split("\\n");
			    eses=ees[0];
			  // System.out.println(eses);
			   for(int j=0;j<li.size();j++) {
			   if(eses.equals(s4)) {
				  ele.click();
				  
				  //Thread.sleep(2000);
				}
			   }
		   }

		   waits(page2.getContext());
		   clickaction(page2.getLinecontext());	  
		   page2.getJepgoption().click();
		   String file_name="chart.jpeg";
		   Thread.sleep(1000);
		   Assert.assertTrue(isFileDownloaded("C:\\Users\\EIT-JAGADESHAN\\Downloads", file_name));
		   delete_file(file_name);
		   }
	@Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=25)
	 public void English_Login_and_Gridview_Verifying_Speed_trend_chart_ContextMenu_Download_pdf_option(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   
		   for(int i=0;i<li.size();i++) {
			   WebElement ele=li.get(i);
			   String es=ele.getText();
			   String ees[]=es.split("\\n");
			    eses=ees[0];
			  // System.out.println(eses);
			   for(int j=0;j<li.size();j++) {
			   if(eses.equals(s4)) {
				  ele.click();
				  
				  //Thread.sleep(2000);
				}
			   }
		   }

		   //listvaluenameclick(page2.getNameclick(),"loadtest-2370");
		   waits(page2.getContext());
		   clickaction(page2.getLinecontext());	  
		   page2.getPdfoption().click();
		   String file_name="chart.pdf";
		   Thread.sleep(1000);
		   Assert.assertTrue(isFileDownloaded("C:\\Users\\EIT-JAGADESHAN\\Downloads", file_name));
		   delete_file(file_name);
		   }
	@Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=26)
	 public void English_Login_and_Gridview_Verifying_Lat_Lang_Live_Data_module(String s1,String s2,String s3,String s4)  {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
		   waits(page2.getContext());
		   listvaluenameclick(page2.getNameclick(), s4);
		   waits(page2.getContext());
          
String s = driv.findElement(By.xpath("//div[@class='live-tracking-address']/span[3]")).getText();
//System.out.println(s);
String a[]=s.split(" ");
String v=a[a.length-1];
//System.out.println(v);
          driv.findElement(By.linkText(v)).click();
          String wi=driv.getWindowHandle();
          Set<String>page=driv.getWindowHandles();
          for(String vv:page) {
          if(!wi.equals(vv)) {
        	 driv.switchTo().window(vv);
          }
          }
           Assert.assertTrue(driv.getCurrentUrl().contains("maps"));
	 } 
	@Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=27) 
	 public void English_Login_and_Gridview_Verifying_History_module_playbutton(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   
		   for(int i=0;i<li.size();i++) {
			   WebElement ele=li.get(i);
			   String es=ele.getText();
			   String ees[]=es.split("\\n");
			    eses=ees[0];
			  // System.out.println(eses);
			   for(int j=0;j<li.size();j++) {
			   if(eses.equals(s4)) {
				  ele.click();
				  
				  //Thread.sleep(2000);
				}
			   }
		   }
		   page2.getHistory().click();
		   Assert.assertTrue(page2.getPlay().isDisplayed()," Expected result : Play button should display");
		   Assert.assertTrue(page2.getPlay().isEnabled()," Expected result : Play button should Enable");
		  waits(page2.getPlay());
		  Thread.sleep(7000);
		   page2.getPlay().click();
		   String disable= page2.getPlay().getAttribute("disabled");
		   System.out.println(disable);
	       Assert.assertTrue("true".equals(disable), "Expected result :play button should be clicked");
	 
	 }
	@Parameters({ "CorporateId","Username","password" })
	 @Test (priority=28)
	 public void English_Login_and_Gridview_Verifying_History_module_stop_button(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   
		   for(int i=0;i<li.size();i++) {
			   WebElement ele=li.get(i);
			   String es=ele.getText();
			   String ees[]=es.split("\\n");
			    eses=ees[0];
			  // System.out.println(eses);
			   for(int j=0;j<li.size();j++) {
			   if(eses.equals("loadtest-2370")) {
				  ele.click();
				  
				  //Thread.sleep(2000);
				}
			   }
		   }
		   page2.getHistory().click();
		   Thread.sleep(10000);
		   waits(page2.getPlay());
		   clickaction(page2.getPlay());
		   clickaction(page2.getPause());
		   String disable= page2.getStop().getAttribute("disabled");
		   System.out.println(disable);		   
	       Assert.assertTrue("true".equals(disable), "Expected result :plause button should be unclickable");
	 
	 } 
	@Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test (priority=29)
	 public void English_Login_and_Gridview_Verifying_History_module_pause_button(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   
		   for(int i=0;i<li.size();i++) {
			   WebElement ele=li.get(i);
			   String es=ele.getText();
			   String ees[]=es.split("\\n");
			    eses=ees[0];
			  // System.out.println(eses);
			   for(int j=0;j<li.size();j++) {
			   if(eses.equals(s4)) {
				  ele.click();
				  
				  //Thread.sleep(2000);
				}
			   }
		   }
		   page2.getHistory().click();
		   Thread.sleep(10000);
		   clickaction(page2.getPlay());
		   //Thread.sleep(5000);
		   clickaction(page2.getStop());
		  // Thread.sleep(5000);
		   waits(page2.getRunningcheck());
		   String disable= page2.getStop().getAttribute("disabled");
		   System.out.println(disable);
		   String disable1= page2.getPause().getAttribute("disabled");
		   System.out.println(disable1);
		   boolean disab;
		   if(disable.equals("true")||disable1.equals("true")) {
			    disab=true;
		   }
		   else {
			    disab=false;
		   }
		   
		   
	       Assert.assertTrue(disab, "Expected result :Pause button should be unclickable");
	 
	 } 
	@Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test (priority=30)
	 public void English_Login_and_Gridview_Verifying_History_module_Disable_Running_checkbox(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   
		   for(int i=0;i<li.size();i++) {
			   WebElement ele=li.get(i);
			   String es=ele.getText();
			   String ees[]=es.split("\\n");
			    eses=ees[0];
			  // System.out.println(eses);
			   for(int j=0;j<li.size();j++) {
			   if(eses.equals(s4)) {
				  ele.click();
				  
				  //Thread.sleep(2000);
				}
			   }
		   }
		   page2.getHistory().click();
		   //page2.getGo().click();
		   Thread.sleep(7000);
		   waits(page2.getRunningcheck());
		   clickaction(page2.getRunningcheck());
		   if(page2.getRunningcheck().isSelected()) {
			   clickaction(page2.getRunningcheck());
			   remember=true;
		   }
		   else {
			   remember=false;
		   }
		Assert.assertTrue(remember);   
	 }
	 
	@Parameters({ "CorporateId","Username","password" ,"vehiclename"})
	 @Test (priority=31)
	 public void English_Login_and_Gridview_Verifying_History_module_Enable_Running_checkbox(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   page2.getAllSelect().click();
List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   
		   for(int i=0;i<li.size();i++) {
			   WebElement ele=li.get(i);
			   String es=ele.getText();
			   String ees[]=es.split("\\n");
			    eses=ees[0];
			  // System.out.println(eses);
			   for(int j=0;j<li.size();j++) {
			   if(eses.equals(s4)) {
				  ele.click();
				  
				  //Thread.sleep(2000);
				}
			   }
		   }
		   page2.getHistory().click();
		   //page2.getGo().click();
		   Thread.sleep(7000);
		   waits(page2.getRunningcheck());
         if(!page2.getRunningcheck().isSelected()) {
			   clickaction(page2.getRunningcheck());
			   remember=true;
		   }
		   else {
			   remember=false;
		   }
		Assert.assertTrue(remember);   
	 }
	@Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=32)
	 public void English_Login_and_Gridview_Vehicle_search_valid_name(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   send(s4,page2.getVehiclesearch());
		   List<WebElement> lists=page2.getVehname().findElements(By.xpath("//li/div[3]/div"));
		   WebElement liess= lists.get(0);
		   String texts= liess.getText();
		   String sarray[]=texts.split("\\n");
		   pass=sarray[0];
		   System.out.println(pass);
           Assert.assertTrue(s4.equals(pass));
	 
	 
	 }@Parameters({ "CorporateId","Username","password" })
	 @Test(priority=33)
	 public void English_Login_and_Gridview_Vehicle_search_invalid_name(String s1,String s2,String s3) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   String search="AAAAAA";
		   send(search,page2.getVehiclesearch());
		   List<WebElement> lists=page2.getVehname().findElements(By.xpath("//li/div[3]/div"));
		 int i=lists.size();
		 System.out.println(i);
		 if(i==0) {
			 remember=true;
		 }
		 else {
			 remember=false;
		 }
		   Assert.assertTrue(remember);
	 }
	 @Parameters({ "CorporateId","Username","password" })
	 @Test(priority=34)
	 public void English_Login_and_Gridview_Refresh(String s1,String s2,String s3) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
	       Assert.assertTrue(isClickable(page2.getRefresh()));	   
	 
	      }
	 @Parameters({ "CorporateId","Username","password" })
	 @Test(priority=35)
	 public void English_Login_and_Gridview_Operator_tab_AllOption(String s1,String s2,String s3) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
	       page2.getAllSelect().click();
	       String vals=page2.getAllsecval().getText();
	       System.out.println(vals);
	       page2.getOperatortab().click();
	       String vss=listvalue(page2.getOperatorlist());
	       System.out.println(vss);
	      Assert.assertTrue(vals.equals(listvalue(page2.getOperatorlist())));
	 }
	 @Parameters({ "CorporateId","Username","password" })
	 @Test(priority=36)
	 public void English_Login_and_Gridview_Operator_tab_RunningOption(String s1,String s2,String s3) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
	       page2.getRunval().click();
	       String vals=page2.getRunval().getText();
	       System.out.println(vals);
	       page2.getOperatortab().click();
	       String vss=listvalue(page2.getOperatorlist());
	       System.out.println(vss);
	      Assert.assertTrue(vals.equals(listvalue(page2.getOperatorlist())));
	 }
	 @Parameters({ "CorporateId","Username","password" })
	 @Test(priority=37)
	 public void English_Login_and_Gridview_Operator_tab_StopOption(String s1,String s2,String s3) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
	       page2.getStopval().click();
	       String vals=page2.getStopval().getText();
	       System.out.println(vals);
	       page2.getOperatortab().click();
	       String vss=listvalue(page2.getOperatorlist());
	       System.out.println(vss);
	      Assert.assertTrue(vals.equals(listvalue(page2.getOperatorlist())));
	 }
	 @Parameters({ "CorporateId","Username","password" })
	 @Test(priority=38)
	 public void English_Login_and_Gridview_Operator_tab_IdelOption(String s1,String s2,String s3) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
	       page2.getIdelval().click();
	       String vals=page2.getIdelval().getText();
	       System.out.println(vals);
	       page2.getOperatortab().click();
	       String vss=listvalue(page2.getOperatorlist());
	       System.out.println(vss);
	      Assert.assertTrue(vals.equals(listvalue(page2.getOperatorlist())));
	 }
	 
	 @Parameters({ "CorporateId","Username","password" })
	 @Test(priority=39)
	 public void English_Login_and_Gridview_Operator_tab_OverSpeedOption(String s1,String s2,String s3) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
	       page2.getOvspeval().click();
	       String vals=page2.getOvspeval().getText();
	       System.out.println(vals);
	       page2.getOperatortab().click();
	       String vss=listvalue(page2.getOperatorlist());
	       System.out.println(vss);
	      Assert.assertTrue(vals.equals(listvalue(page2.getOperatorlist())));
	 }
	 @Parameters({ "CorporateId","Username","password" })
	 @Test(priority=40)
	 public void English_Login_and_Gridview_Operator_tab_OFFlineOption(String s1,String s2,String s3) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
	       page2.getOffval().click();
	       String vals=page2.getOffval().getText();
	       System.out.println(vals);
	       page2.getOperatortab().click();
	       String vss=listvalue(page2.getOperatorlist());
	       System.out.println(vss);
	      Assert.assertTrue(vals.equals(listvalue(page2.getOperatorlist())));
	 }
	 @Parameters({ "CorporateId","Username","password" })
	 @Test(priority=41)
	 public void English_Login_and_Gridview_Operator_tab_YetToTramsmitOption(String s1,String s2,String s3) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
	       page2.getYttval().click();
	       String vals=page2.getYttval().getText();
	       System.out.println(vals);
	       page2.getOperatortab().click();
	       String vss=listvalue(page2.getOperatorlist());
	       System.out.println(vss);
	      Assert.assertTrue(vals.equals(listvalue(page2.getOperatorlist())));
	 }
	 @Parameters({ "CorporateId","Username","password" })
	 @Test(priority=42)
	 public void English_Login_and_Gridview_Operator_tab_ONlineOption(String s1,String s2,String s3) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
	       page2.getOnval().click();
	       String vals=page2.getOnval().getText();
	       System.out.println(vals);
	       page2.getOperatortab().click();
	       String vss=listvalue(page2.getOperatorlist());
	       System.out.println(vss);
	      Assert.assertTrue(vals.equals(listvalue(page2.getOperatorlist())));
	 }
	 @Parameters({ "CorporateId","Username","password" })
	 @Test(priority=43)
	 public void English_Login_and_Gridview_Operator_tab_TowedOption(String s1,String s2,String s3) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
	       page2.getTowval().click();
	       String vals=page2.getTowval().getText();
	       System.out.println(vals);
	       page2.getOperatortab().click();
	       String vss=listvalue(page2.getOperatorlist());
	       System.out.println(vss);
	      Assert.assertTrue(vals.equals(listvalue(page2.getOperatorlist())));
	 }
	 @Parameters({ "CorporateId","Username","password" })
	 @Test(priority=44)
	 public void English_Login_and_Gridview_OperatorModule_Search_valid_operator(String s1,String s2,String s3) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
	       page2.getOperatortab().click();
	       String opna="No Operator";
	       send( opna,page2.getOpesearch());
	       List<WebElement> ope=page2.getOperatorlist().findElements(By.tagName("li"));
	       for(int i=0;i<ope.size();i++) {
	    	   WebElement ele=ope.get(i);
	    	   String na=ele.getText();
	    	  // System.out.println(na);
	    	   String sa[]=na.split("\n");
	    	   String op=sa[0];
	    	   //System.out.println(op);
	    	   if(opna.equals(op)) {
	    		   remember=true;
	    		   System.out.println("passed");
	    	   }
	    	   else {
	    		   remember=false;
	    		   System.out.println("failed");
	    		   break;
	    	   }
	    	  
	    	}
	       Assert.assertTrue(remember);
	 
	 }
	 @Parameters({ "CorporateId","Username","password" })
	 @Test(priority=45)
	 public void English_Login_and_Gridview_OperatorModule_Search_invalid_operator(String s1,String s2,String s3) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
	       page2.getOperatortab().click();
	       String opna="AAAAAA";
	       send( opna,page2.getOpesearch());
	       List<WebElement> lists=page2.getOperatorlist().findElements(By.tagName("li"));
			 int i=lists.size();
			 System.out.println(i);
			if(i==0) {
				 remember=true;
			 }
			 else {
				 remember=false;
			 }
			   Assert.assertTrue(remember);
	 }
	 @Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=46)
	 public void English_Login_and_Gridview_NearBy_Module_Map_and_Satellite_button(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
		   page2.getAllSelect().click();
		   List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   		   
		   		   for(int i=0;i<li.size();i++) {
		   			   WebElement ele=li.get(i);
		   			   String es=ele.getText();
		   			   String ees[]=es.split("\\n");
		   			    eses=ees[0];
		   			   for(int j=0;j<li.size();j++) {
		   			   if(eses.equals(s4)) {
		   				  ele.click();		   				  
		   				}
		   			   }
		   		   }
	       clickaction(page2.getNearby());
	       waits(page2.getZoomin());
	       page2.getSatelite().click();
	       Attrib(page2.getSatelite(),"style");
	       Assert.assertTrue("color: black;".equals(Attrib(page2.getSatelite(),"style")),"Expected result:It Showld show the Satellite view");
	       Thread.sleep(2000);
	       page2.getMap().click();
	       Attrib(page2.getSatelite(),"style");
	       Assert.assertTrue("color: gray;".equals(Attrib(page2.getSatelite(),"style")),"Expected result:It Showld show the normal map view");
	 
	 }
	 @Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=47)
	 public void English_Login_and_Gridview_NearBy_Module_Map_ZoomIn_ZoomOut_Button(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
		   page2.getAllSelect().click();
		   List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   		   
		   		   for(int i=0;i<li.size();i++) {
		   			   WebElement ele=li.get(i);
		   			   String es=ele.getText();
		   			   String ees[]=es.split("\\n");
		   			    eses=ees[0];
		   			   for(int j=0;j<li.size();j++) {
		   			   if(eses.equals(s4)) {
		   				  ele.click();		   				  
		   				}
		   			   }
		   		   }
	       clickaction(page2.getNearby());
	       waits(page2.getZoomin());	 
	 Assert.assertTrue(isClickable(page2.getZoomin()),"Expected Result:Zoom In button Should be clicked ");
	 Assert.assertTrue(isClickable(page2.getZoomout()),"Expected Result:Zoom Out button Should be clicked ");

	 }
	 @Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=48)
	 public void English_Login_and_Gridview_NearBy_Distance_Dropdown(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
		   page2.getAllSelect().click();
		   List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   		   
		   		   for(int i=0;i<li.size();i++) {
		   			   WebElement ele=li.get(i);
		   			   String es=ele.getText();
		   			   String ees[]=es.split("\\n");
		   			    eses=ees[0];
		   			   for(int j=0;j<li.size();j++) {
		   			   if(eses.equals(s4)) {
		   				  ele.click();		   				  
		   				}
		   			   }
		   		   }
		   		  
	       clickaction(page2.getNearby());
	       String a[]= {"2","4","6","8","10","12","14","16","18","20","50","100","150","200","250"};
          List<WebElement>kms= langu(page2.getOptvalue()).getOptions();
          for(int i=0;i<kms.size();i++) {
        	  WebElement km=kms.get(i);
        	  //System.out.println(km.getText());
               if (km.getText().equals(a[i])){
            	   //System.out.println(a[i]+"passed");
                   remember=true;             
               }
               else {
            	   //System.out.println("failed");
            	   remember=false;
            	   break;
               }           
	 }
          Assert.assertTrue(remember);
          }	 
	 @Parameters({ "CorporateId","Username","password","vehiclename" })
	 @Test(priority=49)
	 public void English_Login_and_Gridview_DashBoard_ZoomIn_ZoomOut_Button(String s1,String s2,String s3,String s4) throws InterruptedException   {
		   Loginpage page1= new Loginpage();
		   GridViewpage page2 = new GridViewpage();
		   langu(page1.getLang()).selectByIndex(1);
		   waits(page1.getCoopId());
		   send(s1,page1.getCoopId());
		   send(s2,page1.getUsername());
		   send(s3,page1.getPassword());
		   clickaction(page1.getLogin());
		   waitsurl("gridview");
		   clickaction(page2.getGridview());
		   page2.getAllSelect().click();
		   List<WebElement> li = driv.findElements(By.xpath("//div[@class='mostly-customized-scrollbar vehicles']/ul/li/div[3]/div"));
		   		   
		   		   for(int i=0;i<li.size();i++) {
		   			   WebElement ele=li.get(i);
		   			   String es=ele.getText();
		   			   String ees[]=es.split("\\n");
		   			    eses=ees[0];
		   			   for(int j=0;j<li.size();j++) {
		   			   if(eses.equals(s4)) {
		   				  ele.click();		   				  
		   				}
		   			   }
		   		   }
	       waits(page2.getDashZoomin());	 
	 Assert.assertTrue(isClickable(page2.getDashZoomin()),"Expected Result:Zoom In button Should be clicked ");
	 Assert.assertTrue(isClickable(page2.getDashZoomout()),"Expected Result:Zoom Out button Should be clicked ");

	 }
	 
	 @AfterMethod
	
 public void close() {
		 closeBrowser();
	 }
	
}

