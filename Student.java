package main;

public class Student {

	private int exam1;
	private int exam2;
	private int exam3;
	private int exam4;
	private int assignment1;
	private int assignment2;
	private int assignment3;
	private int assignment4;
	private int individual_total_score;
	private String letter_grade;
	private String curved_letter_grade;
	
	private double curved_individual_grade;
	private int individual_grade;
	
	private static int overall_student_count;
	private static int overall_student_score;
	private static float overall_student_mean;
	static double overall_standard_deviation;
	
	
	
	public Student()
	{
		set_student_count();
	}
	
	public Student(int p_individual_grade)
	 {
//	  this.overall_grade = p_overall_grade;
		individual_total_score = p_individual_grade;
		set_overall_student_score(p_individual_grade);
		set_student_count();
		set_overall_student_mean();
		setLetter_grade();
	  }
	 
	
	//mean and standard deviation
	public void set_overall_student_mean()
	{
		overall_student_mean = overall_student_score/overall_student_count;
	}
	public float get_overall_student_mean()
	{
		return overall_student_mean;
	}
	public void set_student_count()
	{
		overall_student_count++;
	}
	public int get_student_count()
	{
		return overall_student_count;
	}
	public void set_overall_student_score(int p_individual_grade)
	{
		overall_student_score = overall_student_score + p_individual_grade;
	}
	public float get_overall_student_score()
	{
		return overall_student_score;
	}
	public void setExam1(int p_exam1)
	{
	 exam1 = p_exam1;
	}
	public int getExam1()
	{
	 return exam1;
	}
	
	public void setExam2(int p_exam2)
	{
	 exam2 = p_exam2;
	}
	public int getExam2()
	{
	 return exam2;
	}
	public void setExam3(int p_exam3)
	{
	 exam3 = p_exam3;
	}
	public int getExam3()
	{
	 return exam3;
	}
	public void setExam4(int p_exam4)
	{
	 exam4 = p_exam4;
	}
	public int getExam4()
	{
	 return exam4;
	}
	public void setAssignment1(int p_assignment1)
	{
	 assignment1 = p_assignment1;
	}
	public int getAssignment1()
	{
	 return assignment1;
	}
	public void setAssignment2(int p_assignment2)
	{
	 assignment2 = p_assignment2;
	}
	public int getAssignment2()
	{
	 return assignment2;
	}
	public void setAssignment3(int p_assignment3)
	{
	 assignment3 = p_assignment3;
	}
	public int getAssignment3()
	{
	 return assignment3;
	}
	public void setAssignment4(int p_assignment4)
	{
	 assignment4 = p_assignment4;
	}
	public int getAssignment4()
	{
	 return assignment4;
	}
	public void setIndividual_final_score()
	{
	 individual_total_score = (exam1 + exam2 + exam3 + exam4 + assignment1 + assignment2 + assignment3 + assignment4);
	}
	public int getIndividual_final_score()
	{
		return individual_total_score;
	}

	
	
	public void setLetter_grade()
	{
	 	if (individual_total_score>=450)
	 	letter_grade = ("A");
	 	
	 	else if (individual_total_score>=400)
 		letter_grade = ("B");
 	 	
	 	else if (individual_total_score>=350)
 		letter_grade = ("C");
	
	 	else if (individual_total_score>=300)
        letter_grade = ("D");
 	 	
 		else 
 		letter_grade = ("F");	
	}
	public String getLetter_grade()
	{
 		return letter_grade;
	}
	
	public void setStandard_deviation(double p_overall_standard_deviation)
	{
		overall_standard_deviation = p_overall_standard_deviation;
	}
	public double getStandard_deviation()
	{
		return overall_standard_deviation;
	}
	
	
	public void setCurved_letter_grade()
	{
	 	if (curved_individual_grade >= (overall_student_mean + (2*overall_standard_deviation)))
	 	curved_letter_grade = ("A");
	 	
	 	else if (curved_individual_grade >= (overall_student_mean + (overall_standard_deviation)))
 		curved_letter_grade = ("B");
 	 	
	 	else if (curved_individual_grade >= (overall_student_mean))
 		curved_letter_grade = ("C");
	
	 	else if (curved_individual_grade >= (overall_student_mean - (overall_standard_deviation)))
        curved_letter_grade = ("D");
 	 	
 		else 
 		curved_letter_grade = ("F");	
	}
	 	public String getCurved_letter_grade()
		{
	 		return curved_letter_grade;
		}
	
	
	public void setCurved_individual_grade()
	{
		 curved_individual_grade = individual_total_score + overall_standard_deviation;
	}
	public double getCurved_individual_grade()
	{
		return curved_individual_grade;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
