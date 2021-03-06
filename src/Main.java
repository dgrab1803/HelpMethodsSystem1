package academy.learnprogramming;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        char choice, ignore;
       for(;;){
        do {
            System.out.println("informacja o składni instrukcji");
            System.out.println(" 1. if ");
            System.out.println(" 2. switch ");
            System.out.println(" 3. for ");
            System.out.println(" 4. while ");
            System.out.println(" 5. do-while ");
            System.out.println(" 6. break");
            System.out.println(" 7. continue\n");
            System.out.println(" Wybierz numer instrukcji:  ");
            System.out.println(" Wybierz 'q' jeśli chcesz zakończyć ");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        }while(choice <'1' | choice >'7' & choice != 'q');

        if(choice == 'q') break;

        System.out.println("\n");
        switch (choice) {

            case '1':
                System.out.println("Instruckja warunkowa if:\n");
                System.out.println("if(warunek) instrukcja");
                System.out.println("else instruckja");
                break;
            case '2':
                System.out.println("Instrukcja wyboru switch:\n");
                System.out.println("switch(wyrazenie) {");
                System.out.println("case 'stała' : ");
                System.out.println("sekwencja instrukcji");
                System.out.println("break: ");
                System.out.println(" //... ");
                System.out.println(" } ");
                break;
            case '3':
                System.out.println("Pętla for:\n");
                System.out.println("for(inicjalizacja; warunek; iteracja)");
                System.out.println("instrukcja");
                break;
            case '4':
                System.out.println("instrukcja wyboru pętli while: \n ");
                System.out.println("while(warunek) instrukcja");
                break;
            case '5':
                System.out.println("instrukcja wyboru pętli do-while:\n");
                System.out.println("do{");
                System.out.println("instrukcja");
                System.out.println("}while (warunek)");
                break;
            case '6':
                System.out.println("instrukcja break:\n");
                System.out.println(" break; ; lub break etykieta;");
                break;
            case '7':
                System.out.println("instrukcja continue:\n");
                System.out.println("continue; lub continue etykieta;");
                break;
        }

       }
    }
}
