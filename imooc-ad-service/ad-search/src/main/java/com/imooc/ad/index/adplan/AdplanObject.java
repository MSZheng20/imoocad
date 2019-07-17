package com.imooc.ad.index.adplan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author zms
 * @data 2019/6/27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdplanObject {
    private Long planId;
    private Long userId;
    private Integer planStatus;
    private Date startDate;
    private Date updateDate;

    public void update(AdplanObject adplanObject){
        if (null != adplanObject.getPlanId()){
            this.planId = adplanObject.getPlanId();
        }
        if (null != adplanObject.getUserId()){
            this.userId = adplanObject.getUserId();
        }
        if (null != adplanObject.getPlanStatus()){
            this.planStatus = adplanObject.getPlanStatus();
        }
        if (null != adplanObject.getStartDate()){
            this.startDate = adplanObject.getStartDate();
        }
        if (null != adplanObject.getUpdateDate()){
            this.updateDate = adplanObject.getUpdateDate();
        }
    }
}
