package com.reco.generate.service;

import com.reco.generate.bo.StatisticsBo;
import com.reco.generate.core.BaseService;
import com.reco.generate.entity.DailyFlow24;
import com.reco.generate.entity.DailyFlow24Example;

import java.util.Date;
import java.util.List;

public interface DailyFlow24Service extends BaseService<DailyFlow24, Integer, DailyFlow24Example> {

    List<StatisticsBo> compileActivity(List<Integer> activityIdList, Date to);
}
