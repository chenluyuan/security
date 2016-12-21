package com.jaksona.security.domain.auth;


import java.io.Serializable;
import java.util.Date;
/**
 * @author jak
 * @version 1.0
 * @date 12/21/16
 */
public class UserAuthorities implements Serializable {

    private Long id;
    private String username;
    private Long authorityId;
    private Date gmtCreate;
    private Date gmtModified;


    public Long getId() {
    return id;
  }

    public void setId(Long id) {
    this.id = id;
  }


    public String getUsername() {
    return username;
  }

    public void setUsername(String username) {
    this.username = username;
  }


    public Long getAuthorityId() {
    return authorityId;
  }

    public void setAuthorityId(Long authorityId) {
    this.authorityId = authorityId;
  }


    public Date getGmtCreate() {
    return gmtCreate;
  }

    public void setGmtCreate(Date gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


    public Date getGmtModified() {
    return gmtModified;
  }

    public void setGmtModified(Date gmtModified) {
    this.gmtModified = gmtModified;
  }

}