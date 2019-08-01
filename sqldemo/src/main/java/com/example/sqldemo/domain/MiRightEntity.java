package com.example.sqldemo.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "mi_right", schema = "test1", catalog = "")
public class MiRightEntity {
    private long rightId;
    private String name;
    private String aDescribe;

    @Id
    @Column(name = "right_id")
    public long getRightId() {
        return rightId;
    }

    public void setRightId(long rightId) {
        this.rightId = rightId;
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
    @Column(name = "a_describe")
    public String getaDescribe() {
        return aDescribe;
    }

    public void setaDescribe(String aDescribe) {
        this.aDescribe = aDescribe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MiRightEntity that = (MiRightEntity) o;
        return rightId == that.rightId &&
                Objects.equals(name, that.name) &&
                Objects.equals(aDescribe, that.aDescribe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rightId, name, aDescribe);
    }
}
