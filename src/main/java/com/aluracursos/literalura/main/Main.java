package com.aluracursos.literalura.main;

import com.aluracursos.literalura.model.*;
import com.aluracursos.literalura.repository.BooksRepository;
import com.aluracursos.literalura.service.Api;
import com.aluracursos.literalura.service.ConvertData;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private BooksRepository repoBooks;

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

    public Main(BooksRepository repoBooks) {
        this.repoBooks = repoBooks;

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
        System.out.println("Estos son los libros en: " + "\n");

    }

    private void showAliveAuthorsByYear() {
        System.out.println("Estos son los autores vivos en el año " + ":\n");
    }

    private void showRegisteredAuthors() {
        System.out.println("Estos son los autores registrados en nuestra base de datos: \n");
    }

    private void showRegisteredBooks() {
        System.out.println("Estos son los libros registrados en nuestra base de datos: \n");
        List<Books> books = repoBooks.findAll();
        printBooks(books);

        //books.forEach(System.out::println);
    }

    private void searchBookByTitle() {
        DataBooks data = getDataBooks();
        Books book = new Books(data);

        List<Authors> authorsList = new ArrayList<>();
        for (int i = 0; i < data.authors().size(); i++) {
            Authors author = new Authors(data.authors().get(i));
            authorsList.add(author);
        }
        book.setAuthorsList(authorsList);
        repoBooks.save(book);
    }

    private DataBooks getDataBooks() {
        System.out.println("Escribe del libro:");
        var bookName = input.nextLine();
        System.out.println("Buscando libro por titulo... \n");
        var json = connectionApi.connectionApi(URL_API + "?search=" + bookName.replace(" ", "+"));

        Data data = convertData.getData(json, Data.class);
        Optional<DataBooks> foundBook = data.books().stream()
                .filter(l -> l.title().toUpperCase().contains(bookName.toUpperCase()))
                .findFirst();
        if (foundBook.isPresent()) {
            System.out.println("Libro Encontrado ");
            return foundBook.get();
        } else {
            System.out.println("Libro no encontrado");
        }
        return null;
    }

    public void printBooks(List<Books> books){
        if (!books.isEmpty()) {
            for (Books book : books){
                System.out.println("---------- LIBROS -------");
                System.out.println(" Titulo: " + book.getTitle());
                for (Authors authors : book.getAuthorsList()){
                    System.out.println(" Autor: " + authors.getName());
                    System.out.println(" Nacio en: " + authors.getBirth_year());
                    System.out.println(" Murio en: " + authors.getDeath_year());
                }
                System.out.println(" Idioma: " + book.getLanguages());
                System.out.println(" Descargas: " + book.getDownloads());
                System.out.println("-------------------------");
            }
        } else {
            System.out.println("No se han agregado libros");
        }
    }
}


