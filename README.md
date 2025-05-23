# Java Battle Simulator

Консольный симулятор командного боя, реализованный на Java с использованием объектно-ориентированного подхода.

## О проекте

Симулятор моделирует сражение двух команд — **Holy Team** и **Dark Team**. Каждое существо на поле боя обладает своими характеристиками, поведением и приоритетами действий.

Проект демонстрирует принципы ООП: наследование, полиморфизм, интерфейсы и разделение ответственности.

## Стек технологий

- Java 17+
- ООП (Object-Oriented Programming)
- Docker (опционально)
- Git

## Структура проекта
.
├── Main.java             # Точка входа
├── Unit/                # Пакет с классами персонажей
│   ├── Hero.java        # Базовый класс
│   ├── Sniper.java
│   ├── Koldun.java
│   └── ...
├── Vector2D.java        # Координаты на поле
├── View.java            # Отображение поля боя
├── Names.java           # Enum с именами персонажей
├── Dockerfile           # Файл для контейнеризации
```

## Запуск

### Локально

1. Убедитесь, что установлен JDK 17+
2. Скомпилируйте и запустите:

```bash
javac Main.java
java Main
```

### Через Docker

1. Соберите образ:

```bash
docker build -t java-battle .
```

2. Запустите проект:

```bash
docker run -it --rm java-battle
```

> Обязательно используйте `-it` для интерактивного режима, иначе `Scanner` не сможет получить ввод с клавиатуры.

## Пример вывода

```
Press Enter to begin...
Step: 1
Holy Team:
Sniper — HP: 10 — Pos: (1,1)
Koldun — HP: 12 — Pos: (2,1)
...

Dark Team:
Razboinik — HP: 11 — Pos: (1,10)
Krestyanin — HP: 8 — Pos: (2,10)
...
```

## Особенности

- Автоматическая расстановка бойцов
- Упорядочение по инициативе
- Поддержка новых классов бойцов
- Цветной вывод в консоли (при поддержке терминала)
