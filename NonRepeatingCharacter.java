package LearningGit;

import java.util.*;

public class NonRepeatingCharacter {
    public static void main(String args[]) {
        String S = "aabcc";
        int l = S.length();
        char s[] = S.toCharArray();
        ArrayList<Character> list = new ArrayList<Character>(l);
        Character answer = '$';
        ArrayList<Character> temp = new ArrayList<Character>(1);

        for (int i = 0; i < l; i++) {
            list.add(s[i]);
        }

        while (list.isEmpty() == false) {
            temp.add(list.get(0));
            list.remove(0);

            if (list.contains(temp.get(0)) == false) {
                answer = temp.get(0);
                break;
            } else {
                list.removeAll(temp);
                temp.clear();
            }
        }
        System.out.println(answer);
    }
}
