function SetValuesToIndexesInArray(args) {
    let num = Number(args[0]);
    let result = [];

    for(let i = 0; i < num; i++){
        result[i] = 0;
    }

    for(let i = 1; i < args.length; i++){
        let indexAndValue = args[i].split(' - ');
        let index = indexAndValue[0];
        let value = indexAndValue[1];

        result[index] = value;
    }

    for(let value of result){
        console.log(value);
    }
}

SetValuesToIndexesInArray(['3', '0 - 5', '1 - 6', '2 - 7']);