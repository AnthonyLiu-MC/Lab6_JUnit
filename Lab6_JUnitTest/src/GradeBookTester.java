import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	GradeBook book1;
	GradeBook book2;

	@BeforeEach
	void setUp() throws Exception {
		
		book1 = new GradeBook(5);
		book2 = new GradeBook(5);
		
		book1.addScore(78.0);
		book1.addScore(56.0);
		book2.addScore(87.0);
		book2.addScore(98.0);
		book2.addScore(45.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		book1 = null;
		book2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue((book1.toString()).equals("78.0 56.0 "));
		assertTrue((book2.toString()).equals("87.0 98.0 45.0 "));
		
		assertEquals(2, book1.getScoreSize());
		assertEquals(3, book2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(134, book1.sum());
		assertEquals(230, book2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(56.0, book1.minimum());
		assertEquals(45.0, book2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(78, book1.finalScore());
		assertEquals(185, book2.finalScore());
	}

}