let arr = [6,7,8,9,10]
let arr1 = [1,2,3,4,5]
//Concat method => return array with the joint arrays;
console.log(arr.concat(arr1));

//Constructor method => return the reference of the function
console.log(arr.constructor)

//copyWithin method => adds the coppied elements to the end of the array
//parameters target,start,end
//targer - index paste the coppied elements
//start - start copying at this index
//end - stop copying at this index(index value excluded)
arr.copyWithin(2,0,1)
console.log(arr)

//entries method => creates an iterator and a key for the elements;
var a = arr.entries()
for(var b of a){
    console.log(b)
}

//every => returns if all the elements in the array satisfies the condition
console.log(arr.every(value => value%2==0))

//fill => fills the elements in the given index range
console.log(arr.fill(99,0,arr.length))

//filter => filters the array with the given conditions
console.log(arr.filter(value=>value%2!=0))

//find => search for the first element that satisfies the condition
console.log(arr1.find(value=>value>3))

//find => search for the first element's index that satisfies the condition
console.log(arr1.findIndex(value=>value>3))

//foreach => Iterates througn every element and process the function
console.log(arr1.forEach(value => console.log(value*2)))

//from => return any object as an array
console.log(Array.from("PRASANNA"))

//includes => returns boolean with respect to the presence of the given element
console.log(arr1.includes("abc"))
console.log(arr1.includes(1))

//indexOf => return the index of the searched element   
console.log(arr1.indexOf(1))

//isArray => returns boolean weather the given object is array or not
console.log(Array.isArray(arr1))

//join => prints the string at each iteration
console.log(arr1.join(" and "))

//keys => Creates an iterator
let key = arr1.keys()
for(let x of key){
    console.log(x)
}

//lastIndexOf => return the last index of the searched element
console.log(arr1.lastIndexOf(1));

//length => retuens the length of the object
console.log(arr1.length);

//map => map elements to a new reference
let arr3 = arr1.map(element => element*2)
console.log(arr3)

//pop => removes the last element in the array
arr3.pop()
console.log(arr3)

//prototype => helps us to create a new mwthos for array
Array.prototype.twice = (
    value => value*2
)
arr3.twice()

//push => inserts the given element at the last position of the array
arr3.push("abc")
console.log(arr3)

//reduce => helps to reduce the array with the condition
console.log(arr3.reduce((sum,value) => sum+value))

//reduceRight => helps to reduce the array with the condition from the last
console.log(arr3.reduceRight((sum,value) => sum+value))

//reverse => reverse the array
console.log(arr3.reverse())

//shift => removes the first element 
arr3.shift()
console.log(arr3)

//slice => cuts the array with tha range of index
console.log(arr3.slice(0,3))

//some => returns boolean with respect to weather the condition satisfies some of the elements
console.log(arr3.some(value => value%2 == 0))

//sort => sorts the array
//console.log(arr3.sort())

//splice => adds elements in the index
arr3.splice(0,2,"new1","new2")
console.log(arr3)

//toString => returns the object as String
console.log(arr3.toString());

//unShift => adds new elements to the begining of the array
arr3.unshift("unshift1")
console.log(arr3)

//valueOf => returns itself
console.log(arr3.valueOf())
