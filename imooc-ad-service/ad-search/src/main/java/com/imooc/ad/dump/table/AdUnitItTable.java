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
public class AdUnitItTable {
    private Long unitId;
    private Integer unitStatus;
    private Integer positionType;

    private Long planId;
    private String itTag;
}
