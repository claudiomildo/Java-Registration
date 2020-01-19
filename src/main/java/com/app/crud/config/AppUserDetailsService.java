package com.app.crud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.crud.domain.AppUser;
import com.app.crud.repository.AppUserRepository;

@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	AppUserRepository appUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AppUser appUser = appUserRepository.findOneByUsername(username);
		return appUser;
	}
}