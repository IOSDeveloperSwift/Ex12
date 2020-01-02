package com.Doloscan;

public class Main {

    public static void main(String[] args) {

        //1
        
        System.out.println("Ex12.1");

        String getCharacter = "Let’s go home,it’s late already!";
        //12.1.1
        System.out.println(getCharacter.charAt(6));
        System.out.println(getCharacter.charAt(10));
        //12.1.2
        System.out.println(getCharacter.contains("late"));
        //12.1.3
        System.out.println(getCharacter.endsWith("already!"));
        //12.1.4
        System.out.println(getCharacter.equals("Let’s go home,it’s late already!"));
        //12.1.5
        System.out.println(getCharacter.equalsIgnoreCase("LET’S GO HOME,IT’S LATE ALREADY!"));


        //2
        System.out.println("-------");
        System.out.println("Ex12.2");

        String replaceCharacter = "    The quick brown fox jumps over the lazy dog";
        //Ex12.2.1
        System.out.println(replaceCharacter.replace('d','f'));
        //Ex12.2.2
        System.out.println(replaceCharacter.toLowerCase());
        //Ex12.2.3
        System.out.println(replaceCharacter.trim());


        //3
        System.out.println("-------");
        System.out.println("Ex12.3");

        String str1 = "Shanghai Houston Colorado Alexandria";
        String str2 = "Alexandria Colorado Houston Shanghai";

        boolean match1 = str1.regionMatches(0, str2, 28, 8);
        boolean match2 = str1.regionMatches(9, str2, 9, 8);

        System.out.println("str1[0 - 7] == str2[28 - 35]? " + match1);
        System.out.println("str1[9 - 15] == str2[9 - 15]? " + match2);





    }
}
