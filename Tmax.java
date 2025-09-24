import java.util.*;
import java.lang.*;
import java.io.*;

class Tmax
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T-- > 0) {
            int x = s.nextInt(); 
            int y = s.nextInt(); 
            int total = x + y;
            int triplets = total / 3;
            int high = Math.min(y, triplets);
            System.out.println(triplets + high);
}
	}
}
