package com.jaksona.security.domain.auth;


import java.io.Serializable;
import java.util.Date;
/**
 * @author jak
 * @version 1.0
 * @date 12/21/16
 */
public class Dictionaries implements Serializable {

    private Long id;
    private String model;
    private String name;
    private String code;
    private String value;
    private Long sort;
    private Long status;
    private Date gmtCreate;
    private Date gmtModified;


    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }


    public String getModel() {
      return model;
    }

    public void setModel(String model) {
      this.model = model;
    }


    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }


    public String getCode() {
      return code;
    }

    public void setCode(String code) {
      this.code = code;
    }


    public String getValue() {
      return value;
    }

    public void setValue(String value) {
      this.value = value;
    }


    public Long getSort() {
      return sort;
    }

    public void setSort(Long sort) {
      this.sort = sort;
    }


    public Long getStatus() {
      return status;
    }

    public void setStatus(Long status) {
      this.status = status;
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
