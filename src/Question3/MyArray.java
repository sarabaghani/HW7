package Question3;



import java.util.Arrays;

public class MyArray {
    private Object[] array = new Object[15];
    private int index = 0;


    public Object  get(int x) {
        return array[x];
    }

    public void add(Object  e) {
        if (index == array.length - 1) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[index++] = e;

    }

    public void remove(Object s) {
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

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object [] str) {
        this.array = str;
    }

    @Override
    public String toString() {
        String result = "";
        for (Object e :
                getArray()) {
            if (e != null) {
                result += e.getClass().getSimpleName()+ "  ";
            }
        }
        return result;
    }
}


