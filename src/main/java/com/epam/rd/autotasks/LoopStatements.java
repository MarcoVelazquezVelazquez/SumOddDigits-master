package com.epam.rd.autotasks;
class LoopStatements {
    public static int sumOddDigits(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a positive number");
        }
            int sum = 0;
            while (n > 0) {
                int digit = n % 10; //Extract the last digit
                if (digit % 2 != 0) {
                    sum += digit;
                }
                n /= 10;
            }
            return sum;
        }

    public static void main(String[] args) {
        int number = 1234;
        int sum = sumOddDigits(number);
        System.out.println(LoopStatements.sumOddDigits(1234));

        number = 246;
        sum = sumOddDigits(number);
        System.out.println(LoopStatements.sumOddDigits(246));
    }

}





