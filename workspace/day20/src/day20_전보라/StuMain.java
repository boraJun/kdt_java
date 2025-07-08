package day20_전보라;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StuMain {
	static ArrayList<Student> inputStudentInfoList(Scanner sc) {
		ArrayList<Student> studentList = new ArrayList<Student>();

		while (studentList.size() < 7) {
			System.out.println((studentList.size() + 1) + "번째 학생");
			System.out.print("이름 : ");

			String name = sc.nextLine();
			int age = -1;

			System.out.print("나이 : ");
			try {
				age = Integer.parseInt(sc.nextLine());
			} catch (RuntimeException e) {
				System.out.println("숫자를 입력하세요");
				continue;
			}

			try {
				int[] score = inputStudentScore(sc);

				Student s = new Student(name, age);
				s.addScore(score);

				for (int i = 0; i < studentList.size(); i++) {
					if (studentList.get(i).equals(s)) {
						studentList.get(i).addScore(score);
						continue;
					}
				}

				studentList.add(s);
			} catch (ScoreRangeException e) {
				System.out.println("점수는 0점~100점 사이의 값이어야합니다.");
			} catch (RuntimeException e) {
				System.out.println("숫자를 입력하세요");
				continue;
			}
		}

		return studentList;
	}

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
			System.out.println(student.getName() +  "님의 평균점수 : " + student.printAvg()); 
		}
	}
}
