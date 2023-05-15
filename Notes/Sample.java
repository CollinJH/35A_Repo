class Summation {
    public static int[] sum(int[] one, int[] two)
    {
    if (one == null || two == null)
    return null;
    if (one.length != two.length)
    return null;
    int[] result = new int[one.length];
    for (int i = 0; i < one.length; i++)
    result[i] = one[i] + two[i];
    return result;
    }
    }