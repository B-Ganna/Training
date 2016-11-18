package java2notice_tutorial.interviewPrograms;


import java.util.ArrayList;
import java.util.List;

public class DuplicateNumbers {
    public int findDuplicateNumber(List<Integer> numbers) {
        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate = total - (highestNumber * (highestNumber + 1) / 2);
        return duplicate;
    }

    public int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 30; i++) {
            numbers.add(i);
        }
        numbers.add(22);
        DuplicateNumbers dn = new DuplicateNumbers();
        System.out.println("Duplicate number is: " + dn.findDuplicateNumber(numbers));
    }
}
