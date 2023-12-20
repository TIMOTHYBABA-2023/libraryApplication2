package org.example.Models;

import org.example.Enums.Category;

public class OrderUser_2 implements Comparable<OrderUser_2>{
        private Integer orderId;
        private String userName;
        private Category category;
        private String bookName;
        private User user;
        private Library_2 library2;

        public OrderUser_2 (User user, Library_2 library2) {
            this.library2 = library2;
            this.user = user;
            this.userName = user.getUserName();
            this.category = user.getCategory();
            this.bookName = user.getBookName();
            if (category == Category.TEACHER){
                this.orderId = 3;
            } else if (category == Category.SENIOR_STUDENT){
                this.orderId = 2;
            } else this.orderId = 1;

            library2.getPriorityOrder().add(this);
            library2.getFifo().add(this);
        }

        public Integer getOrderId() {
            return orderId;
        }

        public void setOrderId(Integer orderId) {
            this.orderId = orderId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public Category getCategory() {
            return category;
        }

        public void setCategory(Category category) {
            this.category = category;
        }

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public Library_2 getLibrary2() {
            return library2;
        }

        public void setLibrary2(Library_2 library2) {
            this.library2 = library2;
        }

        @Override
        public int compareTo(OrderUser_2 o) {
            return o.orderId < this.orderId ? 1 : 0;
        }
}
