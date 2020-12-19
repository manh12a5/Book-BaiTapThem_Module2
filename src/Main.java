import Book.Book;
import Book.FictionBook;
import Book.ProgrammingBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ProgrammingBook> arrProgrammingBook = new ArrayList<>();
        ArrayList<FictionBook> arrFictionBook = new ArrayList<>();

        int numberProgrammingBook;
        int numberFictionBook;
        double totalProgrammingBook = 0;
        double totalFictionBook = 0;
        double totalBook;

        System.out.println("Nhập số sách Programming Book: ");
        numberProgrammingBook = scanner.nextInt();
        System.out.println("Nhập số sách Fiction Book: ");
        numberFictionBook = scanner.nextInt();

        //Nhập thông tin
        System.out.println("Nhập thông tin Programming Book");
        for (int i = 0; i < numberProgrammingBook; i++) {
            System.out.println("Số thứ tự " + (i + 1));
            ProgrammingBook programmingBook = new ProgrammingBook();
            programmingBook.addNewBook();
            arrProgrammingBook.add(programmingBook);
        }

        System.out.println("Nhập thông tin Fiction Book");
        for (int i = 0; i < numberFictionBook; i++) {
            System.out.println("Số thứ tự " + (i + 1));
            FictionBook fictionBook = new FictionBook();
            fictionBook.addNewBook();
            arrFictionBook.add(fictionBook);
        }

        System.out.println("\n");

        //Programming Book
        System.out.println("Thông tin Programming Book");
        for (int i = 0; i < arrProgrammingBook.size(); i++) {
            System.out.println(arrProgrammingBook.get(i).toString());
        }
        //Tông tiền Programming Book
        for (int i = 0; i < arrProgrammingBook.size(); i++) {
            totalProgrammingBook += arrProgrammingBook.get(i).getPrice();
        }
        System.out.println("Tông tiền Programming Book: " + totalProgrammingBook);

        System.out.println("\n");

        //Fiction Book
        System.out.println("Thông tin Fiction Book");
        for (int i = 0; i < arrFictionBook.size(); i++) {
            System.out.println(arrFictionBook.get(i).toString());
        }
        //Tông tiền Fiction Book
        for (int i = 0; i < arrFictionBook.size(); i++) {
            totalFictionBook += arrFictionBook.get(i).getPrice();
        }
        System.out.println("Tông tiền Fiction Book: " + totalFictionBook);

        System.out.println("\n");

        //Tổng tiền
        totalBook = totalFictionBook + totalProgrammingBook;
        System.out.println("Tông tiền phải chi là: " + totalBook);

        System.out.println("\n");

        //Đếm số sách có language là Java
        int count = 0;
        for (int i = 0; i < arrProgrammingBook.size(); i++) {
            if (arrProgrammingBook.get(i).getLanguage().contains("Java")
                    || arrProgrammingBook.get(i).getLanguage().contains("java"))
                count++;
        }
        System.out.println("Số sách có ngôn ngữ Java: " + count);

        System.out.println("\n");

        //Gộp 2 mảng vào 1 mảng
        ArrayList<Book> arrAllBooks = new ArrayList<>();
        arrAllBooks.addAll(arrProgrammingBook);
        arrAllBooks.addAll(arrFictionBook);

        //Tìm kiếm giá cuốn sách
        System.out.println("Nhập giá cần tìm: ");
        int checkPrice;
        checkPrice = scanner.nextInt();
        for (int i = 0; i < arrAllBooks.size(); i++) {
            if ( checkPrice == arrAllBooks.get(i).getPrice()) {
                System.out.println("Thông tin sách cần tìm: " + arrAllBooks.get(i));
            } else {
                System.out.println("Không có kết quả");
            }
        }


    }

}

