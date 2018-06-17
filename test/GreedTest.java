
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GreedTest {
    private Greed game = new Greed();

    @Test
    void score_NoDice() {
        int[] dice = new int[]{};
        assertEquals(0,game.score(dice));
    }

    @Test
    void score_One1() {
        int[] dice1 = new int[]{1,2,2,3,3,4};
        assertEquals(100,game.score(dice1));
        int[] dice2 = new int[]{1};
        assertEquals(100,game.score(dice2));
    }

    @Test
    void score_One5() {
        int[] dice1 = new int[]{5,2,2,3,3,4};
        assertEquals(50,game.score(dice1));
        int[] dice2 = new int[]{5};
        assertEquals(50,game.score(dice2));
    }

    @Test
    void score_Three1() {
        int[] dice1 = new int[]{1,2,1,3,1,4};
        assertEquals(1000,game.score(dice1));
        int[] dice2 = new int[]{1,1,1};
        assertEquals(1000,game.score(dice2));

    }

    @Test
    void score_Three2() {
        int[] dice1 = new int[]{3,2,2,3,2,4};
        assertEquals(200,game.score(dice1));
        int[] dice2 = new int[]{2,2,2};
        assertEquals(200,game.score(dice2));

    }

    @Test
    void score_Three3() {
        int[] dice1 = new int[]{3,3,6,3,2,4};
        assertEquals(300,game.score(dice1));
        int[] dice2 = new int[]{3,3,3};
        assertEquals(300,game.score(dice2));
    }

    @Test
    void score_Three4() {
        int[] dice1 = new int[]{4,3,6,4,2,4};
        assertEquals(400,game.score(dice1));
        int[] dice2 = new int[]{4,4,4};
        assertEquals(400,game.score(dice2));
    }

    @Test
    void score_Three5() {
        int[] dice1 = new int[]{5,3,5,5,2,4};
        assertEquals(500,game.score(dice1));
        int[] dice2 = new int[]{5,5,5};
        assertEquals(500,game.score(dice2));
    }

    @Test
    void score_Three6() {
        int[] dice1 = new int[]{6,3,6,6,2,4};
        assertEquals(600,game.score(dice1));
        int[] dice2 = new int[]{6,6,6};
        assertEquals(600,game.score(dice2));
    }


}
