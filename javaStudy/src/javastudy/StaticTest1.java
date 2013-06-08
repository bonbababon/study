package javastudy;

/**
 * StaticTest1
 * 
 * 【static】
 * クラスメンバ変数・クラスメソッドとインスタンスメンバ変数・インスタンスメソッドの違い
 * 
 * [クラスメンバ変数・クラスメソッド]
 * ・クラスに割り当てられる
 * ・そのクラスで一つという位置づけ
 * ・使いどころ
 *   ・クラス内で共通の値を保持したい時
 *   ・定数を宣言する時にfinalと共に使用される
 *   ・公式的な処理を行うメソッドに使われる(sin,cosなど)
 *   ・オブジェクトを生成されていなくても処理を行う必要があるときはクラスメソッドを使う
 *    ※オブジェクトに依存しないため、オブジェクトが生成されていなくても実行できる
 * 
 * [インスタンスメンバ変数・インスタンスメソッド]
 * ・オブジェクト毎に割り当てられる
 * 
 */
public class StaticTest1 {
    // クラスメンバ変数宣言
    static int classV;
    
    // インスタンスメンバ変数宣言
    int instanceV;
    
    public static void main(String args[]) {
        StaticTest1 object1 = new StaticTest1();
        StaticTest1 object2 = new StaticTest1();
        
        // クラスメンバ変数に値を代入
        object1.classV = 100;
        object2.classV = 200;
        
        // クラスメンバ変数の値を確認
        // クラス内に一つしか保持しないので、値が上書きされる
        System.out.println(object1.classV + ":" + object2.classV);
        
        // インスタンスメンバ変数に値を代入
        object1.instanceV = 100;
        object2.instanceV = 200;
        
        // インスタンスメンバ変数の値を確認
        System.out.println(object1.instanceV + ":" + object2.instanceV);
    }
}