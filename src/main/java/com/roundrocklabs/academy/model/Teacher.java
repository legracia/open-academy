/**
 * @author Lehi Gracia
 * @copyright 2014 Lehi Gracia
 */


package com.roundrocklabs.academy.model;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="teacher")
public class Teacher extends Person {
	
	Integer teacher_id;
	
	
	public Integer getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(Integer teacher_id) {
		this.teacher_id = teacher_id;
	}

}
