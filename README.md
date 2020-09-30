(Example)
# Javaの環境をdockerで構築する
## ファイルを元にビルドしていく
```
$ docker-compose build
```
## dockerをバックグラウンドで起動
```
$ docker-compose up -d 
```
## 確認
```
$ docker-compose ps 
```
## dockerの中に入る
```
$ docker-compose exec java bash
```
## コンパイル
```
 # janac Main.java
```
## 実行
```
 # java Main
```
