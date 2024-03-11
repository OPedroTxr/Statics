package pkgstatic;

import classes.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    
    public static int printMenu() {
        Scanner read = new Scanner(System.in);
        System.out.println(" - - - - - - - - - - ");
        System.out.println("1- Insert people");
        System.out.println("2- Remove people");
        System.out.println("3- Search people");
        System.out.println("0- Exit menu");
        System.out.println(" - - - - - - - - - - ");
        System.out.print("select an option: ");
        return read.nextInt();
    }

    public static int searchBy() {
        Scanner read = new Scanner(System.in);
        System.out.println("You want to search for: ");
        System.out.println("1- Nome");
        System.out.println("2- Idade");
        System.out.println("0 - Return to menu");
        System.out.println(" - - - - - - - - - - - - ");
        System.out.print("select an option: ");
        return read.nextInt();
    }
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Pessoa> listOfPeoples = new ArrayList<>();
        
        int menuOption = 0;

        do {
            menuOption = printMenu();

            if (menuOption == 1) {
                //Insert
                Pessoa pessoa = new Pessoa();
                pessoa.fill();
                listOfPeoples.add(pessoa);
            } else if (menuOption == 2) {
                //Remove
                String remove = read.nextLine();

                for (int i = 0; i < listOfPeoples.size(); i++) {
                    Pessoa _pessoa = listOfPeoples.get(i);
                    if (remove.equals(_pessoa.getNome())) {
                        listOfPeoples.remove(_pessoa);
                    }
                }
            }
            if (menuOption == 3) {
                //Search
                int searchOption = searchBy();

                switch (searchOption) {
                    case 1:
                        System.out.print("Title: ");
                        String title = read.nextLine();
                        for (int i = 0; i < listOfPeoples.size(); i++) {
                            Pessoa _pessoa = listOfPeoples.get(i);
                            if (title.equals(_pessoa.getNome())) {
                                _pessoa.printSummary();
                            }
                        }   break;
                    case 2:
                        System.out.print("Author: ");
                        String author = read.nextLine();
                        for (int i = 0; i < listOfPeoples.size(); i++) {
                            Pessoa _pessoa = listOfPeoples.get(i);
                            if (author.equals(_pessoa.getIdade())) {
                                _pessoa.printSummary();
                            }
                        }   break;
                    case 0:
                        System.out.println("Voltando ao menu!");
                        break;
                    default:
                        break;
                }
            }
        } while (menuOption != 0);

        
        
    }
    
}
