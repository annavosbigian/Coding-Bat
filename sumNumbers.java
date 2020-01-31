import java.util.ArrayList;

public class sumNumbers {
    public int sumNumbers(String str){
        int sum = 0;
        //store ints
        ArrayList<Integer> ints = new ArrayList<Integer>();
        //go thru str
        for (int i = 0; i < str.length();){
            int segment = i;
            while (Character.isDigit(str.charAt(i))){
                i++;
                if (i==str.length() || !Character.isDigit(str.charAt(i))){
                    ints.add(Integer.parseInt(str.substring(segment, i)));
                    i--;
                    break;
                }
            }
            i++;
        }
        for (Integer x : ints){
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        String int1 = "abc123xyz";
        String int2 = "aa11b33";
        String int3 = "7 11";
        sumNumbers sn = new sumNumbers();
        System.out.println(sn.sumNumbers(int1));
        System.out.println(sn.sumNumbers(int2));
        System.out.println(sn.sumNumbers(int3));
    }
}
