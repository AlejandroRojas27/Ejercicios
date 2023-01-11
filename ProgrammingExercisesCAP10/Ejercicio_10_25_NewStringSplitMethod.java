package ProgrammingExercisesCAP10;

import java.util.Arrays;

public class Ejercicio_10_25_NewStringSplitMethod {
    public static void main(String[] args) {

        String s = "#ab#12#453#xox";

        System.out.println(Arrays.toString(split(s, "#")));

        String s2 = "a?b?gf#e";
        String regex = "[?#]";
        System.out.println(Arrays.toString(split(s2, regex)));
    }

    public static String[] split(String s, String regex) {
        String x = "";
        String[] ans = new String[s.length()];
        int j = 0;

        if (regex.length() == 1) {
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) != regex.charAt(0)) {
                    x += s.charAt(i);
                    ans[j] = x;
                } else if (s.charAt(i) == regex.charAt(0)) {
                    ans[j + 1] = regex;
                    j += 2;
                    x = "";
                }


            }

            int count = 0;
            for (int i = 0; i < ans.length; i++) {
                if (ans[i] != null) {
                    count++;
                }
            }


            String[] substrings = new String[count];
            int z = 0;
            for (int i = 0; i < ans.length; i++) {
                if (ans[i] != null) {
                    substrings[z] = ans[i];
                    z++;
                }
            }
            ans = substrings;

        } else if (regex.length() > 1) {
            String reg1 = "";
            int index = 0;

            String x1 = "";
            String[] answer = new String[s.length()];
            int j1 = 0;

            for (int i = 0; i < s.length(); i++) {

                for (int k = 1; k < regex.length() - 1; k++) {
                    if (s.charAt(i) != regex.charAt(k)) {
                        if (k == 1) {
                            x1 += s.charAt(i);
                            answer[j1] = x1;
                        }
                    } else if (s.charAt(i) == regex.charAt(k)) {
                        answer[j1 + 1] = String.valueOf(regex.charAt(k));
                        j1 += 2;
                        x1 = "";
                    }
                }


            }

            int count = 0;
            for (int i = 0; i < answer.length; i++) {
                if (answer[i] != null) {
                    count++;
                }
            }

            String[] substrings = new String[count];
            int z = 0;
            for (int i = 0; i < answer.length; i++) {
                if (answer[i] != null) {
                    substrings[z] = answer[i];
                    z++;
                }
            }

            String local = "";

            String[] ans1 = new String[2];

            int r = 0;
            x1 = "";

            for (int k = 2; k < regex.length() - 1; k++) {
                String reg = String.valueOf(regex.charAt(k));

                for (int i = 0; i < substrings.length; i++) {

                    if (substrings[i].length() > 1) {
                        index = i;

                        local = substrings[i];

                        for (int l = 0; l < local.length(); l++) {

                            if (local.charAt(l) != reg.charAt(0)) {
                                x1 += local.charAt(l);
                                ans1[r] = x1;
                            } else if (local.charAt(l) == reg.charAt(0)) {
                                ans1[r + 1] = String.valueOf(reg.charAt(0));
                                r += 2;
                                x1 = " ";
                            }

                            if (r == answer.length) {
                                String[] temp = new String[ans1.length + 1];
                                System.arraycopy(ans1, 0, temp, 0, ans1.length);
                                ans1 = temp;
                            }

                        }


                    }
                }

            }

            String[] b = new String[s.length()];
            System.arraycopy(substrings, 0, b, 0, index);

            System.arraycopy(ans1, 0, b, index, ans1.length);

            System.arraycopy(substrings, index + 1, b, index + ans1.length, index - ans1.length);

            ans = b;
        }

        return ans;
    }


}
