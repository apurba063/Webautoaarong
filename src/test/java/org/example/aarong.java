package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class aarong extends browsersetup {

    public void test() throws InterruptedException {

        browser.get("https://www.aarong.com/customer/account/login/referer/aHR0cHM6Ly93d3cuYWFyb25nLmNvbS9laWQtdWwtZml0ci0yMDI0P2dhZF9zb3VyY2U9MQ,,/");

        browser.findElement(By.xpath("//input [@name=\"checkinput\"]")).sendKeys("HELLO");
        Thread.sleep(2000);
        String text=browser.findElement(By.id("block-customer-login-heading")).getText();
        System.out.println(text);
        text = browser.findElement(By.className("parts-sec")).getText();
        System.out.println(text);

        //click continue button
       browser.findElement(By.cssSelector("button[id=\"send2\"]")).click();
       Thread.sleep(5000);


        //close the popup message
        browser.findElement(By.xpath("//button[@id=\"btn-cookie-close\"]")).click();
        Thread.sleep(2000);

        //click sign up now
        browser.findElement(By.cssSelector("div[class=\"signup-here\"]>a>span")).click();
        Thread.sleep(2000);


      //click the search button
        browser.findElement(By.xpath("//i[@class=\"icon icon-search\"]")).click();
        Thread.sleep(2000);
        browser.findElement(By.id("search")).sendKeys("punjabi");
        Thread.sleep(2000);
        browser.findElement(By.cssSelector("button[class='action search']")).click();
        Thread.sleep(2000);

        //click facebook icon
       browser.findElement(By.cssSelector("div[class=\"social-signup\"]>div>div>div>a>span")).click();
       Thread.sleep(2000);


        //click the aarong logo to go to home page
        browser.findElement(By.xpath("//a[@title=\"Aarong Ecommerce\"]")).click();
        Thread.sleep(2000);

    }
}
