/*
https://techdevguide.withgoogle.com/paths/foundational/interpreter-problem-for-java/#!
Write a simple interpreter which understands "+", "-", and "*" operations. Apply the operations in order using command/arg pairs starting with the initial value of `value`. If you encounter an unknown command, return -1.


interpret(1, ["+"], [1]) → 2
interpret(4, ["-"], [2]) → 2
interpret(1, ["+", "*"], [1, 3]) → 6
*/

public int interpret(int value, String[] commands, int[] args) {
  int total = value;
  if (commands.length != args.length){
    return -1;
  }
  for (int i = 0; i < commands.length; i++){
    if (commands[i] == "+"){
      total += args[i];
    }
    else if (commands[i] == "-"){
      total -= args[i];
    }
    else if (commands[i] == "*"){
      total *= args[i];
    }
    else {
      return -1;
    }
  }
  return total;
}
