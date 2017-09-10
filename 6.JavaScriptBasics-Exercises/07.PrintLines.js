function PrintLines(args) {
    for(let i = 0; i <= args.length; i++){
        let command = args[i];

        if(command != 'Stop'){
            console.log(command);
        }
        else{
            break;
        }
    }
}

PrintLines([
    'Line 1',
    'Line 2',
    'Line 3',
    'Stop',
    '11'
])