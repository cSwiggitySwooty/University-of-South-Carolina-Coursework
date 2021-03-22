import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserAPITest {

	UserAPI userAPI = new UserAPI();
	ArrayList<User> users = new ArrayList<User>();
	RealEstateAgent re = new RealEstateAgent("agent1", "password1", "agent1@email.com", 1, "123-456-7890", "Agent Smith", "Bio of agent", "Some Agency", new ArrayList<Property>());
	Renter r = new Renter("renter1", "password3", "renter1@email.com", 3, "123-456-7890", "Renter Jill", "Bio of renter", "A1232456");
	
	@BeforeEach
	void setup() {
		DataWriter.clearUsers();
		userAPI = new UserAPI();
		userAPI.createRenter(r);
		userAPI.createRE(re);
		userAPI.createSeller(new Seller("seller1", "password2", "seller1@email.com", 2, "123-456-7890", "Seller Bob", "Bio of seller", new ArrayList<Property>()));
		Renter rs = new Renter("renter 2", "password4", "renter2@email.com", 4, "123-456-7890", "Renter Seller Joey", "Bio of renterSeller", "A5649874");
		userAPI.createRenter(new Renter("renter 2", "password4", "renter2@email.com", 4, "123-456-7890", "Renter Seller Joey", "Bio of renterSeller", "A5649874", true, new Seller(rs)));
	}
	
	@AfterEach
	void tearDown() {
		DataWriter.clearUsers();
	}
	
	@Test
	void testLoginRenter() {
		int login = userAPI.userLogin("renter1", "password3");
		assertEquals(0, login);
	}
	
	@Test
	void testLoginSeller() {
		int login = userAPI.userLogin("seller1", "password2");
		assertEquals(1, login);
	}
	
	@Test
	void testLoginRealEstateAgent() {
		int login = userAPI.userLogin("agent1", "password1");
		assertEquals(2, login);
	}
	
	@Test
	void testLoginFailure() {
		int login = userAPI.userLogin("badusername", "badpassword");
		assertEquals(-1, login);
	}
	
	@Test
	void testLogout_Pass() {
		userAPI.userLogin("agent1", "password1");
		assertTrue(userAPI.logoutUser(re));
	}
	
	@Test
	void testLogout_Fail() {
		userAPI.userLogin("agent1", "password1");
		assertFalse(userAPI.logoutUser(r));
	}
	
	@Test
	void testLoggedOn_Pass() {
		userAPI.userLogin("agent1", "password1");
		assertTrue(userAPI.isLoggedIn(re));
	}
	
	@Test
	void testLoggedOn_Fail() {
		userAPI.userLogin("agent1", "password1");
		assertFalse(userAPI.isLoggedIn(r));
	}
	
	@Test
	void testGetUser_Exists() {
		User u = UserAPI.getUser(1);
		assertEquals("agent1", u.getUsername());
	}
	
	@Test
	void testGetUser_NotExists() {
		assertNull(UserAPI.getUser(44));
	}
	
	@Test
	void testDeleteUser_Exists() {
		userAPI.deleteUser(1);
		users = userAPI.getUsers();
		assertEquals(3, users.size());
	}
	
	@Test
	void testDeleteUser_NotExists() {
		userAPI.deleteUser(44);
		users = userAPI.getUsers();
		assertEquals(4, users.size());
	}

}
