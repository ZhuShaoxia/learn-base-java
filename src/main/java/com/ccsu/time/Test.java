package com.ccsu.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/12/16
 * @Time: 11:36
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        //Instant start = Instant.now();
        ////runMethod();
        //Instant end = Instant.now();
        //Duration duration = Duration.between(start,end);
        //System.out.println(duration.toMillis());
        Test test = new Test();
        //test.localDate1();
        test.formate();
    }

    public void localDate1() {
        //LocalDate today = LocalDate.now();
        //LocalDate today = LocalDate.of(2018,12,16);
        LocalDate birthday = LocalDate.of(1995, 6, 11);
        LocalDate today = LocalDate.now();
        System.out.println(today.toEpochDay() - birthday.toEpochDay());
    }

    public void formate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = dateTimeFormatter.format(localDateTime);
        System.out.println(format);

    }


}
