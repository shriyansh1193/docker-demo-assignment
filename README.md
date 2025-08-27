
# Book Management API

This Project is a collection of API to add, view and delete collection of Books stred in a database

This rope consist Backend code as well as the Docker-compose for multi app.

Repo for Frontend implementation: https://github.com/shriyansh1193/docker-FE-assignment




## Environment Variables

To run this project, you will need to run 
DockerDemoApplication.java


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://katherineoelsner.com/)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/)


## Documentation




## API Reference

#### Get all items

```http
  GET /
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `` | `` |Return List of Books stored |


```http
  POST /
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Course` | `` |Below is the list of parametrs required |
|`id`| `Integer` | id of the book |
| `title` | `String` | Title of the book |
| `price` | `double` | price of the object |


```http
  DELETE /
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `id` | `INTEGER` |id of the book to be deleted |

## Deployment

To deploy this project on docker hub run

```bash
docker build -t shriyansh1193/docker-demo:latest .
```

```bash
docker push shriyansh1193/docker-demo:latest
```
