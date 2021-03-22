import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserInterfaceTest {
	
	UserInterface ui;
	
	@BeforeEach
	void setUp() throws Exception {
		Main.main(null);
		ui = new UserInterface();
	}

	@AfterEach
	void tearDown() throws Exception {
		ui = null;
		DataWriter.clearUsers();
	}
	
	@Test
	public void testUserLogin_ShouldReturnNegOneIfUserNotFound() {
		assertEquals(-1, ui.userLogin("this user does not exists", "password1111111"));
	}

	@Test
	public void testUserLogin_ShouldReturn0ForRenter() {
		Renter rent = new Renter("RenterTest", "Renter", "email", Main.userApi.getNewUserID(), "123-123-1123", "RenterTest", "RenterTest bio", "D555");
		Main.userApi.createRenter(rent);
		assertEquals(0, ui.userLogin(rent.getUsername(), rent.getPassword()));
	}
	
	@Test
	public void testUserLogin_ShouldReturn1ForSeller() {
		Seller seller = new Seller("SellerTest", "TestPass", "email", Main.userApi.getNewUserID(), "999-111-1111", "SellerTest", "Seller bio", new ArrayList<Property>());
		Main.userApi.createSeller(seller);
		assertEquals(1, ui.userLogin(seller.getUsername(), seller.getPassword()));
	}
	
	@Test
	public void testUserLogin_ShouldReturn2ForREA() {
		RealEstateAgent rea = new RealEstateAgent("rea", "rea", "email", Main.userApi.getNewUserID(), "999-999-9999", "rea", "bio", "Good Agency", new ArrayList<Property>());
		Main.userApi.createRE(rea);
		assertEquals(2, ui.userLogin(rea.getUsername(), rea.getPassword()));
	}
	
	@Test
	public void testRemoveListing_ShouldNotBeFoundInDataBaseAfterRemoval() {
		Seller seller = new Seller("SellerTest", "TestPass", "email", Main.userApi.getNewUserID(), "999-111-1111", "SellerTest", "Seller bio", new ArrayList<Property>());
		Property listing = new Property(seller.getUserID(), "TestProp", "Address", "222", "Columbia", "SC", "Yes");
		Main.propertyApi.createProperty(listing);
		ui.removeListing(listing.getID());
		assertFalse(DataReader.propertyExists(listing.getID()));
	}
	
	@Test
	public void testAddToFavorites_PropertyShouldBeInRentersFavorites() {
		Renter rent = new Renter("RenterTest", "Renter", "email", Main.userApi.getNewUserID(), "123-123-1123", "RenterTest", "RenterTest bio", "D555");
		Seller seller = new Seller("SellerTest", "TestPass", "email", Main.userApi.getNewUserID(), "999-111-1111", "SellerTest", "Seller bio", new ArrayList<Property>());
		Property prop = new Property(seller.getUserID(), "TestProp", "Address", "222", "Columbia", "SC", "Yes");
		Main.renter = rent;
		Main.propertyApi.createProperty(prop);
		ui.addToFavorites(prop.getID());
		boolean isfound = false;
		for (Property prop2 : Main.renter.getFavorites()) {
			if (prop2.equals(prop)) {
				isfound = true;
				break;
			}
		}
		assertTrue(isfound);
	}
	
	@Test
	public void testRemoveFavorite_FavoriteShouldBeRemovedFromTheUser() {
		Renter rent = new Renter("RenterTest", "Renter", "email", Main.userApi.getNewUserID(), "123-123-1123", "RenterTest", "RenterTest bio", "D555");
		Main.renter = rent;
		Main.userApi.createRenter(rent);
		Seller seller = new Seller("SellerTest", "TestPass", "email", Main.userApi.getNewUserID(), "999-111-1111", "SellerTest", "Seller bio", new ArrayList<Property>());
		Property prop = new Property(seller.getUserID(), "TestProp", "Address", "222", "Columbia", "SC", "Yes");
		ui.addToFavorites(prop.getID());
		ui.removeFavorite(prop.getID());
		boolean isfound = false;
		for (Property listing : Main.renter.getFavorites()) {
			if (listing.equals(prop)) {
				isfound = true;
				break;
			}
		}
		assertFalse(isfound);
	}
	
	@Test
	public void testSearch_LookingForCorrectSizeOutput() {
		Seller seller = new Seller("SellerTest", "TestPass", "email", Main.userApi.getNewUserID(), "999-111-1111", "SellerTest", "Seller bio", new ArrayList<Property>());
		Property prop = new Property(seller.getUserID(), "TestProp", "Address", "222", "Columbia", "SC", "Yes");
		Property prop2 = new Property(seller.getUserID(), "TestProp2", "Address2", "222", "Columbia", "SC", "Yes");
		Room room1 = new Room(Main.roomApi.getNewRoomID(), 1, 1, 1, "good", new ArrayList<String>(), new ArrayList<String>(), PropertyType.APARTMENT, true, false, 300);
		Room room2 = new Room(Main.roomApi.getNewRoomID(), 1, 1, 1, "good", new ArrayList<String>(), new ArrayList<String>(), PropertyType.APARTMENT, true, false, 300);
		Main.propertyApi.createProperty(prop);
		Main.propertyApi.createProperty(prop2);
		ArrayList<Property> check = ui.search(1, -1, PropertyType.APARTMENT, new ArrayList<String>(), -1);
		assertEquals(2, check.size());
	}
	
	@Test
	public void testSearch_LookingForPropertiesWithCorrectPrice() {
		Seller seller = new Seller("SellerTest", "TestPass", "email", Main.userApi.getNewUserID(), "999-111-1111", "SellerTest", "Seller bio", new ArrayList<Property>());
		Property prop = new Property(seller.getUserID(), "TestProp", "Address", "222", "Columbia", "SC", "Yes");
		Property prop2 = new Property(seller.getUserID(), "TestProp2", "Address2", "222", "Columbia", "SC", "Yes");
		Room room1 = new Room(Main.roomApi.getNewRoomID(), 1, 1, 1, "good", new ArrayList<String>(), new ArrayList<String>(), PropertyType.APARTMENT, true, false, 300);
		Room room2 = new Room(Main.roomApi.getNewRoomID(), 1, 1, 1, "good", new ArrayList<String>(), new ArrayList<String>(), PropertyType.APARTMENT, true, false, 600);
		Main.propertyApi.createProperty(prop);
		Main.propertyApi.createProperty(prop2);
		ArrayList<Property> check = ui.search(1, -1, PropertyType.APARTMENT, new ArrayList<String>(), 350);
		assertEquals(1, check.size());
	}

}
