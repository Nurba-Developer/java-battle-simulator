FROM openjdk:17-alpine

WORKDIR /app

# Копируем всё в рабочую директорию контейнера
COPY . .

# Компилируем все Java-файлы
RUN javac -cp . $(find . -name "*.java")

# Запускаем Main
CMD ["java", "Main"]
