Park Finder

子どもと行ける公園を探すためのWebアプリケーションです。
子どもの年齢に応じて利用できる公園を検索できることを目指して開発しています。

概要

現在地から近くの公園を検索し、地図上で確認できるアプリを想定しています。

公園について以下の情報をユーザーが回答できる仕組みを考えています。

駐車場の有無

適性年齢

ユーザーの回答によって公園情報を蓄積し、将来的には
「駐車場の有無」や「年齢別」で検索できる機能を実装することを目指しています。

背景

子どもと公園へ行く際に

駐車場があるか

小さい子どもが遊べるか

といった情報が既存の地図アプリでは分かりにくいと感じました。

そのため、ユーザーの回答によって公園情報を集める仕組みを作ることで、
子ども連れでも安心して公園を探せるサービスを作りたいと考え、このアプリを作成しました。

現在実装している機能
公園一覧取得
GET /parks

公園一覧を取得します。

年齢による公園検索
GET /parks/search?age=4

指定した年齢に適した公園を検索します。

技術構成
Backend

Java

Spring Boot

Build Tool

Maven

Database

PostgreSQL（予定）

Infrastructure

Docker（予定）

ディレクトリ構成
src/main/java/com/yui/parkfinder

├─ controller
│   └ ParkController.java
├─ service
│   └ ParkService.java
├─ model
│   └ Park.java
└ ParkfinderApplication.java
Controller

APIエンドポイントを定義

Service

ビジネスロジック（年齢による公園検索）

Model

公園データを管理

実行方法

リポジトリをクローン

git clone https://github.com/yui-k-dev/park-finder

Spring Bootアプリケーションを起動

ブラウザで以下のURLにアクセス

http://localhost:8080/parks
今後の予定

公園データの登録機能

駐車場アンケート機能

適性年齢アンケート機能

駐車場の有無による検索

年齢別検索

地図表示機能

現在地からの公園検索
