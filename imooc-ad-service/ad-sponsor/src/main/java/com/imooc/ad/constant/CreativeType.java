package com.imooc.ad.constant;

import lombok.Getter;

/**
 * @author zms
 * @data 2019/6/26
 */
@Getter
public enum  CreativeType {
    IMAGE(1, "图片"),
    VIDEO(2, "视频"),
    TEXT(3, "文本");

    private int type;
    private String desc;

    CreativeType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
