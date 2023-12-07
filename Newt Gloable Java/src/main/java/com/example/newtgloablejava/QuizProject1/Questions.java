package com.example.newtgloablejava.QuizProject1;

public class Questions {
    private int id;
    private String question;
    private String otp1;
    private String otp2;
    private String otp3;
    private String otp4;
    private String answer;

    public Questions(int id, String question, String otp1, String otp2, String otp3, String otp4, String answer) {
        this.id = id;
        this.question = question;
        this.otp1 = otp1;
        this.otp2 = otp2;
        this.otp3 = otp3;
        this.otp4 = otp4;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getOtp1() {
        return otp1;
    }

    public String getOtp2() {
        return otp2;
    }

    public String getOtp3() {
        return otp3;
    }

    public String getOtp4() {
        return otp4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOtp1(String otp1) {
        this.otp1 = otp1;
    }

    public void setOtp2(String otp2) {
        this.otp2 = otp2;
    }

    public void setOtp3(String otp3) {
        this.otp3 = otp3;
    }

    public void setOtp4(String otp4) {
        this.otp4 = otp4;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
