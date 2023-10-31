/*
* Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
* Then print the respective minimum and maximum values as a single line of two space-separated long integers.
*/
class MiniMaxSum{

public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    List<Long> sumList = new ArrayList<>();
    
    for(int i=0; i<arr.size(); i++){
        long sum =0;
        for(int j=0; j<arr.size(); j++){
            if(i!=j){
                sum = sum +arr.get(j);
            }
        }
        sumList.add(sum);
    }
    long minVal = Collections.min(sumList);
    long maxVal = Collections.max(sumList);
    System.out.println(minVal+" "+maxVal);

    }  
  
}
