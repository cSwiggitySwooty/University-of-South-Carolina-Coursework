import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReviewAPITest {

	ArrayList<Review> reviews = new ArrayList<Review>();
	ReviewAPI revAPI = new ReviewAPI();
	Review r1 = new Review(3, 5, "description1", "renter1");
	Review r2 = new Review(3, 5, "description2", "renter2");
	
	@BeforeEach
	void setup() {
		DataWriter.clearReviews();
		revAPI = new ReviewAPI();
		Review r1 = new Review(3, 5, "description1", "renter1");
		Review r2 = new Review(3, 5, "description2", "renter2");
		revAPI.createReview(r1);
		revAPI.createReview(r2);
		reviews = revAPI.getReviews();
	}
	
	@AfterEach
	void tearDown() {
		DataWriter.clearReviews();
	}
	
	@Test
	void testGetReviews() {
		reviews = revAPI.getReviews();
		assertEquals(2, reviews.size());
	}
	
	@Test
	void testRemoveReviews() {
		revAPI.removeReview(r1);
		reviews = revAPI.getReviews();
		assertEquals(1, reviews.size());
	}
	
	@Test
	void testGetNewReviewID() {
		int newID = revAPI.getNewReviewID();
		assertFalse(DataReader.reviewExists(newID));
	}
	

}
