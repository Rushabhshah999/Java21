import javax.crypto.KEM;
import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class EncapsulatorKey {

     // this will not run
    public static void main(String[] args) throws Exception {
        KEM kem1 = KEM.getInstance("RSA-KEM");

        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA-KEM"); // provider dependent
        KeyPair keyPair = keyPairGen.generateKeyPair();

        // 2️⃣ Create an Encapsulator using the public key
        KEM kem = KEM.getInstance("RSA-KEM");
        KEM.Encapsulator encapsulator = kem.newEncapsulator(keyPair.getPublic());

        // 3️⃣ Encapsulate a secret key
        KEM.Encapsulated encapsulated = encapsulator.encapsulate();
        SecretKey secretFromEncapsulation = encapsulated.key();
        byte[] ciphertext = encapsulated.encapsulation(); // send this to recipient

        System.out.println("Encapsulated Secret Key: " + secretFromEncapsulation);
        System.out.println("Ciphertext length: " + ciphertext.length);

        // 4️⃣ Create a Decapsulator using the private key
        KEM.Decapsulator decapsulator = kem.newDecapsulator(keyPair.getPrivate());
        SecretKey decapsulatedKey = decapsulator.decapsulate(ciphertext);

        System.out.println("Decapsulated Secret Key: " + decapsulatedKey);

        // ✅ Verify both keys are the same
        System.out.println("Keys match: " + secretFromEncapsulation.equals(decapsulatedKey));
    }
}
