package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerBook {

    //Danh sách thuộc tính
    int numberProgrammingBook;
    int numberFictionBook;
    double totalProgrammingBook = 0;
    double totalFictionBook = 0;

    //Tạo mảng ProgrammingBook và FictionBook
    ArrayList<ProgrammingBook> arrProgrammingBook = new ArrayList<>();
    ArrayList<FictionBook> arrFictionBook = new ArrayList<>();

    //Danh sách phướng thức
    public ManagerBook() {
    }

    public void menuBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số sách Programming Book: ");
        numberProgrammingBook = scanner.nextInt();
        System.out.println("Nhập số sách Fiction Book: ");
        numberFictionBook = scanner.nextInt();
    }

    public void informationProgrammingBook() {
        System.out.println("Nhập thông tin Programming Book");
        for (int i = 0; i < numberProgrammingBook; i++) {
            System.out.println("Số thứ tự " + (i + 1));
            ProgrammingBook programmingBook = new ProgrammingBook();
            programmingBook.addNewBook();
            arrProgrammingBook.add(programmingBook);
        }
    }

    public void informationFictionBook() {
        System.out.println("Nhập thông tin Fiction Book");
        for (int i = 0; i < numberFictionBook; i++) {
            System.out.println("Số thứ tự " + (i + 1));
            FictionBook fictionBook = new FictionBook();
            fictionBook.addNewBook();
            arrFictionBook.add(fictionBook);
        }
    }

    public void listProgrammingBook() {
        System.out.println("Thông tin Programming Book");
        for (int i = 0; i < arrProgrammingBook.size(); i++) {
            System.out.println(arrProgrammingBook.get(i).toString());
        }
    }

    public void listFictionBook() {
        for (int i = 0; i < arrFictionBook.size(); i++) {
            System.out.println(arrFictionBook.get(i).toString());
        }
    }

    public void getTotalProgrammingBook() {
        for (int i = 0; i < arrProgrammingBook.size(); i++) {
            totalProgrammingBook += arrProgrammingBook.get(i).getPrice();
        }
        System.out.println("Tổng tiền Programming Book: " + totalProgrammingBook);
    }

    public void getTotalFictionBook() {
        for (int i = 0; i < arrFictionBook.size(); i++) {
            totalFictionBook += arrFictionBook.get(i).getPrice();
        }
        System.out.println("Tông tiền Fiction Book: " + totalFictionBook);
    }

    public double getTotalBook() {
        return totalProgrammingBook + totalFictionBook;
    }

    public int checkCount() {
        int count = 0;
        for (int i = 0; i < arrProgrammingBook.size(); i++) {
            if (arrProgrammingBook.get(i).getLanguage().contains("Java")
                    || arrProgrammingBook.get(i).getLanguage().contains("java")) {
                count++;
            }
        }
        return count;
    }

    //Gộp mảng
    //Tìm kiếm giá sách
    public void searchPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá sách cần tìm: ");
        int search = scanner.nextInt();
        ArrayList<Book> arrayBook = new ArrayList<>();
        arrayBook.addAll(arrProgrammingBook);
        arrayBook.addAll(arrFictionBook);
        for (int i = 0; i < arrayBook.size(); i++) {
            if (search == arrayBook.get(i).getPrice()) {
                System.out.println(arrayBook.get(i));
            }
        }
    }

}
