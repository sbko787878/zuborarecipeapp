# ステージ1: ビルド
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app
COPY . .
# Gradleの実行権限を付与してビルド
RUN chmod +x ./gradlew
RUN ./gradlew bootJar

# ステージ2: 実行
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# セキュリティ対策：rootユーザーではなく、一般ユーザー使用
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

# ビルドステージから生成されたJARファイルのみをコピー
COPY --from=build /app/build/libs/*.jar app.jar

# 外部からのアクセス用ポート（Spring Bootのデフォルトは8080）
EXPOSE 8080

# アプリの起動
ENTRYPOINT ["java", "-jar", "app.jar"]
