import java.util.Random;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class Task1Test {
    Random random = new Random();

    @BeforeEach
    void beforeTest() {
        System.out.println("========================Test method start");
    }

    @AfterEach
    void afterTest() {
        System.out.println("Test method end");
        System.out.println("========================");
    }

    @Test
    void isEvenTest() {
        int number = random.nextInt(100) + 1;
        System.out.println("Число: " + number);
        System.out.println("Результат: " + BasicJava.isEven(number));
    }

    @RepeatedTest(20)
    void checkAccessTest() {
        int age = random.nextInt(100);
        System.out.println("Возраст: " + age);
        System.out.println("Результат: " + BasicJava.checkAccess(age));
    }

    @ParameterizedTest
    @MethodSource("randomScores")
    void getGradeTest(int score) {
        System.out.println("Баллы: " + score);
        System.out.println("Оценка: " + BasicJava.getGrade(score));
    }

    static Integer[] randomScores() {
        Random random = new Random();
        Integer[] scores = new Integer[10];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = random.nextInt(101);
        }
        return scores;
    }
}
