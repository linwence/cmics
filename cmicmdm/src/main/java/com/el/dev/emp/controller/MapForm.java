package com.el.dev.emp.controller;

import com.el.dev.emp.domain.Emp;

import java.util.Map;

/**
 * Created by Vincent on 2016/8/23.
 */
public class MapForm {
   private Map<String,Emp> userMap;
    private Map<String,Object> objectMap;

    public Map<String, Object> getObjectMap() {
        return objectMap;
    }

    public void setObjectMap(Map<String, Object> objectMap) {
        this.objectMap = objectMap;
    }

    public Map<String, Emp> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, Emp> userMap) {
        this.userMap = userMap;
    }

    @Override
    public String toString() {
        return "MapForm{" +
                "userMap=" + userMap +
                ", objectMap=" + objectMap +
                '}';
    }
}
