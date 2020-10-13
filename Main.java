/**
 * In this program, a procedure type methos called examGrade that takes an exam percentage as a parameter and prints out the associated letter grade is created.
 * @author Dafna Khripun
 */
public class Main {

  // determine the letter grade of the numerical grade
  public static void examGrade(int numericalGrade){
    
    // determine what letter grade represents the entered grade based on a grades chart
      // any mark below 50, is F
      if(numericalGrade < 50){
        System.out.println("F");

        // a mark between 50 and 59 (including 50 and 59) is considered a D
      }else if( numericalGrade >= 50 && numericalGrade <= 59){
        System.out.println("D");

        // a mark between 60 and 69 (including 60 and 69) is considered a C
      }else if( numericalGrade >= 60 && numericalGrade <= 69){
        System.out.println("C");

        // a mark between 70 and 79 (including 70 and 79) is considered a B
      }else if( numericalGrade >= 70 && numericalGrade <= 79){
        System.out.println("B");

        // any mark above 80 (including 80) is considered an A
      }else if(  numericalGrade >= 80){
        System.out.println("A");
      }
   
   
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // check the method using a number. Could as well use a user's input by importing a scanner.
    examGrade(60);
   
  }
}
