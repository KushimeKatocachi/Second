package Tekseru;

import java.util.HashMap;
import java.util.Scanner;

public class Cikl {
      public static void main(String[] args) {
          HashMap<String, Integer> grades = new HashMap<>();
          grades.put("Arsen", 90);
          grades.put("Adam", 80);
          grades.put("Arina", 75);
          grades.put("Patima", 95);
          grades.put("Adel", 90);
          for(String name : grades.keySet()) {
              int grade = grades.get(name);
              System.out.println(name + ": " + grade);
          }
          double sum = 0;
          for(int grade : grades.values()) {
              sum += grade;
          }

          double average = sum / grades.size();
          System.out.println("Avarage grade: " + average);

          grades.remove("Arina");

          // Print out the updated grades of all students in the HashMap
          for (String name : grades.keySet()) {
              int grade = grades.get(name);
              System.out.println(name + ": " + grade);
          }

          String student = "Adel";
          if(grades.containsKey(student)) {
              int grade = grades.get(student);
              System.out.println(student + "'s grade is " + grade);
          } else {
              System.out.println("Student not found.");
          }
      }
  }