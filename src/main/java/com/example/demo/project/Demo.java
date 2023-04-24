package com.example.demo.project;


import com.example.demo.project.domain.Base;
import com.example.demo.project.domain.User;
import com.sun.deploy.util.StringUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0");
        System.out.println(Double.valueOf("1.0"));
        System.out.println(format.format(Double.valueOf("0.5")));
    }

}
