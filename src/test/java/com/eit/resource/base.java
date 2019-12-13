package com.eit.resource;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class base {
	public static WebDriver driv;
	public static Select s;
	public static Wait<WebDriver> gWait;
	public static Wait<WebDriver> aWait;
	public static Boolean remember;
	public static Actions a;
	public static String mail,pass,eses;
	public static int count=0; 
	public void openbrowser(String url) throws AWTException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","E:\\Eit_track\\driver\\chromedriver.exe");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	    chromePrefs.put("credentials_enable_service", false);
        options.setExperimentalOption("prefs", chromePrefs);
	    driv = new ChromeDriver(options);
        driv.get(url);
		driv.manage().window().maximize();
		}
	  public void closeBrowser() {
		  driv.close();
	  }
	  public Select langu(WebElement e) {
		s=new Select(e);
		return s;
		}
	  public void send(String value,WebElement ele) {
		  ele.sendKeys(value);
	  }
	  public void click(WebElement ele)
	  {
		ele.click();
	  }
      public void clickaction(WebElement elem) {
    	  a= new Actions(driv);
    	  a.moveToElement(elem).click().build().perform();
	
       }
      public void waitsvis(WebElement eleme) {
    	  gWait = new FluentWait<WebDriver>(driv).withTimeout(Duration.ofSeconds(60))
  		        .pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);
    	  gWait.until(ExpectedConditions.visibilityOf(eleme));;
      }
      public void waits(WebElement eleme) {
    	  gWait = new FluentWait<WebDriver>(driv).withTimeout(Duration.ofSeconds(60))
  		        .pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);
    	  gWait.until(ExpectedConditions.elementToBeClickable(eleme));
      }
      public void waitsurl(String url) {
    	  gWait = new FluentWait<WebDriver>(driv).withTimeout(Duration.ofSeconds(60))
  		        .pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);
    	  gWait.until(ExpectedConditions.urlContains(url));
      }
      public String Attrib(WebElement ele,String val) {
    	String text= ele.getAttribute(val);  
      return text;
      }
      public void URLmail() {
    	    driv.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

      }
      public void waitss() {
    	  driv.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
      }
      public String listvalue(WebElement ele) {
    	  List<WebElement> lis=ele.findElements(By.tagName("li"));
    	  int i = lis.size();
    	  String val=String.valueOf(i);
    	  return val;
      }
      
      public void vehiclename(List<WebElement> ele,String platename,WebElement elem) {
    	  List<WebElement> lis=(List<WebElement>) ele;
    	   System.out.println(lis.size());
    	   for(int i=0;i<lis.size();i++) {
    		   WebElement liss= lis.get(i);
    		   String text= liss.getText();
    		   if(platename.equals(text)) {
    			   liss.click();
    			   elem.click();
    		break;	   
    		   }
      }
    	   
      
      
      }
      public void vehiclenamecom(List<WebElement> ele,String platename) {
    	  List<WebElement> lis=(List<WebElement>) ele;
    	   System.out.println(lis.size());
    	   for(int i=0;i<lis.size();i++) {
    		   WebElement liss= lis.get(i);
    		   String text= liss.getText();
    		   if(platename.equals(text)) {
    			   liss.click();
    			  
    		break;	   
    		   }
      }
    	   }
    	   public void listvaluenameclick(WebElement e,String name)  {
    	    	  List<WebElement> lis=e.findElements(By.tagName("li"));
    	    	  for(int i =0;i<lis.size();i++) {
    	    		  WebElement elem= lis.get(i);
    	    		    String nam=elem.getText();
    	    		  if(nam.equals(name)) {
    	    			 
    	    			  elem.click();
    	    		  }
    	    	  }

      
    	   }
    	   public void hyperlink(String text) {
    		   driv.findElement(By.linkText(text)).click();
    		   }
    	   
    	   
    	   
    	   
    	   public String Excelldata(int row,int cell) throws IOException {
    		   File loc=new File("E:\\Eit_track\\lib\\data.xlsx");
    		   FileInputStream f=new FileInputStream(loc);
    		   String str=null;
    		   Workbook w = new XSSFWorkbook(f);
    		   Sheet s=w.getSheet("Sheet1");
    		   Row r= s.getRow(row);
    		  Cell c= r.getCell(cell);
    		   str= c.getStringCellValue();
    		// System.out.println(str);
    		   return str;
    		   
    		   
    	   }
    	   public boolean isFileDownloaded(String downloadPath, String fileName) throws InterruptedException {
    			boolean flag = false;
    		    File dir = new File(downloadPath);
    		    File[] dir_contents = dir.listFiles();
    		  	    
    		    for (int i = 0; i < dir_contents.length; i++) {
    		        if (dir_contents[i].getName().equals(fileName))
    		        
    		        	return flag=true;
    		            }

    		    return flag;
    		}
    	   public void delete_file(String file_name) {
    		   File file = new File("C:\\Users\\EIT-JAGADESHAN\\Downloads\\"+file_name); 
    		   if(file.delete()) {
    		       System.out.println("file deleted");
    		   }
    		   else{
    			   System.out.println("file not deleted");
    		   }
    		   }
    	   @SuppressWarnings("deprecation")
		public static boolean isClickable(WebElement webe)      
    	   {
    	       try
    	       {
    	           WebDriverWait wait = new WebDriverWait(driv, 5);
    	           wait.until(ExpectedConditions.elementToBeClickable(webe));
    	           webe.click();
    	           return true;
    	       }
    	       catch (Exception e)
    	       {
    	           return false;
    	       }
    	   }
    	      
    	 public static void tablewait(){
    		WebElement ele=driv.findElement(By.id("jqxNotificationDefaultContainer-bottom-right"));
    		//  WebElement lis=ele.findElement(By.tagName("table"));
       	   //WebElement lis2=lis.findElement(By.tagName("tbody"));
         	//	  WebElement lis3=lis2.findElement(By.tagName("tr"));
             //		 WebElement lis4=lis3.findElement(By.xpath("//td/div[@class='jqx-notification-close-button jqx-notification-close-button-info NotificationCloseButton jqx-notification-close-button-ltr']"));
             		gWait = new FluentWait<WebDriver>(driv).withTimeout(Duration.ofSeconds(60))
              		        .pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);
                	  gWait.until(ExpectedConditions.visibilityOf(ele));
                	  
               	 // a.moveToElement(lis4).click().build().perform();
             		 
    	 
    	          } 	  
    		 
    
    	 }