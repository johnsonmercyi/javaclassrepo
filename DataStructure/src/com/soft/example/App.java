package com.soft.example;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import com.soft.example.beans.Question;

public class App {

  //ExamUtil eu;
  private Map<UUID, Question> exams = new HashMap<>();

  public App() {
    Question q = new Question();
    exams.put(q.getId(), q);

    //initialize the ExamUtil object
  }

  public Map<UUID, Question> getExams() {
    return exams;
  }

  public void welcome() {
    while(true) {
      //welcome the user
      //user taps a key to commence the exam
      //the question displays
      //the user types in an alphabet representating an answer
      //the answer is validated
      //if right, congratulate user and got to the next question
      //else tell the user they got it wrong and move on the next question still
      //at the end of the exam, calculate the score and display it to the user.
      //Optionally, you can grade the user's score
    }
  }

  public void displayQuestions() {
    for (Question q : exams.values()) {
      //display the question
      //wait for user to answer
      
    }
  }

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
  }
}
