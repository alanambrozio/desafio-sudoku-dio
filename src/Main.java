import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Generate the starting numbers for the Sudoku puzzle
        StartingNumbers.generateStartingNumbers();

        // Print the generated starting numbers
        StartingNumbers.printStartingNumbers();

        while (true) {
            // Display the menu and handle user input
            Display.displayMenu();
            System.out.println("Deseja continuar? (s/n)");
            Scanner scanner = new Scanner(System.in);
            String continueGame = scanner.nextLine();
            StartingNumbers.printStartingNumbers();
            if (!continueGame.equalsIgnoreCase("s")) {
                System.out.println("Saindo do jogo.");
                break; // Exit the loop if the user does not want to continue
            }
        }

    }


    }