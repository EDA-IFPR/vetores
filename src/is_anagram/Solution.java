package is_anagram;

public class Solution {
  public boolean isAnagram(String s, String t) {
    int[] contagem = new int[26];
    char[] sw = s.toCharArray();
    char[] tw = t.toCharArray();
    for (int i = 0; i < sw.length; i++) {
      contagem[(sw[i] - 'a')]++;
    }
    for (int j = 0; j < sw.length; j++) {
      contagem[(tw[j]) - 'a']--;
    }

    for (int c : contagem) {
      if (c != 0) {
        return false;
      }
    }

    return true;
  }
}
