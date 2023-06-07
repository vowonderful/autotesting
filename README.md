# _AUTOTESTS FOR ITEXUS.COM: <br>check sending contact forms_

---

### Install Java on global locale:
https://www.oracle.com/java/technologies/downloads/#java20
```bash
sudo apt update
sudo apt install default-jre
java -version
sudo apt install default-jdk
javac -version
```

### Install Maven on local machine:
```bash
sudo apt install maven
```

---

## _Data:_

**Java version**: `20.0.1` \
**OpenJDK version**: `20.0.1` \
**Maven version**: `3.9.1` \
**Selenium version**: `4.9.0`
<br>
<br>
---

## _Temp Settings:_

- _File -> Project Structure -> Project Settings -> **Project**_: \
  **Name**: `auto-tests` \
  **JDK**: `openjdk-20` <small>`(Oracle OpenJDK version 20)`</small> \
  **Language level**: `20`
- _File -> Project Structure -> Project Settings -> **Modules**_: \
  **Name**: `itexusFormsChecker` 

  **Sources Tab**:
  - **Language level**: `11`
  
  **Dependencies Tab**:
  - **Module SDK**: `Project SDK`<small>`(openjdk-20)`</small>
- _File -> Settings -> Build, Execution, Deployment -> Build Tools -> **Maven**_: \
  **Maven home path:** `/home/work/itexus/auto-tests/dependencies/apache-maven-3.9.1`
<br>
<br>
---

## _Drivers:_
Download the appropriate driver
for your operating system, browser and its version:
- _Google Chrome:_ https://chromedriver.chromium.org/downloads
- _Mozilla Firefox:_ https://github.com/mozilla/geckodriver/releases
- _Microsoft Edge:_ https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
- _Safari Browser:_ https://developer.apple.com/documentation/webkit/about_webdriver_for_safari

## _Artifacts for Maven:_
https://mvnrepository.com/
<br><br>
---

## _Build Project_:
```bash
mvn clean install
```

### _Run Test:_
```bash
mvn test
```

### _Clean Project_:
```bash
mvn clean
```

### _Run Application:_
```bash
java -jar itx-check--forms.jar
```

### _Create Zip Archive:_
<small>_JAR-file and tests list only:_</small>
```bash
zip -j build/forms-checker.zip build/tests.xml build/itx-check--forms.jar
```
<small>_Config.properties, tests.xml and jar-file:_</small>
```bash
zip -j build/forms-checker.zip build/config.properties build/tests.xml build/itx-check--forms.jar
```
<br><br>

---

## _Dependencies_:
All dependencies are specified in **_pom.xml_** file. \
Updating existing ones and adding new ones is done through Maven.

<br><br>

---

## _Information_:
1. Веб-драйвера находятся в директории `drivers`, которая в корне проекта. 
   Если её нет -- создайте её и загрузите в неё подходящие веб-драйвера.
   После сборки проекта (команда `mvn install`) они автоматически будут скопированы
   в корень проекта, а также добавлены в автоматически сформированную директорию `target` 
   (в `build` нужный(е) драйвер(а) нужно перенести самостоятельно вручную, или добавить эту команду в pom.xml для её автоматизации).
   При выполнении команды `mvn clean` они будут автоматически удалены из корняя проекта
   (дирректория `target` будет удалёна полностью).
2. Все методы, являющиеся тестами для тестирования контактных форм, задаются в файле `src -> main -> java -> Testing -> WebTest.java`.
3. После сборки проекта, в корне проекта будет создана папка `build`, в которую автоматически будет добавлено 3 основых файла:
   - **_itx-check--forms.jar_**: скомпилированный файл программы;
   - **_tests.xml_**: список запускаемых тестов;
   - **_config.properties_**: конфигурации программы тестирования;

   Сюда же нужно добавить используемый(ые) файлы веб-драйвера(ов). \
   Итого, все 4 файла должны располагаться на одном файловом уровне. \
   P.S.: все эти файлы, включая файлы веб-драйверов из папки `drivers`, будут автоматически добавлены и в `target`.
    
    Чтобы добавить все необходимые файлы в один архив -- можно использовать следующую команду в терминале из корня проекта: \
    ``` bash
    zip -j build/forms-checker.zip build/config.properties build/tests.xml build/itx-check--forms.jar
    ```

4. При выполнении очистки проекта с помощью команды `mvn clean`, в директории `build` все файлы, кроме перенесённых туда драйверов, будут очищены.
   Таким образом, драйвер(а) в `build` достаточно добавить только один раз.
5. Список запускаемых во время автоматизированного тестирования тестов задаётся в файле `tests.xml`,
   распалогаемого в корне проекта. В `build` (и `target`) он будет добавлен автоматически после сборки проекта.
6. В файле `config.properties`, расположенном в корне проекта (или находящемся рядом с файлом
   `itx-check--forms.jar`), можно задавать конфигурации программы тестирования:
    - указывать тип запуска графического интерфейса браузера во время тестирования
      (запускать браузер в фоновом режиме или открывать и показывать окно браузера);
    - управлять процессом логирования (выводить ли процесс тестирования в консоль, записывать ли файл, или отключить всё);
    - задавать вводимые автотестом в контактные формы значения;
    - указывать тип браузера (или несколько браузеров), на котором(ых) будет осуществляться тестирование;
    - задавать время ожидания после прокрутки страницы к элементу;
    - указывать разрешения экрана браузера при выполнении теста для эмуляции различных устройств:
        - _desktop_ (мониторы);
        - _laptop_ (ноутбуки);
        - _tablet_ (планшеты);
        - _mobile_ (смартфоны);
        - _desktop portrait mode_ (портретрный режим монитора);
        - _laptop portrait mode_ (повёрнутый на 90^ экран ноутбука);
        - _tablet rotate_ (повёрнутый на 90^ планшет);
        - _mobile rotate_ (повёрнутый горизонтально смартфон). 

      Этот  файл будет автоматически добавлен в папку `build` (и `target`) при сборке проекта.
7. Если файла `config.properties` не будет рядом со скомпилированным файлом `itx-check--forms.jar`,
   программа тестирования будет использовать значения по умолчанию, заданные в классе `Testing.Config`.
8. Если логирование включено и запись логов в файл активна, рядом с исполняемым файлом `itx-check--forms.jar` будет создана папка `log`,
   в которую ежедненво будет добавляться новый файл (в качестве имени файла -- текущая дата) с результатами тестирования за день.
9. Отчёты с результатом тестирования формируются в директории `test-output` после запуска jar-файла с автотестами `itx-check--forms.jar` (запуск командой `java -jar itx-check--forms.jar`).  
10. При сборке проекта, в файле конфигураций `config.properties` флаг `DO_REAL_TESTS` можно установить в значение false
   для того, чтобы реальное тестирование форм на сайте не выполнялось. Таким образом, проект будет собран за несколько секунд,
   так как этап с выполнением реальных тестов будет пропущен.
   <small>Тестирование двухсот форм с `waitTime=500` занимает около палутора часа.</small>