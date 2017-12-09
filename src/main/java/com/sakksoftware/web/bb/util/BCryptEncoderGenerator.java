package com.sakksoftware.web.bb.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Scanner;

public class BCryptEncoderGenerator {

    public static void main(String[] args) {

        String plainText;

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the plain text you want to encode with BCrypt: ");

        plainText = inputScanner.nextLine();

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        System.out.println(bCryptPasswordEncoder.encode(plainText));

    }

}
