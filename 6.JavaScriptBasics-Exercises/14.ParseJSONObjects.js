function ParseJSONObjects(args) {

    let objects = args.map(JSON.parse);

    for(let object of objects){
        console.log(`Name: ${object.name}`);
        console.log(`Age: ${object.age}`);
        console.log(`Date: ${object.date}`);
    }
}

ParseJSONObjects([
    '{"name":"Gosho","age":10,"date":"19/06/2005"}',
    '{"name":"Tosho","age":11,"date":"04/04/2005"}'
]);