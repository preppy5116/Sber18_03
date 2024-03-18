import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    String str = "1 sgs / 2 3 5";

    @org.junit.jupiter.api.Test
    void squareString() {
        for (int i = 0; i < 1000; i++) {
            String result = Main.squareString(str);
            assertEquals("1 4 9 25", result);
        }
    }

    @org.junit.jupiter.api.Test
    void squareString2() {
        for (int i = 0; i < 1000; i++) {
            String result = Main.squareString2(str);
            assertEquals("1 4 9 25", result);
        }
    }

    @Test
    void SquareString3() {
        for (int i = 0; i < 1000; i++) {
            String result = Main.squareString3(str);
            assertEquals("1 4 9 25", result);
        }
    }
}