package com.zsj.mybatis.dao;

import com.zsj.mybatis.pojo.Student;

public interface StudentDao {

	//删除
	public void deleteStudent(String sno);
	//更新
	public void updateStudent(Student student);
	//查找
	public Student findStudent(String sno);
	//添加
	public void addStudent(Student student);
}
