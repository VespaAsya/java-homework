import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BasicJavaTest {
    Random random = new Random();

    // Четыре обычных теста.
    @Test
    void isEvenTest() {
        int number = random.nextInt(100) + 1;
        boolean result = BasicJava.isEven(number);
        boolean expected = number % 2 == 0;
        if (result == expected) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    @Test
    void checkAccessTest() {
        int age = random.nextInt(100);
        String result = BasicJava.checkAccess(age);
        String expected;
        if (age > 18) {
            expected = "Allowed";
        } else {
            expected = "Denied";
        }
        if (result.equals(expected)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    @Test
    void isPositiveTest() {
        int number = random.nextInt(201) - 100;
        boolean result = BasicJava.isPositive(number);
        boolean expected = number >= 0;
        if (result == expected) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    @Test
    void getGradeTest() {
        int score = random.nextInt(101);
        String result = BasicJava.getGrade(score);
        String expected;
        if (score <= 20) {
            expected = "E";
        } else if (score <= 40) {
            expected = "D";
        } else if (score <= 60) {
            expected = "C";
        } else if (score <= 80) {
            expected = "B";
        } else {
            expected = "A";
        }
        if (result.equals(expected)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    // Четыре теста со случайным значением при каждом повторении.
    @RepeatedTest(5)
    void blastOffTest() {
        int start = random.nextInt(5) + 1;
        String result = BasicJava.blastOff(start);
        String[] expected = {
            "1 Поехали!", "2 1 Поехали!", "3 2 1 Поехали!",
            "4 3 2 1 Поехали!", "5 4 3 2 1 Поехали!"
        };
        if (result.equals(expected[start - 1])) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    @RepeatedTest(5)
    void sumToNTest() {
        int number = random.nextInt(20) + 1;
        int result = BasicJava.sumToN(number);
        int expected = number * (number + 1) / 2;
        if (result == expected) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    @RepeatedTest(5)
    void hasBugTest() {
        boolean addBug = random.nextBoolean();
        String[] messages;
        if (addBug) {
            messages = new String[] {"Hello", "bUg", "Test"};
        } else {
            messages = new String[] {"Hello", "Java", "Test"};
        }
        boolean result = BasicJava.hasBug(messages);
        if (result == addBug) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    @RepeatedTest(5)
    void getEvenInRangeTest() {
        int start = random.nextInt(10);
        int end = start + 10;
        String result = BasicJava.getEvenInRange(start, end);
        String expected = "";
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                expected = expected + i + " ";
            }
        }
        if (result.equals(expected.trim())) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    // Четыре параметризованных теста.
    @ParameterizedTest
    @MethodSource("randomNumbers")
    void findMaxTest(int number) {
        int[] numbers = {number, number / 2, 0};
        int result = BasicJava.findMax(numbers);
        if (result == number) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    @ParameterizedTest
    @MethodSource("randomNumbers")
    void reverseTest(int number) {
        String[] words = {"A" + number, "B", "C"};
        String[] result = BasicJava.reverse(words);
        String[] expected = {"C", "B", "A" + number};
        if (Arrays.equals(result, expected)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    @ParameterizedTest
    @MethodSource("randomNumbers")
    void calcAverageTest(int number) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(number);
        numbers.add(number + 2);
        double result = BasicJava.calcAverage(numbers);
        double expected = number + 1;
        if (result == expected) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    @ParameterizedTest
    @MethodSource("randomNumbers")
    void removeSpecificNameTest(int number) {
        String nameToRemove = "Name" + number;
        List<String> names = new ArrayList<>();
        names.add("Ann");
        names.add(nameToRemove);
        names.add("Bob");
        names.add(nameToRemove);
        List<String> result = BasicJava.removeSpecificName(names, nameToRemove);
        List<String> expected = new ArrayList<>();
        expected.add("Ann");
        expected.add("Bob");
        if (result.equals(expected)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    static Integer[] randomNumbers() {
        Random random = new Random();
        Integer[] numbers = new Integer[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }
        return numbers;
    }
}
