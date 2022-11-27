package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {

        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainBoundaries() {

        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainBoundariesAbove() {

        int amount = 1001;
        int expected = 999;

        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

}