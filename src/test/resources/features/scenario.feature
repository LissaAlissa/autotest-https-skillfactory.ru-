Feature: Open page

#  1 кликнуть по кнопке в нав панели бесплатно
  Scenario: click button Free
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button Free
    And Open page 'Бесплатные мероприятия и материалы'

# 2 при нажатии кнопки  Все курсы
  Scenario:  click button All courses
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button All courses
    And Open All courses 'Онлайн-курсы по IT-профессиям'

# 3 кликнуть по кнопке в нав панели Корпоративное обучение
  Scenario: click button Corporate training
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button All courses
    When website is open click the button Corporate training
    And Open 'Используйте свои ресурсы — эффективно'

# 4 кликнуть по лого и вернуться на главную страницу
  Scenario: click button logo
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button All courses
    Then click logo
    And Open main page 'SkillFactory — ваш прямой путь в IT-профессии'

# 5 Нажатие кнопки Контакты
  Scenario: click button Contacts
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button All courses
    Then website is open click the button Contacts
    And Open Contacts 'Контактная информация'

# 6 Нажатие кнопки Создание сайтов на странице Все курсы
  Scenario: click button Sozdanie Saytov
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button All courses
    When website is open click the button Sozdanie Saytov
    And Open Sozdanie Saytov 'Курсы по созданию сайтов'

# 7 Нажатие кнопки Курсы PHP  на странице Создание сайтов
  Scenario: click button Courses Php
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button All courses
    When website is open click the button Sozdanie Saytov
    Then website is open click the button Courses Php
    And Open Courses Php 'Курсы PHP'

 #  8 кликнуть по кнопке в нав панели сотрудничество
  Scenario: click button Cooperation
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button Cooperation
    And Open Cooperation 'станьте партнером SkillFactory'

# 9 Нажатие кнопки Data Science
  Scenario: click button Data Science
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button Data Science
    And Open Data Science 'Курсы по Data Science'

# 10 Нажатие кнопки Аналитика данных
  Scenario: click button Data Analytics
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button Data Analytics
    And Open Data Analytics 'Курсы по аналитике данных'

# 11 Нажатие кнопки Программирование
  Scenario: click button Programming
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button Programming
    And Open Programming 'Курсы программирования'

# 12 Нажатие кнопки бесплатные материалы Free Materials
  Scenario: click button Free Materials
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button Free Materials
    And Open page 'Бесплатные мероприятия и материалы'

# 13 Нажатие кнопки Аналитика
  Scenario: click button Analitika Dannyh
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button Analitika Dannyh
    And Open Analitika Dannyh 'Курсы по аналитике данных'

# 14 Нажатие кнопки веб-разработке
  Scenario: click button Web Razrabotka
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button Web Razrabotka
    And Open Web Razrabotka 'Курсы по веб-разработке'

# 15 Нажатие кнопки тестирование
  Scenario: click button Testirovanie
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button Testirovanie
    And Open Testirovanie 'Курсы по тестированию'

# 16 Нажатие кнопки разработка игр
  Scenario: click button Razrabotka Igr
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button Razrabotka Igr
    And Open Razrabotka Igr 'Курсы по разработке игр'

# 17 Нажатие кнопки «Надёжный старт в IT»
  Scenario: click button Start
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button Start
    And Open Start 'Надёжный старт в IT'

# 18 Нажатие кнопки Отзывы студентов
  Scenario: click button Reviews
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button Reviews
    And Open Reviews 'Отзывы студентов SkillFactory'

# 19 Нажатие кнопки Читать Историю
  Scenario: click button Read Story
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button Read Story
    And Open page Read Story 'Денис Злобин: «Я проучился на курсе полгода и нашел сразу две работы»'

# 20 Нажатие кнопки Вопрос-ответ в блог
  Scenario: click button Ask
    Given url of site  'https://skillfactory.ru/'
    When website is open click the button Read Story
    Then click button ask
    And Open page ask 'Вопрос-ответ'



