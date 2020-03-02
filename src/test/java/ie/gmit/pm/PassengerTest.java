package ie.gmit.pm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {
    @Test
    void testConstructorTitle(){
        Passenger p = new Passenger("Mr","Paulius","DD12345678",1234567890,33);
        assertEquals("Mr",p.getTitle());

    }

    @Test
    void testConstructorName(){
        Passenger p = new Passenger("Mr","Paulius","DD12345678",1234567890,33);
        assertEquals("Paulius",p.getName());

    }

    @Test
    void testConstructorID(){
        Passenger p = new Passenger("Mr","Paulius","DD12345678",1234567890,33);
        assertEquals("DD12345678",p.getPassengerId());

    }

    @Test
    void testConstructorPhone(){
        Passenger p = new Passenger("Mr","Paulius","DD12345678",1234567890,33);
        assertEquals(1234567890,p.getPhone());

    }

    @Test
    void testConstructorAge(){
        Passenger p = new Passenger("Mr","Paulius","DD1312345678",1234567890,33);
        assertEquals(33,p.getAge());

    }

    @Test
    void testConstructorBadTitle(){
        //Passenger p = new Passenger("M","Paulius","DD12345678",1234567890,33);
        assertThrows(IllegalArgumentException.class, ()->
                new Passenger("M","Paulius","DD12345678",1234567890,33));

    }

    @Test
    void testConstructorBadName(){
        //Passenger p = new Passenger("Mr","Pa","DD12345678",1234567890,33);
        assertThrows(IllegalArgumentException.class, ()->
                new Passenger("Mr","Pa","DD12345678",1234567890,33));

    }

    @Test
    void testConstructorBadID(){
        //Passenger p = new Passenger("Mr","Paulius","DD1234",1234567890,33);
        assertThrows(IllegalArgumentException.class, ()->
                new Passenger("Mr","Paulius","DD1234",1234567890,33));

    }

    @Test
    void testConstructorBadPhone(){
        //Passenger p = new Passenger("Mr","Paulius","DD12345678",123,33);
        assertThrows(IllegalArgumentException.class, ()->
                new Passenger("Mr","Paulius","DD12345678",123,33));

    }

    @Test
    void testConstructorBadAge(){
        //Passenger p = new Passenger("Mr","Paulius","DD1312345678",1234567890,10);
        assertThrows(IllegalArgumentException.class, ()->
                new Passenger("Mr","Paulius","DD1312345678",1234567890,10));

    }



}
