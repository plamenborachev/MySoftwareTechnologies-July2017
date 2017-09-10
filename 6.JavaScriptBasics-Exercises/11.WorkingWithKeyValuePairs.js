function WorkingWithKeyValuePairs(args) {
    let result = {};

    for(let i = 0; i < args.length - 1; i++){
        let keyValue = args[i].split(' ');

        let keyKVP = keyValue[0];
        let valueKVP = keyValue[1];

        result[keyKVP] = valueKVP;
    }

    let keyCheck = args[args.length - 1];

    console.log(result[keyCheck] || 'None');
}

WorkingWithKeyValuePairs([
    'key value',
    'key eulav',
    'test tset',
    'key'
])

WorkingWithKeyValuePairs([
    '3 test',
    '3 test1',
    '4 test2',
    '4 test3',
    '4 test5',
    '4'
])

WorkingWithKeyValuePairs([
    '3 bla',
    '3 alb',
    '2'
])

function solve(args) {
    let obj = {};

    for(let arg of args.slice(0, args.length - 1)){
        let tokens = arg.split(' ');

        let key = tokens[0];
        let value = tokens[1];

        obj[key] = value;
    }

    let key = args[args.length - 1];

    console.log(obj[key] || "None");
}

solve([
    'key value',
    'key eulav',
    'test tset',
    'key'
])

solve([
    '3 test',
    '3 test1',
    '4 test2',
    '4 test3',
    '4 test5',
    '4'
])

solve([
    '3 bla',
    '3 alb',
    '2'
])


