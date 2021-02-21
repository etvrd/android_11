package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Changer<T> {
    private T[] obj;

    public Changer(T... obj) {
        this.obj = obj;
    }

    public T[] getObj() {
        return obj;
    }

    public List<T> setObjToArrayList() {
        List<T> newArr = new ArrayList<>();
        Collections.addAll(newArr, obj);
        return newArr;
    }

    public void change(){
        T tempObj;
        tempObj = obj[0];
        obj[0] = obj[1];
        obj[1] = tempObj;
    }
}
