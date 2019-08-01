package com.example.sqldemo.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "mi_role", schema = "test1", catalog = "")
public class MiRoleEntity {
    private long roleId;
    private String name;
    private Timestamp createTime;
    private String rDescribe;

    @Id
    @Column(name = "role_id")
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "r_describe")
    public String getrDescribe() {
        return rDescribe;
    }

    public void setrDescribe(String rDescribe) {
        this.rDescribe = rDescribe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MiRoleEntity that = (MiRoleEntity) o;
        return roleId == that.roleId &&
                Objects.equals(name, that.name) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(rDescribe, that.rDescribe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, name, createTime, rDescribe);
    }
}
