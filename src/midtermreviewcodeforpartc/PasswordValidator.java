/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

import java.util.Scanner;

/**
 *
 * @author grom6
 */

public class PasswordValidator {
    public static String validatePassword(){
        Scanner key = new Scanner(System.in);
        boolean valid = false;
        String password = "";
        
        while (!valid){
            System.out.println("Passwords must have at least 8 characters");
            System.out.println("Passwords must have at least one special character");
            System.out.println("Please enter your desired password:"); 
            
            password = key.nextLine();
            int specialCharCount=0;
            
            for(int i = 0; i < password.length(); i++)
            {
                if (!(Character.isLetterOrDigit(password.charAt(i))))
                {
                    specialCharCount++;
                }
            }
            
            if (specialCharCount >= 1 && password.length() >= 8)
            {
                valid = true;
            }
        }
        
        return password;
    }
}
