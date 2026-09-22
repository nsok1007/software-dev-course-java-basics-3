package org.example;

public class LoopExercises {
    public int sum(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // (use a for loop)

        int sum = 0; //sum variable

        for (int i = 1; i <= n; i++) {
            sum = sum + i; //adds the current value of i to the accumulation total
        } return sum;
    }

    public int sumUntilEven(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // but stops adding when the sum is even
        // (use a while loop with a sum variable and a counter variable)

        int counter = 1; //counter variable (what number should be added next)
        int sum = 0; //sum variable (total value added)

        while (sum % 2 !=0 || sum == 0) { // sum % 2 !=0 is the expression for when an integer is EVEN
            sum = sum + counter; //ads counter variable to the sum
            counter++; //adds counter +1
        } return sum;
    }
}

// need OR statement because it should add as long as it's NOT even
// OR equal to 0, since otherwise the loop would end before running because 0 is even
