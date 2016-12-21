package com.jaksona.security.domain.auth;


import java.io.Serializable;
import java.util.Date;

/**
 * @author jak
 * @version 1.0
 * @date 12/21/16
 */
public class Users implements Serializable {

    private long id;
    private String username;
    private String password;
    private long enabled;
    private String salt;
    private Date gmtCreate;
    private Date gmtModified;


    public long getId() {
    return id;
  }

    public void setId(long id) {
      this.id = id;
    }


    public String getUsername() {
    return username;
  }

    public void setUsername(String username) {
      this.username = username;
    }


    public String getPassword() {
      return password;
    }

    public void setPassword(String password) {
      this.password = password;
    }


    public long getEnabled() {
      return enabled;
    }

    public void setEnabled(long enabled) {
      this.enabled = enabled;
    }


    public String getSalt() {
      return salt;
    }

    public void setSalt(String salt) {
      this.salt = salt;
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