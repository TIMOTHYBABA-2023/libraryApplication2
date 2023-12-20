package org.example.Services;

import org.example.Models.Library_2;
import org.example.Models.OrderUser_2;

import java.util.Queue;

public interface LibrarianServiceImpl {

    public void giveOutBook(Library_2 library, Queue<OrderUser_2> orderUserPriorityQueue);

}

