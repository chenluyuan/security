package com.jaksona.security.domain.auth;

import java.io.Serializable;

/**
 * @author jak
 * @version 1.0
 * @date 12/21/16
 */
public class AclEntry implements Serializable {

    private Long id;
    private Long aclObjectIdentity;
    private Long aceOrder;
    private Long sid;
    private Long mask;
    private Long granting;
    private Long auditSuccess;
    private Long auditFailure;


    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }


    public Long getAclObjectIdentity() {
      return aclObjectIdentity;
    }

    public void setAclObjectIdentity(Long aclObjectIdentity) {
      this.aclObjectIdentity = aclObjectIdentity;
    }


    public Long getAceOrder() {
      return aceOrder;
    }

    public void setAceOrder(Long aceOrder) {
      this.aceOrder = aceOrder;
    }


    public Long getSid() {
      return sid;
    }

    public void setSid(Long sid) {
      this.sid = sid;
    }


    public Long getMask() {
      return mask;
    }

    public void setMask(Long mask) {
      this.mask = mask;
    }


    public Long getGranting() {
      return granting;
    }

    public void setGranting(Long granting) {
      this.granting = granting;
    }


    public Long getAuditSuccess() {
      return auditSuccess;
    }

    public void setAuditSuccess(Long auditSuccess) {
      this.auditSuccess = auditSuccess;
    }


    public Long getAuditFailure() {
      return auditFailure;
    }

    public void setAuditFailure(Long auditFailure) {
      this.auditFailure = auditFailure;
    }

}
