# Домашняя работа: Gradle и JUnit 5

Проект содержит два задания.

**Задача 1:** класс `Task1Test` запускает `isEven` один раз со случайным числом от 1 до 100, `checkAccess` 20 раз с числами от 0 до 99 и `getGrade` в параметризованном тесте с десятью случайными числами от 0 до 100. До и после каждого запуска выводятся строки из задания.

**Задача 2:** класс `BasicJavaTest` вызывает все 12 методов из первой домашней работы и сравнивает результат с ожидаемым. Есть четыре метода с `@Test`, четыре с `@RepeatedTest` и четыре с `@ParameterizedTest`. Каждый запуск печатает `TEST PASSED` или `TEST FAILED`.

## Запуск

Нужны JDK 17 и Gradle. В корневой папке проекта выполните:

```bash
gradle runAllTests --rerun-tasks
```

`runAllTests` запускает стандартную задачу Gradle `test`, затем `testRunIsOver` выводит `Test run is over`. Параметр `--rerun-tasks` нужен, чтобы Gradle не пропустил тесты при повторном запуске.

В условии встречается написание `@ParametrizedTest`. В JUnit 5 эта аннотация называется `@ParameterizedTest`.

## Загрузка в GitHub

Создайте пустой публичный репозиторий `java-homework`, затем из этой папки выполните:

```bash
git init
git add .
git commit -m "Add Gradle and JUnit homework"
git branch -M main
git remote add origin https://github.com/VespaAsya/java-homework.git
git push -u origin main
```

Ссылка на коммит будет иметь вид `https://github.com/VespaAsya/java-homework/commit/<хеш>`; реальный хеш появится после коммита.
