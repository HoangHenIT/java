package com.bezkoder.spring.oracle.entity;

import com.bezkoder.spring.oracle.common.APIResponse;
import com.bezkoder.spring.oracle.dto.LoginRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MA_USER")
    private Integer ma_user;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "CREATED")
    private Date created;
    @Column(name = "UPDATED")
    private Date updated;
    @Column(name = "LEVEL_USER")
    private String level_user;
    @Column(name = "IOC")
    private Integer ioc;
    @Column(name = "ID_HSSK")
    private Integer id_hssk;
    @Column(name = "LEVEL_MOBILE")
    private Integer level_mobile;

    public Integer getMa_user() {
        return ma_user;
    }

    public void setMa_user(Integer ma_user) {
        this.ma_user = ma_user;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getLevel_user() {
        return level_user;
    }

    public void setLevel_user(String level_user) {
        this.level_user = level_user;
    }

    public Integer getIoc() {
        return ioc;
    }

    public void setIoc(Integer ioc) {
        this.ioc = ioc;
    }

    public Integer getId_hssk() {
        return id_hssk;
    }

    public void setId_hssk(Integer id_hssk) {
        this.id_hssk = id_hssk;
    }

    public Integer getLevel_mobile() {
        return level_mobile;
    }

    public void setLevel_mobile(Integer level_mobile) {
        this.level_mobile = level_mobile;
    }
}
