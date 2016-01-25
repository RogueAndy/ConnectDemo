package com.rogue.entity;

import java.util.Date;

public class Resume {
    private String resumeid;

    private String userid;

    private String resumecontent;

    private Date resumedate;

    public String getResumeid() {
        return resumeid;
    }

    public void setResumeid(String resumeid) {
        this.resumeid = resumeid == null ? null : resumeid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getResumecontent() {
        return resumecontent;
    }

    public void setResumecontent(String resumecontent) {
        this.resumecontent = resumecontent == null ? null : resumecontent.trim();
    }

    public Date getResumedate() {
        return resumedate;
    }

    public void setResumedate(Date resumedate) {
        this.resumedate = resumedate;
    }
}