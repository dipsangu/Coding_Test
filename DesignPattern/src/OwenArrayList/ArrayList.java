package OwenArrayList;

import java.util.Arrays;

public class ArrayList {

    private Object[] objects;
    private int size = 0;

    public ArrayList() {
        objects = new Object[10];
    }

    public void add(Object object) {

        if (size == objects.length) {
            increaseCapacity();
        }

        objects[size++] = object;
    }

    private void increaseCapacity() {

        int newCapacity = (objects.length * 3) / 2;

        objects = Arrays.copyOf(objects, newCapacity);
    }

    public int arrayLength() {
        return size;
    }

    public void display() {

        for (int i = 0; i < size; i++) {
            System.out.println(objects[i]);
        }
    }

    public Object get(int index){
        if(index<0 || index>size){
            throw new ArrayIndexOutOfBoundsException("Out of range is not supported");
        }
        Object object = objects[index];
        return object;
    }

    // DELETE / REMOVE BY INDEX
    public Object remove(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    "Invalid index: " + index
            );
        }

        Object removedObject = objects[index];

        // Shift elements to the left
        for (int i = index; i < size - 1; i++) {
            objects[i] = objects[i + 1];
        }

        // Remove duplicate reference
        objects[size - 1] = null;

        size--;

        return removedObject;
    }

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add("Sangram");
        arrayList.add("Dipu");

        arrayList.display();
        System.out.println(arrayList.get(21));

        System.out.println("Size = " + arrayList.arrayLength());
    }
}