package Testcases;

import java.nio.file.WatchEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Apputils;

public class Moneyreifftables extends Apputils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       utils.Apputils.launchapp("https://money.rediff.com/tools/forex");
	 WebElement crtable = driver.findElement(By.className("dataTable"));
     List<WebElement> rows =	crtable.findElements(By.tagName("tr"));
     List<WebElement> clns = rows.get(1).findElements(By.tagName("td"));
      String str1= rows.get(1).getText();
      String str2=clns.get(0).getTagName();
	
	System.out.println(str1+""+str2);
	 
	}
}
