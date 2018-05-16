package com.zsj.mybatis.util;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.zsj.mybatis.dao.StudentDao;
import com.zsj.mybatis.pojo.Student;

public class StudentUtil {

	private boolean isrun = true;
	private static SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
	private static StudentDao sd = sqlSession.getMapper(StudentDao.class);

	public static void showMenu() {
		System.out.println("***********************");
		System.out.println("*   1.添加学生                     *");
		System.out.println("*   2.删除学生                     *");
		System.out.println("*   3.更新学生                     *");
		System.out.println("*   4.查询学生                     *");
		System.out.println("*   0.退出                             *");
		System.out.println("***********************");
	}

	public static void findStudentMessage() {
		System.out.println("*************************************");
		System.out.println("请输入学生学号：");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Student student = sd.findStudent(str);
		sqlSession.commit();
		System.out.println("姓名|学号|年龄|语文|数学|英语");
		if (student == null) {
			System.out.println("结果：学生不存在。");
			System.out.println("*************************************");
			System.out.println();
			showMenu();
		} else {
			System.out.println(student);
			System.out.println("*************************************");
			System.out.println();
			showMenu();
		}
	}

	public static void addStudentMessage() {
		System.out.println("*************************************");
		System.out.println("请输入学生信息：");
		System.out.println("姓名,学号，年龄，语文，数学，英语");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] str1 = str.split(",");

		Student student = new Student(str1[1], str1[0], Integer.parseInt(str1[2]), Integer.parseInt(str1[3]),
				Integer.parseInt(str1[4]), Integer.parseInt(str1[5]));
		try {
			sd.addStudent(student);
			sqlSession.commit();
			System.out.println("结果：添加成功");
			System.out.println("*************************************");
			System.out.println();
			showMenu();
		} catch (Exception e) {
			System.out.println("结果：添加失败");
			System.out.println("*************************************");
			System.out.println();
			showMenu();
		}
	}

	public static void deleteStudentMessage() {
		System.out.println("*************************************");
		System.out.println("请输入学生学号：");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		try {
			sd.deleteStudent(str);
			sqlSession.commit();
			System.out.println("结果：删除成功");
			System.out.println("*************************************");
			System.out.println();
			showMenu();
		} catch (Exception e) {
			System.out.println("结果：删除失败");
			System.out.println("*************************************");
			System.out.println();
			showMenu();
		}
	}

	public static void updateStudentMessage() {
		System.out.println("*************************************");
		System.out.println("请输入学生信息：");
		System.out.println("姓名,学号，年龄，语文，数学，英语");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] str1 = str.split(",");

		Student student = new Student(str1[1], str1[0], Integer.parseInt(str1[2]), Integer.parseInt(str1[3]),
				Integer.parseInt(str1[4]), Integer.parseInt(str1[5]));
		try {
			sd.updateStudent(student);
			sqlSession.commit();
			System.out.println("结果：更新成功");
			System.out.println("*************************************");
			System.out.println();
			showMenu();
		} catch (Exception e) {
			System.out.println("结果：更新失败");
			System.out.println("*************************************");
			System.out.println();
			showMenu();
		}

	}

	public static void exitMessage() {
		System.out.println();
		System.out.println("***********************");
		System.out.println("*                     *");
		System.out.println("*                     *");
		System.out.println("*        谢谢使用               *");
		System.out.println("*                     *");
		System.out.println("*                     *");
		System.out.println("***********************");
	}
}
