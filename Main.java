jaimport java.util.*; 
import java.io.*;

class Main {

    public static int NoughtsDeterminer(String[] strArr) {

    int[] rows = new int[]{0,4,8};
    for(int row : rows){
        if(strArr[0+row] == "-" && strArr[2+row] == strArr[1+row] && strArr[1+row] != "-"){
            return 0+row;
        }
        if(strArr[1+row] == "-" && strArr[0+row] == strArr[2+row] && strArr[2+row] != "-"){
            return 1+row;
        }
        if(strArr[2+row] == "-" && strArr[0+row] == strArr[1+row] && strArr[1+row] != "-"){
            return 2+row;
        }
    }

    int[] columns = new int[]{0,1,2};
    for(int col : columns){
        if(strArr[1+col] == "-" && strArr[4+col] == strArr[8+col] && strArr[8+col] != "-"){
            return 0+col;
        }
        if(strArr[4+col] == "-" && strArr[0+col] == strArr[8+col] && strArr[8+col] != "-"){
            return 4+col;
        }
        if(strArr[8+col] == "-" && strArr[0+col] == strArr[4+col] && strArr[4+col] != "-"){
            return 8+col;
        }
    }

    int[] diagonal = new int[]{0,2,8,10};
    for(int dia : diagonal){
        if(strArr[0+dia] == "-" && strArr[5] == strArr[10-dia] && strArr[10-dia] != "-"){
            return 0+dia;
        }
        if(dia == 0 || dia == 8){
          if(strArr[5] == "-" && strArr[0+dia] == strArr[10-dia] && strArr[10-dia] != "-"){
            return 5;
          }
        }
    }

    return -1;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(NoughtsDeterminer(s.nextLine())); 
  }

}
