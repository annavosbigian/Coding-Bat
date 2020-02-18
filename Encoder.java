/*
https://techdevguide.withgoogle.com/paths/foundational/encoder-problem-hard/#!

Write a function that replaces the words in `raw` with the words in `code_words` such that the first occurrence of each word in `raw` is assigned the first unassigned word in `code_words`.


encoder(["a"], ["1", "2", "3", "4"]) → ["1"]
encoder(["a", "b"], ["1", "2", "3", "4"]) → ["1", "2"]
encoder(["a", "b", "a"], ["1", "2", "3", "4"]) → ["1", "2", "1"]
*/

public String[] encoder(String[] raw, String[] code_words) {
  String[] encoded = new String[raw.length];
  HashMap<String, String> map = new HashMap<String, String>();
  int codeLocation = 0;
  for (int i = 0; i < raw.length; i++) {
      if (!map.containsKey(raw[i])){
        map.put(raw[i], code_words[codeLocation]);
        encoded[i] = code_words[codeLocation];
        codeLocation++;
      }    
      else {
        encoded[i] = map.get(raw[i]);
      }
  }
  return encoded;
}
