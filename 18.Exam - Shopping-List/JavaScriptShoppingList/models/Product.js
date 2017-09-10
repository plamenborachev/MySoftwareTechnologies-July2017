const mongoose = require('mongoose');

let productSchema = mongoose.Schema({
    priority: {type: 'string', required: 'true'},
    name: {type: 'string', required: 'true'},
    quantity: {type: 'string', required: 'true'},
    status: {type: 'string', required: 'true'},
});

let Product = mongoose.model('Product', productSchema);

module.exports = Product;