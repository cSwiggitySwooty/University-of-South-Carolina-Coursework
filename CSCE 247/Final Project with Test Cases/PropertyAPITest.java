import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyAPITest {

	ArrayList<Property> properties = new ArrayList<Property>();
	PropertyAPI propAPI = new PropertyAPI();
	
	
	@BeforeEach
	void setup() {
		DataWriter.clearProperties();
		propAPI = new PropertyAPI();
		propAPI.createProperty(new Property(1, "property1", "address1", "zip1", "city1", "state1", "description1", 1));
		propAPI.createProperty(new Property(2, "property2", "address2", "zip2", "city2", "state2", "description2", 2));
		properties = propAPI.getProperties();
	}
	
	@AfterEach
	void tearDown() {
		DataWriter.clearProperties();
	}
	
	@Test
	void testGetProperties() {
		properties = propAPI.getProperties();
		assertEquals(2, properties.size());
	}
	
	@Test
	void testCreateProperty() {
		propAPI.createProperty(new Property(3, "property3", "address3", "zip3", "city3", "state3", "description3", 3));
		properties = propAPI.getProperties();
		assertEquals(3, properties.size());
	}
	
	@Test
	void testGetProperty() {
		Property p = propAPI.getProperty(2);
		assertEquals("property2", p.getName());
	}
	
	@Test
	void testGetProperty_NotExists() {
		Property p = propAPI.getProperty(44);
		assertNull(p);
	}
	
	@Test
	void testDeleteProperty_Exists() {
		propAPI.deleteProperty(2);
		properties = propAPI.getProperties();
		assertEquals(1, properties.size());
	}
	
	@Test
	void testDeleteProperty_NotExists() {
		propAPI.deleteProperty(44);
		properties = propAPI.getProperties();
		assertEquals(2, properties.size());
	}

	@Test
	void testGetNewID() {
		int newID = propAPI.getNewPropertyID();
		assertFalse(DataReader.propertyExists(newID));
	}
}
