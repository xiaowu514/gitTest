package com.xw.test.testmybatisplus.linkedlist;

import java.util.LinkedList;

public class DuiLie {

    private LinkedList linkedList;

    DuiLie() {
        linkedList = new LinkedList();
    }

    public void myAdd(Object obj) {
        linkedList.addLast(obj);
    }

    public Object myGet() {
        return linkedList.removeFirst();
    }

    public boolean isNull() {
        return linkedList.isEmpty();
    }

    public void myAdd2(Object obj) {
        linkedList.offerFirst(obj);
    }

    public Object pollFirst() {
        return linkedList.pollFirst();
    }
}
