/*
 * A binary gap within a positive integer N is any maximal sequence of
 * consecutive zeros that is surrounded by ones at both ends in the binary 
 * representation of N.
 * For example, number 9 has binary representation 1001 and contains a binary 
 * gap of length 2. The number 529 has binary representation 1000010001 and 
 * contains two binary gaps: one of length 4 and one of length 3. The number 20 
 * has binary representation 10100 and contains one binary gap of length 1. The 
 * number 15 has binary representation 1111 and has no binary gaps. The number 
 * 32 has binary representation 100000 and has no binary gaps.
 * Write a function:
 * class Solution { public int solution(int N); }
 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
 */
package binarygap;
import java.util.Scanner;

/**
 *
 * @author ahdieh
 */
public class BinaryGap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int n = in.nextInt();
        int countGap = solution(n);
        System.out.printf("Bimary Gap of %d is %d.", n, countGap);
        System.out.println();
    }
    
    public static int solution(int N) {
        int binaryGap = 0;
        boolean foundOne = false;

        for (int j = 0; N > 0; N /= 2) {
            if (N % 2 == 0) {
                j++;
            } else {
                if (j > binaryGap && foundOne == true){
                    binaryGap = j;
                }
                foundOne = true;
                j = 0;
            }
        }

        return binaryGap;
    }
    
}
