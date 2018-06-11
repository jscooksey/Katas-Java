import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreedTest {
    private Greed game = new Greed();

    @Test
    void test_score() {
        int[] dice = new int[]{1,2,3,4,5,6};

        assertEquals(100,game.score(dice));
    }
}