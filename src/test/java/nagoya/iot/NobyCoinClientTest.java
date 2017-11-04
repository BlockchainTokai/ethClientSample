package nagoya.iot;

import java.io.IOException;

import junit.framework.TestCase;
import nagoya.iot.NobyCoinClient;

public class NobyCoinClientTest extends TestCase {

	public void testAccessEthe() throws IOException {
		
		
		NobyCoinClient nc = new NobyCoinClient();
		String s =nc.accessEthe();
		
		System.out.println(s);
	}
	
	public void testAccessManageAccount() throws IOException {
		
		
		NobyCoinClient nc = new NobyCoinClient();
		String s =nc.accessAsAdminClient();
		
		System.out.println(s);
	}

}