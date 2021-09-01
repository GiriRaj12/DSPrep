package ds.prep.Arrays;

public class AddTwoNumbersInAString {
    public static void main(String[] args) {
        System.out.println(addTwoNumbers("1","9"));

    }

    public static String addTwoNumbers(String num1, String num2){
        int num1Length = num1.length() - 1;
        int num2Length = num2.length() - 1;

        StringBuilder resultString = new StringBuilder();
        int carry = 0;
        while(num1Length >= 0 || num2Length >= 0 || carry != 0){
            int one = num1Length >= 0 ? num1.charAt(num1Length) - 48 : 0;
            int two = num2Length >= 0 ? num2.charAt(num2Length) - 48 : 0;
            int sum = one + two + carry;
            if(sum >= 10)
                carry = sum / 10;
            else
                carry = 0;

            resultString.append(sum % 10);
            num1Length--;
            num2Length--;
        }
        return resultString.reverse().toString();
    }
}
