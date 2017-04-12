package md;

import java.io.FileReader;
import com.opencsv.CSVReader;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
	public static int max(int a, int b){
		return a > b? a:b;
	}

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Première modification du projet !");
        System.out.println("Test de la fonction max entre 4 et 5 - MAX : " + max(4,5));
        
        System.out.println("OPEN CSV :");
        int monmax=0;
        CSVReader reader = new CSVReader(new FileReader("data.csv"));
        
    }
}
