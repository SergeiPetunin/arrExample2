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
 //_________________________________________________________________________
 //*************************************************************************
        //----------------------------------------------------
        System.out.println("--- Двухмерный массив ---");
        int sum2d = 0;
        int min2d = 10;
        int max2d = 0;
        
        int sumString = 0;
        int summDiagDown = 0;
        int summDiagUp = 0;

        int n = 3;
        int count = n;
        int rnd = 9;
        
        int[][] nums3 = new int[n][n];
        for (int[] i : nums3) {
            for (int j = 0; j < i.length; j++) {
                i[j] = rand.nextInt(rnd)+1;
            }
        }
        
//-----------------------------------------------------------------------------
        int[] minString = new int[nums3.length];
        Arrays.fill(minString, rnd);
        int[] maxString = new int[nums3.length];
        int[] minColumn = new int[nums3.length];
        Arrays.fill(minColumn, rnd);
        int[] maxColumn = new int[nums3.length];
        int minDiagDown = rnd;
        int maxDiagDown = 0;
        int minDiagUp = rnd;
        int maxDiagUp = 0;
        for (int i = 0; i < nums3.length; i++) {
            summDiagDown += nums3[i][i];// сумма диагонали
            if(minDiagDown > nums3[i][i])minDiagDown = nums3[i][i];
            if(maxDiagDown < nums3[i][i])maxDiagDown = nums3[i][i];
            summDiagUp += nums3[i][nums3.length - 1 - i];// сумма диагонали
            if(minDiagUp > nums3[i][nums3.length - 1 - i])minDiagUp = nums3[i][nums3.length - 1 - i];
            if(maxDiagUp < nums3[i][nums3.length - 1 - i])maxDiagUp = nums3[i][nums3.length - 1 - i];
            
            for (int j = 0; j < nums3[i].length; j++)
            {
                sum2d += nums3[i][j];// сумма всего массива
                if(min2d > nums3[i][j])min2d = nums3[i][j]; //минимальное массива
                if(max2d < nums3[i][j])max2d = nums3[i][j]; //Максимальное массива
                if(minString[i] > nums3[i][j])minString[i] = nums3[i][j];
                if(maxString[i] < nums3[i][j])maxString[i] = nums3[i][j];
                if(minColumn[j] > nums3[i][j])minColumn[j] = nums3[i][j];
                if(maxColumn[j] < nums3[i][j])maxColumn[j] = nums3[i][j];
                
            }
            System.out.println("");
        }
//-----------------------------------------------------------------------------
//------------получим результат каждой строки  и сохраним в массиве
        //создаем массив размером nums3.length
        int[] strResult = new int[nums3.length];
        int[] colResult = new int[nums3.length];
        
        //Цикл по первому измерению
        for (int i = 0; i < nums3.length; i++) { 
            //Для каждой строки вычислите сумму и сохраните ее в сумме
            for (int j = 0; j < nums3[i].length; j++) {
                strResult[i] += nums3[i][j];
                colResult[j] += nums3[i][j];
            }
        }
        
        System.out.println("");
        for (int i = 0; i < nums3.length; i++) {
            
            for (int j = 0; j < nums3[i].length; j++)
            {
                System.out.printf("%3d", nums3[i][j]);
            }
                System.out.printf(" | sum:%4d min:%4d max:%4d", strResult[i], minString[i], maxString[i]);
                System.out.println("");
        }
        for (int i = 0; i < nums3.length; i++) {
            System.out.print("---");
        }
        System.out.println("");

        for (int i :colResult){
            System.out.printf("%3d", i);
        }
        System.out.println("");
        for (int i : minColumn){
            System.out.printf("%3d", i);
        }
        System.out.println("");
        for (int i : maxColumn){
            System.out.printf("%3d", i);
        }
        System.out.println("");
        System.out.print("Сумма всего массива: " + sum2d);
        System.out.print("\t\tМинимальное массива: " + min2d);
        System.out.println("\t\tМаксимальное массива: " + max2d);
        System.out.println("");

        System.out.print("Сумма диагонали 1 : " + summDiagDown);
        System.out.print("\tМинимальное диагонали 1 : " + minDiagDown);
        System.out.println("\tМаксимальное диагонали 1 : " + maxDiagDown);
        
        System.out.print("Сумма диагонали 2 : " + summDiagUp);
        System.out.print("\tМинимальное диагонали 2 : " + minDiagUp);
        System.out.println("\tМаксимальное диагонали 2 : " + maxDiagUp);
        System.out.println("");
    }
    
}
