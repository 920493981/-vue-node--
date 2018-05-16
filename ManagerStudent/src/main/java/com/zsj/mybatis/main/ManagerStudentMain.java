package com.zsj.mybatis.main;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.zsj.mybatis.dao.StudentDao;
import com.zsj.mybatis.util.SqlSessionFactoryUtil;
import com.zsj.mybatis.util.StudentUtil;

public class ManagerStudentMain {

	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		StudentUtil.showMenu();
		int num = sc.nextInt();
		while(true){
		if (num == 1) {
			StudentUtil.addStudentMessage();
		} else if (num == 2) {
			StudentUtil.deleteStudentMessage();
		} else if (num == 3) {
			StudentUtil.updateStudentMessage();
		} else if (num == 4) {
			StudentUtil.findStudentMessage();
		} else if (num == 0){
			StudentUtil.exitMessage();
			break;
		}
		 num = sc.nextInt();
	}

}

}
