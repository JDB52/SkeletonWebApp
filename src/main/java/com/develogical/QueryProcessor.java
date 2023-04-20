package com.develogical;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QueryProcessor {

  public String process(String query) {

    if (query.toLowerCase().contains("shakespeare")) {
      return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
          + "English poet, playwright, and actor, widely regarded as the greatest "
          + "writer in the English language and the world's pre-eminent dramatist.";
    }

    if (query.toLowerCase().contains("your name")) {
      return "WeatheredWaterfall";
    }

    if (query.toLowerCase().contains("plus")) {
      String[] queryArray = query.split(" ");
      Integer num1 = Integer.parseInt(queryArray[2]);
      String num2AsString = queryArray[4].replace("?", "");
      Integer num2 = Integer.parseInt(num2AsString);
      String total = String.valueOf(num1 + num2);
      return total;
    }

    if (query.toLowerCase().contains("numbers is the largest")) {
      String substringNumbers = query.substring(47);
      String[] queryArray = substringNumbers.split(", ");
      Integer num1 = Integer.parseInt(queryArray[0]);
      Integer num2 = Integer.parseInt(queryArray[1]);
      String num3AsString = queryArray[2].replace("?", "");
      Integer num3 = Integer.parseInt(num3AsString);
      Integer[] numbers = {num1, num2, num3};
      Arrays.sort(numbers);
      String largest = String.valueOf(numbers[2]);
      return largest;
    }

    if (query.toLowerCase().contains("multiplied")) {
      String[] queryArray = query.split(" ");
      Integer num1 = Integer.parseInt(queryArray[2]);
      String num2AsString = queryArray[5].replace("?", "");
      Integer num2 = Integer.parseInt(num2AsString);
      String total = String.valueOf(num1 * num2);
      return total;
    }

    return "";
  }
}
