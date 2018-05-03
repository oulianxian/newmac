package com.ini.mac.enums;

/**
 * Created by ou on 2018/4/14/014.
 */
public enum AttitudeEnumType {
    ANGRY("生气", "ANGRY"),
    NORMAL("正常", "NORMAL"),
    HAPPY("开心", "HAPPY");

    private String code;
    private String name;

    AttitudeEnumType(String name,String code) {
        this.code = code;
        this.name = name;

    }

    public String toName() {
        return name;
    }

    public String toCode() {
        return code;
    }

    public static AttitudeEnumType fromCode(String code) {
        for (AttitudeEnumType attitudeEnumType : AttitudeEnumType.values()) {
            if (attitudeEnumType.toCode().equals(code)) {
                return attitudeEnumType;
            }

        }
        return null;
    }

    /**
     * 获取下一个心态
     * @param code
     * @return
     */
    public static  AttitudeEnumType getNextAttitude(String code) {
        AttitudeEnumType attitudeEnumType = fromCode(code);
        if (attitudeEnumType == null) {
            return null;
        }
        int ordinal = attitudeEnumType.ordinal();
        if (++ordinal >= 3) {
            ordinal = 0;
        }
        return getAttitudeByIndex(ordinal);
    }

    /**
     * 通过下标获取enum
     * @param ordinal
     * @return
     */
    public static  AttitudeEnumType getAttitudeByIndex(int ordinal) {
        for (AttitudeEnumType attitudeEnumType : AttitudeEnumType.values()) {
            if (attitudeEnumType.ordinal() == ordinal){
                return attitudeEnumType;
            }
        }
        return null;
    }

}
