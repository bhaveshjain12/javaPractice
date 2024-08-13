package com.company;

import java.util.Scanner;

public class StarPatten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patten1(n);
        System.out.println();
        System.out.println("------------------------------------------------------patten2");
        patten2(n);
        System.out.println("------------------------------------------------------patten3");
        patten3(n);
        System.out.println("------------------------------------------------------patten4");
        patten4(n);
        System.out.println("------------------------------------------------------patten5");
        patten5(n);
        System.out.println("------------------------------------------------------patten6");
        patten6(n);
        System.out.println("------------------------------------------------------patten7");
        patten7(n);
        System.out.println("------------------------------------------------------patten8");
        patten8(n);
        System.out.println("------------------------------------------------------patten9");
        patten9(n);
        System.out.println("------------------------------------------------------patten10");
        patten10(n);
        System.out.println("------------------------------------------------------patten11");
        patten11(n);

        System.out.println("------------------------------------------------------patten31");
        patten31(n);
        System.out.println("------------------------------------------------------patten12");
        patten12(n);
        System.out.println("------------------------------------------------------patten13");
        patten13(n);
        System.out.println("------------------------------------------------------patten14");
        patten14(n);
        System.out.println("------------------------------------------------------patten15");
        patten15(n);
        System.out.println("------------------------------------------------------patten16");
        patten16(n);
        System.out.println("------------------------------------------------------patten17");
        patten17(n);
    }

    static void patten1(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void patten2(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void patten3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void patten4(int n) {
        for (int row = 0; row < n * 2; row++) {
            int totalcolinrow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalcolinrow; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void patten5(int n) {
        for (int i = 0; i <= n; i++) {
            int space = n - i;
            for (int k = 0; k <= space; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patten6(int n) {
        for (int i = 0; i <= n; i++) {
            int space = i;
            for (int k = 0; k <= space; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patten7(int n) {
        for (int i = 0; i < n; i++) {
            int space = n - i;
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i + i + 1; k++) {
                System.out.print("" + "*");
            }
            System.out.println();
        }
    }

    static void patten8(int n) {
        for (int i = 0; i < n; i++) {
            int space = i;
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < 2 * n - (i + i + 1); l++) {
                System.out.print("" + "*");
            }
            System.out.println();
        }
    }

    static void patten9(int n) {
        for (int i = 0; i < n; i++) {
            for (int sp = 0; sp < n - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + "*");
            }
            System.out.println();
        }
    }

    static void patten10(int n) {
        for (int i = 0; i < n; i++) {

            for (int sp = 0; sp <= i; sp++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void patten11(int n) {
        for (int i = 0; i <= n * 2; i++) {
            int space = i <= n ? i : 2 * n + 1 - i;
            for (int sp = 0; sp < space; sp++) {
                System.out.print(" ");
            }
            int col = i <= n ? n - i : i - n - 1;
            for (int j = 0; j <= col; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void patten31(int n) {
        int original = n;
        n = 2 * n;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int a = (original - Math.min(Math.min(i, j), Math.min(n - i, n - j))) + 1;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    static void patten12(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = row; space < n; space++) {
                System.out.print(" ");
            }
            int star = 2 * row - 1;
            for (int col = 1; col <= star; col++) {
                if (col == 1 || row == n || col == star) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void patten13(int n) {
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp < row; sp++) {
                System.out.print(" ");
            }
            int star = 2 * n - row;
            for (int col = star; col > 0; col--) {
                if (row == 1 || col == row || col == star) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void patten14(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = row; space < n; space++) {
                System.out.print(" ");
            }
            int star = 2 * row - 1;
            for (int cols = 1; cols <= star; cols++) {
                if (cols == 1 || cols == star) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

     for (int row2 =n; row2 >= 1; row2--){
        for (int space =1; space <=n-row2; space++) {
            System.out.print(" ");
        }
        int star=2*row2-1;
        for (int cols = 1; cols <=star; cols++) {
            if(cols==1|| cols==star){
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}
        static void patten15(int n){
            for (int row = 1; row <=n; row++) {
                for (int sp = row; sp <n ; sp++) {
                    System.out.print(" ");
                }
                int ab=1;
                for (int cols = 1; cols <=row ; cols++) {


                    System.out.print(ab +" ");
                    ab =ab*(row-cols)/cols;
                }

                System.out.println();
            }
        }
        static void patten16(int n){
            for (int row = 1; row <=n ; row++) {
                int sp = row <=n ? n - row : row / 2;
                for (int space = 1; space <= sp; space++) {
                    System.out.print(" ");
                }
                for (int cols = row; cols >= 1; cols--) {
                    System.out.print(cols);
                }
                for (int cols = 2; cols <= row; cols++) {
                    System.out.print(cols);
                }
                System.out.println();
            }
            for (int row = 1; row <=3 ; row++) {
                for (int sp = 1; sp <=row ; sp++) {
                    System.out.print(" ");
                }

                for (int  i= n-row; i >=1; i--) {
                    System.out.print(i);
                }

                for (int cols=2;cols<=n-row;cols++){
                    System.out.print(cols);
                }

                System.out.println();
            }
        }
        static void patten17(int n){
                int a=2*n;
            for (int row = a; row >=1 ; row--) {


                for(int col=1;col<=row/2;col++) {
                        System.out.print("* ");
                    }




                System.out.println();
            }
        }
}
