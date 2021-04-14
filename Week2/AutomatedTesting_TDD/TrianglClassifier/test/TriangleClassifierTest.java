import com.codegym.TriangleClassifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    TriangleClassifier triangleClassifier = new TriangleClassifier();

    @Test
    @DisplayName("2,2,2")
    void TriangleClassifierTest() {
        int firstNumb = 2;
        int secondNumb = 2;
        int thirdNumb = 2;
        String expected = "tam giac thuong";
        String actual = triangleClassifier.classifierTriangle(firstNumb, secondNumb, thirdNumb);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("2,2,3")
    void TriangleClassifierTest1() {
        int firstNumb = 2;
        int secondNumb = 2;
        int thirdNumb = 3;
        String expected = "tam giac thuong";
        String actual = triangleClassifier.classifierTriangle(firstNumb, secondNumb, thirdNumb);
        assertEquals(expected, actual);
    }

}
