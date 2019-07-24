public class Test {
    public static void main(String[] args) {
        ExtendShow ext = new ExtendShow();
        SuperShow sup = new SuperShow();
        ext.show();
        sup.show();
        System.out.println("ext.str = " + ext.str);
        System.out.println("sup.str = " + sup.str);

    }
}

class ExtendShow extends SuperShow {
    public String str = "ExtendStr";
    public void show() {
        System.out.println("Extend.show: " + str);
    }
}