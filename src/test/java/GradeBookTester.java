//task 2

//Create the Test Class GradebookTester by right clicking on the GradeBook.java, select New, Junit Test Case.
//Using the wizard:
//1.Select the setUp and tearDown method check boxes and click Next.
//2.Select all of the methods of Gradebook, except for the constructor to create tests for. Then click finish.

//and it created this which is very handy

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	// task 3.1, needed to do this otherwise the tearDown method can't see the
	// objects in order to set them to null
	private GradeBook gb1, gb2;

	@BeforeEach
	void setUp() throws Exception {
		// task 3.1
		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		for (int i = 1; i <= 5; ++i) {
			gb1.addScore(i * 10);
			gb2.addScore(i * 10);
		}
	}

	@AfterEach
	void tearDown() throws Exception {
		// task 3.2
		gb1 = gb2 = null;
	}

	@Test
	void testGradeBook() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		// task 4.1
		// 1. addScore
		// Use the toString method to compare the contents of what is in the scores
		// array vs. what is expected to be in the scores array assertTrue( . . .)
		// Compare the scoreSize to the expected number of scores entered, using
		// assertEquals(. . .)
		assertTrue(gb1.toString().equals("10 20 30 40 50"));
		assertEquals(gb1.getScoreSize(), gb2.getScoreSize());
	}

	@Test
	void testSum() {
		// task 4.2
		// sum
		// Compare what is returned by sum() to the expected sum of the scores
		// entered.
		assertEquals(gb1.sum(), 10 + 20 + 30 + 40 + 50);
	}

	@Test
	void testMinimum() {
		// task 4.3
		// minimum
		// Compare what is returned by minimum() to the expected minimum of the scores
		// entered.
		assertEquals(gb1.minimum(), 10);
	}

	@Test
	void testFinalScore() {
		// task 4.4
		// finalScore
		// Compare what is returned by finalScore() to the expected finalScore of the
		// scores entered. The finalScore is the sum of the scores, with the lowest
		// score dropped if there are at least two scores, or 0 if there are no scores.
		assertEquals(gb1.finalScore(), 20 + 30 + 40 + 50);
		// take out the 10 since lowest score is dropped according to assignment page
	}

	// do not need to implement these next 2 according to the assignment,
	// but it would wrong to just leave a failed test case
	@Test
	void testGetScoreSize() {
		assertEquals(gb1.getScoreSize(), 5);
	}

	@Test
	void testToString() {
		assertTrue(gb1.toString().equals("10 20 30 40 50"));

	}

}
