package com.reco.generate.entity;

import com.reco.generate.core.easyui.Datagrid;

import java.util.Date;

public class DailyFlow24 extends Datagrid {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column daily_flow_clear24.id_user
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    private String idUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column daily_flow_clear24.ckey
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    private String ckey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column daily_flow_clear24.platform
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    private Integer platform;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column daily_flow_clear24.ctype
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    private Integer ctype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column daily_flow_clear24.createtime
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column daily_flow_clear24.id_user
     *
     * @return the value of daily_flow_clear24.id_user
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    public String getIdUser() {
        return idUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column daily_flow_clear24.id_user
     *
     * @param idUser the value for daily_flow_clear24.id_user
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    public void setIdUser(String idUser) {
        this.idUser = idUser == null ? null : idUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column daily_flow_clear24.ckey
     *
     * @return the value of daily_flow_clear24.ckey
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    public String getCkey() {
        return ckey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column daily_flow_clear24.ckey
     *
     * @param ckey the value for daily_flow_clear24.ckey
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    public void setCkey(String ckey) {
        this.ckey = ckey == null ? null : ckey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column daily_flow_clear24.platform
     *
     * @return the value of daily_flow_clear24.platform
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column daily_flow_clear24.platform
     *
     * @param platform the value for daily_flow_clear24.platform
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column daily_flow_clear24.ctype
     *
     * @return the value of daily_flow_clear24.ctype
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    public Integer getCtype() {
        return ctype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column daily_flow_clear24.ctype
     *
     * @param ctype the value for daily_flow_clear24.ctype
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column daily_flow_clear24.createtime
     *
     * @return the value of daily_flow_clear24.createtime
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column daily_flow_clear24.createtime
     *
     * @param createtime the value for daily_flow_clear24.createtime
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}