package org.student.score.manage.model;

import java.io.Serializable;

/**
 * @author 摇滚轮回
 * @功能 建立学生信息表的信息
 * @sid 学号
 * @sname 姓名
 * @sex 性别
 * @birthday 出生日期
 * @allCredit 总学分
 * @remark 备注
 * @photo 照片
 * @majorInfo 专业课
 * 
 */
public class StudentInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sid;
	private String sname;
	private String sex;
	private String birthday;
	private Integer allCredit;
	private String remark;
	private byte[] photo;
	private MajorInfo majorInfo;

	// 建立不含参数的构造方法
	public StudentInfo() {

	}

	// 建立含有参数的构造方法

	public StudentInfo(String sname, String sex, String birthday,
			Integer allCredit, String remark, byte[] photo, MajorInfo majorInfo) {
		super();
		this.sname = sname;
		this.sex = sex;
		this.birthday = birthday;
		this.allCredit = allCredit;
		this.remark = remark;
		this.photo = photo;
		this.majorInfo = majorInfo;
	}

	public MajorInfo getMajorInfo() {
		return majorInfo;
	}

	public void setMajorInfo(MajorInfo majorInfo) {
		this.majorInfo = majorInfo;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getAllCredit() {
		return allCredit;
	}

	public void setAllCredit(Integer allCredit) {
		this.allCredit = allCredit;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

}
