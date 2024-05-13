package web.service;

import org.junit.Assert;
import org.junit.Test;

public class LoginTest {

    @Test
    public void testValidLogin() {
        Assert.assertTrue(LoginService.login("ahsan", "ahsan_pass", "1997-12-10"));
    }

    @Test
    public void testNullUsernamecorrectpassworddob() {
        Assert.assertFalse(LoginService.login(null, "ahsan_pass", "1997-12-10"));
    }

    @Test
    public void testNullPasswordcorrectusernamedob() {
        Assert.assertFalse(LoginService.login("ahsan", null, "1997-12-10"));
    }

    @Test
    public void testNullDOBcorrectusernamepassword() {
        Assert.assertFalse(LoginService.login("ahsan", "ahsan_pass", null));
    }
    
    @Test
    public void testNullusernamepassworddob() {
        Assert.assertFalse(LoginService.login(null, null, null));
    }
    
    @Test
    public void testWrongUsernamePasswordAndDOB() {
        Assert.assertFalse(LoginService.login("abc", "abc_123", "1998-11-11"));
    }
    
    @Test
    public void testCorrectUsernameWrongPasswordAndDOB() {
    	Assert.assertFalse(LoginService.login("ahsan", "abc_123", "1998-11-11"));
    }
    
    @Test
    public void testWrongUsernameCorrectPasswordAndDOB() {
        Assert.assertFalse(LoginService.login("abc", "ahsan_pass", "1997-12-10"));
    }
    
    @Test
    public void testWrongUsernamePasswordAndCorrectDOB() {
        Assert.assertFalse(LoginService.login("abc", "abc_123", "1997-12-10"));
    }
    
    @Test
    public void testCorrectUsernamePasswordAndWrongDOB() {
        Assert.assertFalse(LoginService.login("ahsan", "ahsan_pass", "1998-11-11"));
    }
    
    @Test
    public void testCorrectUsernameWrongPasswordAndCorrectDOB() {
        Assert.assertFalse(LoginService.login("ahsan", "abc_123", "1997-12-10"));
    }

    @Test
    public void testWrongusernamewrongpasswordcorrectdob() {
        Assert.assertFalse(LoginService.login("abc", "abc_123", "1997-12-10"));
    }

    

}
