
package rekursja;
/**
 *
 * @author Mateusz
 */
import java.io.*;

class silnia1
{
    public long silnia(int liczba)
    {
        long zwrot = 1;
        if (liczba >= 2)
        {
            zwrot = liczba*silnia(liczba-1);
        }
        return zwrot;
    }
}

public class Rekursja 
{
     
    public static void main(String[] args)
            throws IOException
    {
        int i, n;
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        silnia1 s = new silnia1();
        
        System.out.println("Obliczanie silni dla liczby całkowietej.");
        System.out.println("Podaj n.");
        
        n = Integer.parseInt(br.readLine());
        
        for (i =1; i<=n; i++)
        {
            System.out.println(i+ " ! = "+ s.silnia(i));
        }
        
        
    }
    
}
