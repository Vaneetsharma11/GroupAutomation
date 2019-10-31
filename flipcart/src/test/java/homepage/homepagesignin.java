package homepage;

import base.CommonAPI;
import org.testng.annotations.Test;

public class homepagesignin extends CommonAPI {

@Test
    public void clicksignin() {
    clickByXpath("//a[@title='Sign in']");
}

}
