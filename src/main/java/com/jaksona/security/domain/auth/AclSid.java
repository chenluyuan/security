package com.jaksona.security.domain.auth;

import java.io.Serializable;

/**
 * @author jak
 * @version 1.0
 * @date 12/21/16
 */
public class AclSid implements Serializable {

    private Long id;
    private Long principal;
    private String sid;


    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }


    public Long getPrincipal() {
      return principal;
    }

    public void setPrincipal(Long principal) {
      this.principal = principal;
    }


    public String getSid() {
      return sid;
    }

    public void setSid(String sid) {
      this.sid = sid;
    }

}
