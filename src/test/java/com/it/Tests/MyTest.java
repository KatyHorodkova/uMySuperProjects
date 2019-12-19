package com.it.Tests;

import com.it.Users.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BAseTest {
    @Test
    public void test1() {
        System.out.println(UserFactory.getrandomUser());
        System.out.println(UserFactory.getrandomUsers(20));
        app.login.login(validUser);;
        Assert.assertEquals(app.dashboard.getEmailUser(), validUser.email);

    }
}
