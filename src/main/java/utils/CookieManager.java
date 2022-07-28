package utils;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class CookieManager {

    private WebDriver driver;

    public CookieManager (WebDriver driver){
        this.driver = driver;
    }

    public void addCookie(Cookie cookie){
        driver.manage().addCookie(cookie);
    }

    public void deleteCookie(Cookie cookie){
        driver.manage().deleteCookie(cookie);
    }

    public void deleteCookieByName(String cookie){
        driver.manage().deleteCookieNamed(cookie);
    }

    public boolean isCookieExists(Cookie cookie){
        return driver.manage().getCookieNamed(cookie.getName()) != null;
    }

    public Set<Cookie> getCookies(){
        Set<Cookie> cookies = driver.manage().getCookies();
        return cookies;
    }

    public Cookie buildCookie(String name, String value){
        Cookie cookie = new Cookie.Builder(name, value)
                .domain("the-internet.herokuapp.com")
                .build();
        return cookie;
    }

}
