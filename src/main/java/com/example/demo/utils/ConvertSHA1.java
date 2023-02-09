package com.example.demo.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

public class ConvertSHA1 {
  public static String convertSHA1(String input){
    try {
      MessageDigest md = MessageDigest.getInstance("SHA-1");
      byte[] messageDisgest = md.digest(input.getBytes());
      BigInteger no = new BigInteger(1, messageDisgest);
      String hashText = no.toString(16);
      while(hashText.length()<32){
        hashText = "0"+ hashText;
      }
      return hashText;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
