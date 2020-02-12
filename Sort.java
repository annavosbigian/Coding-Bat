/*
https://techdevguide.withgoogle.com/paths/foundational/array-sort-problem-sorted-values/#!
Return an array that contains the sorted values from the input array with duplicates removed.


sort([]) → []
sort([1]) → [1]
sort([1, 1]) → [1]
*/

int[] sort(int[] a) {
  ArrayList<Integer> al = new ArrayList<>();
  for (int i = 0; i < a.length; i++){
    if (!al.contains(a[i])){
      al.add(a[i]);
    }
  }
  int[] sorted = new int[al.size()];
  for (int j = 0; j < al.size(); j++){
    sorted[j] = al.get(j);
  }
  return sorted;
}
