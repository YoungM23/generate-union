package com.reco.generate.entity;

import java.util.Date;

public class UserPayHistory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pay_history.id
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pay_history.ip
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pay_history.uid
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pay_history.fee
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    private Integer fee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pay_history.paytime
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    private Date paytime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pay_history.exptime
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    private Date exptime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pay_history.createtime
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pay_history.purchase
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    private String purchase;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pay_history.area
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    private String area;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pay_history.sid
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    private Integer sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pay_history.sname
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    private String sname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pay_history.platform
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    private Integer platform;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pay_history.stat
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    private Integer stat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pay_history.id
     *
     * @return the value of user_pay_history.id
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pay_history.id
     *
     * @param id the value for user_pay_history.id
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pay_history.ip
     *
     * @return the value of user_pay_history.ip
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pay_history.ip
     *
     * @param ip the value for user_pay_history.ip
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pay_history.uid
     *
     * @return the value of user_pay_history.uid
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pay_history.uid
     *
     * @param uid the value for user_pay_history.uid
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pay_history.fee
     *
     * @return the value of user_pay_history.fee
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public Integer getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pay_history.fee
     *
     * @param fee the value for user_pay_history.fee
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public void setFee(Integer fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pay_history.paytime
     *
     * @return the value of user_pay_history.paytime
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public Date getPaytime() {
        return paytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pay_history.paytime
     *
     * @param paytime the value for user_pay_history.paytime
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pay_history.exptime
     *
     * @return the value of user_pay_history.exptime
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public Date getExptime() {
        return exptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pay_history.exptime
     *
     * @param exptime the value for user_pay_history.exptime
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public void setExptime(Date exptime) {
        this.exptime = exptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pay_history.createtime
     *
     * @return the value of user_pay_history.createtime
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pay_history.createtime
     *
     * @param createtime the value for user_pay_history.createtime
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pay_history.purchase
     *
     * @return the value of user_pay_history.purchase
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public String getPurchase() {
        return purchase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pay_history.purchase
     *
     * @param purchase the value for user_pay_history.purchase
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public void setPurchase(String purchase) {
        this.purchase = purchase == null ? null : purchase.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pay_history.area
     *
     * @return the value of user_pay_history.area
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pay_history.area
     *
     * @param area the value for user_pay_history.area
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pay_history.sid
     *
     * @return the value of user_pay_history.sid
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pay_history.sid
     *
     * @param sid the value for user_pay_history.sid
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pay_history.sname
     *
     * @return the value of user_pay_history.sname
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public String getSname() {
        return sname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pay_history.sname
     *
     * @param sname the value for user_pay_history.sname
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pay_history.platform
     *
     * @return the value of user_pay_history.platform
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pay_history.platform
     *
     * @param platform the value for user_pay_history.platform
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pay_history.stat
     *
     * @return the value of user_pay_history.stat
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public Integer getStat() {
        return stat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pay_history.stat
     *
     * @param stat the value for user_pay_history.stat
     *
     * @mbg.generated Fri May 10 17:17:16 CST 2019
     */
    public void setStat(Integer stat) {
        this.stat = stat;
    }
}