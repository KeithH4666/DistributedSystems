package ie.gmit.sw.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;

public class ServiceSetup {
	public static void main(String[] args) throws Exception {
		//System.setSecurityManager(new RMISecurityManager());
		// Set an instance of DatabaseService
		DatabaseService ds = new DatabaseServiceImpl();
		LocateRegistry.createRegistry(1099);
		Naming.rebind("database", ds);
		System.out.println("Server ready.");
	}
}
