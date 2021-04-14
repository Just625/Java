import com.codegym.TriangleClassifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    TriangleClassifier triangleClassifier = new TriangleClassifier();

    @Test
    void TriangleClassifierTest() {
        int firstNumb = 2;
        int secondNumb = 2;
        int thirdNumb = 2;
        String expected = "Tam giac can";
        String actual = triangleClassifier.classifierTriangle(firstNumb,secondNumb,thirdNumb);
        assertEquals(expected, actual);
    }
}
