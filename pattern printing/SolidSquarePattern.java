/*
  Problem: Print a solid square star pattern
 
 Pattern:
 * * * *
 * * * *
 * * * *
 * * * *
 
  Approach:
  - Use two nested loops
  - Outer loop controls number of rows
  - Inner loop controls number of stars per row
 
  Time Complexity: O(n^2)
 Space Complexity: O(1)
 */
public class SolidSquarePattern {

    public static void main(String[] args) {

        int n = 4; // number of rows

        // Outer loop -> rows
        for (int i = 0; i < n; i++) {

            // Inner loop -> columns (stars in one row)
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
