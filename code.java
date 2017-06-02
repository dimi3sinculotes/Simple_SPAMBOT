// your package

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

// your class{

  public static void main(String[] args) throws AWTException {
        Robot r = new Robot();
        Scanner s = new Scanner(System.in);

        String cntnt = s.nextLine();
        String[] ac = cntnt.split("");

        r.delay(3000);
        for (int i = 0; i < ac.length; i++) {
            r.delay(100);
            if (ac[i].equals(" ")) {
                r.keyPress(KeyEvent.VK_SHIFT);
                r.keyPress(KeyEvent.VK_MINUS);
                r.keyRelease(KeyEvent.VK_MINUS);
                r.keyRelease(KeyEvent.VK_SHIFT);
            } else {
                int kcode = KeyEvent.getExtendedKeyCodeForChar(ac[i].charAt(0));
                r.keyPress(kcode);
                r.keyRelease(kcode);
            }

            r.delay(100);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
        }
    }

// } class
