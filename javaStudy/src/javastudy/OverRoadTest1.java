package javastudy;

/**
 * OverRoadTest1
 * 
 * 【オーバーロード】
 * 同一クラス内でメソッド名が同じでも、引数の型、引数の数、引数の並び順
 * が違うものを複数定義することを言う。
 * 異なるメソッドとして扱われる
 * 
 */
public class OverRoadTest1 {
    // ①引数が2個
    void toroku(String name, String country) {
        System.out.println("名前は" + name);
        System.out.println("国は" + country);
    }
    
    // ②引数が1個
    void toroku(String name) {
        System.out.println("名前は" + name);
        System.out.println("国は日本");
    }

    // ③引数の型が異なる
    void toroku(String name, int country) {
        System.out.println("名前は" + name);
        System.out.println("国コードは" + country);
    }

    public static void main(String[] args) {
        OverRoadTest1 object = new OverRoadTest1();
        // ①
        object.toroku("boss", "アフリカ");
        // ②
        object.toroku("武田");
        // ③
        object.toroku("devid", 99);
    }
}
