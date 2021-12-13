package Zadacha1;
import java.util.HashMap;
import java.util.Map;

public class GlavnaPrograma {

    public static void main(String[] args) {

        Map<String,String> rechnik = new HashMap<String,String>();
        rechnik.put("book", "kniga");
        rechnik.put("coffee", "kafe");
        rechnik.put("tea", "chaj");
        rechnik.put("water", "voda");
        rechnik.put("hi", "zdravo");

        System.out.println("Kluchevi se: "+rechnik.keySet());
        System.out.println("Vrednosti se: "+rechnik.values());

        for(Map.Entry<String,String> entry : rechnik.entrySet()){
            System.out.println(entry.getKey()+" | "+entry.getValue());
        }

        if(rechnik.containsKey("hi"))
            System.out.println("Vrednosta odnosno prevodot za zborot 'hi' na makedonski e :" + rechnik.get("hi"));
        else
            System.out.println("Zborot 'hi' ne postoi.");
    }
}
