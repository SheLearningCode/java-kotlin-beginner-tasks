package chapter1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ISINAlgorithmJavaTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/isin_test_values.csv", numLinesToSkip = 1)
    public void isinAlgorithmTest(String expected, String isin) {
        assertEquals(Integer.parseInt(expected), org.example.Algorithms.ISINAlg.algorithm(isin));
    }
}
