import mongoose from "mongoose";

const productSchem = mongoose.Schema({
  id: { type: String, require: true },
  title: { type: String, require: true },
  price: { type: String, require: true },
});
const productModel = mongoose.model("ProductModel", productSchem);
export default productModel;
