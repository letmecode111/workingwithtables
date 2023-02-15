package Testcases;

import java.nio.file.WatchEvent;
import java.util.List;

import javax.swing.table.TableColumn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Apputils;

public class workingwithtables extends Apputils {

	public static void main(String[] args) {
		utils.Apputils.launchapp("https://money.rediff.com/tools/forex");
	  WebElement crtbale=	driver.findElement(By.className("dataTable"));
	 List<WebElement> rows= crtbale.findElements(By.tagName("tr"));
	        for(int i =1;i<rows.size();i++)
	        {
	                List<WebElement>clns= rows.get(i).findElements(By.tagName("td"));
	 String str1= clns.get(0).getText();
	 String str2= clns.get(1).getText();
	 System.out.println(str1 +" "+ str2);
	 
	        }

	 
	 
	}
}