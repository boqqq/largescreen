package com.dfjinxin.population.server.modules.dto;

import lombok.Data;

import java.util.List;

@Data
public class T04IndsWorkPersMemQtyChgTrndVo {

    private List<String> desc;

    private List<String> year;

    private List<List<Integer>> lists;
}
