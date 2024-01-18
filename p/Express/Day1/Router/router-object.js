const express = require("express");

const router = express.Router(); //Getting the particular Router package from express and stored it in router.

router.get("/myorders/prachi", (request, response) => {
  response.send(`Prachi past orders page`);
});
router.get("/cart/addtocart", (request, response) => {
  response.send(`Some Code here to add product to cart collection in MongoDB`);
});
router.get("/cart/removefromcart", (request, response) => {
  response.send(
    `Some Code here to delete product from cart collection in MongoDB`
  );
});
router.get("/products", (request, response) => {
  response.send(
    `Some Code here to fetch all product categories from product collection in MongoDB`
  );
});
router.get("/products/laptop", (request, response) => {
  response.send(`Some Code here to fetch only products matching with laptop from product collection in
   MongoDB`);
});

module.exports=router;