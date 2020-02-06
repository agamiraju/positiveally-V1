package test;


//
//Decompiled by Procyon v0.5.36
//



import org.openqa.selenium.WebElement;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import java.io.OutputStream;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.FileOutputStream;
import java.io.File;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AboutUs
{
 public static void main(final String[] args) throws Exception {
	 System.setProperty("webdriver.gecko.driver", "/home/ganesh/Documents/Selenium_Eclipse/geckodriver");
	 final WebDriver driver = (WebDriver)new FirefoxDriver();
     driver.manage().window().maximize();
     
     driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
     driver.get("https://www.positiveally.com");
     driver.findElement(By.xpath("//a[text()='ABOUT US']")).click();
     try {
         final File f = new File("/home/ganesh/Desktop/Test3.xls");
         final FileOutputStream fos = new FileOutputStream(f);
         final Workbook wb = (Workbook)new HSSFWorkbook();
         final CellStyle style3 = wb.createCellStyle();
         final Font font3 = wb.createFont();
         font3.setBold(true);
         style3.setFont(font3);
         final CellStyle style4 = wb.createCellStyle();
         final Font font4 = wb.createFont();
         final CellStyle style5 = wb.createCellStyle();
         final Font font5 = wb.createFont();
         final Sheet sh = wb.createSheet("About Us");
         Row rw = sh.createRow(0);
         Cell cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Test Case");
         cl.setCellStyle(style3);
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Expected Result");
         cl.setCellStyle(style3);
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Actual Result");
         cl.setCellStyle(style3);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Status");
         cl.setCellStyle(style3);
         rw = sh.createRow(1);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Amandeep (\u201cAman\u201d) Narula");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg1 = driver.findElement(By.xpath("//span[text()='Amandeep (\u201cAman\u201d) Narula']"));
         final String text1 = msg1.getText();
         System.out.println(text1);
         cl.setCellValue(text1);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text1.contains("Amandeep (\u201cAman\u201d) Narula")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(2);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("President and Founder");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg2 = driver.findElement(By.xpath("//span[text()='President and Founder']"));
         final String text2 = msg2.getText();
         System.out.println(text2);
         cl.setCellValue(text2);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text2.contains("President and Founder")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[1]/div[3]/p/span[2]/a")).click();
         rw = sh.createRow(3);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("I am an ex-software executive who in 2009, after 17 years, decided to change tracks and follow my passion for leadership development in youth.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg3 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[1]/div[3]/p"));
         final String text3 = msg3.getText();
         System.out.println(text3);
         cl.setCellValue(text3);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text3.contains("I am an ex-software executive who in 2009, after 17 years, decided to change tracks and follow my passion for leadership development in youth.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(4);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("It all started when I could not find quality afterschool programming for my three boys who at the time were in elementary school. I wanted a place which");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg4 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[1]/div[3]/p"));
         final String text4 = msg4.getText();
         System.out.println(text4);
         cl.setCellValue(text4);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text4.contains("It all started when I could not find quality afterschool programming for my three boys who at the time were in elementary school. I wanted a place which")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(5);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("not only was a safe place with loving teachers who challenged my boys, but also a place for learning all the many things that public schools nowadays do not offer their students, like theater, soccer, destination imagination, formal public speaking training, and so on.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg5 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[1]/div[3]/p"));
         final String text5 = msg5.getText();
         System.out.println(text5);
         cl.setCellValue(text5);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text5.contains("not only was a safe place with loving teachers who challenged my boys, but also a place for learning all the many things that public schools nowadays do not offer their students, like theater, soccer, destination imagination, formal public speaking training, and so on.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(6);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("I talked to a few of my neighbors and found, not surprisingly, that I was not the only parent who wanted an enriching environment for their children between 3pm and 6pm.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg6 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[1]/div[3]/p"));
         final String text6 = msg6.getText();
         System.out.println(text6);
         cl.setCellValue(text6);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text6.contains("I talked to a few of my neighbors and found, not surprisingly, that I was not the only parent who wanted an enriching environment for their children between 3pm and 6pm.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(7);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("And so, I founded Positive Ally and the journey continues. ");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg7 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[1]/div[3]/p"));
         final String text7 = msg7.getText();
         System.out.println(text7);
         cl.setCellValue(text7);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text7.contains("And so, I founded Positive Ally and the journey continues. ")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(8);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Dede Torrez");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg8 = driver.findElement(By.xpath("//span[text()='Dede Torrez']"));
         final String text8 = msg8.getText();
         System.out.println(text8);
         cl.setCellValue(text8);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text8.contains("Dede Torrez")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(9);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Director Quality & Curriculum");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg9 = driver.findElement(By.xpath("//span[text()='Director Quality & Curriculum']"));
         final String text9 = msg9.getText();
         System.out.println(text9);
         cl.setCellValue(text9);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text9.contains("Director Quality & Curriculum")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[2]/div[3]/p/span[2]/a")).click();
         Thread.sleep(1000L);
         rw = sh.createRow(10);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("I have 20 years of teaching experience. I have been with Positive Ally since 2010 and was its very first hire. I joined Positive Ally as a Site Director of the after school program for the first few years, and have now transitioned to senior management.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg10 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[2]/div[3]/p"));
         final String text10 = msg10.getText();
         System.out.println(text10);
         cl.setCellValue(text10);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text10.contains("I have 20 years of teaching experience. I have been with Positive Ally since 2010 and was its very first hire. I joined Positive Ally as a Site Director of the after school program for the first few years, and have now transitioned to senior management.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(11);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Born and raised in California, I earned a B");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg11 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[2]/div[3]/p"));
         final String text11 = msg11.getText();
         System.out.println(text11);
         cl.setCellValue(text11);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text11.contains("Born and raised in California, I earned a B")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(12);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("A from California State University Chico. After graduation, I was accepted into the first cadre of the concurrent credential program and received graduate teaching credentials in both Elementary and Special Education with emphasis on cross cultural language and development.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg12 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[2]/div[3]/p"));
         final String text12 = msg12.getText();
         System.out.println(text12);
         cl.setCellValue(text12);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text12.contains("A from California State University Chico. After graduation, I was accepted into the first cadre of the concurrent credential program and received graduate teaching credentials in both Elementary and Special Education with emphasis on cross cultural language and development.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         rw = sh.createRow(13);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Upon completion of graduate school, I accepted a teaching position with Evergreen School District, San Jose, CA at a California Distinguished School as well as a National School Award recipient. I was selected amongst many to be a District Wide mentor to new teachers and student teachers. I relocated to Washington in 2005 and worked in Renton and Bellevue School Districts before joining the Positive Ally team.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg13 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[2]/div[3]/p"));
         final String text13 = msg13.getText();
         System.out.println(text13);
         cl.setCellValue(text13);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text13.contains("Upon completion of graduate school, I accepted a teaching position with Evergreen School District, San Jose, CA at a California Distinguished School as well as a National School Award recipient. I was selected amongst many to be a District Wide mentor to new teachers and student teachers. I relocated to Washington in 2005 and worked in Renton and Bellevue School Districts before joining the Positive Ally team.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(14);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Teaching comes naturally to me and I easily connect with children and families. In fact, what I find most fulfilling and rewarding about being an educator is the lifelong connection between students and teachers. In fact, I keep in touch with several of my former students and families. It has been a pleasure to watch former students graduate college, get married, and have children. To see my young students grow into responsible and amazing adults, is what makes me smile and why I know this was the career for me!");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg14 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[2]/div[3]/p"));
         final String text14 = msg14.getText();
         System.out.println(text14);
         cl.setCellValue(text14);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text14.contains("Teaching comes naturally to me and I easily connect with children and families. In fact, what I find most fulfilling and rewarding about being an educator is the lifelong connection between students and teachers. In fact, I keep in touch with several of my former students and families. It has been a pleasure to watch former students graduate college, get married, and have children. To see my young students grow into responsible and amazing adults, is what makes me smile and why I know this was the career for me!")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(15);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Chris Poulsen");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg15 = driver.findElement(By.xpath("//span[text()='Chris Poulsen']"));
         final String text15 = msg15.getText();
         System.out.println(text15);
         cl.setCellValue(text15);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text15.contains("Chris Poulsen")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(16);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Director-DMV, Virginia");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg16 = driver.findElement(By.xpath("//span[text()='Director-DMV, Virginia']"));
         final String text16 = msg16.getText();
         System.out.println(text16);
         cl.setCellValue(text16);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text16.contains("Director-DMV, Virginia")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[3]/div[3]/p/span[2]/a")).click();
         Thread.sleep(500L);
         rw = sh.createRow(17);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("My personal drive to help others enrich their lives is who I am. For the last 12 years I have been involved with people of various age groups from elementary school to successful adults. I\u2019ve done many actions from helping others learn English, learn effective communication skills, life-coaching som");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg17 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[3]/div[3]/p"));
         final String text17 = msg17.getText();
         System.out.println(text17);
         cl.setCellValue(text17);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text17.contains("My personal drive to help others enrich their lives is who I am. For the last 12 years I have been involved with people of various age groups from elementary school to successful adults. I\u2019ve done many actions from helping others learn English, learn effective communication skills, life-coaching som")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(18);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("e to overcome their difficulties and personal blocks, to helping children learn how to study.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg18 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[3]/div[3]/p"));
         final String text18 = msg18.getText();
         System.out.println(text18);
         cl.setCellValue(text18);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text18.contains("e to overcome their difficulties and personal blocks, to helping children learn how to study.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(19);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("I was offered a position at Positive Ally to expand us to the east coast and I\u2019m very proud to announce that our first location in Virginia has successfully opened in Fall of 2017! While running a business comes easy to me, having run a successful business in my previous life, my true passion is to be with the young students of Positive Ally. Since being here, I\u2019ve helped our students grow as public speakers, learn the mechanics of various sports, hiked with our kids many places including to the top of Mt. Si, coached them in their homework so they learn what they are studying in school and helped them learn vital life skills.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg19 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[1]/div[3]/div[3]/p"));
         final String text19 = msg19.getText();
         System.out.println(text19);
         cl.setCellValue(text19);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text19.contains("I was offered a position at Positive Ally to expand us to the east coast and I\u2019m very proud to announce that our first location in Virginia has successfully opened in Fall of 2017! While running a business comes easy to me, having run a successful business in my previous life, my true passion is to be with the young students of Positive Ally. Since being here, I\u2019ve helped our students grow as public speakers, learn the mechanics of various sports, hiked with our kids many places including to the top of Mt. Si, coached them in their homework so they learn what they are studying in school and helped them learn vital life skills.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(20);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Sripriya Vishwanathan");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg20 = driver.findElement(By.xpath("//span[text()='Sripriya Vishwanathan']"));
         final String text20 = msg20.getText();
         System.out.println(text20);
         cl.setCellValue(text20);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text20.contains("Sripriya Vishwanathan")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(21);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Program Director");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg21 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[2]/div[1]/div[2]/span[2]"));
         final String text21 = msg21.getText();
         System.out.println(text21);
         cl.setCellValue(text21);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text21.contains("Program Director")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[2]/div[1]/div[3]/p/span[2]/a")).click();
         Thread.sleep(500L);
         rw = sh.createRow(22);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("I have a passion for teaching. I have been with Positive Ally since 2011. My job at Positive Ally has been a wonderful blessing.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg22 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[2]/div[1]/div[3]/p"));
         final String text22 = msg22.getText();
         System.out.println(text22);
         cl.setCellValue(text22);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text22.contains("I have a passion for teaching. I have been with Positive Ally since 2011. My job at Positive Ally has been a wonderful blessing.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(23);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Born and raised in India, I earned a BS in Computer Science from MS University and subsequently obtained an Masters in Computer Application from MS University. I starte");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg23 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[2]/div[1]/div[3]/p"));
         final String text23 = msg23.getText();
         System.out.println(text23);
         cl.setCellValue(text23);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text23.contains("Born and raised in India, I earned a BS in Computer Science from MS University and subsequently obtained an Masters in Computer Application from MS University. I starte")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(24);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("d my career in India and worked as a Lecturer for four years and then got married and relocated to Atlanta, Georgia in May 2001. I was working as a Substitute teacher with the Cobb County School District for three years. I took a break to raise a family and relocated to Redmond, Washington in 2008 and eventually joined the Positive Ally team. The Redmond Ridge community knows me very well and I have invested a lot of time building relationships with students and parents over the past four years.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg24 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[2]/div[1]/div[3]/p"));
         final String text24 = msg24.getText();
         System.out.println(text24);
         cl.setCellValue(text24);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text24.contains("d my career in India and worked as a Lecturer for four years and then got married and relocated to Atlanta, Georgia in May 2001. I was working as a Substitute teacher with the Cobb County School District for three years. I took a break to raise a family and relocated to Redmond, Washington in 2008 and eventually joined the Positive Ally team. The Redmond Ridge community knows me very well and I have invested a lot of time building relationships with students and parents over the past four years.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(25);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("My husband Vishy and I, are celebrating fifteen years of marriage in 2016. My only son, Anikait, is our pride and joy. We love outdoors and they enjoy playing board games together.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg25 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[2]/div[1]/div[3]/p"));
         final String text25 = msg25.getText();
         System.out.println(text25);
         cl.setCellValue(text25);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text25.contains("My husband Vishy and I, are celebrating fifteen years of marriage in 2016. My only son, Anikait, is our pride and joy. We love outdoors and they enjoy playing board games together.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(26);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Simrat Dhindsa");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg26 = driver.findElement(By.xpath(".//span[text()='Simrat Dhindsa']"));
         final String text26 = msg26.getText();
         System.out.println(text26);
         cl.setCellValue(text26);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text26.contains("Simrat Dhindsa")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(27);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Program Director");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg27 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[2]/div[2]/div[2]/span[2]"));
         final String text27 = msg27.getText();
         System.out.println(text27);
         cl.setCellValue(text27);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text27.contains("Program Director")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[2]/div[2]/div[3]/p/span[2]/a")).click();
         Thread.sleep(500L);
         rw = sh.createRow(28);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("I have been a teacher for more than 10 years. Being a mother of a 9-year-old daughter and a 7-year-old son, I believe that an overall development of a child is extremely important in order to thrive in today\u2019s world. I work very well with parents and students to identify growth opportunities for a p");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg28 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[2]/div[2]/div[3]/p"));
         final String text28 = msg28.getText();
         System.out.println(text28);
         cl.setCellValue(text28);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text28.contains("I have been a teacher for more than 10 years. Being a mother of a 9-year-old daughter and a 7-year-old son, I believe that an overall development of a child is extremely important in order to thrive in today\u2019s world. I work very well with parents and students to identify growth opportunities for a p")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(29);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("articular child with respect to homework, behavior, interaction and so on and then come up with an effective and efficient best-practices using our Trusted Advisor Program at Positive Ally. Being able to help parents to make their child a successful individual is what my passion is.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg29 = driver.findElement(By.xpath(".//*[@id='post-39']/div[1]/div/div[2]/div[2]/div[3]/p"));
         final String text29 = msg29.getText();
         System.out.println(text29);
         cl.setCellValue(text29);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text29.contains("articular child with respect to homework, behavior, interaction and so on and then come up with an effective and efficient best-practices using our Trusted Advisor Program at Positive Ally. Being able to help parents to make their child a successful individual is what my passion is.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(30);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Our Partners");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg30 = driver.findElement(By.xpath(".//*[@id='post-39']/div[2]/div/div/div[1]/div/h2"));
         final String text30 = msg30.getText();
         System.out.println(text30);
         cl.setCellValue(text30);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text30.contains("Our Partners")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/ol/li[1]")).click();
         Thread.sleep(200L);
         rw = sh.createRow(31);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Coerver");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg31 = driver.findElement(By.xpath("//p[text()='Coerver']"));
         final String text31 = msg31.getText();
         System.out.println(text31);
         cl.setCellValue(text31);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text31.contains("Coerver")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(32);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Coerver Coaching NW is a premier soccer skills training organization. It is a soccer skills teaching method suited for all ages but especially for players aged 5-16 years old of all abilities and their parents, coaches and teachers. This method focuses on individual skills development and small group play.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg32 = driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/div/div[1]/blockquote/div/div/div[2]/p[2]"));
         final String text32 = msg32.getText();
         System.out.println(text32);
         cl.setCellValue(text32);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text32.contains("Coerver Coaching NW is a premier soccer skills training organization. It is a soccer skills teaching method suited for all ages but especially for players aged 5-16 years old of all abilities and their parents, coaches and teachers. This method focuses on individual skills development and small group play.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/ol/li[2]")).click();
         Thread.sleep(500L);
         rw = sh.createRow(33);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Stone Soup Theatre");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg33 = driver.findElement(By.xpath("//p[text()='Stone Soup Theatre']"));
         final String text33 = msg33.getText();
         System.out.println(text33);
         cl.setCellValue(text33);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text33.contains("Stone Soup Theatre")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         rw = sh.createRow(34);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Stone Soup\u2019s Theatre educational programs focus on giving each young actor the tools they need to succeed on stage. All our student productions are actor-centered, our students are the true stars of our shows! We take focus away from the technical aspects of theatre and put it back in our young actor\u2019s imaginations. We use suggestive costuming, sets and props to allow the students\u2019 bodies, focus, reactions and facial expressions be what shows our audience the world and environment of the play.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg34 = driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/div/div[2]/blockquote/div/div/div[2]/p[2]"));
         final String text34 = msg34.getText();
         System.out.println(text34);
         cl.setCellValue(text34);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text34.contains("Stone Soup\u2019s Theatre educational programs focus on giving each young actor the tools they need to succeed on stage. All our student productions are actor-centered, our students are the true stars of our shows! We take focus away from the technical aspects of theatre and put it back in our young actor\u2019s imaginations. We use suggestive costuming, sets and props to allow the students\u2019 bodies, focus, reactions and facial expressions be what shows our audience the world and environment of the play.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/ol/li[3]")).click();
         Thread.sleep(500L);
         rw = sh.createRow(35);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Sammamish Baseball Academy");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg35 = driver.findElement(By.xpath("//p[text()='Sammamish Baseball Academy']"));
         final String text35 = msg35.getText();
         System.out.println(text35);
         cl.setCellValue(text35);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text35.contains("Sammamish Baseball Academy")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         rw = sh.createRow(36);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("SBA has a strong curriculum that can benefit all age groups and skill levels from our popular mini-camps to our summer camps and fall ball programs. The experienced and professional staff at SBA will provide personal training to teach the correct baseball fundamentals necessary to succeed at the next level. SBA is open to teams and individuals of all ages.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg36 = driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/div/div[3]/blockquote/div/div/div[2]/p[2]"));
         final String text36 = msg36.getText();
         System.out.println(text36);
         cl.setCellValue(text36);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text36.contains("SBA has a strong curriculum that can benefit all age groups and skill levels from our popular mini-camps to our summer camps and fall ball programs. The experienced and professional staff at SBA will provide personal training to teach the correct baseball fundamentals necessary to succeed at the next level. SBA is open to teams and individuals of all ages.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/ol/li[4]")).click();
         Thread.sleep(500L);
         rw = sh.createRow(37);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Coding with Kids");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg37 = driver.findElement(By.xpath("//p[text()='Coding with Kids']"));
         final String text37 = msg37.getText();
         System.out.println(text37);
         cl.setCellValue(text37);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text37.contains("Coding with Kids")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         rw = sh.createRow(38);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("We bring the knowledge of computer programming to elementary and middle school children! In just a few lessons, children start building their own programs and soon they can create their first games. Advanced kids learn deeper topics and build more sophisticated programs & games. Our lessons are fun and engaging, but also deliver structured computer science education.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg38 = driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/div/div[4]/blockquote/div/div/div[2]/p[2]"));
         final String text38 = msg38.getText();
         System.out.println(text38);
         cl.setCellValue(text38);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text38.contains("We bring the knowledge of computer programming to elementary and middle school children! In just a few lessons, children start building their own programs and soon they can create their first games. Advanced kids learn deeper topics and build more sophisticated programs & games. Our lessons are fun and engaging, but also deliver structured computer science education.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(39);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Our team includes both professional programmers and educators, and we offer multi-year progressive curriculum that will take students from the beginning of coding to its mastership");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg39 = driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/div/div[4]/blockquote/div/div/div[2]/p[2]"));
         final String text39 = msg39.getText();
         System.out.println(text39);
         cl.setCellValue(text39);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text39.contains("Our team includes both professional programmers and educators, and we offer multi-year progressive curriculum that will take students from the beginning of coding to its mastership")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/ol/li[5]")).click();
         Thread.sleep(500L);
         rw = sh.createRow(40);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Smart with Art");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg40 = driver.findElement(By.xpath("//p[text()='Smart with Art']"));
         final String text40 = msg40.getText();
         System.out.println(text40);
         cl.setCellValue(text40);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text40.contains("Smart with Art")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         rw = sh.createRow(41);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Smart with Art brings art education to students in Washington schools, foundations and businesses. They offer After School Art Enrichment Programs, In-School Daytime Programming, Art Parties, Corporate Events, Workshops and Summer Camps.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg41 = driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/div/div[5]/blockquote/div/div/div[2]/p[2]"));
         final String text41 = msg41.getText();
         System.out.println(text41);
         cl.setCellValue(text41);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text41.contains("Smart with Art brings art education to students in Washington schools, foundations and businesses. They offer After School Art Enrichment Programs, In-School Daytime Programming, Art Parties, Corporate Events, Workshops and Summer Camps.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/ol/li[6]")).click();
         Thread.sleep(500L);
         rw = sh.createRow(42);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Eastside Basketball Club");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg42 = driver.findElement(By.xpath("//p[text()='Eastside Basketball Club']"));
         final String text42 = msg42.getText();
         System.out.println(text42);
         cl.setCellValue(text42);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text42.contains("Eastside Basketball Club")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         rw = sh.createRow(43);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("We believe that athletic participation helps students in the formation of values and their development as mature individuals. EBC provides an intense training program in the development of the fundamental skills of basketball and to implant firmly in the children of the community the ideals of good sportsmanship, teamwork, self-confidence, pride, courage and respect for others.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg43 = driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/div/div[6]/blockquote/div/div/div[2]/p[2]"));
         final String text43 = msg43.getText();
         System.out.println(text43);
         cl.setCellValue(text43);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text43.contains("We believe that athletic participation helps students in the formation of values and their development as mature individuals. EBC provides an intense training program in the development of the fundamental skills of basketball and to implant firmly in the children of the community the ideals of good sportsmanship, teamwork, self-confidence, pride, courage and respect for others.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/ol/li[7]")).click();
         Thread.sleep(500L);
         rw = sh.createRow(44);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("MindAntix");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg44 = driver.findElement(By.xpath("//p[text()='MindAntix']"));
         final String text44 = msg44.getText();
         System.out.println(text44);
         cl.setCellValue(text44);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text44.contains("MindAntix")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         rw = sh.createRow(45);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("MindAntix is a fun, collaborative platform to help children learn and build creative thinking skills. Creativity is rated as the most important skill to possess in the 21st century. Unfortunately, Creative thinking scores in the United States have been declining steadily since the 1990\u2019s, unlike IQ scores that have been rising (Flynn Effect). Our goal at MindAntix is simple \u2013 we want to reverse this drop in creativity.The good news is that anyone can learn to be more creative. At MindAntix, we have designed fun, simple brainteasers that teach these higher order thinking skills (we like to call them Antix). You can do these brainteasers by yourself, or with your friends and family! And you can do them any time and any place \u2013 whenever and wherever you can think. Like at dinner time with your family or when you are in traffic and tired of playing Punch Buggy. So jump in, start exercising your mind and help us beat the declining creativity trend!");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg45 = driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/div/div[7]/blockquote/div/div/div[2]/p[2]"));
         final String text45 = msg45.getText();
         System.out.println(text45);
         cl.setCellValue(text45);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text45.contains("MindAntix is a fun, collaborative platform to help children learn and build creative thinking skills. Creativity is rated as the most important skill to possess in the 21st century. Unfortunately, Creative thinking scores in the United States have been declining steadily since the 1990\u2019s, unlike IQ scores that have been rising (Flynn Effect). Our goal at MindAntix is simple \u2013 we want to reverse this drop in creativity.The good news is that anyone can learn to be more creative. At MindAntix, we have designed fun, simple brainteasers that teach these higher order thinking skills (we like to call them Antix). You can do these brainteasers by yourself, or with your friends and family! And you can do them any time and any place \u2013 whenever and wherever you can think. Like at dinner time with your family or when you are in traffic and tired of playing Punch Buggy. So jump in, start exercising your mind and help us beat the declining creativity trend!")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/ol/li[8]")).click();
         Thread.sleep(500L);
         rw = sh.createRow(46);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Slam City Management Group");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg46 = driver.findElement(By.xpath("//p[text()='Slam City Management Group']"));
         final String text46 = msg46.getText();
         System.out.println(text46);
         cl.setCellValue(text46);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text46.contains("Slam City Management Group")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         rw = sh.createRow(47);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Slam City Management Group offers basketball training and camps for children in elementary school through high school. We provide children with the opportunity to learn and develop their basketball skill in a structured, fast paced, and competitive environment. Our programs are constructed with the intent of making players play intelligent basketball, train efficiently and with purpose, to be an extension of the coach on the court, and to lead on and off of the court in every aspect of life.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg47 = driver.findElement(By.xpath(".//*[@id='quote-carousel-1']/div/div[8]/blockquote/div/div/div[2]/p[2]"));
         final String text47 = msg47.getText();
         System.out.println(text47);
         cl.setCellValue(text47);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text47.contains("Slam City Management Group offers basketball training and camps for children in elementary school through high school. We provide children with the opportunity to learn and develop their basketball skill in a structured, fast paced, and competitive environment. Our programs are constructed with the intent of making players play intelligent basketball, train efficiently and with purpose, to be an extension of the coach on the court, and to lead on and off of the court in every aspect of life.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         Thread.sleep(500L);
         rw = sh.createRow(48);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("What others say about us");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg48 = driver.findElement(By.xpath(".//*[@id='post-39']/div[3]/div/div/div[1]/div"));
         final String text48 = msg48.getText();
         System.out.println(text48);
         cl.setCellValue(text48);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text48.contains("What others say about us")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         driver.findElement(By.xpath(".//*[@id='quote-carousel']/div/div[1]/blockquote/div/div/p[1]")).click();
         Thread.sleep(1000L);
         rw = sh.createRow(49);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("This is a true testimonial of all the hard work you all are putting in! Wow\u2026 we are super impressed. I enjoyed seeing him to do all the stretches\u2026 we see an overall development. The program is not bookish and it is wonderful to see him blossom through real life experiences. We are very happy with the program and only have good things to say \u2013 even the walk from school to the center helps him get fresh air and build immunity. For the first time I don\u2019t feel guilty about leaving Aatish and going to work \u2013 that has been a big relief. Also we spend more family time as he gets home work done at PA. All we have to say is THANK YOU, THANK YOU for all your effort, Ms. Dede is awesome (she is very real in her expectations from the kids and parents)");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg49 = driver.findElement(By.xpath(".//*[@id='quote-carousel']/div/div[1]/blockquote/div/div/p[1]"));
         final String text49 = msg49.getText();
         System.out.println(text49);
         cl.setCellValue(text49);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text49.contains("This is a true testimonial of all the hard work you all are putting in! Wow\u2026 we are super impressed. I enjoyed seeing him to do all the stretches\u2026 we see an overall development. The program is not bookish and it is wonderful to see him blossom through real life experiences. We are very happy with the program and only have good things to say \u2013 even the walk from school to the center helps him get fresh air and build immunity. For the first time I don\u2019t feel guilty about leaving Aatish and going to work \u2013 that has been a big relief. Also we spend more family time as he gets home work done at PA. All we have to say is THANK YOU, THANK YOU for all your effort, Ms. Dede is awesome (she is very real in her expectations from the kids and parents)")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(50);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Aloka &Nilesh Parson");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg50 = driver.findElement(By.xpath(".//*[@id='quote-carousel']/div/div[1]/blockquote/div/div/p[2]"));
         final String text50 = msg50.getText();
         System.out.println(text50);
         cl.setCellValue(text50);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text50.contains("Aloka &Nilesh Parson")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         driver.findElement(By.xpath(".//*[@id='quote-carousel']/ol/li[2]")).click();
         Thread.sleep(1000L);
         rw = sh.createRow(51);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("I have been so pleased with the additional support that Positive Ally provides me. It is great to know that homework packets are being taken care of in the program to free up my time at home for reading and other work. I am also very happy with the variety of extracurricular programs and sports that Positive Ally is introducing to her. It is far more than I could hope to expose her to on my own.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg51 = driver.findElement(By.xpath(".//*[@id='quote-carousel']/div/div[2]/blockquote/div/div/p[1]"));
         final String text51 = msg51.getText();
         System.out.println(text51);
         cl.setCellValue(text51);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text51.contains("I have been so pleased with the additional support that Positive Ally provides me. It is great to know that homework packets are being taken care of in the program to free up my time at home for reading and other work. I am also very happy with the variety of extracurricular programs and sports that Positive Ally is introducing to her. It is far more than I could hope to expose her to on my own.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(52);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Krish Ringenbach");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg52 = driver.findElement(By.xpath(".//*[@id='quote-carousel']/div/div[2]/blockquote/div/div/p[2]"));
         final String text52 = msg52.getText();
         System.out.println(text52);
         cl.setCellValue(text52);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text52.contains("Krish Ringenbach")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         driver.findElement(By.xpath(".//*[@id='quote-carousel']/ol/li[3]")).click();
         Thread.sleep(1000L);
         rw = sh.createRow(53);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("I have to admit that I was nervous about switching Joshua from B&G Club to PA. When I made the decision to switch, I had a bit of anxiety about whether PA will work or not. In retrospect, I think that was one of the best decisions I made. I am glad that PA has worked for Joshua and me so well. Joshua has learned so many new things in the few months that he has been with Positive Ally. When he comes back home from PA, most of his homework is complete and we get more bonding time with him. The teachers are very loving, passionate and proud of the work they do. My wife and I are glad that we made the switch to PA and happy with the results ");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg53 = driver.findElement(By.xpath(".//*[@id='quote-carousel']/div/div[3]/blockquote/div/div/p[1]"));
         final String text53 = msg53.getText();
         System.out.println(text53);
         cl.setCellValue(text53);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text53.contains("I have to admit that I was nervous about switching Joshua from B&G Club to PA. When I made the decision to switch, I had a bit of anxiety about whether PA will work or not. In retrospect, I think that was one of the best decisions I made. I am glad that PA has worked for Joshua and me so well. Joshua has learned so many new things in the few months that he has been with Positive Ally. When he comes back home from PA, most of his homework is complete and we get more bonding time with him. The teachers are very loving, passionate and proud of the work they do. My wife and I are glad that we made the switch to PA and happy with the results ")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(54);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Joe Morris");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg54 = driver.findElement(By.xpath(".//*[@id='quote-carousel']/div/div[3]/blockquote/div/div/p[2]"));
         final String text54 = msg54.getText();
         System.out.println(text54);
         cl.setCellValue(text54);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text54.contains("Joe Morris")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         driver.findElement(By.xpath(".//*[@id='quote-carousel']/ol/li[4]")).click();
         Thread.sleep(1000L);
         rw = sh.createRow(55);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Positive Ally has been phenomenal in helping our son achieve his true potential. With our work lives and associated travel we would not have been in a position to focus on homework and extra curricular activities, the wide spectrum of which, he has so effortlessly enjoyed after school at Positive Ally.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg55 = driver.findElement(By.xpath(".//*[@id='quote-carousel']/div/div[4]/blockquote/div/div/p[1]"));
         final String text55 = msg55.getText();
         System.out.println(text55);
         cl.setCellValue(text55);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text55.contains("Positive Ally has been phenomenal in helping our son achieve his true potential. With our work lives and associated travel we would not have been in a position to focus on homework and extra curricular activities, the wide spectrum of which, he has so effortlessly enjoyed after school at Positive Ally.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         rw = sh.createRow(56);
         cl = rw.createCell(0);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("About Us page Verification");
         cl = rw.createCell(1);
         cl.setCellType(CellType.STRING);
         cl.setCellValue("Positive Ally has been phenomenal in helping our son achieve his true potential. With our work lives and associated travel we would not have been in a position to focus on homework and extra curricular activities, the wide spectrum of which, he has so effortlessly enjoyed after school at Positive Ally.");
         cl = rw.createCell(2);
         cl.setCellType(CellType.STRING);
         final WebElement msg56 = driver.findElement(By.xpath(".//*[@id='quote-carousel']/div/div[4]/blockquote/div/div/p[1]"));
         final String text56 = msg56.getText();
         System.out.println(text56);
         cl.setCellValue(text56);
         cl = rw.createCell(3);
         cl.setCellType(CellType.STRING);
         if (text56.contains("Positive Ally has been phenomenal in helping our son achieve his true potential. With our work lives and associated travel we would not have been in a position to focus on homework and extra curricular activities, the wide spectrum of which, he has so effortlessly enjoyed after school at Positive Ally.")) {
             font4.setColor(IndexedColors.GREEN.getIndex());
             style4.setFont(font4);
             cl.setCellStyle(style4);
             System.out.println("True");
             cl.setCellValue("True");
         }
         else {
             font5.setColor(IndexedColors.RED.getIndex());
             style5.setFont(font5);
             cl.setCellStyle(style5);
             System.out.println("False");
             cl.setCellValue("False");
         }
         wb.write((OutputStream)fos);
         wb.close();
     }
     catch (Exception e) {
         e.printStackTrace();
     }
 }
}
