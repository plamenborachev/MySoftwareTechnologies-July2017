function TurnObjectIntoJSONString(args) {
    let obj = {};

    for(let string of args){
        let tokens = string.split(' -> ');
        let key = tokens[0];
        let value = tokens[1];

        if (key === 'age' || key === 'grade'){
            value = Number(value);
        }

        obj[key] = value;
    }

    let str = JSON.stringify(obj);

    console.log(str);
}

TurnObjectIntoJSONString([
    'name -> Angel',
    'surname -> Georgiev',
    'age -> 20',
    'grade -> 6.00',
    'date -> 23/05/1995',
    'town -> Sofia'
])