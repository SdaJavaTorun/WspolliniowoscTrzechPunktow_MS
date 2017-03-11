package com.sdajava.macierzwyznacznik;

import java.util.Scanner;

public class Main {

    int [][] tab = new int[3][3];
    int ax,ay,bx,by,cx,cy, det;

    public  void points (){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj x i y punktu A:");
        this.ax = input.nextInt();
        this.bx = input.nextInt();
        System.out.println("Podaj x i y punktu B: ");
        this.bx = input.nextInt();
        this.by = input.nextInt();
        System.out.println("Podaj x i y punktu C: ");
        this.cx = input.nextInt();
        this.cy = input.nextInt();
    }
    public void array() {
        this.tab[0][0] = ax;
        this.tab[0][1] = ay;
        this.tab[1][0] = bx;
        this.tab[1][1] = by;
        this.tab[2][0] = cx;
        this.tab[2][1] = cy;
        for (int i = 0; i < tab.length; i++){
            tab[i][2] = 0;
        }
    }
    public int det(){
        int det = tab[0][0] * tab[1][1] * tab[2][2] +
                tab[1][0] * tab[2][1] * tab[0][2] +
                tab[2][0] * tab[0][1] * tab[1][2] -
                tab[0][2] * tab[1][1] * tab[2][0] -
                tab[0][1] * tab[1][0] * tab[2][2] -
                tab[0][0] * tab[2][1] * tab[1][2] ;
        this.det = det;
        return det;
    }

    public void multicollinearity(){
        if (det == 0){
            System.out.println("Punkty A, B i C są współliniowe");
        } else if (det > 0){
            System.out.println("Punkty A, B i C nie są współliniowe. Punkt C znajduje się po lewej stronie wektora AB.");
        } else {
            System.out.println("Punkty A, B i C nie są współliniowe. Punkt C znajduje się po prawej stronie wektora AB.");
        }

    }

    public static void main(String[] args) {
        Main matrix = new Main();
        matrix.points();
        matrix.array();
        System.out.println("Wyznacznik macierzy = " + matrix.det());
        matrix.multicollinearity();

    }
}
