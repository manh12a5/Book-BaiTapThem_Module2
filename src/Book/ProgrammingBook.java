package Book;

import java.util.Scanner;

public class ProgrammingBook extends Book{

    //Danh sách thuộc tính
    private String language;
    private String framework;

    //Danh sách phương thức
    public ProgrammingBook() {
    }

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(int bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public void addNewBook() {
        Scanner scanner = new Scanner(System.in);
        super.addNewBook();
        System.out.println("Nhập ngôn ngữ: ");
        language = scanner.nextLine();
        System.out.println("Nhập Framework: ");
        framework = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Ngôn ngữ: " + this.language + "\n" +
                "Framework: " + this.framework;

    }

}
