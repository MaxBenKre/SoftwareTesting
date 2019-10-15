package de.uni_passau.fim.se2.junit5_intro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class LiftTest {

    private Lift lift;
    private Lift biggerLift;

    @BeforeEach
    void init(){
        lift = new Lift(5);
        biggerLift = new Lift(10, 10);
    }

    @Test
    void testGetFloor(){
        assertEquals(5, lift.getTopFloor());
    }

    @Test
    void testgetCurrentFloor(){
        assertEquals(0, lift.getCurrentFloor());
    }

    @Test
    void testGetCapacity(){
        assertEquals(10, biggerLift.getCapacity());
    }

    @Test
    void testGetRiders(){
        assertEquals(0, lift.getNumRiders());
    }

    @Test
    void testGoUpAndDown(){
        lift.goUp();
        lift.goUp();
        lift.goDown();
        assertEquals(1, lift.getCurrentFloor());
    }

    @Test
    void testIsFull(){
        assertFalse(lift.isFull());
    }

    @Test
    void testAddRiders(){
        assertAll("Riders",
                () -> lift.addRiders(1),
                () -> assertEquals(1, lift.getNumRiders()),
                () -> lift.addRiders(20),
                () -> assertEquals(10, lift.getNumRiders()));
    }

    @Test
    void testCall(){
        assertAll("Riders",
                () -> lift.call(4),
                () -> assertEquals(4, lift.getCurrentFloor()),
                () -> lift.call(1),
                () -> assertEquals(1, lift.getCurrentFloor()));
    }

}