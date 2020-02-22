package practica2;

import java.math.BigInteger;

public class randomGenerator {

    private int n;

    //26.1, 26.2
    private double Xn;

    //26.3
    private BigInteger BigXn_263;

    //Comb
    private BigInteger BigXn_Comb;
    private BigInteger w;
    private BigInteger x;
    private BigInteger y;

    randomGenerator(BigInteger seed, int n) {
        this.Xn = seed.doubleValue();
        this.n = n;
        BigXn_263 = new BigInteger(seed.toString());
        BigXn_Comb = new BigInteger(seed.toString());
        w = new BigInteger(seed.toString());
        x = new BigInteger(seed.toString());
        y = new BigInteger(seed.toString());
    }

    // 26.1a //
    public double random26_1a() {
        Xn = (5 * (Xn) % Math.pow(2, 5));
        return Xn;
    }

    public double norm_random26_1a() {
        return (random26_1a() / Math.pow(2, 5));
    }

    // 26.1b //
    public double random26_1b() {
        Xn = (7 * (Xn) % Math.pow(2, 5));
        return Xn;
    }

    public double norm_random26_1b() {
        return (random26_1b() / Math.pow(2, 5));
    }

    // 26.2 //
    public double random26_2() {
        Xn = (3 * (Xn) % 31);
        return Xn;
    }

    public double norm_random26_2() {
        return (random26_2() / 31);
    }

    // 26.3 //
    public BigInteger random26_3() {
        BigXn_263 = (BigXn_263.multiply(new BigInteger("16807")).mod(new BigInteger("2147483647")));
        return BigXn_263;
    }

    public double norm_random26_3() {
        BigInteger Norm_Xn1 = random26_3();
        return Norm_Xn1.doubleValue() / 2147483647;
    }

    // Combined Generator (26-42) //
    public BigInteger random_comb(){
        w = w.multiply(new BigInteger("157")).mod(new BigInteger("32363"));
        x = x.multiply(new BigInteger("146")).mod(new BigInteger("31727"));
        y = y.multiply(new BigInteger("142")).mod(new BigInteger("31657"));

        BigXn_Comb = w.subtract(x.add(y)).mod(new BigInteger("32362"));    
        return BigXn_Comb;
    }

    public double norm_random_comb(){
        BigInteger aux = random_comb();
        return aux.doubleValue() / 32362;
    }

    public static void main(String[] ags) {
        randomGenerator A = new randomGenerator(new BigInteger("1"), 10);

        for (int i = 0; i < 10; ++i) {
            double aux = A.norm_random_comb();
                System.out.println(aux);
        }
    }

}