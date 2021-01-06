package io.dev.core;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JWTUtil {

    public static void main(String[] args) {

        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        cal.add(Calendar.SECOND, 8600000);

        String signWithSecret = JWT.create()
                .withExpiresAt(cal.getTime())
                .withIssuer("Vasudev")
                .withClaim("userId", "vasudevk")
                .withAudience("Retail", "Care", "Web")
                .withSubject("hello friends! please use shikshampoo")
                .sign(Algorithm.HMAC512("vk51gn5"));

        System.out.println("JWT with HS512 :: \n" + signWithSecret);
    }
}