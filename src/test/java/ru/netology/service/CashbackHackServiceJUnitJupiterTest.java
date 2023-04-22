package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CashbackHackServiceJUnitJupiterTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldLeaveTheRemainder1() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldLeaveTheRemainder2() {
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldLeaveTheRemainder3() {
        int actual = service.remain(500);
        int expected = 500;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldLeaveTheRemainder4() {
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldLeaveTheRemainder5() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }
}


