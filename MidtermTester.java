/*
creates and processes an array of Midterm objects
this driver program has similar functionality as the previous MeasurableTester program
*/
import java.util.*;

public class MidtermTester
{
	public static void main(String[] args)
	{
		//Create 10 Midterm objects -- you can decide on the name and scores of each object
		//totally very realistic midterm scores
		Measurable[] midterms = new Measurable[10];
		midterms[0] = new Midterm("Toast", 325);
		midterms[1] = new Midterm("Squash", 114);
		midterms[2] = new Midterm("TJ", 95);
		midterms[3] = new Midterm("Jamie", 830);
		midterms[4] = new Midterm("Moonie", 72);
		midterms[5] = new Midterm("Ace", 27);
		midterms[6] = new Midterm("Li", 915);
		midterms[7] = new Midterm("Aly", 124);
		midterms[8] = new Midterm("Lychee", 111);
		midterms[9] = new Midterm("Pokey", 525);

		//Print each object (name and score)
		System.out.println("name; midterm score");
		for (Measurable m: midterms) 
		{
			System.out.println(m);
		}

		//Display the average score of the 10 objects (using the interface method)
		System.out.println("\naverage score of the ten midterms: " + Measurable.average(midterms));
		System.out.println("expected: 313.8");

		//Display the student with the highest score (using the interface method)
		Measurable maxMidterms = Measurable.max(midterms);
		System.out.println("\nstudent with the highest score: " + maxMidterms);
		System.out.println("expected: Li; 915");

		//sort the midterm objects using the Arrays.sort method
		System.out.println("\nsorting midterms (lowest to highest score)");
		Arrays.sort(midterms);

		//Print the sorted objects.
		for (Measurable m: midterms) 
		{
			System.out.println(m);
		}


	}
}