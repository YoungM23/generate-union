package com.reco.generate.repository;

import com.reco.generate.bo.StatisticsBo;
import com.reco.generate.core.BaseDao;
import com.reco.generate.entity.DailyFlow24;
import com.reco.generate.entity.DailyFlow24Example;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailyFlow24Mapper extends BaseDao<DailyFlow24, Integer, DailyFlow24Example> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table daily_flow_clear24
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    int countByExample(DailyFlow24Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table daily_flow_clear24
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    int deleteByExample(DailyFlow24Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table daily_flow_clear24
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    int insert(DailyFlow24 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table daily_flow_clear24
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    int insertSelective(DailyFlow24 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table daily_flow_clear24
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    List<DailyFlow24> selectByExample(DailyFlow24Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table daily_flow_clear24
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    int updateByExampleSelective(@Param("record") DailyFlow24 record, @Param("example") DailyFlow24Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table daily_flow_clear24
     *
     * @mbg.generated Fri May 10 15:19:46 CST 2019
     */
    int updateByExample(@Param("record") DailyFlow24 record, @Param("example") DailyFlow24Example example);

    List<StatisticsBo> compileActivity(@Param("activityIdList") List<Integer> activityIdList, @Param("to") Date to);
}