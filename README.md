
### Project Guide

- setup env
```bash
    
```
- Install dependencies

```bash
  mvn clean install
```

- start project 
```bash
  mvn spring-boot:run
```

### setup java version
- export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_351.jdk/Contents/Home




## Run Locally

Clone the project

```bash
  git clone https://link-to-project
```

Go to the project directory

```bash
  cd my-project
```

Install dependencies

```bash
  npm install
```

Start the server

```bash
  npm run start
```


## API Reference

#### Get all items

```http
  GET /api/items
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get item

```http
  GET /api/items/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

#### add(num1, num2)

Takes two numbers and returns the sum.


## Consul Setup

```consul
https://developer.hashicorp.com/consul
```

```consul ui
consul agent -ui -config-dir /opt/consul/config
consul agent -dev -bind 192.168.0.128
consul agent -dev -bind (192.168.0.128 =  your ipaddress machine) 
  ipconfig getifaddr en1 - Ethernet 
  ipconfig getifaddr en0 - Wifi
    http://localhost:8500/ui/dc1/services
```


## Used By

This project is used by the following companies:

- Company 1
- Company 2

