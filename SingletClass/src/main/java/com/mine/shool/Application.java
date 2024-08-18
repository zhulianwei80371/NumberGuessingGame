package com.mine.shool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Application {
     public static void main(String[] args) {
    	 //3个学生
    	 List<Student> studentList= new ArrayList<Student>();
    	 Student st1=new Student("st1");
    	 Student st2=new Student("st2");
    	 Student st3=new Student("st3");
    	 studentList.add(st1);
    	 studentList.add(st2);
    	 studentList.add(st3);

    	 
    	 //3门课程
    	 List<Subject> subjectList= new ArrayList<Subject>();
    	 Subject sub1=new Subject(1,"sb1");
    	 Subject sub2=new Subject(2,"sb2");
    	 Subject sub3=new Subject(3,"sb3");
    	 subjectList.add(sub1);
    	 subjectList.add(sub2);
    	 subjectList.add(sub3);


    	 
    	 //分数
    	 List<TestResult> testResultList= new ArrayList<TestResult>();
    	 
    	 float baseScore = 90.0f;
    	 
    	 for(int i=0;i<3;i++) {
    		 for(int j=0;j<3;j++) {
    			 TestResult testResult= new TestResult(studentList.get(i),
    					 subjectList.get(j),baseScore);
    			 testResultList.add(testResult);
    		 }
    	 }
    	 
    	 for(int i=0;i<9;i++) {
 	 		System.out.println(testResultList.get(i).toString());
    	 }
    	 
    	 Map<Subject,TestResult>  maxScorceStuForSubject = new HashMap<Subject,TestResult>();
    	 
    	 for(int i=0;i<subjectList.size();i++) {
    		 Subject subject =subjectList.get(i);
    		 float maxScore = 0;
    		 TestResult testResult =null;
    		 for(int j=0;j<testResultList.size();j++) {
    			 if(testResultList.get(j).getSubject().equals(subject)) {
    				 if(testResultList.get(j).getScores()>=maxScore) {
    					 maxScore = testResultList.get(j).getScores();
    					 testResult = testResultList.get(j);
    				 }
    			 }
    		 }
    		 maxScorceStuForSubject.put(subject, testResult);
    	 }
    	 
    	 for(Subject subject:subjectList) {
    		 System.out.println(
    				 maxScorceStuForSubject.get(subject).getSubject().getName() +" "+
    				 maxScorceStuForSubject.get(subject).getStudent().getName() +" "+
    				 maxScorceStuForSubject.get(subject).getScores());
    	 }
    	 
    	 
    	 
    	 // 每个subject 最高分 学生
         // Group employees by department
//         Map<Department, List<Employee>> byDept
//             = employees.stream()
//                        .collect(Collectors.groupingBy(Employee::getDepartment));
         
//    	 testResultList.stream().collect(Collectors.groupingBy(item -> {
//    		 System.out.println(item.get)
//    	 }));
    	 
    	 Map<Subject, List<TestResult>> part = 
    			 testResultList.stream().collect(Collectors.groupingBy(TestResult::getSubject));
    	 
    	 Map<Subject, Float> maxscorce = new HashMap<Subject, Float>(); 
    	 
    	 part.forEach((key,value)->{
    		 maxscorce.put(
    				 key, 
    				 value.stream().max((p1,p2)->Float.compare(p1.getScores(),p2.getScores())).get().getScores());

    	 });
    	 
  		Map<Boolean, List<TestResult>> partition
  		
  		= testResultList.stream().collect(
  				Collectors.partitioningBy(x->x.getScores() == maxscorce.get(x.getSubject())));

  		System.out.println("---------------------");
   	   for(Map.Entry entry:partition.entrySet()){

   		 System.out.println(entry.getKey());

   		 System.out.println(entry.getValue());

   		 };
//       System.out.println("---------------------");
//    	 
//    	 System.out.println("---------------------");
//    	 for(Map.Entry entry:part.entrySet()){
//
//    		 System.out.println(entry.getKey());
//
//    		 System.out.println(entry.getValue());
//
//    		 };
//        System.out.println("---------------------");
//        for(Map.Entry entry:maxpart.entrySet()){
//
//   		 System.out.println(entry.getKey());
//
//   		 System.out.println(entry.getValue());
//
//   		 };
    	 
//    	 
    	 
// 		//the max score player
// 		PlayerRound maxPlayerRound = playerRoundList.stream().max((p1, p2) -> 
//    	 Integer.compare(p1.getTotalScore(), p2.getTotalScore())).get();
//         // players group by max score 
// 		Map<Boolean, List<PlayerRound>> part = playerRoundList.stream().collect(Collectors.partitioningBy(x -> x.getTotalScore()==maxPlayerRound.getTotalScore() ));
// 		
// 		System.out.println("The Overall winner/s:"); 
// 		part.get(true).stream().forEach(e->  System.out.println("Player:" +e.getPlayer().getName()));
    	 
     }
}
