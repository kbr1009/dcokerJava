import java.io.BufferedReader;    // キーボードから文字列を入力するために利用するクラスBufferedReaderをインポートする
import java.io.InputStreamReader; // キーボードから文字列を入力するために利用するクラスInputStreamReaderをインポートする

class Test {

    public static void main( String args[ ] ) throws Exception { // { の前の throws Exception は，キーボードから文字列を入力する機能を利用するためのおまじない。

        // 下行は，キーボードから文字列を入力するためのおまじない。後期学習する BufferedReader クラスのオブジェクトを利用すると文字入力ができる。
        // ここでは，BufferedReader型オブジェクト buf を生成して，利用している。
        BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );

        // 上行を実行すると，Eclipseのコンソールウィンドウ(Console window)が入力待ち状態になるので，文字列をキーボードでタイプして Enterキーで入力する。
        // コンソールウィンドウは，Eclipseの下のエリアにある(タブで選択)。もし見当たらなければ，「ウィンドウ」メニュー→「ビューの表示」→「コンソール」で表示可能
        // 例として，ここではコンソールウィンドウに 1.23 と入力して Enterキーを押してみよう。

        // 入力された文字列1行分を取得するには，下行のように BufferedReader型オブジェクト buf の readLine( ) メソッドを呼び出す。
        // この readLine( )メソッドはキーボードから入力された1行分の文字列をString型オブジェクトとして返してくれる。
        // そして，取得した文字列を double 型の数値に変換するには，下行のように Double クラスのstaticメソッド parseDouble( ) を使う。
        double a = Double.parseDouble( buf.readLine( ) ); // キーボードから 1.23 と入力しした場合， "1.23" という文字列が parseDouble( ) メソッドに渡され，double型実数値 1.23 が返される。
        System.out.println( "input is " + a );

        // もう一度やってみる。
        // 下行の処理で再度コンソールウィンドウが入力待ち状態になるので，キーボードから実数値を表す文字列を再度入力してみよ。
        buf = new BufferedReader( new InputStreamReader( System.in ) );
        double b = Double.parseDouble( buf.readLine( ) );
        System.out.println( "input is " + b );

        // 今度は，キーボードから入力した文字列1行分の先頭の1文字を取り出してみよう。
        // 下行の処理で再度コンソールウィンドウが入力待ち状態になるので，キーボードから適当な文字列を入力してみよ。
        buf = new BufferedReader( new InputStreamReader( System.in ) );
        char op = buf.readLine( ).charAt( 0 ); // 取得した文字列は前期に学習したように String型なので，1文字目を取り出すには charAt( ) メソッドに 0 を渡せば良い。
        System.out.println( "input is " + op );

    }

}