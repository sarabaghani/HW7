package Question2;


public class ElementArray {
    public static void main(String[] args) {

        NonMetalElement se = new NonMetalElement("Se" ,34,78.96 );
        NonMetalElement p = new NonMetalElement("P" ,15,	30.97376 );
        MetalElement fe = new MetalElement("Fe" ,26,	55.847 );
        MetalElement ag = new MetalElement("Ag" ,47,	107.868 );
        MyArray elements = new MyArray();
        elements.add(se);
        elements.add(p);
        elements.add(fe);
        elements.add(ag);

        System.out.println(elements);

        for (int i = 0; i <elements.size(); i++) {
            elements.get(i).describeElement();
        }
    }
}
