public class Midterm implements Measurable, Comparable<Midterm>
{
	//Midterm object has both the score (double) and a student’s name (String)
	private String name;
	private double score;

	//parameterized constructor
	public Midterm(String givenName, double givenScore)
	{
		name = givenName;
		score = givenScore;
	}

	//returns midterm score
	public double getMeasurement() 
	{
		return score;
	}

	//comparing each Midterm object's test score to the other
	//comparing in order of lowest to highest test score 
	public int compareTo(Midterm m)
	{
		if (this.getMeasurement() < m.getMeasurement()) {
			return -1;
		} else if (this.getMeasurement() > m.getMeasurement()) {
			return 1;
		} else {
			return 0;
		}
	}

	//toString method return student name and test score
	public String toString() 
	{
		String text = name + "; " + score;
		return text;
	}

}