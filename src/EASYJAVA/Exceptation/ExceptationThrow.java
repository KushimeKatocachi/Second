package EASYJAVA.Exceptation;

import java.util.HashMap;
import java.util.Map;

public class ExceptationThrow {
    public static void main(String[] args) {
        try {
            getHealthString("Karina");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("I'm still working");
    }

   public static String getHealthString(String name) throws RuntimeException{
       Map<Integer, String> characterHealth = new HashMap<>();
        String health = characterHealth.get(name);
        try {
            return health.toString();
        } catch (Exception e) {
            e.printStackTrace();
                throw new RuntimeException("No character found with name " + name);
        }
    }
}
