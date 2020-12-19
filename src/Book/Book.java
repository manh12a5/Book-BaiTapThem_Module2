package Book;

import java.util.Scanner;

public class Book {

    //Danh sách thuộc tính
    private int bookCode;
    private String name;
    private int price;
    private String author;

    //Danh sách phương thức
    public Book() {
    }

    public Book(int bookCode, String name, int price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void addNewBook() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        bookCode = scanner.nextInt();
        System.out.println("Nhập tên sách: ");
        name = scanner1.nextLine();
        System.out.println("Nhập giá tiền: ");
        price = scanner.nextInt();
        System.out.println("Nhập tên tác giả: ");
        author = scanner1.nextLine();
    }

    @Override
    public String toString() {
        return "Mã sách: " + this.bookCode + "\n" +
                "Tên sách: " + this.name + "\n" +
                "Giá tiền: " + this.price + "\n" +
                "Tên tác giả: " + this.author;
    }

}
