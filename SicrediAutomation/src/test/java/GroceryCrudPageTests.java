

import org.junit.Test;

import core.BaseTest;
import flows.GroceryCrudPageFlow;


public class GroceryCrudPageTests extends BaseTest{
	/*
	 *This flow navigate through grocerycrud.com
	 *change bootstrap version and perform the input of a new User
	 */
	@Test
		public void GroceryCrudPageFlowAddCustomerTest() {
			GroceryCrudPageFlow crud = new GroceryCrudPageFlow();
			crud.AddCustomerFlow();
		}
	
	/*
	 *This flow navigate through grocerycrud.com
	 *change bootstrap version and perform the input of a new User,
	 *go back to previous page end delete all users with user name
	 *
	 */
	@Test
	public void GroceryCrudPageFlowDeleteCustomerFlow() {
		GroceryCrudPageFlow crud = new GroceryCrudPageFlow();
		crud.AddCustomerFlow();
		crud.DeleteCustomerFlow();
	}
}
