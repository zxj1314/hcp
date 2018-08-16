package com.hdvon.rcp.common.decrypt;


import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

/**
 * Created by Toby on 2017/6/26.
 */
public class Base64PropertyPasswordDecoder implements PropertyPasswordDecoder {

    public String decodePassword(String encodedPassword) {
        try {
            byte[] decodedData = Base64.decodeBase64(encodedPassword);
            String decodedString = new String(decodedData, "UTF-8");
            return decodedString;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }


}
