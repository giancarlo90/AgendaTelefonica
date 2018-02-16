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
    
    /**
     * Metodo para insertar contactos.
     */
    public void enterNumber(String name, String number){
        contactos.put(name, number);
    }
    
    /**
     * Metodo para devolver contactos por su clave.
     */
    public String lookupNumber(String name){
        return contactos.get(name);
    }
    
    /**
     * Print all keys
     */
    public void printAllNames(){
        System.out.println(contactos.keySet());
    }
}
