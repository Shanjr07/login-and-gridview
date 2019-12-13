package com.eit.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eit.resource.base;

public class GridViewpage   extends base{
		public GridViewpage() {
			PageFactory.initElements(driv,this);
			
		}
		@FindBy(xpath="//a[@href='#/gridview']")
		private WebElement Grid;
		public WebElement getGrid() {
			return Grid;
		}
		@FindBy(id="logout_sidebarId")
		private WebElement logout;
		public WebElement getLogout() {
			return logout;
		}
		@FindBy(id="check-slider1")
		private WebElement gridview;
		@FindBy(id="allSelected")
		private WebElement AllSelect;
		@FindBy(xpath="//div[@id='allSelected']/div[1]/div")
		private WebElement Allsecval;
		@FindBy(xpath="//ul[@id='dashboardVehicles']")
		private WebElement list;
		@FindBy(id="runningSelected")
		private WebElement allrun;
		@FindBy(xpath="//div[@id='runningSelected']/div[1]/div[1]")
		private WebElement runval;
		@FindBy(id="stopSelected")
		private WebElement allstop;
		@FindBy(xpath="//div[@id='stopSelected']/div[1]/div[1]")
		private WebElement stopval;
		@FindBy(id="idleSelected")
		private WebElement allidel;
		@FindBy(xpath="//div[@id='idleSelected']/div[1]/div[1]")
		private WebElement idelval;
		@FindBy(id="overspeedSelected")
		private WebElement alloverspe;
		@FindBy(xpath="//div[@id='overspeedSelected']/div[1]/div[1]")
		private WebElement ovspeval;
		@FindBy(id="offlineSelected")
		private WebElement alloff;
		@FindBy(xpath="//div[@id='offlineSelected']/div[1]/div[1]")
		private WebElement offval;
		@FindBy(id="yettotransmitSelected")
		private WebElement allytt;
		@FindBy(xpath="//div[@id='yettotransmitSelected']/div[1]/div[1]")
		private WebElement yttval;
		@FindBy(id="onlineSelected")
		private WebElement allon;
		@FindBy(xpath="//div[@id='onlineSelected']/div[1]/div[1]")
		private WebElement onval;
		@FindBy(id="towedSelected")
		private WebElement alltow;
		@FindBy(xpath="//div[@class='filterIcon']")
		private WebElement filter;
		@FindBy(id="s2id_select2_plateno")
		private WebElement plate;
		@FindBy(xpath="//button[@ng-click='getFilterValues(true)']")
		private WebElement search;
		@FindBy(id="select2-drop")
		private WebElement autoplate;
		@FindBy (xpath="//div[@id='select2-drop']/ul[@class='select2-results']/li")
		private List<WebElement> autolist;
	    @FindBy (xpath="//button[@ng-click='getFilterValues(true)']")
	    private WebElement clickop;
	    public WebElement getVehnmae1() {
			return vehnmae1;
		}
		public WebElement getVehname() {
			return vehname;
		}
		@FindBy (id="dashboardVehicles")
	    private WebElement vehname;
		@FindBy (xpath="//li/div[3]/div")
		private WebElement vehnmae1;
	    @FindBy (xpath="//div[@class='live-tracking-address']/span[1]/p")
	    private WebElement livedataname;
	    @FindBy(id="s2id_select2_operator")
		private WebElement operator;
	    @FindBy(id="s2id_select2_status")
	    private WebElement status;
	    @FindBy(id="s2id_select2_fleetmanager")
	    private WebElement fleetmanager;
	    @FindBy(xpath="//a[@data-target='#dash-alerts-content']")
	    private WebElement Alert;
	    @FindBy(xpath="//a[@data-target='#dash-maintenance-content']")
	    private WebElement maintain;
		@FindBy (id="dashboardVehicles")
		private WebElement nameclick;
		@FindBy (xpath="//*[local-name()='svg']//*[local-name()='g'][2]//*[local-name()='g']")
		private WebElement context;
		@FindBy (xpath="//*[local-name()='svg']//*[local-name()='g'][6]//*[local-name()='g']")
		private WebElement linecontext;
		public WebElement getLinecontext() {
			return linecontext;
		}
		@FindBy (xpath="//div[@id='dash-alerts-content']/div")
		private List<WebElement> Alertlist;
		public List<WebElement> getMainlist() {
			return mainlist;
		}
		public WebElement getLive() {
			return live;
		}
		public WebElement getHistory() {
			return History;
		}
		public WebElement getNearby() {
			return nearby;
		}
		@FindBy (xpath="//div[@id='dash-maintenance-content']")
		private List<WebElement> mainlist;
		@FindBy (id="liveTrackingtab")
		private WebElement live;
		public WebElement getLivenames() {
			return livenames;
		}
		@FindBy (xpath="//*[@class='svgPopupMarkerId1']/following::p[1]")
		private WebElement livenames;
		@FindBy (id="trackHistoryMapId")
		private WebElement History;
		@FindBy (xpath="//a[@data-target='#tab12']")
		private WebElement nearby;
		@FindBy (xpath="//div[@id='live-charts-col']/div/div[@class='track-history']/div[@class='tabbable tabbable-tabdrop']/ul/li/a[text()='Live Data']")
		private WebElement livedata;
		@FindBy(xpath ="//div[@id='live-charts-col']/div/div[@class='track-history']/div[@class='tabbable tabbable-tabdrop']/ul/li/a[text()='Odometer']")
		private WebElement odometer;
		@FindBy(xpath ="//div[@id='live-charts-col']/div/div[@class='track-history']/div[@class='tabbable tabbable-tabdrop']/ul/li/a[text()='Vehicle Details']")
		private WebElement vehicledetail;
		public List<WebElement> getAlertlist() {
			return Alertlist;
		}
		public WebElement getLivedata() {
			return livedata;
		}
		public WebElement getOdometer() {
			return odometer;
		}
		public WebElement getVehicledetail() {
			return vehicledetail;
		}
		public WebElement getContext() {
			return context;
		}
		public WebElement getNameclick() {
			return nameclick;
		}
		public WebElement getAlert() {
			return Alert;
		}
		public WebElement getMaintain() {
			return maintain;
		}
		public WebElement getFleetmanager() {
			return fleetmanager;
		}
		public WebElement getStatus() {
			return status;
		}
		public WebElement getOperator() {
			return operator;
		}
		public WebElement getClickop() {
			return clickop;
		}
		public WebElement getSearch() {
			return search;
		}
		public WebElement getAutoplate() {
			return autoplate;
		}
		public List<WebElement> getAutolist() {
			return autolist;
		}
		
		
		public WebElement getLivedataname() {
			return livedataname;
		}
		public WebElement getFilter() {
			return filter;
		}
		public WebElement getPlate() {
			return plate;
		}
		public WebElement getAllstop() {
			return allstop;
		}
		public WebElement getStopval() {
			return stopval;
		}
		public WebElement getAllidel() {
			return allidel;
		}
		public WebElement getIdelval() {
			return idelval;
		}
		public WebElement getAlloverspe() {
			return alloverspe;
		}
		public WebElement getOvspeval() {
			return ovspeval;
		}
		public WebElement getAlloff() {
			return alloff;
		}
		public WebElement getOffval() {
			return offval;
		}
		public WebElement getAllytt() {
			return allytt;
		}
		public WebElement getYttval() {
			return yttval;
		}
		public WebElement getAllon() {
			return allon;
		}
		public WebElement getOnval() {
			return onval;
		}
		public WebElement getAlltow() {
			return alltow;
		}
		public WebElement getTowval() {
			return towval;
		}
		@FindBy(xpath="//div[@id='towedSelected']/div[1]/div[1]")
		private WebElement towval;
		
	
		public WebElement getAllrun() {
			return allrun;
		}
		public WebElement getRunval() {
			return runval;
		}
		public WebElement getGridview() {
			return gridview;
		}
		public WebElement getAllSelect() {
			return AllSelect;
		}
		public WebElement getAllsecval() {
			return Allsecval;
		}
		public WebElement getList() {
			return list;
		}
		
		public WebElement getPngoption() {
			return pngoption;
		}
		public WebElement getJepgoption() {
			return jepgoption;
		}
		public WebElement getPdfoption() {
			return pdfoption;
		}
		@FindBy( xpath="//div[text()='Download PNG image']")
		private WebElement pngoption;
		@FindBy( xpath="//div[text()='Download JPEG image']")
		private WebElement jepgoption;
		@FindBy( xpath="//div[text()='Download PDF document']")
		private WebElement pdfoption;
		public WebElement getPlay() {
			return play;
		}
		public WebElement getPause() {
			return pause;
		}
		public WebElement getStop() {
			return stop;
		}
		@FindBy(xpath="//button[@class='col-xs-12 track-history-play']")
		private WebElement play;
		@FindBy(xpath ="//div[@class=' row option-play-pause-stop']/div[2]/button")
		private WebElement pause;
		@FindBy(xpath ="//div[@class=' row option-play-pause-stop']/div[3]/button")
		private WebElement stop;
		@FindBy(xpath="//div[@class='row option-inputs']/div/button")
		private WebElement Go;
		public WebElement getGo() {
			return Go;
		}
		public WebElement getRunningcheck() {
			return runningcheck;
		}
		public WebElement getVehiclesearch() {
			return vehiclesearch;
		}
		@FindBy(xpath ="//div[@id='running-check']/label/input")
		private WebElement runningcheck;
        @FindBy(xpath="//div[@id='filterSearchBar']/input")
        private WebElement vehiclesearch;
        @FindBy(id="newRefresh")
        private WebElement refresh;
		public WebElement getRefresh() {
			return refresh;
		}
		 @FindBy(id="operatorDasbordGridTabId")
	        private WebElement Operatortab;
        @FindBy(xpath="//div[@class='mostly-customized-scrollbar operators']/ul")
        private WebElement operatorlist;
		public WebElement getOpesearch() {
			return opesearch;
		}
		public WebElement getOperatortab() {
			return Operatortab;
		}
		public WebElement getOperatorlist() {
			return operatorlist;
		}
        @FindBy (xpath="//div[@id='grid-second-tab']/div/div/div/div/input")
        private WebElement opesearch;
        @FindBy (xpath="//div[@class='tab-pane active']/div/div[2]/div/div/div/div[@translate='SATELLITE']")
        private WebElement satelite;
        @FindBy (xpath="//div[@class='container-fluid']/div[2]/div/div/div/div[1]")
        private WebElement Map;
		public WebElement getSatelite() {
			return satelite;
		}
		public WebElement getZoomin() {
			return zoomin;
		}
		public WebElement getZoomout() {
			return zoomout;
		}
		public WebElement getMap() {
			return Map;
		}	
		@FindBy (id="searchOptionValue")
		private WebElement optvalue;
			
		
        public WebElement getDashZoomin() {
			return dashZoomin;
		}
		public WebElement getDashZoomout() {
			return dashZoomout;
		}
		public WebElement getOptvalue() {
			return optvalue;
		}
		@FindBy (xpath="//div[@id='map_for_nearby_live']/div/div/div/div[1]/button[@class='ol-zoom-in']")
        public WebElement zoomin;
        @FindBy (xpath="//div[@id='map_for_nearby_live']/div/div/div/div[1]/button[@class='ol-zoom-out']")
        public WebElement zoomout;
        @FindBy (xpath="//div[@id='newdashboardMapWrapper']/div/div/div/div[1]/button[@class='ol-zoom-in']")
        private WebElement dashZoomin;
        @FindBy (xpath="//div[@id='newdashboardMapWrapper']/div/div/div/div[1]/button[@class='ol-zoom-out']")
        private WebElement dashZoomout;


}
