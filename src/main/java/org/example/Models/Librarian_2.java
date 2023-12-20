package org.example.Models;

import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Librarian_2 {

    public void giveOutBookByFIFO(Library_2 library) {

        Queue<OrderUser_2> orderUser_2s = library.getFifo();
        orderUser_2s.forEach(user -> library.getBooks().stream()
                .filter(book -> book.getTitle().equals(user.getBookName()))
                .findFirst().ifPresent(book -> {
                    if (book.getCopies()< 1){
                        System.out.println(user.getUserName() + ", "
                                +book.getTitle() + " has been taken already.");
                    } else {
                        int remainingCopies = book.getCopies();
                        remainingCopies --;
                        book.setCopies(remainingCopies);
                        System.out.println(book.getTitle() + " has been borrowed by " + user.getUserName()
                                + "." );
                    }
                }));
        }

    public void giveOutBookByPriority(Library_2 library) {

        Queue<OrderUser_2> orderUser_2s = library.getPriorityOrder();
        orderUser_2s.forEach(user -> library.getBooks().stream()
                .filter(book -> book.getTitle().equals(user.getBookName()))
                .findFirst().ifPresent(book -> {
                    if (book.getCopies()< 1){
                        System.out.println(user.getUserName() + ", "
                                +book.getTitle() + " has been taken already.");
                    } else {
                        int remainingCopies = book.getCopies();
                        remainingCopies --;
                        book.setCopies(remainingCopies);
                        System.out.println(book.getTitle() + " has been borrowed by " + user.getUserName()
                                + "." );
                    }
                }));
    }
}
