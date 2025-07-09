package day20_전보라;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StuMain {
	//최대 학생 수
	static final int MAX_STUDENT = 7;
	
	static ArrayList<Student> inputStudentInfoList(Scanner sc) {
		ArrayList<Student> studentList = new ArrayList<Student>();

		//7명 입력 받을때까지
		while (studentList.size() < MAX_STUDENT) {
			System.out.println((studentList.size() + 1) + "번째 학생");
			System.out.print("이름 : ");

			String name = sc.nextLine();
			int age = -1;

			System.out.print("나이 : ");
			try {
				age = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요");
				continue;
			} catch(Exception e) {
				System.out.println("다시 입력하세요");
				continue;
			}

			Student student = new Student(name, age);
			
			try {
				addStudentList(sc, studentList, student);
			} catch (ScoreRangeException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요");
				continue;
			} catch(Exception e) {
				System.out.println("다시 입력하세요");
				continue;
			}
		}

		return studentList;
	}
	
	//객체를 리스트에 추가 또는 객체 메소드 호출
	static void addStudentList(Scanner sc, ArrayList<Student> studentList, Student student)  throws Exception{
		int[] score = inputStudentScore(sc);

		student.addScore(score);

		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).equals(student)) {
				studentList.get(i).addScore(score);
				System.out.println("동일 학생 점수 변경");
				return;
			}
		}

		studentList.add(student);
	}

	//점수 입력
	static int[] inputStudentScore(Scanner sc) throws RuntimeException, ScoreRangeException {
		int[] scores = new int[3];

		System.out.print("수학 : ");
		scores[Student.SCORE.MATH.idx] = Integer.parseInt(sc.nextLine());

		System.out.print("영어 : ");
		scores[Student.SCORE.ENG.idx] = Integer.parseInt(sc.nextLine());

		System.out.print("국어 : ");
		scores[Student.SCORE.KOR.idx] = Integer.parseInt(sc.nextLine());
		
		return scores;
	}

	public static void main(String[] args) {
		ArrayList<Student> studentList = null;
		Scanner sc = new Scanner(System.in);

		studentList = inputStudentInfoList(sc);
		
		for(Student student : studentList) {
			System.out.printf("%s(%d살)님의 평균 점수 : %.2f점\n", student.getName(), student.getAge(), student.printAvg());
		}
	}
}
