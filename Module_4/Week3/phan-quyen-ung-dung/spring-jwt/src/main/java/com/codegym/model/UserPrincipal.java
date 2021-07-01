package com.codegym.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.*;

public class UserPrincipal implements UserDetails {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String userName;
    private String passWord;
    private Collection<? extends GrantedAuthority> roles;

    public UserPrincipal(Long id, String userName, String passWord, Collection<? extends GrantedAuthority> roles) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.roles = roles;
    }

    public static UserPrincipal build(User user){
        List<GrantedAuthority> authorities = new ArrayList<>();
        Set<Role> roles = user.getRoles();
        for(Role role: roles){
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new UserPrincipal(user.getId(), user.getUserName(), user.getPassWord(), authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public String getPassword() {
        return passWord;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPrincipal that = (UserPrincipal) o;
        return Objects.equals(id, that.id) && Objects.equals(userName, that.userName) && Objects.equals(passWord, that.passWord) && Objects.equals(roles, that.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, passWord, roles);
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
