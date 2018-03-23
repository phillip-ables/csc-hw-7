package hw7;

import java.util.Scanner;

/*
course: CSC 190
project: hw7
date: 03-22-18
author: Phillip Ables
purpose: Declare and implement a class named MyString.  
This class will have a string data member s and the following methods:

A constructor: initialize s with the null string("" is the null string).
setMyString(): get a string as input parameter and assign it to s.
getMyString(): return s.
countChar(): find how many times each character of s repeats. If s = "launch at noon", this method should print

*/
class MyString
{
    String s;

    public void MyString(){
        s = "";
    }
    void setMyString(String inputParameter){
        s = inputParameter;
    }
    String getMyString(){
        return s;
    }
    void countChar(){
        String cString = s;
        String tString = s;
        String lString = "";
        char targetChar;
        int count;
        
        for(int i =0; i < cString.length(); i++){
            //for every charachter in current string
            //reset count and select current target char
            count = 0;
            targetChar = cString.charAt(i);
            for(int j = 0; j < tString.length(); j++){
                
                if(targetChar == tString.charAt(j)){
                    //when our char is equal to a charachter in the string
                    count++;
                }else{
                    //if not equal concat value to left over string
                    lString += tString.charAt(j);
                }
            }
            //display number of count if letter hasnt been counted and removed previously
            if(count > 0){
                if(count == 1)
                    System.out.println("\""+targetChar+"\" appears once in "+cString);
                else if(count == 2)
                    System.out.println("\""+targetChar+"\" appears twice in "+cString);
                else
                    System.out.println("''"+targetChar+"'' appears "+count+" times in "+cString);
            }
            tString = lString;
            lString = "";
        }
    }
}
public class Hw7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String uString, mString;

        System.out.println("Feed me String!!");
        uString = in.nextLine();
        
        //construct new MyString obj and set its value
        MyString myString = new MyString();
        myString.setMyString(uString);
        mString = myString.getMyString();
        System.out.println("String: "+mString);
        
        myString.countChar();
    
    }
}
