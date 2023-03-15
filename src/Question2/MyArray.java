package Question2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArray {
    private Element[] array = new Element[15];
    private int index = 0;


    public Element get(int x) {
        return array[x];
    }

    public void add(Element e) {
        if (index == array.length - 1) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[index++] = e;

    }

    public void remove(Element s) {
        int sIndex = index + 1;
        for (int i = 0; i < index; i++) {
            if (array[i].equals(s)) {
                array[i] = null;
                sIndex = i;
                break;
            }
        }
        for (int i = sIndex; i < index; i++) {
            if (i != index - 1)
                array[i] = array[i + 1];
        }
        index--;
    }

    public int size() {
        return index;
    }

    public Element[] getArray() {
        return array;
    }

    public void setArray(Element[] str) {
        this.array = str;
    }

    @Override
    public String toString() {
        String result = "";
        for (Element e :
                getArray()) {
            if (e != null) {
                result += e.getSymbol() + "  ";
            }
        }
        return result;
    }
}


