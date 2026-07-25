package Backtracking;

import java.util.*;

public class NQueens {


    static List<List<String>> solveNQueens(int n) {


        List<List<String>> result = new ArrayList<>();

        int queenCol[] = new int[n];


        backtrack(n,0,queenCol,result);


        return result;
    }



    static void backtrack(int n,
                          int row,
                          int queenCol[],
                          List<List<String>> result) {


        if(row==n) {

            result.add(createBoard(n,queenCol));
            return;
        }



        for(int col=0;col<n;col++) {


            if(isSafe(row,col,queenCol)) {


                queenCol[row]=col;


                backtrack(n,row+1,
                        queenCol,result);
            }
        }
    }



    static boolean isSafe(int row,
                          int col,
                          int queenCol[]) {


        for(int r=0;r<row;r++) {


            if(queenCol[r]==col)
                return false;


            if(Math.abs(queenCol[r]-col)
                    == Math.abs(r-row))
                return false;
        }


        return true;
    }



    static List<String> createBoard(int n,int queenCol[]) {


        List<String> board=new ArrayList<>();


        for(int i=0;i<n;i++) {


            StringBuilder row=new StringBuilder();


            for(int j=0;j<n;j++) {


                if(queenCol[i]==j)
                    row.append("Q");

                else
                    row.append(".");
            }


            board.add(row.toString());
        }


        return board;
    }



    public static void main(String[] args) {


        System.out.println(
                solveNQueens(4)
        );
    }
}