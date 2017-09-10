function MultipleValuesForKey(args) {
    let result = {};

    for(let i = 0; i < args.length - 1; i++){
        let kvp = args[i].split(' ');
        let key = kvp[0];
        let value = kvp[1];

        if (!result[key]){
            result[key] = [];
        }
        result[key].push(value);
    }

    let checkKey = args[args.length - 1];

    if(result[checkKey]){
        for(let value of result[checkKey]){
            console.log(value);
        }
    } else {
        console.log('None');
    }
}

MultipleValuesForKey([
    'key value',
    'key eulav',
    'test tset',
    'key'
])

MultipleValuesForKey([
    '3 test',
    '3 test1',
    '4 test2',
    '4 test3',
    '4 test5',
    '4'
])

MultipleValuesForKey([
    '3 bla',
    '3 alb',
    '2'
])

