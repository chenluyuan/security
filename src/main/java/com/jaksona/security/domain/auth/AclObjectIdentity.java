package com.jaksona.security.domain.auth;

import java.io.Serializable;

/**
 * @author jak
 * @version 1.0
 * @date 12/21/16
 */
public class AclObjectIdentity implements Serializable {

    private Long id;
    private Long objectIdClass;
    private Long objectIdIdentity;
    private Long parentObject;
    private Long ownerSid;
    private Long entriesInheriting;


    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }


    public Long getObjectIdClass() {
      return objectIdClass;
    }

    public void setObjectIdClass(Long objectIdClass) {
      this.objectIdClass = objectIdClass;
    }


    public Long getObjectIdIdentity() {
      return objectIdIdentity;
    }

    public void setObjectIdIdentity(Long objectIdIdentity) {
      this.objectIdIdentity = objectIdIdentity;
    }


    public Long getParentObject() {
      return parentObject;
    }

    public void setParentObject(Long parentObject) {
      this.parentObject = parentObject;
    }


    public Long getOwnerSid() {
      return ownerSid;
    }

    public void setOwnerSid(Long ownerSid) {
      this.ownerSid = ownerSid;
    }


    public Long getEntriesInheriting() {
      return entriesInheriting;
    }

    public void setEntriesInheriting(Long entriesInheriting) {
      this.entriesInheriting = entriesInheriting;
    }

}
