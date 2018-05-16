package com.zsj.mybatis.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//单例模式
public class SqlSessionFactoryUtil {

	// SqlSessionFactory
	private static SqlSessionFactory sqlSessionFactory = null;

	// 类线程锁
	private static final Class CLASS_LOCK = SqlSessionFactoryUtil.class;

	private SqlSessionFactoryUtil() {
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		if (sqlSessionFactory == null) {
			synchronized (CLASS_LOCK) {
				if (sqlSessionFactory == null) {

					InputStream inputStream;
					try {
						inputStream = Resources.getResourceAsStream("mybatis.xml");
						sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
					} catch (IOException e) {
						throw new RuntimeException(e.getCause());
					}
				}
			}
		}
		return sqlSessionFactory;
	}

	public static SqlSession openSession() {
		if (sqlSessionFactory == null) {
			getSqlSessionFactory();
		}
		return sqlSessionFactory.openSession();

	}
}
