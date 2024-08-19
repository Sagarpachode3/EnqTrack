package com.psagar3codes.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ET_USER_DTLS")
public class UserDetailsEnity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	private String userName;

	private String email;

	private String password;

	private Long phoneNo;

	private String accStatus;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<StudentEnqEntity> enquiries;
}
