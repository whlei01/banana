package org.student.score.manage.dao;

import org.student.score.manage.model.LoginInfo;

public interface LoginInfoDao {

	//��֤�û��Ƿ�Ϸ�
	public boolean checkLogin(String sid,String password);
	
	//���ӵ�¼�û�
	public void save(LoginInfo loginInfo);
	
	//����ѧ�ź���������û�
	public LoginInfo find(String sid,String password);
}