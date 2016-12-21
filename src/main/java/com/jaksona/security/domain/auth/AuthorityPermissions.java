package com.jaksona.security.domain.auth;


import java.io.Serializable;
import java.util.Date;
/**
 * @author jak
 * @version 1.0
 * @date 12/21/16
 */
public class AuthorityPermissions implements Serializable {

    private Long id;
    private Long authorityId;
    private Long permissionId;
    private Date gmtCreate;
    private Date gmtModified;


    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }


    public Long getAuthorityId() {
      return authorityId;
    }

    public void setAuthorityId(Long authorityId) {
      this.authorityId = authorityId;
    }


    public Long getPermissionId() {
      return permissionId;
    }

    public void setPermissionId(Long permissionId) {
      this.permissionId = permissionId;
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
