package Question2;

public class NonMetalElement extends Element{
    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("- "+getSymbol()+" is an element in periodic table which atomic number is "
                +getAtomicNumber()+ " and the atomic weight is "+getAtomicWeight());
        System.out.println("This elements is a non-metal element, which means it's a poor conductor of heat and electricity,\n" +
                "and is not malleable or ductile.");
    }
}
