package Encoding;

public class Encoding {
    // Encoding
    public static String encode(String input) {
        StringBuilder encoded = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                encoded.append(count).append(input.charAt(i - 1));
                count = 1;
            }
        }

        // Append the last character's count and character
        encoded.append(count).append(input.charAt(input.length() - 1));

        return encoded.toString();
    }

    // Decoding
    public static String decode(String input) {
        StringBuilder decoded = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            int count = Character.getNumericValue(input.charAt(i));
            char character = input.charAt(i + 1);
            
            for (int j = 0; j < count; j++) {
                decoded.append(character);
            }

            i += 2;
        }

        return decoded.toString();
    }

    public static void main(String[] args) {
        String original = "AAAABBBCCDAA";
        
        String encoded = encode(original);
        System.out.println("Encoded: " + encoded);
        
        String decoded = decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}

    

