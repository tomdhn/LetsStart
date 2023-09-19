package org.example;

import static org.junit.jupiter.api.Assertions.*;

class StringPorcessorTest {

    @org.junit.jupiter.api.Test
    void appendIfMissing() {
        StringPorcessor stringPorcessor = new StringPorcessor();
        String result = stringPorcessor.appendIfMissing("hallo!","!");
        assertEquals(result, "hallo!");
    }

    @org.junit.jupiter.api.Test
    void appendIfMissingWithoutSuffix() {
        StringPorcessor stringPorcessor = new StringPorcessor();
        String result = stringPorcessor.appendIfMissing("hallo","!");
        assertEquals(result, "hallo!");
    }
}