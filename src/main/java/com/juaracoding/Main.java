package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\MyTools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Open Browser");
        driver.findElement(By.name("q")).sendKeys("JuaraCoding"+ Keys.ENTER);
        System.out.println("Input Search + Enter");
//        driver.findElement(By.name("btn")).click();
//        System.out.println("Klik Button");

        try {
            Thread.sleep(3000);// delay 3 detik
            } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Quit Browser");
    }
}