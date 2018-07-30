package Others;

public class ReadExcelDataUsingUtilClass
{
    public static void main(String args[]) throws Exception
    {
    	ExcelReadColName eat = new ExcelReadColName("D:\\TestData.xls");        
        System.out.println(eat.getCellData("Credentials","UserName",2));
        System.out.println(eat.getCellData("Credentials","PassWord",2));
        //System.out.println(eat.getCellData("Credentials","DateCreated",2));
        //System.out.println(eat.getCellData("Credentials","NoOfAttempts",2));
    }
}