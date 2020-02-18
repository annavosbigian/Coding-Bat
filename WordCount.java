/*
https://techdevguide.withgoogle.com/paths/foundational/wordcount-problem-classic-algorithm-hard/#!

The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.


wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
*/

public Map<String, Integer> wordCount(String[] strings) {
  HashMap<String, Integer> map = new HashMap<String, Integer>();
  for (int i = 0; i < strings.length; i++){
      if (!map.containsKey(strings[i])){
        map.put(strings[i], 1);
      }
      else {
        int j = map.get(strings[i]) + 1;
        map.put(strings[i], j);
      }
  }
  return map;
}
