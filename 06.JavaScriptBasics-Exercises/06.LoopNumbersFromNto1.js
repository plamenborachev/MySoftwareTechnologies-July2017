function  LoopNumbersFromNto1(args) {
    let num = Number(args[0]);

    for(let i = num; i >= 1; i--){
        console.log(i);
    }
}

LoopNumbersFromNto1(['5']);