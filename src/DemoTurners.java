public class DemoTurners {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        System.out.print(leaf.getClass().getSimpleName()+": ");
        leaf.turner();
        Page page = new Page();
        System.out.print(page.getClass().getSimpleName()+": ");
        page.turner();
        Pancake pancake = new Pancake();
        System.out.print(pancake.getClass().getSimpleName()+": ");
        pancake.turner();
    }
}
