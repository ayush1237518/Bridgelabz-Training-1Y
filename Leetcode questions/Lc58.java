class Lc58 {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String lastWord = arr[arr.length-1];
        return lastWord.length();

    }
}