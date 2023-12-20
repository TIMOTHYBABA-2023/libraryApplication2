package org.example;

import org.example.Enums.Category;
import org.example.Models.Librarian_2;
import org.example.Models.Library_2;
import org.example.Models.OrderUser_2;
import org.example.Models.User;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        String fileName1 = "C:/Users/TIMOTHY O. BABA/IdeaProjects/LibraryBooks.xlsx";
        String sheetName1 = "graphic novels";

        Library_2 library2 = new Library_2();
        library2.addBooksToLibrary(fileName1,sheetName1);


        User user1 = new User("James", Category.JUNIOR_STUDENT, "Animal Stories");
        User user2 = new User("Comfort", Category.SENIOR_STUDENT, "Alone forever");
        User user3 = new User("Bob", Category.JUNIOR_STUDENT,"Alone forever");
        User user4 = new User("Timothy", Category.TEACHER,"Alone forever");
        User user5 = new User("Charles", Category.SENIOR_STUDENT,"Animal Stories");
        User user6 = new User("Tammy", Category.TEACHER,"Animal Stories");


        System.out.println("********----------------**********");

        OrderUser_2 orderUser_1 = new OrderUser_2(user1,library2);
        OrderUser_2 orderUser_2 = new OrderUser_2(user2,library2);
        OrderUser_2 orderUser_3 = new OrderUser_2(user3,library2);
        OrderUser_2 orderUser_4 = new OrderUser_2(user4,library2);
        OrderUser_2 orderUser_5 = new OrderUser_2(user5,library2);
        OrderUser_2 orderUser_6 = new OrderUser_2(user6,library2);

        Librarian_2 librarian2 = new Librarian_2();

        librarian2.giveOutBookByFIFO(library2);
        System.out.println("********----------------**********");;
        librarian2.giveOutBookByPriority(library2);

    }
}