package com.it;

import com.it.Helpers.CommonHelper;
import com.it.Helpers.DashboardHelper;
import com.it.Helpers.LoginHelper;
import com.it.Pages.DashboardPage;
import com.it.Pages.LoginPage;

public class App {
    public LoginHelper login;
    public DashboardHelper dashboard;
    public CommonHelper common;

    public App() {
        login = new LoginHelper();
        dashboard = new DashboardHelper();
        common = new CommonHelper();

    }
}
