package test.ma.tinyurl.core;

import ma.tinyurl.core.TinyUrl;
import junit.framework.TestCase;
import ma.tinyurl.exceptions.UrlNotFoundException;

public class TinyUrlTest extends TestCase {

    TinyUrl testUrl = new TinyUrl();

    public void testEncode() {
        String actualUrl = "http://git-extensions-documentation.readthedocs.io/en/latest/getting_started.html";
        String expectUrl = "www.tinyurl.ma/3e5728a6";
        String result = testUrl.encode(actualUrl);
        assertEquals(expectUrl, result);
    }

    public void testDecode() throws UrlNotFoundException {
        String url = "http://git-extensions-documentation.readthedocs.io/en/latest/getting_started.html";
        String result = testUrl.decode(testUrl.encode(url));
        assertEquals(url, result);
    }

    public void testExceptionDecode() {
        String expectedMessage = "Your tiny url is not found";
        String url = "www.tinyurl.ma/testexception";
        try{
            testUrl.decode(url);
            fail("Exception not thrown");
        }catch (UrlNotFoundException e){
            assertEquals(expectedMessage, e.getMessage());
        }
    }
}