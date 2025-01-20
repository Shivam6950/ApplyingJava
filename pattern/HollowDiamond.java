public class HollowDiamond {
    public static void main(String[] args) {
        int x = 7, mid = x / 2;
        char[] Alphabet = {'A', 'B', 'C', 'D'}; 
        
        // Loop for row
        for (int i = 0; i < x; i++) {
            int letterIndex = Math.min(i, x - 1 - i); 
            char currentLetter = Alphabet[letterIndex % Alphabet.length]; 

            for (int j = 0; j < x; j++) {
                // Distance from the center
                int distance = Math.abs(mid - i) + Math.abs(mid - j);
                // Print the letter if distance = mid
                if (distance == mid) {
                    System.out.print(currentLetter + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
