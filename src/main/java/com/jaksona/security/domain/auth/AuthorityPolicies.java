package com.jaksona.security.domain.auth;


import java.io.Serializable;
import java.util.Date;
/**
 * @author jak
 * @version 1.0
 * @date 12/21/16
 */
public class AuthorityPolicies implements Serializable {

    private Long id;
    private String username;
    private Long policy;
    private String description;
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


    public Long getPolicy() {
      return policy;
    }

    public void setPolicy(Long policy) {
      this.policy = policy;
    }


    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
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
