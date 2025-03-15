package com.myproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        String fileName = "NumberFile.txt";
        int[] numbers = readNumbersFromFile(fileName);

        if (numbers != null) {
            int sum = calculateSum(numbers);
            double average = calculateAverage(numbers);
            int max = findMaximum(numbers);
            int min = findMinimum(numbers);

            System.out.println("Numbers read from file:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println("\nSum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
        } else {
            System.err.println("Error reading numbers from file.");
        }
    }

    // Read numbers from a file and store them in an array
    public static int[] readNumbersFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            String[] tokens = line.split(" ");
            int[] numbers = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                numbers[i] = Integer.parseInt(tokens[i]);
            }
            return numbers;
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Calculate the sum of numbers in the array
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Calculate the average of numbers in the array
    public static double calculateAverage(int[] numbers) {
        int sum = calculateSum(numbers);
        return (double) sum / numbers.length;
    }

    // Find the maximum value in the array
    public static int findMaximum(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Find the minimum value in the array
    public static int findMinimum(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}

