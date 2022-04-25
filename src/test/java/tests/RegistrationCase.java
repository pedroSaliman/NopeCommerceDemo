package tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.RegistartionPage;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RegistrationCase extends Base{
    HomePage home;
    RegistartionPage reg;
    MyAccountPage acount;
    LoginPage log;
    @Test(dataProvider = "Excel",priority = 1)

    void register(String fname,String lname,String email,String company,String pass,String conpass){
        Log4g.startcase("register");
        home=new HomePage(driver);
      reg=  home.registerclick();
   acount=   reg.enterregister(fname,lname,email,company,pass,conpass);
   acount.logout();
        Log4g.startcase("register");

    }

    @Test(priority = 2,dataProvider = "Login")
    void login(String name,String pass)
    {
        Log4g.startcase("Login");
        home=new HomePage(driver);
   log=home.log();
   log.enterinfo(name,pass);
   acount.logout();
        Log4g.endcase("Login");

    }


///////////////////////////////////////ForLogin/////////////////////////////////////
@DataProvider(name = "Login")
public Object[][] getExcelLogin() throws IOException, IOException {
    DataFormatter format = new DataFormatter();
    String path = "E:\\seleniumprojects\\DemoSelenium\\src\\test\\java\\tests\\LoginCase.xlsx";
    FileInputStream fs = new FileInputStream(path);
    XSSFWorkbook wb = new XSSFWorkbook(fs);
    XSSFSheet sheet = wb.getSheet("sheet1");
    int rowcount = sheet.getPhysicalNumberOfRows();
    XSSFRow row = sheet.getRow(0);
    int colum = row.getLastCellNum();
    Object data[][] = new Object[rowcount - 1][colum];
    for (int i = 0; i < rowcount - 1; i++) {
        row = sheet.getRow(i + 1);
        for (int j = 0; j < colum; j++) {
            XSSFCell cell = row.getCell(j);
            data[i][j] = format.formatCellValue(cell);
        }
    }


    return data;
}








/////////////////////////ForRegister//////////////////////////////////////////////////
    @DataProvider(name = "Excel")
    public Object[][] getExcel() throws IOException, IOException {
        DataFormatter format = new DataFormatter();
        String path = "E:\\seleniumprojects\\DemoSelenium\\src\\test\\java\\tests\\nopecommerceexcel.xlsx";
        FileInputStream fs = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fs);
        XSSFSheet sheet = wb.getSheet("sheet1");
        int rowcount = sheet.getPhysicalNumberOfRows();
        XSSFRow row = sheet.getRow(0);
        int colum = row.getLastCellNum();
        Object data[][] = new Object[rowcount - 1][colum];
        for (int i = 0; i < rowcount - 1; i++) {
            row = sheet.getRow(i + 1);
            for (int j = 0; j < colum; j++) {
                XSSFCell cell = row.getCell(j);
                data[i][j] = format.formatCellValue(cell);
            }
        }


        return data;
    }
}
