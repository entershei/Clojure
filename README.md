# Тесты к курсу «Парадигмы программирования»

[Условия домашних заданий](http://www.kgeorgiy.info/courses/paradigms/homeworks.html)


## Домашнее задание 12. Линейная алгебра

Модификации
 * *Базовая*
    * Код должен находиться в файле `linear.clj`.
    * Исходный код тестов
        * [Простой вариант](clojure/cljtest/LinearBinaryTest.java)
        * [Сложный вариант](clojure/cljtest/LinearNaryTest.java)


## Исходный код к лекциям по Clojure

Запуск Clojure
 * Консоль: [Windows](clojure/RunClojure.cmd), [*nix](clojure/RunClojure.sh)
    * Интерактивный: `RunClojure`
    * С выражением: `RunClojure --eval "<выражение>"`
    * Скрипт: `RunClojure <файл скрипта>"`
    * Справка: `RunClojure --help`
 * IDE
    * IntelliJ Idea: [плагин Cursive](https://cursive-ide.com/userguide/)
    * Eclipse: [плагин Counterclockwise](https://doc.ccw-ide.org/documentation.html)

[Скрипт со всеми примерами](clojure/examples.clj)

Лекция 1. Введение
 * [Введение](clojure/examples/1_1_intro.clj)
 * [Функции](clojure/examples/1_2_functions.clj)
 * [Списки](clojure/examples/1_3_lists.clj)
 * [Вектора](clojure/examples/1_4_vectors.clj)
 * [Функции высшего порядка](clojure/examples/1_5_functions-2.clj)


## Домашнее задание 11. Обработка ошибок на JavaScript

Модификации
 * *Базовая*
    * Код должен находиться в файле `objectExpression.js`.
    * [Исходный код тестов](javascript/jstest/PrefixParserTest.java)
        * Запускать c аргументом `easy` или `hard`
 * *Простая*. Дополнительное реализовать поддержку:
    * унарных операций:
        * `ArcTan` (`atan`) — арктангенс, `(atan 2)` примерно равно 1.1;
        * `Exp` (`Exp`) — экспонента, `(exp 3)` примерно равно 20;
    * [Исходный код тестов](javascript/jstest/PrefixAtanExpTest.java)
 * *Сложная*. Дополнительное реализовать поддержку выражений в постфиксной записи:
    * `(2 3 +)` равно 5
    * [Исходный код тестов](javascript/jstest/PostfixAtanExpTest.java)


## Домашнее задание 10. Объектные выражения на JavaScript

Модификации
 * *Базовая*
    * Код должен находиться в файле `objectExpression.js`.
    * [Исходный код тестов](javascript/jstest/ObjectExpressionTest.java)
        * Запускать c аргументом `easy`, `hard` или `bonus`.
 * *Модификация*. Дополнительное реализовать поддержку:
    * унарных операций:
        * `Square` (`square`) — возведение в квадрат, `3 square` равно 9;
        * `Sqrt` (`sqrt`) — извлечение квадратного корня из модуля аргумента, `-9 sqrt` равно 3;
    * [Исходный код тестов](javascript/jstest/ObjectSquareTest.java)
 * *Модификация*. Дополнительное реализовать поддержку:
    * бинарных операций:
        * `Power` (`pow`) — возведение в степень, `2 3 pow` равно 8;
        * `Log` (`log`) — логарифм абсолютного значения аргумента
            по абсолютному значению основания `-2 -8 log` равно 3;
    * [Исходный код тестов](javascript/jstest/ObjectPowLogTest.java)


## Домашнее задание 9. Функциональные выражения на JavaScript

Модификации
 * *Базовая*
    * Код должен находиться в файле `functionalExpression.js`.
    * [Исходный код тестов](javascript/jstest/FunctionalExpressionTest.java)
        * Запускать c аргументом `hard` или `easy`;
 * *Простая*. Дополнительное реализовать поддержку:
    * переменных: `y`, `z`;
    * унарных функций:
        * `negate` — смена знака, `-2 negate` равно 2;
        * `cube` — возведение в куб, `2 cube` равно 8;
        * `cuberoot` — кубический корень, `8 cuberoot` равно 2;
    * [Исходный код тестов](javascript/jstest/FunctionalCubeTest.java)
 * *Сложная*. Дополнительное реализовать поддержку:
    * переменных: `y`, `z`;
    * констант:
        * `pi` — π;
        * `e` — основание натурального логарифма;
    * операций:
        * `negate` — смена знака, `-2 negate` равно 2;
        * `min3` — минимальный из трех элементов, `3 1 4 min3` равно 1;
        * `max5` — максимальный из пяти элементов, `3 1 4 0 2 max5` равно 4.
    * [Исходный код тестов](javascript/jstest/FunctionalPieMinMaxTest.java)
        * Запускать c аргументом `hard` или `easy`


## Исходный код к лекции по JavaScript

[Скрипт с примерами](javascript/script.js)

[Запуск в браузере](javascript/RunJS.html)

Запуск из консоли
 * [на Java](javascript/RunJS.java): `java -cp . RunJS`
 * [на jjs](javascript/RunJS.jjs.js): `jjs RunJS.jjs.js`
 * [на node.js](javascript/RunJS.node.js): `node RunJS.node.js`

Обратите внимание на реализацию функции `mCurry` в разделе про
[функции высшего порядка](javascript/examples/functions-hi.js).


## Домашнее задание 8. Вычисление в различных типах

Модификации
 * *Базовая*
    * Класс `GenericTabulator` должен реализовывать интерфейс
      [Tabulator](java/expression/generic/Tabulator.java) и
      сроить трехмерную таблицу значений заданного выражения.
        * `mode` — режим вычислений:
           * `i` — вычисления в `int` с проверкой на переполнение;
           * `d` — вычисления в `double` без проверки на переполнение;
           * `bi` — вычисления в `BigInteger`.
        * `expression` — выражение, для которого надо построить таблицу;
        * `x1`, `x2` — минимальное и максимальное значения переменной `x` (включительно)
        * `y1`, `y2`, `z1`, `z2` — аналогично для `y` и `z`.
        * Результат: элемент `result[i][j][k]` должен содержать
          значение выражения для `x = x1 + i`, `y = y1 + j`, `z = z1 + k`.
          Если значение не определено (например, по причине переполнения),
          то соответствующий элемент должен быть равен `null`.
    * [Исходный код тестов](java/expression/generic/GenericTest.java)
 * *Простая*
    * Дополнительно реализовать поддержку режимов:
        * `u` — вычисления в `int` без проверки на переполнение;
        * `l` — вычисления в `long` без проверки на переполнение;
        * `s` — вычисления в `s` без проверки на переполнение.
    * [Исходный код тестов](java/expression/generic/GenericUlsTest.java)
 * *Сложная*
    * Реализовать операции из простой модификации.
    * Дополнительно реализовать унарные операции:
        * `count` — число установленных битов, `count 5` равно 2.
    * Дополнительно реализовать бинарную операцию (минимальный приоритет):
        * `min` — минимум, `2 min 3` равно 2;
        * `max` — максимум, `2 max 3` равно 3.
    * Дополнительно реализовать поддержку режимов:
        * `u` — вычисления в `int` без проверки на переполнение;
        * `l` — вычисления в `long` без проверки на переполнение;
        * `s` — вычисления в `s` без проверки на переполнение.
    * [Исходный код тестов](java/expression/generic/GenericCmmUlsTest.java)


## Домашнее задание 7. Обработка ошибок

Модификации
 * *Базовая*
    * Класс `ExpressionParser` должен реализовывать интерфейс
        [Parser](java/expression/exceptions/Parser.java)
    * Классы `CheckedAdd`, `CheckedSubtract`, `CheckedMultiply`,
        `CheckedDivide` и `CheckedNegate` должны реализовывать интерфейс
        [TripleExpression](java/expression/TripleExpression.java)
    * Нельзя использовать типы `long` и `double`
    * Нельзя использовать методы классов `Math` и `StrictMath`
    * [Исходный код тестов](java/expression/exceptions/ExceptionsTest.java)
 * *Простая*
    * Дополнительно реализовать унарные операции:
        * `log10` — логарифм по уснованию 10, `log10 1000` равно 3;
        * `pow10` — 10 в степени, `pow10 4` равно 10000.
    * [Исходный код тестов](java/expression/exceptions/ExceptionsPowLog10Test.java)
 * *Сложная*
    * Реализовать операции простой модификации.
    * Дополнительно реализовать бинарные операции (максимальный приоритет):
        * `**` — возведение в степень, `2 ** 3` равно 8;
        * `//` — логарифм, `10 // 2` равно 3.
    * [Исходный код тестов](java/expression/exceptions/ExceptionsPowLogTest.java)


## Домашнее задание 6. Разбор выражений

Модификации
 * *Базовая*
    * Класс `ExpressionParser` должен реализовывать интерфейс
        [Parser](java/expression/parser/Parser.java)
    * Результат разбора должен реализовывать интерфейс
        [TripleExpression](java/expression/TripleExpression.java)
    * [Исходный код тестов](java/expression/parser/ParserTest.java)
 * *Простая*
    * Дополнительно реализовать бинарные операции:
        * `&` — побитное И, приоритет меньше чем у `+` (`6 & 1 + 2` равно `6 & (1 + 2)` равно 2);
        * `^` — побитный XOR, приоритет меньше чем у `&` (`6 ^ 1 + 2` равно `6 ^ (1 + 2)` равно 5);
        * `|` — побитное ИЛИ, приоритет меньше чем у `^` (`6 | 1 + 2` равно `6 | (1 + 2)` равно 7);
    * [Исходный код тестов](java/expression/parser/ParserBitwiseTest.java)
 * *Сложная*
    * Реализовать операции из простой модификации.
    * Дополнительно реализовать унарные операции (приоритет как у унарного минуса):
        * `~` — побитное отрицание, `~-5` равно 4;
        * `count` — число установленных битов, `count -5` равно 31.
    * [Исходный код тестов](java/expression/parser/ParserNotCountTest.java)


## Домашнее задание 5. Вычисление выражений

Модификации
 * *Базовая*
    * Реализовать интерфейс [Expression](java/expression/Expression.java)
    * [Исходный код тестов](java/expression/ExpressionTest.java)
 * *Простая*
    * Реализовать интерфейс [DoubleExpression](java/expression/DoubleExpression.java)
    * [Исходный код тестов](java/expression/DoubleExpressionTest.java)
 * *Сложная*
    * Реализовать интерфейсы [DoubleExpression](java/expression/DoubleExpression.java) и [TripleExpression](java/expression/TripleExpression.java)
    * [Исходный код тестов](java/expression/TripleExpressionTest.java)


## Домашнее задание 4. Очередь на связном списке

Модификации
 * *Базовая*
    * [Исходный код тестов](java/queue/QueueTest.java)
    * [Откомпилированные тесты](artifacts/queue/QueueTest.jar)
 * *Простая*
    * Добавить в интерфейс очереди и реализовать метод
      `toArray`, возвращающий массив,
      содержащий элементы, лежащие в очереди в порядке
      от головы к хвосту
    * Исходная очередь должна оставаться неизменной
    * Дублирования кода быть не должно
    * [Исходный код тестов](java/queue/QueueToArrayTest.java)
    * [Откомпилированные тесты](artifacts/queue/QueueToArrayTest.jar)
 * *Сложная*
    * Добавить в интерфейс очереди и реализовать методы
        * `filter(predicate)` – создать очередь, содержащую элементы, удовлетворяющие
            [предикату](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)
        * `map(function)` – создать очередь, содержащую результаты применения
            [функции](https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html)
    * Исходная очередь должна остаться неизменной
    * Тип возвращаемой очереди должен соответствовать типу исходной очереди
    * Взаимный порядок элементов должен сохраняться
    * Дублирования кода быть не должно
    * [Исходный код тестов](java/queue/QueueFunctions.java)
    * [Откомпилированные тесты](artifacts/queue/QueueFunctionsTest.jar)


## Домашнее задание 3. Очередь на массиве

Модификации
 * *Базовая*
    * Классы должны находиться в пакете `queue`
    * [Исходный код тестов](java/queue/ArrayQueueTest.java)
    * [Откомпилированные тесты](artifacts/queue/ArrayQueueTest.jar)
 * *Простая*
    * Реализовать метод `toArray`, возвращающий массив,
      содержащий элементы, лежащие в очереди в порядке
      от головы к хвосту.
    * Исходная очередь должна остаться неизменной
    * Дублирования кода быть не должно
    * [Исходный код тестов](java/queue/ArrayQueueToArrayTest.java)
    * [Откомпилированные тесты](artifacts/queue/ArrayQueueToArrayTest.jar)
 * *Сложная*
    * Реализовать методы
        * `push` – добавить элемент в начало очереди
        * `peek` – вернуть последний элемент в очереди
        * `remove` – вернуть и удалить последний элемент из очереди
    * [Исходный код тестов](java/queue/ArrayQueueDequeTest.java)
    * [Откомпилированные тесты](artifacts/queue/ArrayQueueDequeTest.jar)


## Домашнее задание 2. Бинарный поиск

Модификации
 * *Базовая*
    * Класс `BinarySearch` должен находиться в пакете `search`
    * [Исходный код тестов](java/search/BinarySearchTest.java)
    * [Откомпилированные тесты](artifacts/search/BinarySearchTest.jar)
 * *Простая*
    * Если в массиве `a` отсутствует элемент, равный `x`, то требуется
      вывести индекс вставки в формате, определенном в
      [`Arrays.binarySearch`](http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#binarySearch-int:A-int-).
    * Класс должен иметь имя `BinarySearchMissing`
    * [Исходный код тестов](java/search/BinarySearchMissingTest.java)
    * [Откомпилированные тесты](artifacts/search/BinarySearchMissingTest.jar)
 * *Сложная*
    * Требуется вывести два числа: начало и длину диапазона элементов,
      равных `x`. Если таких элементов нет, то следует вывести
      пустой диапазон, у которого левая граница совпадает с местом
      вставки элемента `x`.
    * Не допускается использование типов `long` и `BigInteger`.
    * Класс должен иметь имя `BinarySearchSpan`
    * [Исходный код тестов](java/search/BinarySearchSpanTest.java)
    * [Откомпилированные тесты](artifacts/search/BinarySearchSpanTest.jar)


## Домашнее задание 1. Хэширование

Модификации
 * *Базовая*
    * Исходный код тестов:
       [CalcMD5Test.java](java/hash/CalcMD5Test.java),
       [HashChecker.java](java/hash/HashChecker.java)
    * [Откомпилированные тесты](artifacts/hash/CalcMD5Test.jar)
 * *Для M3138, 39*
    * Класс должен иметь имя `CalcSHA256` и подсчитывать [SHA-256](https://en.wikipedia.org/wiki/Secure_Hash_Algorithm)
    * [Исходный код тестов](java/hash/CalcSHA256Test.java)
    * [Откомпилированные тесты](artifacts/hash/CalcSHA256Test.jar)
 * *Для M3136, 37*
    * Напишите простой аналог утилиты [sha256sum](http://linux.die.net/man/1/sha256sum)
    * Класс должен называться `SHA256Sum`
    * Список файлов для хэширования передается в виде аргументов командной строки
    * Если список файлов пуст, то хэшируется стандартный ввод а именем файла считается `-`
    * Вывод хэшей осуществляется в формате `<хэш> *<имя файла>`
    * [Исходный код тестов](java/hash/SHA256SumTest.java)
    * [Откомпилированные тесты](artifacts/hash/SHA256SumTest.jar)

Для того, чтобы протестировать базовую модификацию домашнего задания:

 1. Скачайте тесты ([CalcMD5Test.jar](artifacts/hash/CalcMD5Test.jar))
 * Откомпилируйте `CalcMD5.java`
 * Проверьте, что создался `CalcMD5.class`
 * В каталоге, в котором находится `CalcMD5.class` выполните команду

    ```
       java -jar <путь к CalcMD5Test.jar>
    ```

    Например, если `CalcMD5Test.jar` находится в текущем каталоге, выполните команду

    ```
        java -jar CalcMD5Test.jar
    ```
