package com.app.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.app.blog.entities.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min = 4, message = "Username must be minium 4 characters !!")
	private String name;
	
	@Email(message = "Email address is not valid !!")
	@NotEmpty(message = "Please Enter the email")
	private String email;
	
	@NotEmpty
	@Size(min = 4,max = 8,message = "Password must be min of 4 char and max of 8 char !!")
//	@Pattern(regexp = "")for password pattern
	private String password;
	
	@NotNull
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();
}
