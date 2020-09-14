package com.datastructure.backtrack;

public class StringPermutation {

    public static void main(String[] args) {

         permute("ABC",0,2);
    }


    /**
     * ABC => ABC ,ACB , BAC, BCA, CAB, CBA
     * <p>
     * A _ _
     *
     * @param str
     */
    public static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
            return;
        }
        for (int i = l; i <= r; i++) {
            if (i != l) {
                str = swap(str, i, l);
            }

            permute(str, l + 1, r);

            if (i != l) {
                str = swap(str, i, l);
            }
        }

    }

    private static String swap(String str, int i, int l) {
        char[] tpmparray = str.toCharArray();
        char temp = tpmparray[i];
        tpmparray[i] = tpmparray[l];
        tpmparray[l] = temp;
        return String.copyValueOf(tpmparray);
    }
}
