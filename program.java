
public class Program {

    public static void main(String[] args) {
        int rows,cols;
        int a[][] = {{1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}};
        int b []={10};
rows = a.length;  
cols = a.length; 
int t[][] = new int[cols][rows]; //record  
for(int i = 0; i < cols; i++){  
  for(int j = 0; j < rows; j++){  
      t[i][j] = a[j][i];  //cross section
  }  
}  
System.out.println("Single array : ");
System.out.println(b[0] + " ");  //single array
System.out.println("multidimensional array dan transpose ");
for(int i = 0; i < cols; i++){  
  for(int j = 0; j < rows; j++){ 
     System.out.print(t[i][j] + " ");  //transpose dan multidimensi array
  }  
  System.out.println();  
}  
}  
}
