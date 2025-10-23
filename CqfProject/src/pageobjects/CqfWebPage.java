package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="CqfWebPage"                                
     , summary=""
     , relativeUrl=""
     , connection="CqfWeb"
     )             
public class CqfWebPage {

	@TextType()
	@FindBy(xpath = "//td[1]/input")
	public WebElement UserDataTableName;
	@TextType()
	@FindBy(xpath = "//tr[2]/td[2]/input")
	public WebElement UserDataTableEmail;
	@TextType()
	@FindBy(xpath = "//tr[2]/td[3]/input")
	public WebElement UserDataTableCity;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Save']")
	public WebElement UserDataTableSave;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Saved']")
	public WebElement UserDataTableSaved;
	@ButtonType()
	@FindBy(xpath = "//td/button[normalize-space(.)='Disabled']")
	public WebElement UserDatatableDisabled;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Add New Row']")
	public WebElement UserDataTableAddNewRow;
	@TextType()
	@FindBy(xpath = "//tr[2]/td[1]/input")
	public WebElement UserDataTableName1;
	@ButtonType()
	@FindBy(xpath = "//tr[2]//button[normalize-space(.)='Delete']")
	public WebElement delete;
	@TextType()
	@FindBy(xpath = "//td[2]/input")
	public WebElement userDataEmail;
	@TextType()
	@FindBy(xpath = "//td[3]/input")
	public WebElement city;
	@TextType()
	@FindBy(xpath = "//tr[2]/td[2]/input")
	public WebElement userDataEmail1;
	@TextType()
	@FindBy(xpath = "//tr[2]/td[3]/input")
	public WebElement city1;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='MoreShow more navigation items']")
	public WebElement moreShowMoreNavigationItems;
	@LinkType()
	@FindBy(xpath = "//one-app-nav-bar-menu-item/a[normalize-space(.)='Weather Information']")
	public WebElement weatherInformation;
	@LinkType()
	@FindBy(xpath = "//one-app-nav-bar-menu-item/a[normalize-space(.)='Data Binding & Rendering']")
	public WebElement dataBindingAndRendering;
			
}
