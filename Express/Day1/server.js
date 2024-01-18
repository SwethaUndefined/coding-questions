const express = require('express');
const app = express(); //constructor of express instead of http.createServer
const PORT = 8080;
const routerObject = require('./Router/router-object');


function costumMiddleWare(request, respone,next){
    console.log("In my custom middle ware");
    next();
}
function costumMiddleWare2(request, respone,next){
    console.log("In my custom middle ware two");
     next();
}

app.get("/", costumMiddleWare, costumMiddleWare2,(request,response)=>{
    console.log("Request Received");
    response.send("Hello how are you");
    response.end();
});

app.all("/secret",(request,respone)=>{
    respone.send("You are in secret route.");
    respone.end();
})

app.use('/ecommerce',routerObject);

app.listen(
    PORT,
    ()=>{
        console.log(`Server is running on port ${PORT}`);
    }
);