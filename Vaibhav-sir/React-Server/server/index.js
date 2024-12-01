import express from "express";
import "./config/dbConnection.js";
import productModel from "./models/product.js";
const app = express();
app.use(express.json());
app.use("*", (req, res, next) => {
  res.setHeader("Access-Control-Allow-Origin", "*");
  res.setHeader("Access-Control-Allow-Headers", "*");
  next();
});
app.post("/data", (req, res) => {
  console.log(req.body);
});
app.get("/:id", async (req, res) => {
  console.log(typeof req.params.id);
  console.log(await productModel.deleteOne({ id: req.params.id }));
  res.send("deleted");
});
app.get("/", (req, res) => {
  productModel.insertMany([{ id: 1, title: "sameer", price: 100 }]);
  res.send("hellow from server");
});
app.listen(3000, () => console.log("Server is running at 3000"));
