

import org.junit.Test;

import core.BaseTest;
import flows.GroceryCrudPageFlow;


public class GroceryCrudPageTests extends BaseTest{

	
	/*test NO 1
	 *This flow navigate through grocerycrud.com
	 *change bootstrap version and perform the input of a new User
	 */
	@Test
		public void GroceryCrudPageFlowInsertNewCustomerTest() {
			GroceryCrudPageFlow crud = new GroceryCrudPageFlow();
			crud.AddCustomerFlow();
		}
	
	/*test NO 2
	 *This flow navigate through grocerycrud.com
	 *change bootstrap version and perform the input of a new User,
	 *go back to previous page end delete all users with user name
	 *NOTE: if there's more than 1 record in search results, this test will fail on deletion assert
	 */
	@Test
	public void GroceryCrudPageFlowDeleteCustomerTest() {
		GroceryCrudPageFlow crud = new GroceryCrudPageFlow();
		crud.AddCustomerFlow();
		crud.DeleteCustomerFlow();
	}	
}
