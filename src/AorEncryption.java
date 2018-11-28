public class AorEncryption {
    /**
     * 使用aor加解密的原理是一个数异或同一个数两次得到的是本身
     * 第一次异或是加密，第二次异或是解密
     * 是对每一个字符进行加密
     * */
    public static String aor(String s){
        char[] chars = s.toCharArray();
        for(int i = 0;i < chars.length; i++){
            chars[i] = (char)(chars[i]^10000);
        }
        return (new String(chars));
    }

}
