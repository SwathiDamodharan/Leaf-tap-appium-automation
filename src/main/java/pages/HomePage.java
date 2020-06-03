package pages;

import mobileWrapper.AppSpecificMethods;

public class HomePage extends AppSpecificMethods{

	public HomePage fetchParName() throws InterruptedException {
		Thread.sleep(3000);
		if(verifyText("Babu Manickam", "xpath", "//label[text()=' PARTICIPANT NAME ']/preceding-sibling::label")) {
			reportStep("the ele babu manickam verified Successfully", "PASS");
		}else
			reportStep("the ele not return the text", "FAIL");
		return this;
	}
}
