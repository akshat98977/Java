import java.io.*;
import java.util.*;

public class Main {
  public static int[] map1 = new int[26];
  public static int[] map2 = new int[26];
  static boolean isAnagram(String a, String b) {
    for(int i = 0; i < a.length(); i++){
      if(a.charAt(i) - 'a' >= 0){
        map1[a.charAt(i) - 'a']++;
      }
      else if(a.charAt(i) - 'A' >= 0){
        map1[a.charAt(i) - 'A']++;
      }

    }
    for(int i = 0; i < b.length(); i++){
      if(a.charAt(i) - 'a' >= 0){
        map2[a.charAt(i) - 'a']++;
      }
      else if(a.charAt(i) - 'A' >= 0){
        map2[a.charAt(i) - 'A']++;
      }

    }
    for(int i = 0; i < 26; i++){
      if(map1[i] != map2[i]){
        return false;
      }
    }
    System.out.println(map1[19] + " " + map2[19]);
    return true;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for(int i = 0; i < num; i++){
      int n = 1;
      for(int j= 0; j < num; j++){
        if(i == 0 || j == 0 || i == num-1 || j == num-1){
          System.out.print(n);
          n++;
        }

      }
      System.out.println();
    }
  }
}



