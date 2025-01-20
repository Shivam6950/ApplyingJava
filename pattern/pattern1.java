public class pattern1 { 
        public static void main(String[] args) {
        // Inverted pyramid
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //+*+ and ++ 
        for (int i = 0; i < 2; i++) {
            // +*+ row
            for (int j = 0; j < 3; j++) {
                if (j % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            // ++ row
            for (int j = 0; j < 2; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
        // Final row
        System.out.println("+");
    }
}

    
