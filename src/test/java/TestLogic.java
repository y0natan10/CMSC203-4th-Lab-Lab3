import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestLogic {

	@Test
	void testBasicAddition() {
		// This test checks if JUnit 5 is correctly linked to the project's build path.
		assertEquals(10, 5 + 5, "JUnit 5 should be correctly linked.");
	}
}