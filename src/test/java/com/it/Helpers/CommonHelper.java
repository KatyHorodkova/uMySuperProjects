package com.it.Helpers;

import com.it.Pages.BasePage;

public class CommonHelper extends BasePage {
   public void closeApp() {
        driver.quit();
    }
}
