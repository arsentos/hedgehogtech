# hedgehogtech
docker pull arsent76/hedgehogtech:latest
docker run arsent76/hedgehogtech:latest -p 8080:8080
### Добавление пользователя
http://localhost:8080/hedgehog-tech/api/create
API принимает в себя данные “Имя/Фамилия”, записывает это в базу данных

### Проверка наличия пользователя
http://localhost:8080/hedgehog-tech/api/check-user
API принимает в себя имя пользователя и отдает ответ, содержащий информацию есть пользователь, или нет в базе

### Удаление пользователя
http://localhost:8080/hedgehog-tech/api/delete
API принимает в себя имя пользователя (или его id, если соискатель добавил эту информацию) и удаляет из базы данных данные

### Поиск по пользователям
http://localhost:8080/hedgehog-tech/api/users
API принимает в себя часть имени пользователя и выводит всех пользователей, которые могут подходить
