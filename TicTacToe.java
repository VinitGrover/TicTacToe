package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {

    void uc1(char[] ch) {
        for (int i = 1; i < 10; i++) {
            ch[i] = ' ';
        }
    }

    char uc2() {
        System.out.print("Enter X or O : ");
        Scanner sc = new Scanner(System.in);
        return sc.next().charAt(0);
    }

    void showBoard(){
        System.out.print("   |   |\n-----------\n   |   |\n-----------\n   |   |");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe program");

        char[] ch = new char[10];
        TicTacToe t1 = new TicTacToe();
        t1.uc1(ch);

        char choice = t1.uc2();
        char choice1, choice2;

        if (choice == 'X') {
            System.out.println("Player chooses X and computer O");
            choice1 = choice;
            choice2 = 'O';
        } else {
            System.out.println("Player chooses O and computer chooses X");
            choice1 = choice;
            choice2 = 'X';
        }
      
        t1.showBoard();
    }
}