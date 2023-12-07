package com.example.newtgloablejava.QuizProject1;

import java.net.PortUnreachableException;
import java.util.Scanner;

public class QuestionSevice {
    Questions questions[] = new Questions[5];
    public QuestionSevice() {
        questions[0] = new Questions(1, "What is the size of the 'int' data type in Java?", "4 bytes", "2 bytes", "8 bytes", "Depends on the platform", "4 bytes");
        questions[1] = new Questions(2, "How much memory does a 'double' data type occupy?", "4 bytes", "8 bytes", "16 bytes", "Depends on the platform", "8 bytes");
        questions[2] = new Questions(3, "What is the default value of 'boolean' in Java?", "true", "false", "0", "null", "false");
        questions[3] = new Questions(4, "Which keyword is used to declare constants in Java?", "const", "final", "static", "volatile", "final");
        questions[4] = new Questions(5, "What is the difference between 'float' and 'double'?", "'float' is 32-bit, 'double' is 64-bit", "'float' is 64-bit, 'double' is 32-bit", "No difference, they are the same", "Depends on the platform", "'float' is 32-bit, 'double' is 64-bit");
    }

    public void displayQuestions()
    {
        for(Questions q : questions)
        {
            System.out.println("Question no : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println("A : "+q.getOtp1());
            System.out.println("B : "+q.getOtp2());
            System.out.println("C : "+q.getOtp3());
            System.out.println("D : "+q.getOtp4());
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            System.out.println("Enter your Answer : "+ str);

            if(str.equals(q.getAnswer()))
                System.out.println("Your answer is correct");
            else
                System.out.println("Correct answer is : "+ q.getAnswer());
                System.out.println("Your answer is wrong");

            System.out.println();

        }
    }
}
