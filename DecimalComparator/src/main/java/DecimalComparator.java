public class DecimalComparator {


    public static boolean areEqualByThreeDecimalPlaces(double a, double b){



        var strA = String.format("%.3f", a);
        var strB = String.format("%.3f", b);
        System.out.println(strA);
        System.out.println(strB);

        return strA.equals(strB);

    }
}
