package problemSet1AB;
import java.math.BigInteger;

public class Server {
    // DO NOT CHANGE THIS PART OF THE CODE ======================
    private final int[] publicKey = new int[2];
    private final int[] privateKey = new int[2];
    private int p;
    private int q;

    public void setP(int p) {
        this.p = p;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public int[] getPublicKey() {
        return publicKey;
    }

    public int[] getPrivateKey() {
        return privateKey;
    }

    private int computeModInverse(int e, int lambda) {
        for (int d=1; d<lambda; d++) {
            if ( ((e%lambda)*(d%lambda))%lambda==1 ) {
                return d;
            }
        }
        return 1;
    }
    private int computeE(int lambda) {
        for (int i=lambda-1; i>2; i-- ) {
            if (lambda%i!=0 && isPrime(i)) {
                return i;
            }
        }
        return 0;
    }
    private boolean isPrime(int a) {
        for (int i = 2; i<a/2; i++) {
            if (a%i==0) {
                return false;
            }
        }
        return true;
    }
    // =========================================

    // Start your answer from here onwards
    public void generatePublicPrivateKey() {
        // TODO 1: Compute modulus n
        int n=p*q;
        // TODO 2: Compute lambda λ
        int lambda=lcm(p-1,q-1);
        // TODO 3: Compute e
        int e=computeE(lambda);
        // TODO 4: Compute d
        int d=computeModInverse(e,lambda);
        // TODO 5: Set (n,e) as the public key
        publicKey[0]=n;
        publicKey[1]=e;
        // TODO 6: Set (n,d) as the private key
        privateKey[0]=n;
        privateKey[1]=d;
    }

    public String decryptMessage(BigInteger[] encryptedIntMessage) {
        BigInteger[] decryptedIntMessage = new BigInteger[encryptedIntMessage.length];
        for (int i=0;i< encryptedIntMessage.length;i++){
            decryptedIntMessage[i]=encryptedIntMessage[i].modPow(BigInteger.valueOf(privateKey[1]),BigInteger.valueOf(privateKey[0]));
        }
        String decryptedMessage="";
        for (int i=0;i< decryptedIntMessage.length;i++){
            decryptedMessage=decryptedMessage+Character.toString((char)decryptedIntMessage[i].intValue());
        }
        // Hint:
        // 1. Decrypt each character of the message. Use .modPow from BigInteger
        // 2. Decrypted character is an ASCII value (integer). Convert to char
        // 3. Concatenate characters into string
        // 4. Return the decrypted string message
        return decryptedMessage;
    }

    private int lcm(int a, int b) {
        // Return the least common multiple of a and b
        int lcm=(a*b)/gcd(a,b);
        return lcm; // 0 is a placeholder to be replaced with the actual output
    }

    private int gcd(int a, int b) {
        int gcd=1;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}
