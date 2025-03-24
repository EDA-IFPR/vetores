package is_anagram;

public class Solution {
  public boolean isAnagram(String s, String t) {
    int[] contagem = new int[26];
    for (int i = 0; i < s.length(); i++) {
      contagem[(s.charAt(i) - 'a')]++;
    }
    for (int j = 0; j < t.length(); j++) {
      contagem[(t.charAt(j) - 'a')]--;
    }

    for (int c : contagem) {
      if (c != 0) {
        return false;
      }
    }

    return true;
  }
}
