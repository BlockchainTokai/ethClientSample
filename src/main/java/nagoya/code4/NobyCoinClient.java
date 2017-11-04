package nagoya.code4;

import java.io.IOException;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.admin.Admin;
import org.web3j.protocol.admin.methods.response.PersonalListAccounts;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

/**
 * 
 * @author kouichi
 *
 */
public class NobyCoinClient {

	/**
	 * @throws IOException 
	 * 
	 */
	public String accessEthe() throws IOException {

		Web3j web3 = Web3j.build(new HttpService());
		
		Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().send();
		
		String clientVersion = web3ClientVersion.getWeb3ClientVersion();
		
		return clientVersion;
		
		
	}
	
	public String accessAsAdminClient() throws IOException {

		Admin admin= Admin.build(new HttpService());
		
		
		Request<?, PersonalListAccounts>  pa = admin.personalListAccounts();
		
		
		//リクエスト情報
		StringBuffer js = new StringBuffer();
		
		js.append(pa.getJsonrpc());
		js.append("\n");
		
		
		js.append("ID \t");
		js.append(pa.getId());
		js.append("\n");

		js.append("Params \t");

		js.append(pa.getParams());
		
		js.append("\n");
		
		
		
		for(String id : pa.send().getAccountIds()){
			
			System.out.println("id " + id );
			
			
		};
		
		
		
		return js.toString();
		
		
	}

}
