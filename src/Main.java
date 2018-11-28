public class Main {

    public static void main(String[] args) {

        /**
         * 使用aor加解密的原理是一个数异或同一个数两次得到的是本身
         * 第一次异或是加密，第二次异或是解密
         * */
        //使用aor加密
        String s = "hello";
        String a = AorEncryption.aor(s);
        System.out.println(a);
        //解密
        a = AorEncryption.aor(a);
        System.out.println(a);

        String bytes = MD5Encryption.md5Encode(s.getBytes());
        String string = new String (bytes);
        System.out.println(string);

        byte[] bytes1 = MD5Encryption.md5Decode(string);
        System.out.println(bytes1.toString());





    }
}
