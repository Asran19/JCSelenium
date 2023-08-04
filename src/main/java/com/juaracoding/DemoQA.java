package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {
    public static void main(String[] args) {
        String path = "C:\\MyTools\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().fullscreen();
        System.out.println("Open Browser");

        driver.findElement(By.id("userName")).sendKeys("Asran");
        driver.findElement(By.id("userEmail")).sendKeys("Info@asran.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Makassar");
        driver.findElement(By.id("permanentAddress")).sendKeys("Makassar");
        js.executeScript("window.scrollBy(0,500)"); // scroll vertical 500px
        driver.findElement(By.id("submit")).click();
//        System.out.println("Klik Submit");
//        delay();
//        driver.quit();
//        System.out.println("Quit Browser");
    }

    static void delay() {
        try {
            Thread.sleep(3000);// delay 3 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}