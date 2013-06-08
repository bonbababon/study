/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javastudy;

/**
 * AbstractTest1
 * 
 * 【抽象クラス】
 * ・使いどころ
 *   ・機能を共通化したいとき
 *    ※共通部分を抽象クラスで実装し、個々の機能をそれぞれのサブクラスで実装
 * 
 * ・ルール
 *   ・抽象クラスのオブジェクトを生成することはできない
 *   ・抽象クラスに抽象メソッドがあってもなくてもよい
 *     しかし、抽象メソッドがある場合は必ず抽象クラスとして宣言する必要がある
 *   ・抽象メソッドがない抽象クラスを宣言することもできる
 *     ※継承先でメソッドに対して何らかの変更があることを表す
 *   ・抽象クラスを継承したサブクラスで、抽象メソッドを実装（オーバーライドしない場合）は、
 *     そのサブクラスが抽象クラスとして宣言される
 * 
 */
abstract class AbstractTest1 {
    int price = 100;
    
    // 共通機能を抽象クラス内で実装
    void show(int taxprice) {
        System.out.println(taxprice + "円");
    }
    
    // 個々で異なる機能はサブクラスで実装
    abstract void calculate();
}

class subClass1 extends AbstractTest1 {
    // 抽象メソッドをオーバーライド
    void calculate() {
        // 共通の抽象メソッドを呼び出す
        show((int)(price * 1.05));
    }
}

class subClass2 extends AbstractTest1 {
    // 抽象メソッドをオーバーライド
    void calculate() {
        // 共通の抽象メソッドを呼び出す
        show((int)(price * 1.08));
    }
}

class ExClass {
    public static void main(String args[]) {
        subClass1 object1 = new subClass1();
        subClass2 object2 = new subClass2();
        
        object1.calculate();
        object2.calculate();
    }
}
