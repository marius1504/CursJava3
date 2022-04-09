package com.example.curs13;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Service
public class TimeZoneService {

    public LocalDateTime getTimeByZone(String timeZone) {
        return LocalDateTime.now(ZoneId.of(timeZone, ZoneId.SHORT_IDS));
    }
}
