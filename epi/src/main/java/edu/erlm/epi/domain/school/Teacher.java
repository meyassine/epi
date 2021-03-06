package edu.erlm.epi.domain.school;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import edu.erlm.epi.domain.User;
import lombok.ToString;

@Entity
@DiscriminatorValue(value = "Teacher")
@ToString
public class Teacher extends User{

	private static final long serialVersionUID = 1L;

}
