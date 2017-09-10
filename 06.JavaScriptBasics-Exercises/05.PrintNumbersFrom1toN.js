function PrintNumbersFrom1toN(args) {
    let num = Number(args[0]);

    for(let i = 1; i <= num; i++){
        console.log(i);
    }
}

PrintNumbersFrom1toN(['5'])