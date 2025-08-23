// package OTHERS;
// import java.util.List;
// import java.util.ArrayList;

// public class pascal_triangle {
//     public List<List<Integer>> generate(int numRows){
//     List<List<Integer>> result = new ArrayList<>();
//         int counter = 1;
//         for(int i=0;i<numRows;i++){
//             List<Integer> currentRow = new ArrayList<>();

//             for(int j=0;j<counter;j++){
//                 if( j == 0 || j == counter-1){
//                     currentRow.add(1);
//                 }
//                 else{
//                     currentRow.add(result.get(i-1).get(j-i)+result.get(i-1).get(j));
//                 }
//                 // if we are in row 2 index 1, we have to add these two numbers: (row 1 : index 0 & 1 ) 
//                 // index 0 and 1 -> (j-1) & j
//             }

//             result.add(currentRow);
//             counter++;
//         }
//         return result;

//         // Time complexity: O(n^2)
//         // space complexity: O(n^2)
// }}

// LEET CODE : 118 


package OTHERS;
import java.util.List;
import java.util.ArrayList;

public class pascal_triangle {
    
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> currentRow = new ArrayList<>();

            for(int j=0; j<=i; j++){  // j<=i because row index starts from 0
                if(j == 0 || j == i){
                    currentRow.add(1); // first and last element always 1
                } else {
                    currentRow.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(currentRow);
        }
        return result;
    }

    public static void main(String[] args) {
        pascal_triangle pt = new pascal_triangle();
        int numRows = 5; // Example: Generate 5 rows

        List<List<Integer>> triangle = pt.generate(numRows);

        // Printing the triangle
        for(List<Integer> row : triangle){
            System.out.println(row);
        }
    }
}

