import org.apache.commons.codec.digest.DigestUtils;
/**
 * 和md加密相似
 * 只能加密不能解密
 **/
public class Sha256Encryption {
    public static String sha256Encode(byte[] input){
        return DigestUtils.sha256Hex(input);
    }
}
