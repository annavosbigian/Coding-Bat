//https://techdevguide.withgoogle.com/paths/foundational/find-longest-word-in-dictionary-that-subsequence-of-given-string#code-challenge

public class Subsequence {

    public String findWord(String S, String[] D){
        //find W - subsequence of S
        String W = "";
        //which string within D are we looking at
        int spot = 0;
        //go thru each word
        while (spot < D.length){
            if (D[spot].length() <= W.length()) {
                spot++;
                continue;
            }
            //compare each char of D to S
            int Dloc = 0;
            int Sloc = 0;
            //go thru each word
            while (Dloc < D[spot].length()){
                //if S contains char
                while (Sloc < S.length() && D[spot].charAt(Dloc) != ((S.charAt(Sloc)))){
                    Sloc++;
                    }
                Dloc++;
                //break if we get to the end of S before the end of D
                if (Sloc == S.length() && Dloc != D[spot].length()){
                    break;
                }
            }
            //if you get to the end of Dloc, add it to W
            if (Dloc == D[spot].length()) {
                W = D[spot];
            }
            spot++;
        }
        return W;
        }

        public static void main(String[] args){
            String S = "abppplee";
            String[] D = {"able", "ale", "apple", "bale", "kangaroo"};
            Subsequence sub = new Subsequence();
            System.out.println(sub.findWord(S, D));
        }

    }

