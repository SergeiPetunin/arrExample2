/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrexample2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class ArrExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("---- Одномерный массив ----");
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(20)+(-10);
            System.out.printf("%2d,",nums[i]);
        }
        
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums2);
        System.out.println("");
        System.out.println(Arrays.toString(nums2));
        
        int sum = 0;
        int min = 10;
        int max = 0;
        for  (int i = 0;i<nums.length;i++){
            
            sum += nums[i];
            if(min > nums[i])min = nums[i];
        }
        for  (int i = 0;i<nums.length;i++){
            
            sum += nums[i];
            if(max < nums[i])max = nums[i];
        }
        
        System.out.println("");
        System.out.println("sum " + sum);
        System.out.println("min " + min);
        System.out.println("max " + max);
        
        //----------------------------------------------------
        System.out.println("--- Двухмерный массив ---");
        int sum2d = 0;
        int min2d = 10;
        int max2d = 0;
        int strSum1 = 0, strSum2 = 0, strSum3 = 0, strSum4 = 0, strSum5 = 0;
        int colSum1 = 0, colSum2 = 0, colSum3 = 0, colSum4 = 0, colSum5 = 0;
        int sumDiag1 = 0, sumDiag2 = 0;
        int minDiag1 = 10, minDiag2 = 10;
        int maxDiag1 = 0, maxDiag2 = 0;
        
        int n = 5;
        int[][] nums3 = new int[n][n];
        for (int[] i : nums3) {
            for (int j = 0; j < i.length; j++) {
                i[j] = rand.nextInt(n)+1;
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            //1строка
            strSum1 += nums3[0][i];
            //2строка
            strSum2 += nums3[1][i];
            //3строка
            strSum3 += nums3[2][i];
            //4строка
            strSum4 += nums3[3][i];
            //5строка
            strSum5 += nums3[4][i];
            //1столбец
            colSum1 += nums3[i][0];
            //2столбец
            colSum2 += nums3[i][1];
            //3столбец
            colSum3 += nums3[i][2];
            //4столбец
            colSum4 += nums3[i][3];
            //5столбец
            colSum5 += nums3[i][4];
            
            for (int j = 0; j < nums3[i].length; j++)
            {
                System.out.printf("%3d", nums3[i][j]);
            }
            System.out.print("\t| lineSum = ");
            System.out.println("");
            
        }
        
        for (int i = 0; i < nums3.length; i++) {
            //диагонали1 вниз с слево на право
            sumDiag1 += nums3[i][i];
            if(minDiag1 > nums3[i][i])minDiag1 = nums3[i][i];
            if(maxDiag1 < nums3[i][i])maxDiag1 = nums3[i][i];
            //диагонали2 вверх
            sumDiag2 += nums3[i][nums3.length - 1 - i];
            if(minDiag2 > nums3[i][nums3.length - 1 - i])minDiag2 = nums3[i][nums3.length - 1 - i];
            if(maxDiag2 < nums3[i][nums3.length - 1 - i])maxDiag2 = nums3[i][nums3.length - 1 - i];
            
            for (int j = 0; j < nums3[i].length; j++) {
                //весь массив
                sum2d += nums3[i][j];
                if(min2d > nums3[i][j])min2d = nums3[i][j];
                if(max2d < nums3[i][j])max2d = nums3[i][j];   
            }
        }
        
        System.out.print("Сумма всего массива: " + sum2d);
        System.out.print("\t\tМинимальное массива: " + min2d);
        System.out.println("\t\tМаксимальное массива: " + max2d);
        System.out.println("");
        
        System.out.println("Сумма 1 строки: " + strSum1);
        System.out.println("Сумма 2 строки: " + strSum2);
        System.out.println("Сумма 3 строки: " + strSum3);
        System.out.println("Сумма 4 строки: " + strSum4);
        System.out.println("Сумма 5 строки: " + strSum5);
        System.out.println("");
        
        
        System.out.println("Сумма 1 столбца: " + colSum1);
        System.out.println("Сумма 2 столбца: " + colSum2);
        System.out.println("Сумма 3 столбца: " + colSum3);
        System.out.println("Сумма 4 столбца: " + colSum4);
        System.out.println("Сумма 5 столбца: " + colSum5);
        System.out.println("");

        System.out.print("Сумма диагонали 1 : " + sumDiag1);
        System.out.print("\tМинимальное диагонали 1 : " + minDiag1);
        System.out.println("\tМаксимальное диагонали 1 : " + maxDiag1);
        
        
        System.out.print("Сумма диагонали 2 : " + sumDiag2);
        System.out.print("\tМинимальное диагонали 2 : " + minDiag2);
        System.out.println("\tМаксимальное диагонали 2 : " + maxDiag2);
        
    }
    
}
