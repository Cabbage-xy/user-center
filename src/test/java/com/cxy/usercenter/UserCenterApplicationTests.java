package com.cxy.usercenter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
class UserCenterApplicationTests {

    @Test
    void testDigest() throws NoSuchAlgorithmException {
        String newPassword = DigestUtils.md5DigestAsHex(("ujustguess" + "12345678").getBytes(StandardCharsets.UTF_8));
        System.out.println(newPassword);
    }

    @Test
    void contextLoads() {
        int[] ak = {123,22};
        float[] aa = {12,3};
//        long[] aj = new long[];
//        aj = Arrays.copyOf(ak, ak.length, aj.getClass());
        if ((Object)ak.getClass() == (Object)Object[].class) {

        }
        System.out.println(aa.getClass());
        System.out.println(Object[].class);
    }

}
