package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.base.java.WebComponent;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="conditionalRenderingPageObject"                                
               , summary=""
               , connection="LWC_Org"
               , lightningWebComponent="conditionalRendering"
               , namespacePrefix=""
     )             
public class conditionalRenderingPageObject {

	@FindBy(xpath = ".//lightning-input[@type='checkbox']")
	@WebComponentMapping(componentId = "38f5a65b-0065-4df9-8e6c-8dd9a0f8111d")
	public WebComponent ConditionalClick_Me;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'slds-p-around_x-small')][text()='I am Visible']")
	public WebElement ConditionalRenderingText;
	
}
