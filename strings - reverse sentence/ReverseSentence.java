import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * @author Latif Fetahaj
 * @version 1.0
 *
 * Time Complexity - O(n)
 * Space Complexity - O(n^2)
 */
public class ReverseSentence {

    public ReverseSentence() {

    }

    public String reverseSentence(String s) {
        //tokenize the string with a space delimiter
        String[] tokens = s.split(" ");
        String result = "";

        int index = tokens.length - 1;
        while(index >= 0) {

            //since in Java strings are immutable, in each iteration a new string will be created
            if(index == 0) {
                result = result.concat(tokens[index]);
            }
            else {
                result = result.concat(tokens[index] + " ");
            }
            index--;
        }

        return result;
    }

    @Test
    public void testReverseOneWord() {
        assertEquals("house java", reverseSentence("java house"));
    }

}
