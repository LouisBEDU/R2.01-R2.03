package tp01;

/**
 * UseIrregular
 */
public class UseIrregular {
    public static void main(String[] args) {
        Irregular I = new Irregular(new int[]{1, 3, 2});
        I.randomFilling();
        System.out.println(I.display());
        System.out.println(I.isCommun(2));
        System.out.println(I.existCommon());
    }
}