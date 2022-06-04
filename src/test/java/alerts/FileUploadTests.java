package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void TestFileUpload(){
        var uploadPage = homePage.clickFileUploadPage();
        uploadPage.uploadFile("C:\\Users\\kegorova\\Desktop\\paw icon.png");
        assertEquals(uploadPage.getUploadedFiles(), "paw icon.png", "Uploaded wrong file!");
    }


}
