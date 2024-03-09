package problemSet1AB;

import java.math.BigInteger;

public class Browser {
    private final int[] publicKey = new int[2]; // DO NOT CHANGE THIS DATA FIELD

    public void establishConnection(Server s) {
        // TODO 1: Generating public and private key by the server
        s.generatePublicPrivateKey();
        // TODO 2: Get the public key from the server and use it to set Browser object's public key
        this.publicKey[0]= s.getPublicKey()[0];
        this.publicKey[1]= s.getPublicKey()[1];
    }

    public BigInteger[] encryptMessage(String message) {
        BigInteger[] encryptedIntMessage = new BigInteger[message.length()];
        for (int i=0;i<message.length();i++){
            int value=message.charAt(i);
            encryptedIntMessage[i]=BigInteger.valueOf(value).modPow(BigInteger.valueOf(publicKey[1]),BigInteger.valueOf(publicKey[0]));
        }
        // Hint:
        // 1. Loop through each character of the message
        // 2. Convert to its ASCII value in integer
        // 3. Encrypt the value. Use .modPow method from BigInteger

        return encryptedIntMessage;
    }
}

