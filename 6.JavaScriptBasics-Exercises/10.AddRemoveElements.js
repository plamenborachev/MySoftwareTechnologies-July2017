function AddRemoveElements(args) {
    let result = [];

    for(let i = 0; i < args.length; i++){
        let commandParams = args[i].split(' ');
        let command = commandParams[0];

        if(command === 'add'){
            let number = Number(commandParams[1]);
            result.push(number);
        }
        else if(command === 'remove'){
            let index = Number(commandParams[1]);

            if(result.length > index){
                result.splice(index, 1);
            }
        }
    }

    for(let number of result){
        console.log(number);
    }
}

AddRemoveElements([
    'add 3',
    'add 5',
    'remove 2',
    'remove 0',
    'add 7'
])
