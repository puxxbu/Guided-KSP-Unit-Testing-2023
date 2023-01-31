
package ooptesting_xxxx;


public class Calculation {
    public static int findMax(int arr[]){  
        int max=arr[0];
        if (arr.length <= 0) {
            throw new IllegalArgumentException("Invalid Input!");
        }
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
    
    public static int findLuasPersegi(int sisi){
        if (sisi <= 0 ) {
            throw new IllegalArgumentException("Invalid Input!");
        }
        return sisi*sisi;
        
        
    }
}
