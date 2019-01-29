# Mail generator
## What is for ? 
Trynig to run different tools together ...   
## Run Rabbitmq locally
We are using docker to run rabbitmq locally, 
using
```
docker pull rabbitmq 
docker run -d --hostname m-generator --name rabbit-m-generator -p 8087:15672 -p 5672:5672 rabbitmq:3-management
```

