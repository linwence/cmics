package com.el.dev.emp.controller;

import java.util.List;

/**
 * Created by Vincent on 2016/8/23.
 */
public class ListForm {
    private List<String> stringList;

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    @Override
    public String toString() {
        return "ListForm{" +
                "stringList=" + stringList +
                '}';
    }
}
