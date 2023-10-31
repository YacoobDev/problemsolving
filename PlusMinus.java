class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void findPlusMinus(List<Integer> arr) {
    int positive=0, negative=0, zero = 0;
    int n = arr.size();
    for (Integer integer : arr) {
        if(integer>0){
            positive = positive+1;
        } else if (integer<0){
            negative = negative+1;
        } else {
            zero = zero+1;
        }
    }

    double proportionOfPositive = (double)positive/n;
    double proportionOfNegative = (double)negative/n;
    double proportionOfZero = (double)zero/n;
    
    //For formatting use the below
    System.out.println(String.format("%.6f", proportionOfPositive));
    System.out.println(String.format("%.6f", proportionOfNegative));
    System.out.println(String.format("%.6f", proportionOfZero));

    }

}
