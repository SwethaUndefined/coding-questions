const express = require('express');

const app = express();
const cookieParser = require('cookie-parser');
const PORT = 8080;

app.use(cookieParser());

app.all('/swe',(request,response)=>{
    console.log("Request Received");
    response.cookie("latest","Swetha",{
    maxAge: 3000
    })
    // response.clearCookie("ecomm");
    app.get('/clear_cookie_upgrad', function(req, res){
        res.clearCookie('Swetha');
        res.send('cookie upgrad cleared');
       });
       
    response.send("Hello How are you?");
    response.end();
    console.log(request.cookies);
})


app.listen(PORT,
    ()=>{
        console.log(`connecting to the port ${PORT}`);
    })