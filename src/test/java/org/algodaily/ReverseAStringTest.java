package org.algodaily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAStringTest {
    ReverseAString sut = new ReverseAString();

    @Test
    public void firstTest() {
        assertEquals(sut.reverseString("timbuktu12"), "21utkubmit");
    }

    @Test
    public void secondTest() {
        assertEquals(
                sut.reverseString("njnschnjkdasn j32 uida"),
                "adiu 23j nsadkjnhcsnjn"
        );
    }

    @Test
    public void thirdTest() {
        assertEquals(
                sut.reverseString("njnschnjkdasn j32 uida"),
                "adiu 23j nsadkjnhcsnjn"
        );
    }

    @Test
    public void fourthTest() {
        assertEquals(sut.reverseString("timbuktu12"), "21utkubmit");
    }

    @Test
    public void fifthTest() {
        assertEquals(sut.reverseString(""), "");
    }

    @Test
    public void sixthTest() {
        assertEquals(sut.reverseString("reverseastring"), "gnirtsaesrever");
    }

}