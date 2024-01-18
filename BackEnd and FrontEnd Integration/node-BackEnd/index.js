const express = require('express');
const app = express();
const cors = require('cors');

var bodyParser = require('body-parser');
// const dotenv = require('dotenv');
// dotenv.config();


var corsOptions = {
    origin  : "http://localhost:3000"
}

app.use(bodyParser.json());
app.use(cors(corsOptions));


app.get("/", (request,response)=>{
    response.send({
        message : "Integration of Backend-FrontEnd"
    })
    response.end();
})

app.post("/add",(request,response)=>{
    console.log(request.body);
      var sum = request.body.num1+request.body.num2;

      response.json({
        message : `Addition is ${sum}`
      })
})

app.listen(8080, ()=>{   //Here i have used it that env instead of 8080, I already put 8080 in common env file and used it here like this.
    console.log("Server is running on port 8080")  //process.env.PORT
});