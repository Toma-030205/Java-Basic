public class Datatype{
     public static void main(String args[]){
        int shiire_ne, teika, kosuu, goukei; //整数型変数
        shiire_ne=100; kosuu=2; //値の代入
        teika=shiire_ne + 10; //定価の計算
        goukei=teika*kosuu;
        System.out.println(goukei); //合計額の印刷
        double waribiki,uri_ne,zei,zeikomi;//実数型の変数
        waribiki=0.2; zei=0.05;
        uri_ne=teika*(1-waribiki); //割引後の値段
        zeikomi=uri_ne*(1+zei); //税込み額
        System.out.println(zeikomi);
        System.out.println((int)zeikomi); //キャストの例
    }
}
