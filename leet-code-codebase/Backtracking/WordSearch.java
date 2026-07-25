package Backtracking;

public class WordSearch {


    static boolean exists(char grid[][], String word) {


        int rows=grid.length;
        int cols=grid[0].length;


        boolean visited[][] =
                new boolean[rows][cols];


        for(int i=0;i<rows;i++) {


            for(int j=0;j<cols;j++) {


                if(backtrack(grid,word,0,
                        i,j,visited))
                    return true;
            }
        }


        return false;
    }



    static boolean backtrack(char grid[][],
                             String word,
                             int index,
                             int r,
                             int c,
                             boolean visited[]) {


        return false;
    }


    static boolean backtrack(char grid[][],
                             String word,
                             int index,
                             int r,
                             int c,
                             boolean visited[][]) {


        if(index==word.length())
            return true;



        if(r<0 || c<0 ||
                r>=grid.length ||
                c>=grid[0].length)
            return false;



        if(visited[r][c] ||
                grid[r][c]!=word.charAt(index))
            return false;



        visited[r][c]=true;



        boolean found =
                backtrack(grid,word,index+1,r+1,c,visited)
                ||
                backtrack(grid,word,index+1,r-1,c,visited)
                ||
                backtrack(grid,word,index+1,r,c+1,visited)
                ||
                backtrack(grid,word,index+1,r,c-1,visited);



        visited[r][c]=false;


        return found;
    }



    public static void main(String[] args) {


        char grid[][]={
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };


        System.out.println(
                exists(grid,"ABCCED")
        );
    }
}