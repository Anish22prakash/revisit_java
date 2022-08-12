package com.masai.question1;

public class Animal {



    public static void main(String[] args) {
        String [] arr= new String[5];
        char [] arr2= new char[3];
        arr2[1]='a';
        arr2[0]='n';
        System.out.println(arr2);


        for(int i=0;i<arr.length;i++){
            arr[i]="an"+i;
        }



        for(int j=0;j<arr.length;j++){
            System.out.println("this is index "+j+" the value is "+arr[j]);
        }


        int[]arr1={1,3,4,4,5,6};

        for(int j=0;j<arr1.length;j++){
            System.out.println("this is index "+j+" the value is "+arr1[j]);
        }

        int[][] D_ARRAY= new int[4][4];
        D_ARRAY[0][1]=3;
        D_ARRAY[0][3]=5;
        D_ARRAY[0][2]=4;

        System.out.println( D_ARRAY[0][1]);


    }


}
