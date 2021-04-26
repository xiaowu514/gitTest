package com.xw.test.testmybatisplus.operatorFactory;

import com.xw.test.testmybatisplus.ifelse.Addition;

import java.util.HashMap;
import java.util.Map;

public class OperatorFactory {

    static Map<String, Addition> operatorMap = new HashMap<>();

    static {
        operatorMap.put("add", new Addition());
    }
}
