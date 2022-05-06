public class Country implements Measurable, Comparable<Country>
{
	//A country has the name (String) of the country and its land’s surface area (double).
	private String name;
	private double surfaceArea;

	//parameterized constructor
	public Country(String givenName, double givenSA)
	{
		name = givenName;
		surfaceArea = givenSA;
	}

	//The method getMeasurement should return the surface area.
	public double getMeasurement() 
	{
		return surfaceArea;
	}

	//comparing each Country object's surface area to the other
	//comparing in order of smallest to greatest surface area 
	public int compareTo(Country c)
	{
		if (this.getMeasurement() < c.getMeasurement()) {
			return -1;
		} else if (this.getMeasurement() > c.getMeasurement()) {
			return 1;
		} else {
			return 0;
		}
	}

	//toString method return country name and surface area
	public String toString() 
	{
		String text = name + "; " + surfaceArea;
		return text;
	}


}