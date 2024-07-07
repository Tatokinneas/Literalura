package challenge.literalura.literalura.main;

import challenge.literalura.literalura.repository.BooksRepository;
import challenge.literalura.literalura.service.Api;
import challenge.literalura.literalura.service.ConvertData;

import java.util.Scanner;

public class Main {
    private BooksRepository repo;
    private static final String URL_API = "https://gutendex.com/books/";
    private Api connectionApi = new Api();
    private ConvertData convertData = new ConvertData();
    private Scanner input = new Scanner(System.in);
    String menu = """
            -------------
            Elija la opcion indicada:
            1.- Buscar libro por titulo
            2.- Listar libros registrados
            3.- Listar autores registrados
            4.- Listar autores vivos en determinado año
            5.- Listar libros idioma
            0.- Salir
            --------------
            """;

    public Main(BooksRepository repo) {
        this.repo = repo;
    }

    public void run() {
        var option = -1;

        while (option != 0) {
            System.out.println(menu);
            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    searchBookByTitle();
                    break;
                case 2:
                    showRegisteredBooks();
                    break;
                case 3:
                    showRegisteredAuthors();
                    break;
                case 4:
                    showAliveAuthorsByYear();
                    break;
                case 5:
                    showBooksByLanguage();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }


        }
    }

    private void showBooksByLanguage() {
    }

    private void showAliveAuthorsByYear() {
        
    }

    private void showRegisteredAuthors() {
        
    }

    private void showRegisteredBooks() {
        
    }

    private void searchBookByTitle() {
        
    }
}
