package com.imooc.ad.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zms
 * @data 2019/7/9
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitTable {

    private Long unitId;
    private String itTag;

    private Long planId;
    private Integer unitStatus;
    private Integer positionType;
}
