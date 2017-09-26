package com.example.demo.pojo;

import java.util.Date;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 22:03 2017/9/6 0006
 */
public class Demo
{
    private Integer id;

    private String name;

    private String address;

    //    @JSONField(serialize = false)
    private String remark;

    //    @JSONField(format = "yyyy-MM-dd HH:MM")
    private Date ceateTime;

    public Date getCeateTime()
    {
        return ceateTime;
    }

    public void setCeateTime(Date ceateTime)
    {
        this.ceateTime = ceateTime;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }
}
