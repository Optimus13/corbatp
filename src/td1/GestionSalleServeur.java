package td1;

import java.io.PrintWriter;

import org.omg.CORBA.ORB;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

public class GestionSalleServeur {

	public static void main(String[] args) throws Exception
	{
		ORB orb = ORB.init(args, null);
		POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
		
		GestionSallesImpl impl = new GestionSallesImpl();
		
		byte[] id = rootPOA.activate_object(impl);
		org.omg.CORBA.Object ref = rootPOA.id_to_reference(id);
		
		String ior = orb.object_to_string(ref);
		System.out.println(ior);
		
		PrintWriter file = new PrintWriter("C:\\Users\\Thomas\\Desktop\\Master_Quarantaine\\Corba\\iorgestionsalles1.txt");
		file.println(ior);
		file.close();
		
		rootPOA.the_POAManager().activate();
		orb.run();
	}

}
