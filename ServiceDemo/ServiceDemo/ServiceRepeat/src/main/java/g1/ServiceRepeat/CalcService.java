package g1.ServiceRepeat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public class CalcService {

	 @GET 
	    @Path("/sum/{a}/{b}")
	    @Produces(MediaType.APPLICATION_JSON)
	  public String sum(@PathParam("a") int a, @PathParam("b") int b) {
		 String result = "";
	        int c=a+b;
	        result +=c;
	        return result;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
	public int mult(int a,int b) {
		return a*b;
	}
}
