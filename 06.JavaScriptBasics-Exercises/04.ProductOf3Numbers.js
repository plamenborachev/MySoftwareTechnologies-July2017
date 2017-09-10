function ProductOf3Numbers(args) {
    let numbers = args.map(Number);

    let negativeNumbers = 0;

    for(let i = 0; i < numbers.length; i++){
        if(numbers[i] < 0){
            negativeNumbers++;
        }
    }

    if(negativeNumbers % 2 != 0){
        console.log('Negative');
    }
    else {
        console.log('Positive');
    }
}

ProductOf3Numbers(['0', '3', '-1'])
