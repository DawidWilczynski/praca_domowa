import java.util.Scanner;

public class Klub {
    public static void main(String[] args) {
        System.out.println("Jak masz na imie?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(" Czesc "+name+" milo cie poznac. Ile masz lat");
        int age = scanner.nextInt();
        if(age >= 21){
            System.out.println("Masz wjazd do klubu mordo");
        } else {
            System.out.println("Mordo musisz jeszcze poczekac");
    }
}}
