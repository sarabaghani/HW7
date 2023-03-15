public class demoTurners2 {
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
        Pinwheel pinwheel = new Pinwheel();
        System.out.print(pinwheel.getClass().getSimpleName()+": ");
        pinwheel.turner();
        Fan fan = new Fan();
        System.out.print(fan.getClass().getSimpleName()+": ");
        fan.turner();
    }
}
