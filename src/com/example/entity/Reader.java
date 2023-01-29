package com.example.entity;

public class Reader {

//                1 ФИО,
//                2 номер читательского билета,
//                3 факультет,
//                4 дата рождения,
//                5 телефон.
//                6 Методы takeBook(), returnBook().
//                7 Разработать программу, в которой создается массив объектов данного класса.
//                8 Перегрузить методы takeBook(), returnBook():

// - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//  - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//  - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//  9  Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
//

        public String nameSurnameMiddleName;
        public int numberOfReadersTicket ;
        public String faculty;
        public String dateOfBirth;
        public String phoneNumber;

    public void printReaderInformation(Reader reader){
        System.out.println("Suranme Name Middle name: "+ reader.nameSurnameMiddleName);
        System.out.println("Number of Ticket: "+ reader.numberOfReadersTicket);
        System.out.println("Faculty: " + reader.faculty);
        System.out.println("Date of Birtday : " + reader.dateOfBirth);
        System.out.println("Phone number: " +reader.phoneNumber );
    }



    }
