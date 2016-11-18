package java2notice_tutorial.interviewPrograms;


public class TwoMaxNumbers {
    public void printTwoMaxNumbers(int[] nums) {
        int maxOne = 0;
        int maxTwo = 0;
        for (int n : nums) {
            if (maxOne < n) {
                maxTwo = maxOne;
                maxOne = n;
            } else if (maxTwo < n) {
                maxTwo = n;
            }
        }
        System.out.println("First Max number: " + maxOne);
        System.out.println("Second Max number: " + maxTwo);
    }


    public static void main(String[] args) {
        int[] array = new int[]{5, 34, 78, 2, 45, 1, 99, 23};
        TwoMaxNumbers tmn = new TwoMaxNumbers();
        tmn.printTwoMaxNumbers(array);
    }
}
