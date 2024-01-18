const express = require('express');
const app = express(); //constructor of express instead of http.createServer
const PORT = 8080;
const bodyparser = require('body-parser');

app.use(bodyparser.json());

app.get("/:fname/:age/:lname",(request,response)=>{
    // console.log(request);
    console.log(request.url);
    console.log(request.params);
    console.log(request.params.age);
    // console.log(request.query)
    response.send("Hello how are you");
    response.end();
});
app.post("/",(request,response)=>{
   console.log(request.body);
    response.send("Hello how are you");
    response.end();
});
app.listen(
    PORT,
    ()=>{
        console.log(`Server is running on port ${PORT}`);
    }
);