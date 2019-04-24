package kontrolltoo;

import org.junit.Test;

import junit.framework.Assert;

import static org.junit.Assert.*;
import java.io.File;

public class AppTest {
    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testPathAddressIfExists(){
        File file = new File("C:\\Users\\Student Admin\\Desktop\\text.txt");
        assertTrue(file.exists());
      }
      @Test
    public void testPathAddressIfNotEmpty(){
        File file = new File("C:\\Users\\Student Admin\\Desktop\\text.txt");
        assertTrue(!file.isEmpty());
    }
    @Test(expected=NullPointerException.class)
    public void testConvertToLowerCaseWithNull() {
      this.words_in_array.convertToLowerCase(null);
    }
    @Test
	public void WordsInLowerEqualsWordsInArrayLower() {
		assertEquals(String words_in_lowercase == words_in_array);
    }
    @Test
	public void StringNotNull() {
		assertFalse(this.words_in_array.StringNotNull(null));
    }
    @Test
    public void containsString(){
        assertThat("C:\\Users\\Student Admin\\Desktop\\text.txt", containsString(","));
    }
    @Test
    public void iMoreThanOnce(){
        assertTrue("Error, i'sid ei ole 2 korda", count <= 1);
        assertTrue("I'sid on üle 2 korra",  count  >= 1);
    }
    public void ifIdoesEqual(){
        Assert.assertEqual("Lauses on nii palju i'.", count_i("C:\\Users\\Student Admin\\Desktop\\text.txt"), 2);
    }

    private Object count_i(String string) {
        return null;
    }

    }
    


    


