class Assignment2 { 
    
    int max(int x, int y) { return (x > y) ? x : y; } 
   
    int maxPathSum(int ar1[], int ar2[], int m, int n) 
    { 
       
        int i = 0, j = 0; 
  
        int result = 0, sum1 = 0, sum2 = 0; 
   
        while (i < m && j < n) { 

            if (ar1[i] < ar2[j]) 
                sum1 += ar1[i++]; 
  
            else if (ar1[i] > ar2[j]) 
                sum2 += ar2[j++]; 
  
            else { 
                
                result += max(sum1, sum2) + ar1[i]; 
  
            
                sum1 = 0; 
                sum2 = 0; 
  
       
                i++; 
                j++; 
            } 
        } 
  
        while (i < m) 
            sum1 += ar1[i++]; 
  
        while (j < n) 
            sum2 += ar2[j++]; 
  
   
        result += max(sum1, sum2); 
  
        return result; 
    } 
   
    public static void main(String[] args) 
    { 
        Assignment1 sumpath = new Assignment1(); 
        int ar1[] = { 2, 3, 7, 10, 12, 15, 30, 34 }; 
        int ar2[] = { 1, 5, 7, 8, 10, 15, 16, 19 }; 
        int m = ar1.length; 
        int n = ar2.length; 
  
        System.out.println( 
            "Maximum sum path is :"
            + sumpath.maxPathSum(ar1, ar2, m, n)); 
    } 
} 
  