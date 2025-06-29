package excel.utility;

import org.testng.annotations.Test;

public class TestExcelWriter {
	
	@Test
	public void loginTest() {
	    // ... Selenium login steps ...
	    
	    boolean status = true; // or false based on actual test result

	    if (status) {
	        ExcelWriterUtil.writeData("E:\\AutomationProject\\AutomationProject\\ExcelFile\\testdata.xlsx", "Sheet1", 8, 2, "PASS");
	    } else {
	        ExcelWriterUtil.writeData("E:\\AutomationProject\\AutomationProject\\ExcelFile\\testdata.xlsx", "Sheet1", 8, 2, "FAIL");
	    }
	}

}
