package task_lab4;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Library of statistical functions using Generics for different statistical
 * calculations.
 *
 * @author Mohamed Jubara Jubara 
 */

public final class jblink_stats {
    
    
    /**
 * @param numbersList first Generics type of list Numbers
 * @return Average  numbersList numbers
 
 */

    public static <T extends Number> double computeAverage(ArrayList<T> numbersList) {
        double totalSum = computeSum(numbersList);
        int countNumbers = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            if ( numbersList.get(i).doubleValue() >= 0) {
                countNumbers++;
            }
        }
        if (countNumbers == 0) {
            //throw new IllegalArgumentException("no values are > 0");
            return -1;
        }
        return totalSum/countNumbers;
    }

      /**
 * @param numbersList first Generics type of list Numbers
 * @return Sum  numbersList numbers
 
 */ 
    
    public static <T extends Number> double computeSum(ArrayList<T> numbersList) {
        if (numbersList.size() < 1) {
            //throw new IllegalArgumentException("numbersList cannot be empty");
            return -1;
        }

        double sum = 0.0;
        for (T val : numbersList) {
            
            double value = val.doubleValue();
            
            if ( value >= 0) {
                sum += value;
                //System.out.println(sum);
            }
        }
        return sum;
    }

    /**
 * @param numbersList first Generics type of list Numbers
 * @return median  numbersList numbers
 
 */ 
    
    
    public static <T extends Number> double computeMedian(ArrayList<T> numbersList) {
        double med;
        if (numbersList.size()%2==0) {
            int length = numbersList.size()/2-1;
            med = (fnv(numbersList, length) + fnv(numbersList,length+1))/2;
        }
        else
            med = fnv(numbersList, numbersList.size()/2);
        return med;
    }
    
    private static <T extends Number> double fnv(ArrayList<T> numbersList, int size) 
    {
        ArrayList<T> lt = new ArrayList<>();
        ArrayList<T> gt = new ArrayList<>();
        
        int pv = numbersList.size()/2;
        
        double pv_val = numbersList.get(pv).doubleValue();
        for (T v : numbersList) {
            if (v.doubleValue() < pv_val)
                lt.add(v);
            else if (v.doubleValue() > pv_val)
                gt.add(v);
        }
        
        if(size < lt.size()) 
            return fnv(lt, size);
        
        else if(size >= (numbersList.size() - gt.size())) 
            return fnv(gt,size - (numbersList.size() - gt.size()));

        return pv_val;
    }
   /**
 * @param data first Generics type of list Numbers
 * @return standard deviation  numbersList numbers
 
    public static <T extends Number> double standardDeviation(ArrayList<T> data) {
        if (data.size() <= 1) {
 */
    public static <T extends Number> double computeStandardDeviation(ArrayList<T> data) {
        if (data.size() <= 1) {
           // throw new IllegalArgumentException("Size of array must be greater than 1");
           return -1;
        }

        int size = data.size();
        double sum = 0;
        double avarageValue = computeAverage(data);
        
        for (int i = 0; i < size; i++) {
            double value = data.get(i).doubleValue();
            sum += Math.pow(value - avarageValue,2);
        }
        double stdev = Math.sqrt(sum / (size-1));
        return stdev;
    }
    

    // Simple set of tests that confirm that functions operate correctly
  /**
 * Main function execute first when program run.
 *
 */

   /* public static void main(String[] args) {

        ArrayList<Integer> testDataI = new ArrayList<>(Arrays.asList(9,2,7,4,5,6,3,8,1,10));
        ArrayList<Double> testDataD = new ArrayList<>(Arrays.asList(2.2, 100.0, 17.5, 30.2, 31.1));

      
        
        System.out.printf("The sum of the Integer array = %.0f\n", sumNumbers(testDataI));
       System.out.printf("The sum of the Double array = %.0f\n", sumNumbers(testDataD));

        System.out.printf("The average of the Integer test set = %.2f\n", averageNumbers(testDataI));
        System.out.printf("The average of the Double test set = %.2f\n", averageNumbers(testDataD));

        System.out.printf("The median value of the Integer data set = %.2f\n", medianNumbers(testDataI));
        
        System.out.printf("The median value of the Double data set = %.2f\n", medianNumbers(testDataD));
        
        System.out.printf("The sample standard deviation of the Integer test set = %.2f\n", standardDeviation(testDataI));
        System.out.printf("The sample standard deviation of the Double test set = %.2f\n", standardDeviation(testDataD));

    }
*/
}
