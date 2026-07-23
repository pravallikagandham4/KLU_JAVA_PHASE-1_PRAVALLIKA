public class CharFrequency {
    public static void main(String[] args) {
        String input = "collection";
        int[] freq = new int[256];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            freq[c]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }
}
