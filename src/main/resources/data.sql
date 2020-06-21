insert into products (id, code, name, grocery_type, image_url) values (1,'MANGO', 'Kesar Mango', 'FRUITS','https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/62e4b3b9-3a82-47c9-be50-e6d095c1f648_425x425.jpg');
insert into products (id, code, name, grocery_type, image_url) values (2,'AVOCADO', 'Avocado', 'FRUITS','https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/a473f647-d419-42d6-bceb-6859d017acbe_425x425.jpg');
insert into products (id, code, name, grocery_type, image_url) values (3,'GRAPES', 'Grapes Red', 'FRUITS','https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/f341c972-bc85-4b0d-8309-6bdaa4fd0cad_425x425.JPG');
insert into products (id, code, name, grocery_type, image_url) values (4,'BANANA', 'Banana Golden','FRUITS', 'https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/de0cd3e5-eefd-4b56-9ec1-503a5db10333_425x425.JPG');
insert into products (id, code, name, grocery_type, image_url) values (5,'BLUEBERRY', 'BlueBerry - exotic','FRUITS', 'https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/83e591f2-ace2-4b45-8916-9a532bfea930_425x425.jpg');

insert into products (id, code, name, grocery_type, image_url) values (6,'CAULIFLOWER', 'Cauliflower', 'VEGETABLES','https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/999a14d9-d3ad-4d97-b637-813aeebfdf69_425x425.jpg');
insert into products (id, code, name, grocery_type, image_url) values (7,'ONION', 'Onion', 'VEGETABLES','https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/14c3fa54-5d8e-4238-903f-a8ef58132879_425x425.JPG');
insert into products (id, code, name, grocery_type, image_url) values (8,'POTATO', 'Potato', 'VEGETABLES','https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/25653f6e-62fe-4e1d-9e95-9adc63305f32_425x425.JPG');
insert into products (id, code, name, grocery_type, image_url) values (9,'TOMATO', 'Tomato', 'VEGETABLES','https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/e4ecd12c-b2db-4f76-b9ea-45e0436ba350_425x425.JPG');
insert into products (id, code, name, grocery_type, image_url) values (10,'CARROT', 'Carrot', 'VEGETABLES','https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/1ca1d5a8-2c35-41c4-8128-2d06541b4626_425x425.JPG');
insert into products (id, code, name, grocery_type, image_url) values (11,'CAPSICUM', 'Capsicum', 'VEGETABLES','https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/9f5ce81b-8325-4ae3-9fad-83e2e7303198_425x425.JPG');
insert into products (id, code, name, grocery_type, image_url) values (12,'BEETROOT', 'Beet Root', 'VEGETABLES','https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/52e6f7fa-4b65-465f-b00b-031632ca072c_425x425.JPG');
insert into products (id, code, name, grocery_type, image_url) values (13,'GINGER', 'Ginger', 'VEGETABLES','https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/9c26881e-0375-492b-ad72-462f4c900bb9_425x425.JPG');


insert into stores (id, store_name) values (1, 'Sri Venkateshawara Stores');
insert into stores (id, store_name) values (2, 'Krishna General Stores');
insert into stores (id, store_name) values (3, 'Balaji General Stores');

insert into store_products(id,cost,product_id, store_id) values (1,'60/kg',1,1);
insert into store_products(id,cost,product_id, store_id) values (2,'65/kg',1,2);
insert into store_products(id,cost,product_id, store_id) values (3,'63/kg',1,3);

insert into store_products(id,cost,product_id, store_id) values (4,'190/kg',2,1);
insert into store_products(id,cost,product_id, store_id) values (5,'185/kg',2,2);
insert into store_products(id,cost,product_id, store_id) values (6,'192/kg',2,3);

insert into store_products(id,cost,product_id, store_id) values (7,'290/kg',3,1);
insert into store_products(id,cost,product_id, store_id) values (8,'285/kg',3,2);
insert into store_products(id,cost,product_id, store_id) values (9,'292/kg',3,3);

insert into store_products(id,cost,product_id, store_id) values (10,'290/kg',4,1);
insert into store_products(id,cost,product_id, store_id) values (11,'285/kg',4,2);
insert into store_products(id,cost,product_id, store_id) values (12,'292/kg',4,3);

insert into store_products(id,cost,product_id, store_id) values (13,'63/kg',5,1);
insert into store_products(id,cost,product_id, store_id) values (14,'190/kg',5,2);
insert into store_products(id,cost,product_id, store_id) values (15,'185/kg',5,3);

insert into store_products(id,cost,product_id, store_id) values (16,'192/kg',6,3);
insert into store_products(id,cost,product_id, store_id) values (17,'290/kg',6,1);
insert into store_products(id,cost,product_id, store_id) values (18,'285/kg',6,2);

insert into store_products(id,cost,product_id, store_id) values (19,'292/kg',7,3);
insert into store_products(id,cost,product_id, store_id) values (20,'290/kg',7,1);
insert into store_products(id,cost,product_id, store_id) values (21,'285/kg',7,2);

