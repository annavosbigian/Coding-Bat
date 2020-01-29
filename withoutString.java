/*
https://codingbat.com/prob/p192570

Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
*/

public class withoutString {

    public String withoutString(String base, String remove) {
        int start = 0;
        int stop = 0;
        //make it not case sensitive
        String baselow = base.toLowerCase();
        String removelow = remove.toLowerCase();
        StringBuilder sb = new StringBuilder("");
        //analyze letters in remove
        //compare to base
        //if it matches, take the segment of the base and add it to sb
        while (stop < base.length()){
            int i = 0;
            while (i < remove.length() && baselow.charAt(stop) == removelow.charAt(i)){
                i++;
                stop++;
                if (i==remove.length()){
                    sb.append(base.subSequence(start, stop - i));
                    start = stop;
                    stop--;
                }
                //if the base string ends in the middle of a match
                else if (stop == base.length()){
                    sb.append(base.subSequence(stop-i, stop));
                    start = base.length();
                    break;
                }
            }
            stop++;
        }
        if (start != base.length()){
            sb.append(base.subSequence(start, stop));
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String base = "Hello there";
        String base2 = "abxxxxab";
        String base3 = "xxx";
        String remove = "llo";
        String remove2 = "e";
        String remove3 = "xx";
        withoutString ws = new withoutString();
        System.out.println(ws.withoutString(base, remove));
        System.out.println(ws.withoutString(base, remove2));
        System.out.println(ws.withoutString(base, remove3));
        System.out.println(ws.withoutString(base2, remove3));
        System.out.println(ws.withoutString(base3, remove3));
    }

}
