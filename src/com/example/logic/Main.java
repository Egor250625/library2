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





    }
}
