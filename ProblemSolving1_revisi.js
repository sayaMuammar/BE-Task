const sum = [2,5,10,15,19];
const target = 29;

for(let i  = 0; i <= sum.length; i++){

    for(let j = i + 1; j <= sum.length; j++){
        if(sum[i] + sum[j] == target){
            console.log(i+", " + j);
        }
    }
    
}