package com.example.logic;

import com.example.entity.Reader;

public class Logic {
    public void takeBook(int numberOfBooks, Reader reader) {

        System.out.println(reader.nameSurnameMiddleName + " took " + numberOfBooks + " books ");
    }

    public void takeBook(Reader reader,String... titlesOfBooks) {

        System.out.println(reader.nameSurnameMiddleName + ":  took the books ");
        for (String title : titlesOfBooks) {
            System.out.print(title);
        }
    }

    public void  returnBooks(Reader reader,String... titlesOfBooks) {
        System.out.println("""
                
                """);
        System.out.print(reader.nameSurnameMiddleName + " return the books: ");
        for (String title : titlesOfBooks) {
            System.out.print(title);
        }
    }
}
