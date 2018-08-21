package ccgp.utils;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils {
	
	
	/*
	 * �������ӳ�BasicDataSource
	 */
	public static BasicDataSource dataSource = new BasicDataSource();
	//��̬�����
	static {
		dataSource.setDriverClassName("com.mysql.jdbc.Driver"); // ����Ҫ���ӵ����ݿ������
		dataSource.setUrl("jdbc:mysql://172.16.234.141/ccgp?useUnicode=true&characterEncoding=utf-8&useSSL=false"); //ָ��Ҫ���ӵ����ݿ��ַ
		dataSource.setUsername("root"); //ָ��Ҫ�������ݵ��û���
		dataSource.setPassword("12345678"); //ָ��Ҫ�������ݵ�����
	}
	/*
	 * �������ӳض���
	 */
	public static DataSource getDataSource(){
		return dataSource;
	}
	
}
