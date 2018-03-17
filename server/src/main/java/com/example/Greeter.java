package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
/ **
  adding check style warning to add comment
  */
  
  public String final greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
