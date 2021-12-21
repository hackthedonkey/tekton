package com.example.web_sample_01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

@RestController
@RequestMapping("/main")
public class MainController {

    @GetMapping("")
    public ResponseEntity<String> viewMain()
    {
        String str = "{\"msg\":\"메인페이지 입니다.\"}";
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));

        str = "TIMESTAMP [" + sdf.format(timestamp) + "]\n" + str;
        System.out.println(str);
        return ResponseEntity.ok(str);
    }
}
