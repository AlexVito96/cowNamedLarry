import java.io.Console;

public class Main {

  public static void main(String[] args) {
    Console console = System.console();
    
    
    cow cow = new cow("Larry");
   
    console.printf("The cow is named %s. %n", cow.getName());

  }
} 