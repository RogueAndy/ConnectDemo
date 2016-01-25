package com.rogue.entity;

public class Job {
    private String jobid;

    private String jobtitle;

    private String jobcontent;

    private String jobsignhuman;

    private String jobworkhuman;

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid == null ? null : jobid.trim();
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle == null ? null : jobtitle.trim();
    }

    public String getJobcontent() {
        return jobcontent;
    }

    public void setJobcontent(String jobcontent) {
        this.jobcontent = jobcontent == null ? null : jobcontent.trim();
    }

    public String getJobsignhuman() {
        return jobsignhuman;
    }

    public void setJobsignhuman(String jobsignhuman) {
        this.jobsignhuman = jobsignhuman == null ? null : jobsignhuman.trim();
    }

    public String getJobworkhuman() {
        return jobworkhuman;
    }

    public void setJobworkhuman(String jobworkhuman) {
        this.jobworkhuman = jobworkhuman == null ? null : jobworkhuman.trim();
    }
}