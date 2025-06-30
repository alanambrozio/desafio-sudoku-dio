import java.util.Scanner;

public class Display {
    static void displayMenu() {
        System.out.println("Escolha uma opção: \n" +
                "1 - Adicionar número\n" +
                "2 - Remover número\n" +
                "3 - Verificar se o jogo está completo\n" +
                "4 - Sair");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Digite a linha (0-8): ");
                int row = scanner.nextInt();
                if (row < 0 || row >= 9) {
                    System.out.println("Linha inválida. Deve ser entre 0 e 8.");
                    return;
                }
                System.out.println("Digite a coluna (0-8): ");
                int col = scanner.nextInt();
                System.out.println("Digite o número (1-9): ");
                int num = scanner.nextInt();
                if (Game.addNumber(StartingNumbers.startingNumbers, row, col, num)) {
                    System.out.println("Número adicionado com sucesso.");
                } else {
                    System.out.println("Número inválido ou posição já ocupada.");
                }
                break;
            case 2:
                System.out.println("Digite a linha (0-8) e coluna (0-8) para remover:");
                row = scanner.nextInt();
                col = scanner.nextInt();
                if (row >= 0 && row < 9 && col >= 0 && col < 9) {
                    StartingNumbers.startingNumbers[row][col] = 0; // Remove the number by setting it to 0
                    System.out.println("Número removido com sucesso.");
                } else {
                    System.out.println("Posição inválida.");
                }
                break;
            case 3:
                boolean isComplete = true;
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (StartingNumbers.startingNumbers[i][j] == 0) {
                            isComplete = false;
                            break;
                        }
                    }
                    if (!isComplete) {
                        break;
                    }
                }
                if (isComplete) {
                    System.out.println("O jogo está completo!");
                } else {
                    System.out.println("O jogo ainda não está completo.");
                }
                break;
            case 4:
                System.out.println("Saindo do jogo. Até logo!");
                break;
        }
    }
}
