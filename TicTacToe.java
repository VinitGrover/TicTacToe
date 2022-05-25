package com.bridgelabz;

public class TicTacToe {

    void uc1(char [] ch){
        for(int i=1;i<10;i++){
            ch[i]=' ';
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe program");

        char [] ch = new char[10];
        TicTacToe t1 = new TicTacToe();
        t1.uc1(ch);
    }
}
