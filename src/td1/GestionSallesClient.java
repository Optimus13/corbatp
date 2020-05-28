package td1;

import java.io.BufferedReader;
import java.io.FileReader;

import org.omg.CORBA.ORB;

public class GestionSallesClient
{

	public static void main(String[] args) throws Exception
	{
		ORB orb = ORB.init(args, null);

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Thomas\\Desktop\\Master_Quarantaine\\Corba\\iorgestionsalles1.txt"));
		String ior = br.readLine();
		br.close();
		
		org.omg.CORBA.Object o = orb.string_to_object(ior);
		
		GestionSalles gs = GestionSallesHelper.narrow(o);
		
		//gs.GestionSalles();

	}

}
