package com.reco.generate.repository;

import com.reco.generate.entity.SongMp3;
import com.reco.generate.entity.SongMp3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SongMp3Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song_mp3
     *
     * @mbg.generated Sun May 05 11:55:33 CST 2019
     */
    long countByExample(SongMp3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song_mp3
     *
     * @mbg.generated Sun May 05 11:55:33 CST 2019
     */
    int deleteByExample(SongMp3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song_mp3
     *
     * @mbg.generated Sun May 05 11:55:33 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song_mp3
     *
     * @mbg.generated Sun May 05 11:55:33 CST 2019
     */
    int insert(SongMp3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song_mp3
     *
     * @mbg.generated Sun May 05 11:55:33 CST 2019
     */
    int insertSelective(SongMp3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song_mp3
     *
     * @mbg.generated Sun May 05 11:55:33 CST 2019
     */
    List<SongMp3> selectByExampleWithBLOBs(SongMp3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song_mp3
     *
     * @mbg.generated Sun May 05 11:55:33 CST 2019
     */
    List<SongMp3> selectByExample(SongMp3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song_mp3
     *
     * @mbg.generated Sun May 05 11:55:33 CST 2019
     */
    SongMp3 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song_mp3
     *
     * @mbg.generated Sun May 05 11:55:33 CST 2019
     */
    int updateByExampleSelective(@Param("record") SongMp3 record, @Param("example") SongMp3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song_mp3
     *
     * @mbg.generated Sun May 05 11:55:33 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") SongMp3 record, @Param("example") SongMp3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song_mp3
     *
     * @mbg.generated Sun May 05 11:55:33 CST 2019
     */
    int updateByExample(@Param("record") SongMp3 record, @Param("example") SongMp3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song_mp3
     *
     * @mbg.generated Sun May 05 11:55:33 CST 2019
     */
    int updateByPrimaryKeySelective(SongMp3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song_mp3
     *
     * @mbg.generated Sun May 05 11:55:33 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(SongMp3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song_mp3
     *
     * @mbg.generated Sun May 05 11:55:33 CST 2019
     */
    int updateByPrimaryKey(SongMp3 record);
}