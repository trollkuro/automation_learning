package cookies;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import java.net.CookieManager;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class CookiesTest extends BaseTests {

    @Test
    public void TestDeleteCookie(){
        var cookieManager = getCookieManager();
        Cookie cookie = cookieManager.buildCookie("optimizelyBuckets", "%7B%TD");
        cookieManager.deleteCookie(cookie);
        assertFalse(cookieManager.isCookieExists(cookie), "Cookie was not deleted!");
    }
}
