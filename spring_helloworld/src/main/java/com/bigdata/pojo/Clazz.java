package com.bigdata.pojo;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2022/8/21 10:43
 * @Version 1.0
 * Desc:
 */
public class Clazz {
    private  Integer cid ;
    private  String cname;
    private List<Student>  stu;

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", stu=" + stu +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Student> getStu() {
        return stu;
    }

    public void setStu(List<Student> stu) {
        this.stu = stu;
    }


}
