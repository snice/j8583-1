package com.protocol.p8583.field;

import com.protocol.utils.StringUtils;

import java.nio.ByteBuffer;

/**
 * User:
 * Date: 13-11-15
 * Time: 13:41
 */
public class FieldVar3 extends FieldVar2 {
    public FieldVar3() {
    }

    public FieldVar3(int fieldLen) {
        super(fieldLen);
    }

    public FieldVar3(int fieldLen, boolean joinBitMap) {
        super(fieldLen, joinBitMap);
    }

    public String getWriteLenStrValue() {
        String len_str = reqSrcBytes.length + "";
        return StringUtils.leftPadWithBytes(len_str, 4, '0', getEncoding());
    }

    @Override
    public byte[] readLenBytes(ByteBuffer byteBuffer) {
        byte len1 = byteBuffer.get();
        byte len2 = byteBuffer.get();
        return new byte[]{len1, len2};
    }

}
