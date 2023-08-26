public class loops {
    public static void main(String[] args) {
        for (int counter = 0 ; counter < 4; counter = counter + 1){
            System.out.println("HEllo World!@");
        }

        int counter = 0;
        for (counter = 0; counter<4;counter++) {
            System.out.print("HEllo\n");
        }
        counter = 0 ;
         while(counter < 10){
             System.out.print((counter + 1) + " ");
             counter++;
         }

         // do While
        int i = 0;
        do {
            System.out.print(i+" ");
            i++;
        }while(i<11);
        System.out.println("\n");
        // change in do while false condition......
        i = 14;
        do {
            System.out.println(i);
            i++;
        }while (i<11);
    }
}
