import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
    floodfill(arr, 0, 0, "");
  }

  // asf -> answer so far
  public static void floodfill(int[][] maze, int sr, int sc, String asf) {
    if (sr < 0 || sc < 0 || sr == maze.length || sc == maze[0].length || maze[sr][sc] == 1) {
      return;         //1
    }
    if (sr == maze.length - 1 && sc == maze[0].length - 1) { //2
      System.out.println(asf);
      return;
    }

    floodfill(maze, sr - 1, sc, asf + "t"); //3
    floodfill(maze, sr, sc - 1, asf + "l"); //4
    floodfill(maze, sr + 1, sc, asf + "d"); //5
    floodfill(maze, sr, sc + 1, asf + "r"); //6

  }
