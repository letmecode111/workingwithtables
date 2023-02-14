package Testcases;

import java.nio.file.WatchEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Apputils;

public class Moneyredifftables extends Apputils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       utils.Apputils.launchapp("https://money.rediff.com/tools/forex");
	 List<WebElement> rows = driver.findElement(By.className("dataTable")).findElements(By.tagName("tr"));
	List<WebElement> clns= driver.findElement(By.className("dataTable")).findElements(By.tagName("td"));
	System.out.println(rows.size());
	System.out.println(clns.size());
	}
}
