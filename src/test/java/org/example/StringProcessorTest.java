package org.example;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    @org.junit.jupiter.api.Test
    void appendIfMissing() {
        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.appendIfMissing("hallo!","!");
        assertEquals(result, "hallo!");
    }

    @org.junit.jupiter.api.Test
    void appendIfMissingWithoutSuffix() {
        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.appendIfMissing("hallo","!");
        assertEquals(result, "hallo!");
    }
}