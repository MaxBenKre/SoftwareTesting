package de.uni_passau.fim.se2.junit5_intro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class MiniMathTest {

    private MiniMath miniMath;

    @BeforeEach
    void init(){
        miniMath = new MiniMath();
    }

    @Test
    void testMin(){
        assertAll("min",
                () -> assertEquals(10, miniMath.min(10, 20)),
                () -> assertEquals(10, miniMath.min(20, 10)));

    }

    @Test
    void testMax(){
        assertAll("max",
                () -> assertEquals(20, miniMath.max(10, 20)),
                () -> assertEquals(20, miniMath.max(20, 10)));

    }

    @Test
    void testAbs(){
        assertAll("abs",
                () -> assertEquals(20, miniMath.abs(-20)),
                () -> assertEquals(20, miniMath.abs(20)));

    }

    @Test
    void testFloor(){
        assertAll("floor",
                () -> assertEquals(20, miniMath.floorDivision(200, 10)),
                () -> assertThrows(IllegalArgumentException.class,
                        () -> miniMath.floorDivision(200, 0)));

    }

}