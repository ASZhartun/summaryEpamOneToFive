package block2.taskBlock.decomposition;

/**
 * 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Task06 {
    public static void main(String[] args) {
        int a = 49;
        int b = 9;
        int c = 16;
        boolean flag;
        flag = mutuallySimple(a,b,c);
        System.out.println(flag);
    }

    public static boolean mutuallySimple(int a,int b,int c) {
        return Task01.nod(a,b)==1 && Task01.nod(b,c)==1 && Task01.nod(a,c)==1;
    }
}
