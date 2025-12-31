package org.example.Head02_JavaProgramming;

public class ReferenceExample {
    public static void main(String[] args) {
        String name = "Java";
        int [] numbers = {1,2,3,4,5};
        Student student = new Student();

        String title = null;

        int[] a = {1,2,3};
        int[] b = a; // 같은 배열 주소를 가리킴

        b[0] = 100;
        System.out.println(a[0]); // 100


    }
}
