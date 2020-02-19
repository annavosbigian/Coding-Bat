/*
https://techdevguide.withgoogle.com/paths/foundational/evenlyspaced-problem-medium/#!

Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
*/

public boolean evenlySpaced(int a, int b, int c) {
  int small = a;
  int med = b;
  int large = c;
  if (a > b || a > c){
    if (a > b && a > c){
      large = a;
      if (b<c){
        small=b;
        med = c;
      }
      else{
        small=c;
      }
    }
    else{
      med = a;
      if (b>c){
        large=b;
        small=c;
      }
      else{
        small=b;
      }
    }
  }
  else if (b>c){
    med = c;
    large = b;
  }
  return (med-small == large-med);
}
