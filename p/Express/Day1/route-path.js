const { request } = require('express');
const express = require('express');
const app = express(); //constructor of express instead of http.createServer
const PORT = 8080;

app.get('/a(bc)?d',(request,response)=>{ //ab?cd,ab+cd,ab*cd,a(bc)?d
    console.log("Request Received");
    response.send(`You are in path test ${request.url}`);
    response.end();
});



app.listen(
    PORT,
    ()=>{
        console.log(`Server is running on port ${PORT}`);
    }
);