package java_programs;

import java.util.Scanner;

class JavaArrays {
	int array[];
	int n,c,d,swap;
JavaArrays() {
      array=new int[5];
}
 public void ArraySort(int a,int b,int c,int d,int e)  
{   
      array[0] = a;
      array[1]=b;
      array[2]=c;
     array[3]=d;
     array[4]=e;
 
    for (c = 0; c <  4 ; c++) {
      for (d = 0; d < 4-c; d++) {
        if (array[d] > array[d+1]) /* For descending order use < */
        {
          swap       = array[d];
          array[d]   = array[d+1];
          array[d+1] = swap;
        }
      }
    }
 
    System.out.println("Sorted list of numbers");
 
    for (c = 0; c < 5; c++) 
      System.out.println(array[c]);
  }
 public int minimum()
 {
	 return array[0];
}
public int maximum()
{
return array[4];	
}
}