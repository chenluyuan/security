package com.jaksona.security.domain.auth;

import java.io.Serializable;

/**
 * @author jak
 * @version 1.0
 * @date 12/21/16
 */
public class AclClass implements Serializable {

    private Long id;
    private String clazz;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
