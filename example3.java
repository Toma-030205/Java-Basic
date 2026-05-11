public class example3 {
    public static void main(String args[]) {
        int shiire_ne1, teika1, kosuu1, goukei1;
        int shiire_ne2, teika2, kosuu2;
        shiire_ne1 = 100;
        kosuu1 = 2;
        shiire_ne2 = 200;
        kosuu2 = 3;
        // 定価の計算
        teika1 = shiire_ne1 + 10;
        teika2 = shiire_ne2 + 15;
        // 合計額
        goukei1 = teika1 * kosuu1 + teika2 * kosuu2;
        // 合計額の表示
        System.out.println(goukei1);
        // 実数型変数
        double zeikomi1, zeikomi2;
        // メソッドの利用
        zeikomi1 = houhou1(teika1);
        zeikomi2 = houhou1(teika2);
        // タブ付き表示
        System.out.println("1:\t" + zeikomi1);
        System.out.println("2:\t" + zeikomi2);
        // 特殊文字の例
        System.out.print("1234" + "5678901234567890" + "\n");
        System.out.println("1234\t123\t12.");
    }
    // 税込み価格を計算するメソッド
    public static int houhou1(int teika) {
        double waribiki, urine, zei;
        waribiki = 0.2;
        zei = 0.05;
        // 割引後価格
        urine = teika * (1 - waribiki);
        // 税込み価格をint型で返す
        return (int)(urine * (1 + zei));
    }
}
