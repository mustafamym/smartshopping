package org.smart.shoping.config.auth;


import org.smart.shoping.core.domain.User;
import org.springframework.security.core.authority.AuthorityUtils;

public class CurrentUser extends org.springframework.security.core.userdetails.User {
	private static final long serialVersionUID = 1;
	private User user;

	public CurrentUser(User user) {
		super(user.getEmail(), user.getPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList(user.getRole().name()));
		// String total =
		// user.getRoles().stream().map(Role::getRole).collect(Collectors.joining(","));
		// System.out.println(total);
		this.user = user;
		
	}

	public User getUser() {
		return this.user;
	}

	public Long getId() {
		return this.user.getId();
	}
	
	

}
