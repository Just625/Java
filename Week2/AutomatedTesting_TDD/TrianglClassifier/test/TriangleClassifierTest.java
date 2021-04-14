import com.codegym.TriangleClassifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    public static final String TAM_GIAC_DEU = "tam giac deu";
    public static final String TAM_GIAC_CAN = "tam giac can";
    public static final String TAM_GIAC_THUONG = "tam giac thuong";
    public static final String KHONG_PHAI_LA_TAM_GIAC = "khong phai la tam giac";
    TriangleClassifier triangleClassifier = new TriangleClassifier();

    @Test
    @DisplayName("2,2,2")
    void TriangleClassifierTest() {
        int firstNumb = 2;
        int secondNumb = 2;
        int thirdNumb = 2;
        String expected = TAM_GIAC_DEU;
        String actual = triangleClassifier.classifierTriangle(firstNumb, secondNumb, thirdNumb);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("2,2,3")
    void TriangleClassifierTest1() {
        int firstNumb = 2;
        int secondNumb = 2;
        int thirdNumb = 3;
        String expected = TAM_GIAC_CAN;
        String actual = triangleClassifier.classifierTriangle(firstNumb, secondNumb, thirdNumb);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("3,4,5")
    void TriangleClassifierTest2() {
        int firstNumb = 3;
        int secondNumb = 4;
        int thirdNumb = 5;
        String expected = TAM_GIAC_THUONG;
        String actual = triangleClassifier.classifierTriangle(firstNumb, secondNumb, thirdNumb);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("8,2,3")
    void TriangleClassifierTest3() {
        int firstNumb = 8;
        int secondNumb = 2;
        int thirdNumb = 3;
        String expected = KHONG_PHAI_LA_TAM_GIAC;
        String actual = triangleClassifier.classifierTriangle(firstNumb, secondNumb, thirdNumb);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("-1,2,1")
    void TriangleClassifierTest4() {
        int firstNumb = -1;
        int secondNumb = 2;
        int thirdNumb = 1;
        String expected =KHONG_PHAI_LA_TAM_GIAC;
        String actual = triangleClassifier.classifierTriangle(firstNumb, secondNumb, thirdNumb);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("0,1,1")
    void TriangleClassifierTest5() {
        int firstNumb = 0;
        int secondNumb = 1;
        int thirdNumb = 1;
        String expected = KHONG_PHAI_LA_TAM_GIAC;
        String actual = triangleClassifier.classifierTriangle(firstNumb, secondNumb, thirdNumb);
        assertEquals(expected, actual);
    }

}
