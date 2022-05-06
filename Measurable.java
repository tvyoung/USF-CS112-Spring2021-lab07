public interface Measurable
{
   double getMeasurement();

    /**
    Computes the average of the measures of the given objects.
    @param objects an array of Measurable objects
    @return the average of the measures
    */
    public static double average(Measurable[] objects)
    {
        double sum = 0.0;
        for (Measurable obj : objects)
        {
            sum = sum + obj.getMeasurement();
        }

        if (objects.length > 0)
        {
            return sum / objects.length;
        } else {
            return 0.0;
        }
    }

    /**
    Finds the maximum of the measurements of the given objects.
    @param objects an array of Measurable objects
    @return the maximum of the measures, null if array is empty
    */
    public static Measurable max(Measurable[] objects)
    {
        if (objects.length == 0)
        {
            return null;
        }

        Measurable max = objects[0];
        for (int i = 0; i < objects.length; i++) 
        {
            if (i > 0 && objects[i].getMeasurement() > max.getMeasurement())
            {
                max = objects[i];
                //FOR TESTING
                //System.out.println("current max: " + objects[i]);
            }
        }
        return max;
    }

}
