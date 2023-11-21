package com.aefimov.collections;

import java.util.ArrayList;

public class CustomArrayList {

    private ArrayList<Integer> arrayList;

    public CustomArrayList() {
        this.arrayList = new ArrayList<>();
    }

    public void addElement(int element) {
        arrayList.add(element);
    }

    public void removeElement(int element) {
        arrayList.remove(Integer.valueOf(element));
    }

    public boolean findElement(int element) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == element) {
                return true;
            }
        }
        return false;
    }
}
