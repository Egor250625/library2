package com.example.logic;

import com.example.entity.Reader;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        Logic logic = new Logic();


        reader.nameSurnameMiddleName = "Ivanov Egor Gennadzievich";
        reader.numberOfReadersTicket = 1234567;
        reader.faculty = "";
        reader.dateOfBirth = "25.07.2006";
        reader.phoneNumber = "+375296754567";
        reader.printReaderInformation(reader);
        logic.takeBook(15, reader);
        logic.takeBook( reader,"Adventures ","vocabulary ","encyclopedia ");
        logic.returnBooks(reader, "Romans ", "Horror ");

        System.out.println("""
                                  
                                  
                """);


//        Reader reader1 = new Reader();
//        reader1.nameSurnameMiddleName = "   ";
//        reader1.numberOfReadersTicket = 12348967;
//        reader1.faculty = "";
//        reader1.dateOfBirth = "2.09.2004";
//        reader1.phoneNumber = "+375331236547";
//        reader1.printReaderInformation(reader1);
//        logic.takeBook(13, reader1);
//        logic.takeBook("Adventures ","encyclopedia");


    }
}
