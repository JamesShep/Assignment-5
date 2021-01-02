package com.coderscampus.assignment5;

public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];
    int arraySize = 0;

    @Override
    public boolean add(T item) {
        if (arraySize >= items.length) {
            items = increaseArraySize();
        }
        items[arraySize++] = item;
        return true;
    }

    @Override
    public int getSize() {
        return arraySize;
    }

    @Override
    public T get(int index) {
        return (T) items[index];
    }

    private Object[] increaseArraySize() {
        Object[] newItemsArray = new Object[arraySize*2];
        System.out.println("Initial array not large enough: Increasing array size to : " +
                newItemsArray.length);
        // Added just to show the array is doubling
        // before start of input of data, to required array size
        for (int i = 0; i < arraySize; i++) {
            newItemsArray[i] = items[i];
        }
        return newItemsArray;
    }
}
