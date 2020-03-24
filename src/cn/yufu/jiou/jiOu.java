package cn.yufu.jiou;
/**
 * 判断某个数是基数还是偶数
 * (a & 1)
 * 两个数，只要有一个是偶数就等于0
 * 两个数都是奇数，则等于1
 */
public class jiOu {
    public static void main(String[] args) {
        System.out.println(isOdd(2));
        System.out.println(isOdd(1));
    }

    public static boolean isOdd(int a){
        return (a & 1)==1;
    }
}

