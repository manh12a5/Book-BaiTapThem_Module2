package Book;

import java.util.Scanner;

public class FictionBook extends Book{

    //Danh sách thuộc tính
    private String category;

    //Danh sách phương thức
    public FictionBook() {
    }

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(int bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void addNewBook() {
        Scanner scanner = new Scanner(System.in);
        super.addNewBook();
        System.out.println("Nhập thể loại: ");
        category = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Thể loại: " + this.category;
    }

}
