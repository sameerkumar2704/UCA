/**
 * globa scope = window
 * function scope = insdie fucntion
 * hosting not make var global but it declar to top of its inner most function , it only define not declar so its value become undefine
 * block scope - usin insdie of if while or for
 */
const data = [{
    id:1,
    productName:"apple",
    cost:20
},
{
    id:1,
    productName:"Orange",
    cost:20
},
{
    id:1,
    productName:"Banana",
    cost:20
}]


(()=>console.log("self call function"))()
