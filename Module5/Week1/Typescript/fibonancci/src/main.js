function getFibonacciByIndex(number) {
    if (number == 1 || number == 2) {
        return 1;
    }
    else {
        return getFibonacciByIndex(number - 1) + getFibonacciByIndex(number - 2);
    }
}
function getFibonacciList(number) {
    var fibonacciList = [1];
    if (number != 1) {
        for (var i = 2; i <= number; i++) {
            fibonacciList.push(getFibonacciByIndex(i));
        }
    }
    return fibonacciList;
}
function calculateSum(list) {
    var sum = 0;
    for (var i = 0; i < list.length; i++) {
        sum += list[i];
    }
    return sum;
}
console.log("Fibonacci number at 5: " + getFibonacciByIndex(5));
console.log("List of first 5 fibonacci number: " + getFibonacciList(5));
console.log("Sum of first 5 fibonacci number = " + calculateSum(getFibonacciList(5)));
