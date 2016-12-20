package com.jaksona.security.service.auth;

import org.springframework.security.acls.model.AclService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jak
 * @version 1.0
 * @date 12/20/16
 */
@Service
public class JakUserDetailsService implements UserDetailsService {

    @Resource
    private AclService aclService;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
