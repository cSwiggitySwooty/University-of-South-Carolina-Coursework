import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RoomAPITest {

	ArrayList<Room> rooms = new ArrayList<Room>();
	RoomAPI roomAPI = new RoomAPI();
	Room r1 = new Room(1, 1, 1, 1, "condition1", new ArrayList<String>(), new ArrayList<String>(), PropertyType.APARTMENT, false, false, 111);
	Room r2 = new Room(2, 2, 2, 2, "condition2", new ArrayList<String>(), new ArrayList<String>(), PropertyType.CONDO, true, true, 222);
	
	@BeforeEach
	void setup() {
		DataWriter.clearRooms();
		roomAPI = new RoomAPI();
		roomAPI.createRoom(r1);
		roomAPI.createRoom(r2);
		rooms = roomAPI.getRooms();
	}
	
	@AfterEach
	void tearDown() {
		DataWriter.clearRooms();
	}
	
	@Test
	void testGetRooms() {
		rooms = roomAPI.getRooms();
		assertEquals(2, rooms.size());
	}
	
	@Test
	void testRemoveRoom() {
		roomAPI.removeRoom(r1.getRoomID());
		rooms = roomAPI.getRooms();
		assertEquals(1, rooms.size());
	}
	
	@Test
	void testGetNewRoomID() {
		int newID = roomAPI.getNewRoomID();
		assertFalse(DataReader.roomExists(newID));
	}

}
