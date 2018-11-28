import org.apache.commons.codec.digest.DigestUtils;

public class MD5Encryption {

    /**
     * md5加密是传入的byte数组
     * 返回的是一个String的字符串
     * 只能加密操作不可以解密操作
     **/
    public static String md5Encode(byte[] input){
        return DigestUtils.md5Hex(input);
    }

    public static byte[] md5Decode(String input){
        return DigestUtils.md5(input);
    }


}
