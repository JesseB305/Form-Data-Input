# Form-Data-Input
Console asks for a specific set of data, user must enter appropriate data relative to console request. Similar to application fillouts

import java.util.Scanner;

public class AutoClassRunner{

  public static void main(String[]args){
    AutoClass newUser = new AutoClass();

    System.out.println(newUser.getGreeting());
    Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
    
    
    System.out.println(newUser.beginApplication());
    statement = in.nextLine();
    
    
while(!statement.equals("Cancel")){
  if(statement.equals("")){
    System.out.println(newUser.getFirstName(statement));
    statement = in.nextLine();
    }
    }
    
  else if(!statement.equals("")){
    while(!statement.equals("")){
      System.out.println(newUser.askLastName());
      statement = in.nextLine();
      }
      }
      
      }
      }
      
