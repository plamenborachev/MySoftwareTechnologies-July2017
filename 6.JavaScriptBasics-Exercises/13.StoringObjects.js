function StoringObjects(args) {
    let studentData = [];

    for(let line of args){
        let tokens = line.split(' -> ');

        let name = tokens[0];
        let age = tokens[1];
        let grade = tokens[2];

        let student = {
            name : name,
            age : age,
            grade : grade
        };

        studentData.push(student);
    }

    for(let student of studentData){
        console.log(`Name: ${student.name}`);
        console.log(`Age: ${student.age}`);
        console.log(`Grade: ${student.grade}`);
    }
}

StoringObjects([
    'Pesho -> 13 -> 6.00',
    'Ivan -> 12 -> 5.57',
    'Toni -> 13 -> 4.90'
])
