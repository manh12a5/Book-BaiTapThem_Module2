import Book.ManagerBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerBook managerBook = new ManagerBook();

        //Điền thông tin Book
        managerBook.menuBook();
        managerBook.informationProgrammingBook();
        managerBook.informationFictionBook();
        System.out.println("\n");

        //Hiển thị thông tin Book đã nhập
        //Tính tổng các loại sách
        //Tìm kiếm
        int number;
        do {
            System.out.println("1. Thông tin Programming Book");
            System.out.println("2. Thông tin Fiction Book");
            System.out.println("3. Tổng tiền Programming Book");
            System.out.println("4. Tổng tiền Fiction Book");
            System.out.println("5. Tổng tiền");
            System.out.println("6. Tìm kiếm ngôn ngữ Java trong ProgrammingBook");
            System.out.println("7. Tìm kiếm giá tiền");
            System.out.println("0. Exit");
            System.out.println("Choice Number: ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    managerBook.listProgrammingBook();
                    break;
                case 2:
                    managerBook.listFictionBook();
                    break;
                case 3:
                    managerBook.getTotalProgrammingBook();
                    break;
                case 4:
                    managerBook.getTotalFictionBook();
                    break;
                case 5:
                    System.out.println("Tông tiền: " + managerBook.getTotalBook());
                    break;
                case 6:
                    System.out.println("Số lượng sách có ngôn ngữ Java trong Programming Book: " +
                            managerBook.checkCount());
                    break;
                case 7:
                    managerBook.searchPrice();
                    break;
            }
            System.out.println("\n");
        } while (number != 0);
        System.exit(0);

    }
}

