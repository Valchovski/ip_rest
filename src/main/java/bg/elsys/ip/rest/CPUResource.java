package bg.elsys.ip.rest;

import java.util.List;

import javax.ws.rs.Consumes;
//import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/* Class for handling rqeuests to the host endpoint */
@Path("/cpus")
public class CPUResource {
	/*
	 * GET Request handler for path /cpus
	 * @return Response
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCpus() {
		List<CPU> itemList = ItemList.getInstance().getItemList();
		return Response.ok(itemList).build();
	}
	
	/*
	 * POST Request handler for path /cpus
	 * @return Response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addCpu(CPU cpu) {
		ItemList itemList = ItemList.getInstance();
		List<CPU> temp = itemList.getItemList();
		temp.add(cpu);
		itemList.setItemList(temp);
		return Response.ok(itemList).build();
	}
}