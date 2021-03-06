package com.alonelaval.cornerstone.entity.constants;

import com.alonelaval.common.entity.IEnum;

/**
 * @author huawei
 * @create 2018-09-28
 **/
public enum EvaluateLikedType  implements IEnum {
    TRUE(0,"是"),
    FALSE(1,"否");

    private final  int value;
    private final String desc;

    @Override
    public int value() {
        return value;
    }

    @Override
    public String desc() {
        return this.desc;
    }

    EvaluateLikedType(int value,String desc){
        this.value = value;
        this.desc = desc;
    }

    public static String typeName() {
        return "是否喜欢";
    }

    @Override
    public IEnum value(int value) {
        return valueOf(value);
    }

    public static EvaluateLikedType valueOf(Integer value) {

        if(value == TRUE.value){
            return TRUE;
        }
        else {
            return  FALSE;
        }
    }
}
