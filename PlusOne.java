class PlusOne {

  public int[] one(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i++) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }
    }
  }

  public void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 9 };
    System.out.println(one(arr));
  }
}
