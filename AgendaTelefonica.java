import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    // instance variables - replace the example below with your own
    HashMap<String, String> contactos;

    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        contactos = new HashMap<>();
    }

    public void enterNumber(String name, String number){
        contactos.put(name, number);
    }

    public String lookupNumber(String name){
        String aDevolver = contactos.get(name);
        return aDevolver;
    }
}
