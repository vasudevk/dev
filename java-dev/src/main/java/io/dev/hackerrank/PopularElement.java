package io.dev.hackerrank;

public class PopularElement {

    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 3, 4, 5, 6, 6, 7, 8, 9};

        int count = 1;
        int tempCount;

        int temp = 0;
        int popElement = a[0];

        for (int i = 0; i < (a.length - 1); i++) {
            temp = a[i];
            tempCount = 0;
            for (int j = 1; j < a.length; j++) {
                if (temp == a[j])
                    tempCount++;
            }
            if (tempCount > count) {
                popElement = temp;
                count = tempCount;
            } else if (tempCount == count && popElement < temp) {
                // If there are two popular elements, then pick the smallest one
                temp = popElement;
            }
        }

        System.out.println(popElement);
    }
}