package com.jaksona.security.domain.auth;


import java.io.Serializable;
import java.util.Date;
/**
 * @author jak
 * @version 1.0
 * @date 12/21/16
 */
public class Permissions implements Serializable {

    private Long id;
    private String code;
    private String description;
    private Date gmtCreate;
    private Date gmtModified;


    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }


    public String getCode() {
      return code;
    }

    public void setCode(String code) {
      this.code = code;
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
