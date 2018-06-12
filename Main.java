package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int exam_score;
		int student1_score;
		double mean;
		int student;
		double sum = 0;
		double standard_deviation;
		
		 Student[] students;
		 students = new Student[11];
		 students[10] = new Student();
		
		
//		System.out.println("Number of students in class = " + students[10].get_student_count());      debugging
		
		exam_score = 0;
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Exam 1 score ");
	    exam_score = scan.nextInt();
	    students[10].setExam1(exam_score);
	    System.out.println("Exam 1 score =  " + students[10].getExam1());
	    System.out.println("---------------");
		
	    System.out.println("Enter Exam 2 score ");
	    exam_score = scan.nextInt();
	    students[10].setExam2(exam_score);
	    System.out.println("Exam 2 score =  " + students[10].getExam2());
		
	    System.out.println("---------------");
	 
	    System.out.println("Enter Exam 3 score ");
	    exam_score = scan.nextInt();
	    students[10].setExam3(exam_score);
	    System.out.println("Exam 3 score =  " + students[10].getExam3());
		
	    System.out.println("---------------");
	    
	    System.out.println("Enter Exam 4 score ");
	    exam_score = scan.nextInt();
	    students[10].setExam4(exam_score);
	    System.out.println("Exam 4 score =  " + students[10].getExam4());
	    
	    System.out.println("---------------");
	    
	    System.out.println("Enter Assignment 1 score ");
	    exam_score = scan.nextInt();
	    students[10].setAssignment1(exam_score);
	    System.out.println("Assignment 1 score =  " + students[10].getAssignment1());
		
	    System.out.println("---------------");
	    
	    System.out.println("Enter Assignment 2 score ");
	    exam_score = scan.nextInt();
	    students[10].setAssignment2(exam_score);
	    System.out.println("Assignment 2 score =  " + students[10].getAssignment2());
	    
	    System.out.println("---------------");
	    
	    System.out.println("Enter Assignment 3 score ");
	    exam_score = scan.nextInt();
	    students[10].setAssignment3(exam_score);
	    System.out.println("Assignment 3 score =  " + students[10].getAssignment3());
		
	    System.out.println("---------------");
	    
	    System.out.println("Enter Assignment 4 score ");
	    exam_score = scan.nextInt();
	    students[10].setAssignment4(exam_score);
	    System.out.println("Assignment 4 score =  " + students[10].getAssignment4());
		
	    System.out.println("---------------");
	    
	    students[10].setIndividual_final_score();
	    students[10].setLetter_grade();
	    
		System.out.println("Total Individiual Student Score = " + students[10].getIndividual_final_score() + ", " + students[10].getLetter_grade());
		students[10].set_overall_student_score(students[10].getIndividual_final_score());
		
		 System.out.println("---------------");
		    

		
//		//finding standard dev

		    students[0] = new Student(400);
		    students[1] = new Student(350);
		    students[2] = new Student(370);
		    students[3] = new Student(280);
		    students[4] = new Student(300);
		    students[5] = new Student(290);
		    students[6] = new Student(310);
		    students[7] = new Student(340);
		    students[8] = new Student(350);
		    students[9] = new Student(330);
		
		    System.out.println("Number of students in class = " + students[10].get_student_count());
			
			 System.out.println("---------------");
			
			System.out.println("Overall student score = " + students[10].get_overall_student_score());
			
//			student1.get_student_count();
			
			 System.out.println("---------------");
			 
//			student1.get_overall_student_mean();
			System.out.println("Average student score = " + students[10].get_overall_student_mean());
			
			
		    for (int i = 0; i < students.length; i++) 
		      {
		         sum = sum + (Math.pow(students[i].getIndividual_final_score() - students[i].get_overall_student_mean(), 2));
//		    	System.out.println("Inside loop sum = " + sum);
//		    	System.out.println("Individual final score is " + students[i].getIndividual_final_score());
//		    	System.out.println("Mean is "+ students[i].get_overall_student_mean());
		      }
		    	standard_deviation = Math.sqrt(sum/(students[10].get_student_count() - 1));
		    	System.out.println("Standard deviation = " + standard_deviation);
//		    	System.out.println("Outside loop sum = " + sum);
		    	
		    	students[10].setStandard_deviation(standard_deviation);
		    	
		    for (int i = 0; i < students.length; i++) 
			   {
		         students[i].setCurved_individual_grade();
		         students[i].setCurved_letter_grade();
		         
		         System.out.println("-------------------------------");
		        System.out.println("Original individual grade = " + students[i].getIndividual_final_score() + " Original letter grade = " +  students[i].getLetter_grade());
		    	System.out.println("Curved individual grade = " + students[i].getCurved_individual_grade() + " Curved letter grade = " +  students[i].getCurved_letter_grade());
		    	
//		    	System.out.println("Individual final score is " + students[i].getIndividual_final_score());
//		    	System.out.println("Mean is "+ students[i].get_overall_student_mean());
			   }
		    
		    	
		    	
	}//main

}//class
