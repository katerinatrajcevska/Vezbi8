package Zadacha2;

import java.util.HashMap;
import java.util.Map;

public class Rechnik {
    Map<String, String> rechnik = new HashMap<String, String>();

    public void vnesiMapa() {
        rechnik.put("Book", "Kniga");
        rechnik.put("Coffee", "Kafe");
        rechnik.put("Tea", "Chaj");
        rechnik.put("Water", "Voda");
    }

    public void translate (String s) {
        if (rechnik.containsKey(s))
        {
            System.out.println(rechnik.get(s));
        }
        else
            System.out.println("Takov zbor vo rechnikot ne postoi.");
    }
}

