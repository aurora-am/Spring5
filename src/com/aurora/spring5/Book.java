package com.aurora.spring5;

public class Book {

    private String bName;   //书名
    private String bAuthor; //作者

    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setbName("abc");
    }
}
