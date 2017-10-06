
package kata2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for(int key : histogr.keySet()){
            System.out.println(key + "==>" + histogr.get(key));
        }
        
        //histogram.keySet().stream().forEach((key) -> {
        //    System.out.println(key + "==>" + histogram.get(key));
        //});
    }
    
}
