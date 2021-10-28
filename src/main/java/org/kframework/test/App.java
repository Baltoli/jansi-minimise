package org.kframework.test;

import org.fusesource.jansi.AnsiConsole;
import org.fusesource.jansi.internal.CLibrary;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    AnsiConsole.systemInstall();
    System.out.println("Hello World!");
    System.out.println(CLibrary.STDOUT_FILENO);
    AnsiConsole.systemUninstall();
  }
}
