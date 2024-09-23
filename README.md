## Сервис для сохранения изменений, вносимых в систему кинотеатра

### Функциональность:

Получение уведомлений об изменении в системе.<br />
Внесение изменений в базу данных.<br />

### Для запуска:

1. Клонируйте репозиторий: git clone https://github.com/PosTour/audit.git
2. Соберите образ: ./mvnw spring-boot:build-image (или воспользуйтесь окном инструментов IDEA:
   Maven -> weather -> Plugins -> spring-boot -> spring-boot:build-image).

Подразумевается интеграция со следующими сервисами:<br />
https://github.com/PosTour/bot<br />
https://github.com/PosTour/cinema<br />
https://github.com/PosTour/environment//github.com/PosTour/weather_bot
