const express = require('express')
const app = express()
const port = 8080;

app.use("/" ,express.static('./public')) // default value for path is '/'

app.listen(port , ()=>console.log(` live at ${port}`))
