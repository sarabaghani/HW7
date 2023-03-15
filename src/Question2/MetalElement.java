package Question2;

public class MetalElement extends Element {
    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println(getSymbol() + " is an element in periodic table which atomic number is "
                + getAtomicNumber() + " and the atomic weight is " + getAtomicWeight());
        System.out.println("This elements is a metal element, " +
                "which means it's lustrous, malleable, ductile, good conductor of \nheat and electricity. ");
    }
}

