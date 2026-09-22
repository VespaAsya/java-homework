import java.util.ArrayList;
import java.util.List;

public class BasicJava {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static String checkAccess(int age) {
        if (age > 18) {
            return "Allowed";
        } else {
            return "Denied";
        }
    }

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static String getGrade(int score) {
        if (score >= 0 && score <= 20) {
            return "E";
        } else if (score <= 40) {
            return "D";
        } else if (score <= 60) {
            return "C";
        } else if (score <= 80) {
            return "B";
        } else if (score <= 100) {
            return "A";
        } else {
            return "Error";
        }
    }

    public static String blastOff(int start) {
        String result = "";
        for (int i = start; i >= 1; i--) {
            result = result + i + " ";
        }
        return result + "Поехали!";
    }

    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static boolean hasBug(String[] messages) {
        for (String message : messages) {
            if (message.equalsIgnoreCase("Bug")) {
                return true;
            }
        }
        return false;
    }

    public static String getEvenInRange(int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                result = result + i + " ";
            }
        }
        return result.trim();
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static String[] reverse(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static double calcAverage(List<Integer> list) {
        double sum = 0;
        for (int number : list) {
            sum = sum + number;
        }
        return sum / list.size();
    }

    public static List<String> removeSpecificName(List<String> list, String nameToRemove) {
        List<String> result = new ArrayList<>();
        for (String name : list) {
            if (!name.equals(nameToRemove)) {
                result.add(name);
            }
        }
        return result;
    }
}
