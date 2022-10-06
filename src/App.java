import javax.sound.midi.SysexMessage;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        String s = "i live in a house";
        String sArray[] = s.split(" ");

        for(int i = 0; i<sArray.length; i++) {
            System.out.println(sArray[i]);
        }
    }
}
